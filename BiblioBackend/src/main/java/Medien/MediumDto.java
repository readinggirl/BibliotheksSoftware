package Medien;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class MediumDto {
    @Id
    private int medienNummer;
    private String sachtitel;
    private String verfasser;
    private int jahr;
}
