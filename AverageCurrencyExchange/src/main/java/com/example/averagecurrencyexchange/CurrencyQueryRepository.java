package com.example.averagecurrencyexchange;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyQueryRepository extends JpaRepository<CurrencyQuery, Long> {
}
