package uz.megatech.tarrifs.entity.mapper;

import org.mapstruct.Mapper;
import uz.megatech.tarrifs.dto.po.PricesOverLimitDTO;
import uz.megatech.tarrifs.entity.po.PricesOverLimit;
@Mapper(componentModel = "spring")
public interface PriceOverLimitMapper extends MainMap<PricesOverLimit, PricesOverLimitDTO>{
}
