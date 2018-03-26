package com.lpaoliello.softek.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Marca {

	public BigDecimal getTasa(LocalDate fechaVencimiento);
}
