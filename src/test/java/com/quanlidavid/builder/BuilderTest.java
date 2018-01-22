package com.quanlidavid.builder;

import org.testng.annotations.Test;

public class BuilderTest {
    @Test
    public void builderTest()
    {
        TicketHelper helper = new TicketHelper();
        helper.buildAdult("成人票");
        helper.buildChildrenFotSeat("有座儿童票");
        helper.buildChildrenNoSeat("无座儿童票");
        helper.buildElderly("老年票");
        helper.buildSoldier("军人票");
        Object ticket = TicketBuilder.builder(helper);
    }
}
