package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void ShouldRemainTestCase1() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(900), 100);
    }

    @Test
    public void ShouldRemainTestCase2() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(999), 1);
    }

    @Test
    public void ShouldRemainTestCase3() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(1_000), 0);
    }

    @Test
    public void ShouldRemainTestCase4() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(1_001), 999);
    }
}