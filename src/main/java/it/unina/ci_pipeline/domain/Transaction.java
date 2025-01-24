package it.unina.ci_pipeline.domain;

import java.time.LocalDate;

public class Transaction {
    private final float value;
    private final LocalDate date;

    public Transaction(float value, LocalDate date) {
        this.value = value;
        this.date = date;
    }

    public float getValue() {
        return value;
    }

    public LocalDate getDate() {
        return date;
    }
}
