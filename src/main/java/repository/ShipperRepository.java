package repository;

import entity.ShipperEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShipperRepository extends JpaRepository<ShipperEntity,Integer> {
    List<ShipperEntity> findByIsOnline();
}
