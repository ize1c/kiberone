package izeic.diploma.kiberone.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ResidentDto {
    private Long id;
    private String name;
    private String surname;
    private Long subCost;
    private int kiberoneAmount;
    private LocalDateTime createdOn;
}
