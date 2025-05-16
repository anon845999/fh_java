package at.fh.controller;

import at.fh.dto.SoftwareEngineerDTO;
import at.fh.model.SoftwareEngineer;
import at.fh.service.SoftwareEngineerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/softwareengineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService SoftwareEngineerService;


    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        SoftwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    public List<SoftwareEngineerDTO> getEngineers() {
        return SoftwareEngineerService.getSoftwareEngineers();
    }

    @PostMapping("/addengineers")
    public SoftwareEngineerDTO addEngineer(@RequestBody SoftwareEngineerDTO dto) {
        return SoftwareEngineerService.addSoftwareEngineer(dto);
    }







}
