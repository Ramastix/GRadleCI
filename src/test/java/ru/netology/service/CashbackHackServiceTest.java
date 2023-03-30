package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashBackHacker;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemain100IfAmount900() {
        CashBackHacker service = new CashBackHacker();

        int amount = 900;
        int expected = 100;
        int actual = service.remain(900);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain350IfAmount650() {
        CashBackHacker service = new CashBackHacker();

        int amount = 650;
        int expected = 350;
        int actual = service.remain(650);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain1000IfAmount0() {
        CashBackHacker service = new CashBackHacker();

        int amount = 0;
        int expected = 1000;
        int actual = service.remain(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain0IfAmount1000() {
        CashBackHacker service = new CashBackHacker();

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected, actual);
    }

}