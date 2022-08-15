
package uz.megatech.tarrifs.dto.po;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "prices",
    "isHidden"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PricesOverLimitDTO implements Serializable
{
    private final static long serialVersionUID = -333308603595080728L;

    @JsonProperty("prices")
    private List<PriceDTO> prices = null;
    @JsonProperty("isHidden")
    private Boolean isHidden;

}
