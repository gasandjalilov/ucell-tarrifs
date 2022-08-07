package uz.megatech.tarrifs.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.UUID;

@Table
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Po implements Serializable {
    @PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED,ordinal = 0,ordering = Ordering.DESCENDING)
    private UUID id;

    private long inetValue;

    private long callValue;

    private long smsValue;

    private Map<String,String>

}
