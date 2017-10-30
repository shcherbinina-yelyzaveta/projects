package com.company.task11;

import com.company.task11.instrument.Drum;
import com.company.task11.instrument.Guitar;
import com.company.task11.instrument.Instrument;
import com.company.task11.instrument.Tube;

/**
 * Created by student on 30.10.2017.
 */
public class InstrumentMain {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar(6);
        instruments[1] = new Drum(50);
        instruments[2] = new Tube(10);

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
