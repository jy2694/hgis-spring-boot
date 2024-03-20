package kr.ac.wku.hgis.repository;

import kr.ac.wku.hgis.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CityRepository extends JpaRepository<City, Long> {

    Optional<City> findCityByName(String name);

    List<City> findAllByParentContaining(String parent);
}
