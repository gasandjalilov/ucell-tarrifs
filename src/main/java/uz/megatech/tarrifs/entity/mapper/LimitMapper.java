package uz.megatech.tarrifs.entity.mapper;

import org.mapstruct.Mapper;
import uz.megatech.tarrifs.dto.po.LimitDTO;
import uz.megatech.tarrifs.entity.po.Limit;

@Mapper(componentModel = "spring")
public interface LimitMapper extends MainMap<Limit, LimitDTO>{
}
