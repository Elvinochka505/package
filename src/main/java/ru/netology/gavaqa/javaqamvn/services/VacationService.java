
package ru.netology.gavaqa.javaqamvn.services;

public class VacationService {
    public static int calculateDays(int income, int expenses, int threshold) {
        int money = 0;
        int freeMonths = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money = (money - expenses) / 3;
                freeMonths++;
            } else {
                money = (money + income) - expenses;
            }

        }
        return freeMonths;

    }
}
