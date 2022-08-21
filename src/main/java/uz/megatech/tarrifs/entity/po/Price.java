
package uz.megatech.tarrifs.entity.po;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@UserDefinedType("price")
public class Price implements Serializable
{
    private String titleRus;
    private String titleUz;
    private String valueRus;
    private String valueUz;
    private String descriptionRus;
    private String descriptionUz;
    private Boolean isHiddenDescr;

}
