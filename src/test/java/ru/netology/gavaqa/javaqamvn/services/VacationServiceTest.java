package ru.netology.gavaqa.javaqamvn.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class VacationServiceTest {

    @Test
    public void CalcServices() {
        VacationService service = new VacationService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;
        int actual = service.calculateDays(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }
}
