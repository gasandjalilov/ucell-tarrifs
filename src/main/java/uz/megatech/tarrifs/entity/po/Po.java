
package uz.megatech.tarrifs.entity.po;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Frozen;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Po implements Serializable
{
    @PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED,
            ordinal = 0,
            ordering = Ordering.DESCENDING)
    private Integer ratePlanId;
    @PrimaryKeyColumn(type = PrimaryKeyType.CLUSTERED,
            ordinal = 1,
            ordering = Ordering.DESCENDING)
    private String titleRus;
    @PrimaryKeyColumn(type = PrimaryKeyType.CLUSTERED,
            ordinal = 2,
            ordering = Ordering.DESCENDING)
    private String titleUz;
    private String subtitleRus;
    private String subtitleUz;
    private String pdfUrlRus;
    private String pdfUrlUz;
    private String websiteLincRus;
    private String websiteLincUz;
    private Boolean archive;
    @Frozen
    private PricesOverLimit pricesOverLimit;
    @Frozen
    private InternationalCommunication internationalCommunication;
    @Frozen
    @CassandraType(type = CassandraType.Name.SET, typeArguments = CassandraType.Name.UDT, userTypeName = "faq")
    private List<Faq> faq = null;
    @Frozen
    @CassandraType(type = CassandraType.Name.SET, typeArguments = CassandraType.Name.UDT, userTypeName = "po_limit")
    private List<Limit> limits = null;
}
