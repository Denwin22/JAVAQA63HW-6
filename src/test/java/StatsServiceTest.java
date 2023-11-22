import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class StatsServiceTest {

    @Test
//    @CsvFileSource(files="src/test/resources/Data.csv")
    public void shouldMonthWithMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
        System.out.println("Месяц с самыми минимальными продажами под №" + expected + " Сентябрь");
    }

    @Test
    public void shouldMonthWithMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 6;
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
        System.out.println("Месяц с самыми максимальными продажами под №" + expected + " Июнь");
    }

    @Test
    public void shouldTotalSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.totalSales(sales);
        Assertions.assertEquals(expected, actual);
        System.out.println("Общая продажа по всем месяцам " + expected + " $");
    }

    @Test
    public void shouldMiddleSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.middleSales(sales);
        Assertions.assertEquals(expected, actual);
        System.out.println("Средняя сумма продаж " + expected + " $");

    }

    @Test
    public void shouldMonthsBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.monthsBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
        System.out.println("Количество месяцев ниже среднего значения " + expected);
    }


    @Test
    public void shouldMonthsAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.monthsAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
        System.out.println("Количество месяцев выше среднего значения " + expected);

    }
}
