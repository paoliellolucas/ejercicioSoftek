package com.lpaoliello.softek.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

public interface OperacionService {
	
	Optional<BigDecimal> getTasa(String marca, LocalDate fechaVencimiento, BigDecimal importe);

}
