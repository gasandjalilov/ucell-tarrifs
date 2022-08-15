package uz.megatech.tarrifs.entity.mapper;

import org.mapstruct.Mapper;
import uz.megatech.tarrifs.dto.po.InternationalCommunicationDTO;
import uz.megatech.tarrifs.entity.po.InternationalCommunication;

@Mapper(componentModel = "spring")
public interface InternationalCommunicationMapper extends MainMap<InternationalCommunication, InternationalCommunicationDTO>{
}
