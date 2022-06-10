package Medien;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Medium {
    @Id
    private int medienNummer;
    private String medienArt;
    private String systematik;
    private String isbn;
    private String sachtitel;
    private String verfasser;
    private int jahr;
}
