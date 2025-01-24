package it.unina.ci_pipeline.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {
    private final List<Transaction> transactions;

    public TransactionRepository(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public List<Transaction> getTransactions(LocalDate startDate, LocalDate endDate) {
        var ret = new ArrayList<Transaction>();
        for (var t : transactions) {
            var date = t.getDate();
            if ((date.isAfter(startDate) || date.isEqual(startDate)) &&
                    (date.isEqual(endDate) || date.isBefore(endDate))) {
                ret.add(t);
            }
        }
        return ret;
    }
}
