package com.productcatalog.service;

import java.util.List;

import com.productcatalog.dataTransferObject.EquipoFinanciadoDto;
import com.productcatalog.dataTransferObject.PlanPagosDto;

public interface IPlanPagosService {
	public List<PlanPagosDto> calcularPlanPagos(EquipoFinanciadoDto equipoFinanciado);
}
