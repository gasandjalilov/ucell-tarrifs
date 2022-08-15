
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
    "dcgrId",
    "descriptionRus",
    "descriptionUz",
    "isHiddenDescr",
    "valueRus",
    "valueUz",
    "icon"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LimitDTO implements Serializable
{
    private final static long serialVersionUID = -3546612254245230375L;


    @JsonProperty("dcgrId")
    private Integer dcgrId;
    @JsonProperty("descriptionRus")
    private String descriptionRus;
    @JsonProperty("descriptionUz")
    private String descriptionUz;
    @JsonProperty("isHiddenDescr")
    private Boolean isHiddenDescr;
    @JsonProperty("valueRus")
    private String valueRus;
    @JsonProperty("valueUz")
    private String valueUz;
    @JsonProperty("icon")
    private String icon;


}
