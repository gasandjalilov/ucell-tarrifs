package uz.megatech.tarrifs.entity.mapper;

import org.mapstruct.Mapper;
import uz.megatech.tarrifs.dto.po.PriceDTO;
import uz.megatech.tarrifs.entity.po.Price;

@Mapper(componentModel = "spring")
public interface PriceMapper extends MainMap<Price, PriceDTO>{
}
