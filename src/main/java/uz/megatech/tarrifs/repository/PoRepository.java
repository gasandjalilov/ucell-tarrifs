package uz.megatech.tarrifs.repository;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;
import uz.megatech.tarrifs.entity.po.Po;

import java.util.UUID;

@Repository
public interface PoRepository extends ReactiveCassandraRepository<Po, Integer> {

    Mono<Po> findByRatePlanId(Integer rate);
}
