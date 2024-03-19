package kr.ac.wku.hgis.repository;

import kr.ac.wku.hgis.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
