package org.example.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Reajuste {
	
	BigDecimal valor();
	LocalDate data();

}
