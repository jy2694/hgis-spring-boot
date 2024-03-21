package kr.ac.wku.hgis.repository;

import kr.ac.wku.hgis.entity.BoundaryCoordinate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoundaryCoordinateRepository extends JpaRepository<BoundaryCoordinate, Long> {

    List<BoundaryCoordinate> findAllByCity(Long city);
}
