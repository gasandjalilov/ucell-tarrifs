package uz.megatech.tarrifs.entity.mapper;

import org.mapstruct.Mapper;
import uz.megatech.tarrifs.dto.po.PoDTO;
import uz.megatech.tarrifs.entity.po.Po;

@Mapper(componentModel = "spring")
public interface PoMapper extends MainMap<Po, PoDTO> {
}
