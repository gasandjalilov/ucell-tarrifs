
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
@UserDefinedType("faq")
public class Faq implements Serializable
{
    private String questionRus;
    private String questionUz;
    private String answerRus;
    private String answerUz;

}
