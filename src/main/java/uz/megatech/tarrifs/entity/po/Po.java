
package uz.megatech.tarrifs.entity.po;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Po implements Serializable
{
    private Integer ratePlanId;
    private String titleRus;
    private String titleUz;
    private String subtitleRus;
    private String subtitleUz;
    private String pdfUrlRus;
    private String pdfUrlUz;
    private String websiteLincRus;
    private String websiteLincUz;
    private Boolean archive;
    private PricesOverLimit pricesOverLimit;
    private InternationalCommunication internationalCommunication;
    private List<Faq> faq = null;
    private List<Limit> limits = null;


}
