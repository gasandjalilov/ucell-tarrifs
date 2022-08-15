
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
    "ratePlanId",
    "titleRus",
    "titleUz",
    "subtitleRus",
    "subtitleUz",
    "pdfUrlRus",
    "pdfUrlUz",
    "websiteLincRus",
    "websiteLincUz",
    "archive",
    "pricesOverLimit",
    "internationalCommunication",
    "faq",
    "limits"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PoDTO implements Serializable
{
    private final static long serialVersionUID = -4294449155750921770L;

    @JsonProperty("ratePlanId")
    private Integer ratePlanId;
    @JsonProperty("titleRus")
    private String titleRus;
    @JsonProperty("titleUz")
    private String titleUz;
    @JsonProperty("subtitleRus")
    private String subtitleRus;
    @JsonProperty("subtitleUz")
    private String subtitleUz;
    @JsonProperty("pdfUrlRus")
    private String pdfUrlRus;
    @JsonProperty("pdfUrlUz")
    private String pdfUrlUz;
    @JsonProperty("websiteLincRus")
    private String websiteLincRus;
    @JsonProperty("websiteLincUz")
    private String websiteLincUz;
    @JsonProperty("archive")
    private Boolean archive;
    @JsonProperty("pricesOverLimit")
    private PricesOverLimitDTO pricesOverLimit;
    @JsonProperty("internationalCommunication")
    private InternationalCommunicationDTO internationalCommunication;
    @JsonProperty("faq")
    private List<FaqDTO> faq = null;
    @JsonProperty("limits")
    private List<LimitDTO> limits = null;


}
