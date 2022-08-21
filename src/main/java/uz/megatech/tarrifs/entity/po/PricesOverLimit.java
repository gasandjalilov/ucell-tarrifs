
package uz.megatech.tarrifs.entity.po;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Frozen;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@UserDefinedType("price_over_limit")
public class PricesOverLimit implements Serializable
{
    private final static long serialVersionUID = -333308603595080728L;
    @Frozen
    @CassandraType(type = CassandraType.Name.SET, typeArguments = CassandraType.Name.UDT, userTypeName = "price")
    private List<Price> prices = null;
    private Boolean isHidden;

}
