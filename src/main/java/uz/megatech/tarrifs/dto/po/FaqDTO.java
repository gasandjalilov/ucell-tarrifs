
package uz.megatech.tarrifs.dto.po;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "questionRus",
    "questionUz",
    "answerRus",
    "answerUz"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FaqDTO implements Serializable
{
    private final static long serialVersionUID = 6937269200066358834L;


    @JsonProperty("questionRus")
    private String questionRus;
    @JsonProperty("questionUz")
    private String questionUz;
    @JsonProperty("answerRus")
    private String answerRus;
    @JsonProperty("answerUz")
    private String answerUz;

}
