package uz.megatech.tarrifs.repository;

import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SoRepository extends ReactiveCassandraRepository<So, UUID> {
}
