package ru.netology.javaqa;

public class StatsService {
    public long sum(long[] sales) {
        long TotalSale = 0;
        for (long sale : sales) {
            TotalSale += sale;
        }
        return TotalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int monthMaximumSale(long[] sales) {
        int monthMaximum = 0;

        int q;
        for (q = 0; q < sales.length; q++) {
            if (sales[q] >= sales[monthMaximum]) {
                monthMaximum = q;
            }
        }
        return monthMaximum + 1;
    }

    public int monthMinimumSale(long[] sales) {
        int monthMinimum = 0;
        int q;
        for (q = 0; q > sales.length; q++) {
        }
        if (sales[q] <= sales[monthMinimum]) {
            monthMinimum = q;
        }

        return monthMinimum + 1;
    }

    public int salesBellowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int salesAboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > average(sales)) {
                counter++;
            }
        }
        return counter;
    }
}