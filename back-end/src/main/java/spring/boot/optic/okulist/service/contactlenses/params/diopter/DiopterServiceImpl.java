package spring.boot.optic.okulist.service.contactlenses.params.diopter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import spring.boot.optic.okulist.dto.contactlenses.parameters.diopter.DiopterRequestDto;
import spring.boot.optic.okulist.dto.contactlenses.parameters.diopter.DiopterResponseDto;
import spring.boot.optic.okulist.mapper.contactlenses.DiopterMapper;
import spring.boot.optic.okulist.model.lenses.parameters.Diopter;
import spring.boot.optic.okulist.repository.lenses.paramsrepository.DiopterRepository;

@Service
@RequiredArgsConstructor
public class DiopterServiceImpl implements DiopterService {

    private final DiopterRepository diopterRepository;
    private final DiopterMapper diopterMapper;

    @Override
    public DiopterResponseDto getDiopterById(Long id) {
        Diopter diopter = diopterRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Diopter not found with id: " + id));
        return diopterMapper.toDto(diopter);
    }

    @Override
    public DiopterResponseDto createDiopter(DiopterRequestDto diopterRequestDto) {
        Diopter diopter = diopterMapper.toModel(diopterRequestDto);
        Diopter savedDiopter = diopterRepository.save(diopter);
        return diopterMapper.toDto(savedDiopter);
    }
}