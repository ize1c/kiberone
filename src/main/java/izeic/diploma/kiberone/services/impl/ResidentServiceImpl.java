package izeic.diploma.kiberone.services.impl;

import izeic.diploma.kiberone.dto.ResidentDto;
import izeic.diploma.kiberone.models.Resident;
import izeic.diploma.kiberone.repository.ResidentRepository;
import izeic.diploma.kiberone.services.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResidentServiceImpl implements ResidentService {
    private ResidentRepository residentRepository;

    @Autowired
    public ResidentServiceImpl(ResidentRepository residentRepository) {
        this.residentRepository = residentRepository;
    }

    @Override
    public List<ResidentDto> findAllResidents() {
        List<Resident> residents = residentRepository.findAll();
        return residents.stream().map(resident -> mapToResidentDto(resident)).collect(Collectors.toList());
    }

    @Override
    public List<ResidentDto> findResidentById(Long id) {
        List<Resident> residents = residentRepository.findAllById(Collections.singleton(id));
        return residents.stream().map(resident -> mapToResidentDto(resident)).collect(Collectors.toList());
    }

    private ResidentDto mapToResidentDto(Resident resident){
        ResidentDto residentDto = ResidentDto.builder()
                .id(resident.getId())
                .name(resident.getName())
                .surname(resident.getSurname())
                .kiberoneAmount(resident.getKiberoneAmount())
                .createdOn(resident.getCreatedOn())
                .build();
        return residentDto;
    }
}
