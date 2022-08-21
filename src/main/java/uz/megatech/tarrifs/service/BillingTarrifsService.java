package uz.megatech.tarrifs.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import uz.megatech.tarrifs.dto.po.PoDTO;

public interface BillingTarrifsService {

    Flux<PoDTO> getAllTarrifs();

    Mono<PoDTO> addTarrif(PoDTO poDTO);

    Flux<PoDTO> getTarrifByPhone(String phone);
}
