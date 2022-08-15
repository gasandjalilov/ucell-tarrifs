package uz.megatech.tarrifs.entity.mapper;

import org.mapstruct.Mapper;
import uz.megatech.tarrifs.dto.po.FaqDTO;
import uz.megatech.tarrifs.entity.po.Faq;

@Mapper(componentModel = "spring")
public interface FaqMapper extends MainMap<Faq, FaqDTO>{
}
