package ru.netology.stats;

public class Main {
        public static void main(String[] args) {
            StatsService service = new StatsService();
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

            System.out.println("Общая сумма " + service.calculateTotalSales(sales));
            System.out.println("Средний показатель " + service.calculateAverageSales(sales));
            System.out.println(service.findMaxSalesMonth(sales));
            System.out.println(service.findMinSalesMonth(sales));
            System.out.println(service.calculateBelowAverageSales(sales));
            System.out.println(service.calculateAboveAverageSales(sales));
        }
    }