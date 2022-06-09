package Medien;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MedienDataService {
    private HashMap<Integer, MediumDto> medien = new HashMap<>();


    /*
    *
    private String medienArt;
    private String systematik;
    private String isbn;
    * */
    public void createInitialMedien(){
        MediumDto m1 = new MediumDto();
        m1.setMedienNummer(123);
        m1.setJahr(2000);
        m1.setVerfasser("Ich, Du, Er, Sie, Es");
        m1.setSachtitel("Wir, Ihr, Sie");

        m1.setMedienArt("art");
        m1.setSystematik("sys");
        m1.setIsbn("1293847");

        this.medien.put(m1.getMedienNummer(), m1);

        MediumDto m2 = new MediumDto();
        m2.setMedienNummer(420);
        m2.setJahr(2003);
        m2.setVerfasser("Coole Verfasser");
        m2.setSachtitel("Cooler Titel");

        m2.setMedienArt("art2");
        m2.setSystematik("sus");
        m2.setIsbn("123412312");

        this.medien.put(m2.getMedienNummer(), m2);

        MediumDto m3 = new MediumDto();
        m3.setMedienNummer(69);
        m3.setJahr(1997);
        m3.setVerfasser("fade Verfasser");
        m3.setSachtitel("fader Titel");

        m3.setMedienArt("art3");
        m3.setSystematik("amogus");
        m3.setIsbn("6789670");

        this.medien.put(m3.getMedienNummer(), m3);
    }

    public List<MediumDto> getMedien(){
        return medien.values().stream().toList();
    }

    public void addMedium(MediumDto medium){
        this.medien.put(medium.getMedienNummer(), medium);
    }
}
