
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
import lombok.Value;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "titleRus",
    "titleUz",
    "valueRus",
    "valueUz",
    "descriptionRus",
    "descriptionUz",
    "isHiddenDescr"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommunicationDTO implements Serializable
{
    private final static long serialVersionUID = -732702198552291448L;

    @JsonProperty("titleRus")
    private String titleRus;
    @JsonProperty("titleUz")
    private String titleUz;
    @JsonProperty("valueRus")
    private String valueRus;
    @JsonProperty("valueUz")
    private String valueUz;
    @JsonProperty("descriptionRus")
    private String descriptionRus;
    @JsonProperty("descriptionUz")
    private String descriptionUz;
    @JsonProperty("isHiddenDescr")
    private Boolean isHiddenDescr;

}
