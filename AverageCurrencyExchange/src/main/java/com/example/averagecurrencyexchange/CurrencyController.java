package com.example.averagecurrencyexchange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CurrencyController {

    @Autowired
    private CurrencyService service;

    @GetMapping("/rate/{currency}")
    public ResponseEntity<Double> getAverageRate(
            @PathVariable String currency,
            @RequestParam(defaultValue = "1") int days) {
        double averageRate = service.getAverageRate(currency, days);
        return ResponseEntity.ok(averageRate);
    }
}
