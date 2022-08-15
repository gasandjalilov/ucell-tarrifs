package uz.megatech.tarrifs.entity.mapper;

import org.mapstruct.Mapper;
import uz.megatech.tarrifs.dto.po.CommunicationDTO;
import uz.megatech.tarrifs.entity.po.Communication;

@Mapper(componentModel = "spring")
public interface CommunicationMapper extends MainMap<Communication, CommunicationDTO>{
}
