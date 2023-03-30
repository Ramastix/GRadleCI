package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.service.CashBackHacker;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemain100IfAmount900() {
        CashBackHacker service = new CashBackHacker();

        int amount = 900;
        int expected = 100;
        int actual = service.remain(900);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain400IfAmount600() {
        CashBackHacker service = new CashBackHacker();

        int amount = 600;
        int expected = 400;
        int actual = service.remain(600);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain1000IfAmount0() {
        CashBackHacker service = new CashBackHacker();

        int amount = 0;
        int expected = 1000;
        int actual = service.remain(0);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain0IfAmount1000() {
        CashBackHacker service = new CashBackHacker();

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(actual, expected);
    }
}