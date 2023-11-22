public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int totalSales(long[] sales) {
        long total = 0;
        for (long month : sales) {
            total = total + month;
        }
        return (int)total;
    }

    public int middleSales(long[] sales) {
        long total = totalSales(sales);
        return (int)(total / sales.length);
    }


    public int monthsBelowAverage(long[] sales) {
        double average = middleSales(sales);
        int belowAverageCount = 0;

        for (long sale : sales) {
            if (sale < average) {
                belowAverageCount++;
            }
        }

        return belowAverageCount;
    }

    public int monthsAboveAverage(long[] sales) {
        int average = middleSales(sales);
        int aboveAverageCount = 0;

        for (long sale : sales) {
            if (sale > average) {
                aboveAverageCount++;
            }
        }

        return aboveAverageCount;
    }
}
