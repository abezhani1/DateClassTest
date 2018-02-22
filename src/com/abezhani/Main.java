package com.abezhani;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {

    public static void main(String[] args)
    {
        Date tree = new GregorianCalendar(1987,2,9).getTime();
        Date hum = new GregorianCalendar(1988,9,10).getTime();
        long diff = hum.getTime() - tree.getTime();

        Date today = new Date();

        long newDay = today.getTime() + diff;
        DateFormat dateFormatter;
        dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT,
                Locale.US);
        today = new Date();
        String dateOut = dateFormatter.format(new Date(newDay));
        System.out.println(dateOut);

        /*
        Date today;
        Date joshuaTree = new Date(1987, 3,9); //march 9 1987
        Date rattleHum = new Date(1988,10,10);  //october 10 1988
        String dateOut;
        String dateOut_JT;
        String dateOut_RH;
        DateFormat dateFormatter;
        dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT,
                Locale.US);
        today = new Date();
        dateOut = dateFormatter.format(today);
        dateOut_JT = dateFormatter.format(joshuaTree);
        dateOut_RH = dateFormatter.format(rattleHum);
        System.out.println(dateOut);
        System.out.println(dateOut_JT);
        System.out.println(dateOut_RH);
        */

    }
}
