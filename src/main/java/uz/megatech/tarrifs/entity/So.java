package uz.megatech.tarrifs.entity;

import lombok.*;
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
public class So implements Serializable {

    @PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED,ordinal = 0,ordering = Ordering.DESCENDING)
    private UUID id;


}
