
package uz.megatech.tarrifs.dto.po;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
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
    "communications",
    "isHidden"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InternationalCommunicationDTO implements Serializable
{

    private final static long serialVersionUID = 8326479407438016767L;

    @JsonProperty("communications")
    private List<CommunicationDTO> communications = null;
    @JsonProperty("isHidden")
    private Boolean isHidden;


}
