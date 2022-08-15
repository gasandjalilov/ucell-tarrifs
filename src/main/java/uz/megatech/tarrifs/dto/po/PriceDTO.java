
package uz.megatech.tarrifs.dto.po;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class PriceDTO implements Serializable
{
    private final static long serialVersionUID = -2538502362577777165L;


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
