package uz.megatech.tarrifs.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import uz.megatech.tarrifs.dto.po.PoDTO;
import uz.megatech.tarrifs.service.BillingTarrifsService;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/po")
public class TarrifController {

    private final BillingTarrifsService billingTarrifsService;

    @GetMapping
    public Flux<PoDTO> getAllTarrifs(){
        return billingTarrifsService.getAllTarrifs();
    }

    @PostMapping
    public Mono<PoDTO> addTarrif(@RequestBody PoDTO poDTO) {
        return billingTarrifsService.addTarrif(poDTO);
    }

    @GetMapping("/{rate}")
    public Mono<PoDTO> getByRate(@PathVariable Integer rate){
        return billingTarrifsService.getTarrifByRate(rate);
    }
}
