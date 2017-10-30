package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Trigger {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        System.out.println(sdf.format(cal.getTime()));


        List<String> lista = new ArrayList<String>();
        lista.add("8:15");
        lista.add("9:45");
        lista.add("10:00");
        lista.add("11:30");
        lista.add("11:45");
        lista.add("13:15");
        lista.add("13:45");
        lista.add("15:15");
        lista.add("15:30");
        lista.add("17:00");
        lista.add("17:15");
        lista.add("18:45");
    }
}