package uz.megatech.tarrifs.service.helper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import uz.megatech.tarrifs.dto.po.PoDTO;
import uz.megatech.tarrifs.entity.mapper.PoMapper;
import uz.megatech.tarrifs.repository.PoRepository;

@Service
@RequiredArgsConstructor
@Slf4j
public class BillingHelper {

    private final PoMapper poMapper;
    private final PoRepository poRepository;

    public Flux<PoDTO> findAll(){
        return poRepository.findAll()
                .map(poMapper::toDto);
    }

    public Mono<PoDTO> add(PoDTO poDTO){
        return poRepository.save(poMapper.toEntity(poDTO))
                .map(poMapper::toDto);
    }


}
