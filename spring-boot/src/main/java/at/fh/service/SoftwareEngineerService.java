package at.fh.service;

import at.fh.dto.SoftwareEngineerDTO;
import at.fh.model.SoftwareEngineer;
import at.fh.repositories.SoftwareEngineerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {

    private final SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;

    }

    //Alle Entities als DTOs zurückgeben
    public List<SoftwareEngineerDTO> getSoftwareEngineers() {
        List<SoftwareEngineer> softwareEngineers = softwareEngineerRepository.findAll();
        return softwareEngineers.stream()
                .map(this::convertToDTO).toList();
    }

    //einen neuen SoftwareEntwickler anlegen anhand eines DTOs
    public SoftwareEngineerDTO addSoftwareEngineer(SoftwareEngineerDTO dto) {
        SoftwareEngineer entity = convertToEntity(dto);
        SoftwareEngineer saved = softwareEngineerRepository.save(entity);
        return convertToDTO(saved);

    }

    public void deleteSoftwareEngineer(long id) {
        softwareEngineerRepository.deleteById(id);
    }

    public SoftwareEngineerDTO getSoftwareEngineerById(long id) {
        return softwareEngineerRepository.findById(id)
                .map(this::convertToDTO)
                .orElse(null);
    }

    public SoftwareEngineerDTO updateSoftwareEngineer(Long id, SoftwareEngineerDTO dto) {
        return softwareEngineerRepository.findById(id)
                .map(existing -> {
                    existing.setName(dto.getName());
                    existing.setTechStack(dto.getTechStack());
                    SoftwareEngineer updated = softwareEngineerRepository.save(existing);
                    return convertToDTO(updated);
                })
                .orElse(null);
    }





    private SoftwareEngineerDTO convertToDTO(SoftwareEngineer entity) {
        return new SoftwareEngineerDTO(entity.getName(), entity.getTechStack());

    }

    private SoftwareEngineer convertToEntity(SoftwareEngineerDTO dto) {
        SoftwareEngineer entity = new SoftwareEngineer();
        entity.setName(dto.getName());
        entity.setTechStack(dto.getTechStack());
        return entity;
    }


}
