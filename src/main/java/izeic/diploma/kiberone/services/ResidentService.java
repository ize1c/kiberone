package izeic.diploma.kiberone.services;

import izeic.diploma.kiberone.dto.ResidentDto;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface ResidentService {
    List<ResidentDto> findAllResidents();

    List<ResidentDto> findResidentById(Long id);

}
