package Medien;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MedienDataService {
    private HashMap<Integer, MediumDto> medien = new HashMap<>();

    public void createInitialMedien(){
        MediumDto m1 = new MediumDto();
        m1.setMedienNummer(123);
        m1.setJahr(2000);
        m1.setVerfasser("Ich, Du, Er, Sie, Es");
        m1.setSachtitel("Wir, Ihr, Sie");

        this.medien.put(m1.getMedienNummer(), m1);

        MediumDto m2 = new MediumDto();
        m2.setMedienNummer(420);
        m2.setJahr(2003);
        m2.setVerfasser("Coole Verfasser");
        m2.setSachtitel("Cooler Titel");

        this.medien.put(m2.getMedienNummer(), m2);

        MediumDto m3 = new MediumDto();
        m3.setMedienNummer(69);
        m3.setJahr(1997);
        m3.setVerfasser("fade Verfasser");
        m3.setSachtitel("fader Titel");

        this.medien.put(m3.getMedienNummer(), m3);
    }

    public List<MediumDto> getMedien(){
        return medien.values().stream().toList();
    }
}
