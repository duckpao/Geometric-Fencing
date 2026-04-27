package repository;

import entity.GeofencesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FencesRepository extends JpaRepository<GeofencesEntity, Long> {

}
