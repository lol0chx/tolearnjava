package com.week2.oop;

import java.time.LocalDate;

public class packageshipmentapp {
    static void main() {
        packageshipment package1 = new packageshipment();
        package1.setSendername("chala");
        package1.setReceivername("vice");
        package1.setCarrier("DHL");
        package1.setstatus("OPEN");
        package1.setTrackingnumber("23123131");
        package1.setShipdate(LocalDate.now());
        package1.printtracking();
    }
}
