package hu.nye.salt.repository;

import java.util.List;

import hu.nye.salt.entity.SaluteEntity;
import org.springframework.data.repository.CrudRepository;

public interface ISaluteRepository extends CrudRepository<SaluteEntity, Long> {
    List<SaluteEntity> findAllByLocation(String location);
}
