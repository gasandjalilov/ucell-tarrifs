
package uz.megatech.tarrifs.entity.po;
import lombok.*;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@UserDefinedType("communication")
public class Communication implements Serializable
{

    private String titleRus;
    private String titleUz;
    private String valueRus;
    private String valueUz;
    private String descriptionRus;
    private String descriptionUz;
    private Boolean isHiddenDescr;

}
