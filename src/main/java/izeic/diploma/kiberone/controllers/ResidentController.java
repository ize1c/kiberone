package izeic.diploma.kiberone.controllers;

import izeic.diploma.kiberone.dto.ResidentDto;
import izeic.diploma.kiberone.models.Resident;
import izeic.diploma.kiberone.repository.ResidentRepository;
import izeic.diploma.kiberone.services.ResidentService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ResidentController {
    private ResidentService residentService;
    private ResidentRepository residentRepository;

    public ResidentController(ResidentService residentService) {
        this.residentService = residentService;
    }

    @GetMapping("/residents")
    public String listResidents(Model model) {
        List<ResidentDto> residents = residentService.findAllResidents();
        model.addAttribute("residents", residents);
        return "residents";
    }

    @GetMapping("/residents/new")
    public String newResident(Model model){
        return "residents-new";
    }

    @PostMapping("/residents/new")
    public String AddResident(Model model, @RequestParam String name, @RequestParam String surname,
                              @RequestParam Long subCost, @RequestParam int kiberoneAmount){
        Resident resident = new Resident(name, surname, subCost, kiberoneAmount);
        return "redirect:/residents";
    }

    @PostMapping("/residents/{id}/remove")
    public String deleteResident(@PathVariable(value = "id") Long id, Model model){
        Resident resident = residentRepository.findById(id).orElseThrow();
        residentRepository.delete(resident);
        return "redirect:/residents";
    }
}
