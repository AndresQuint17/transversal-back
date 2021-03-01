package com.productcatalog.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.productcatalog.dataTransferObject.EquipoFinanciadoDto;
import com.productcatalog.dataTransferObject.PlanPagosDto;
import com.productcatalog.service.IPlanPagosService;

@Service
public class PlanPagosServiceImpl implements IPlanPagosService {

	@Override
	public List<PlanPagosDto> calcularPlanPagos(EquipoFinanciadoDto equipoFinanciado) {

		List<PlanPagosDto> planPagos = new ArrayList<PlanPagosDto>();

		try {
			double interesFinanciacion = 0.09;

			int cuotaMeses = equipoFinanciado.getCuotaMeses();
			double pagoInicial = equipoFinanciado.getPagoInicial();
			double valorEquipo = equipoFinanciado.getValorEquipo();
			int descuento = equipoFinanciado.getDescuento();

			if (descuento > 0 && descuento <= 100) {
				double porcentaje = 100 - descuento;
				porcentaje = porcentaje /100;
				valorEquipo = valorEquipo * porcentaje;

				if (pagoInicial > 0) {
					valorEquipo = valorEquipo - pagoInicial <= 0 ? valorEquipo : valorEquipo - pagoInicial;
				}
			}

			double pagoCapital = 0;
			double pagoIntereses = 0;
			double valorCuotaMensual = 0;
			double saldo = valorEquipo;

			double v = 0;
			if (valorEquipo > 0) {
				// Calcular cuota mensual
				v = Math.pow((1 + interesFinanciacion), (cuotaMeses * -1));
				valorCuotaMensual = valorEquipo / ((1 - v) / interesFinanciacion);

				// Calcular tabla de plan de pagos
				PlanPagosDto aporte;
				for (int i = 0; i < cuotaMeses; i++) {
					aporte = new PlanPagosDto();

					pagoIntereses = saldo * interesFinanciacion;
					pagoCapital = valorCuotaMensual - pagoIntereses;
					saldo = saldo - pagoCapital;

					aporte.setNroCuota(i + 1);
					aporte.setValorInicial((double) Math.round(valorEquipo * 100) / 100);
					aporte.setPagoCapital((double) Math.round(pagoCapital * 100) / 100);
					aporte.setIntereses((double) Math.round(pagoIntereses * 100) / 100);
					aporte.setValorCuotaMensual((double) Math.round(valorCuotaMensual * 100) / 100);
					aporte.setSaldo((double) Math.round(saldo * 100) / 100);

					planPagos.add(aporte);
				}

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			planPagos = new ArrayList<PlanPagosDto>();
		}
		
		return planPagos;
	}

}
