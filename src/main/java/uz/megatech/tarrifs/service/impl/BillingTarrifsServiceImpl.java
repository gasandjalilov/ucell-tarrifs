package uz.megatech.tarrifs.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import uz.megatech.tarrifs.dto.po.PoDTO;
import uz.megatech.tarrifs.repository.PoRepository;
import uz.megatech.tarrifs.service.BillingTarrifsService;
import uz.megatech.tarrifs.service.helper.BillingHelper;

@Slf4j
@RequiredArgsConstructor
@Service
public class BillingTarrifsServiceImpl implements BillingTarrifsService {

    private final BillingHelper billingHelper;

    @Override
    public Flux<PoDTO> getAllTarrifs() {
        return billingHelper.findAll();
    }

    @Override
    public Mono<PoDTO> addTarrif(PoDTO poDTO) {
        return billingHelper.add(poDTO);
    }

    @Override
    public Flux<PoDTO> getTarrifByPhone(String phone) {
        return billingHelper.findAll();
    }

    @Override
    public Mono<PoDTO> getTarrifByRate(Integer rate) {
        return billingHelper.getByRate(rate);
    }
}
