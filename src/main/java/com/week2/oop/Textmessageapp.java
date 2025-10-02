package com.week2.oop;

import java.time.LocalDate;

public class Textmessageapp {
    static void main() {
        Textmessage text1 = new Textmessage();
        text1.setSendernumber("784-2342-5676");
        text1.setReceivernumber("205-1234-4323");
        text1.setBody("we're learning java and its fun ");
        text1.setSenton(LocalDate.now());
        text1.display();
    }

}
