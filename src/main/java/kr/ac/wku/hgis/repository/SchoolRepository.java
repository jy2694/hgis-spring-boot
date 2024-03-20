package kr.ac.wku.hgis.repository;

import kr.ac.wku.hgis.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SchoolRepository extends JpaRepository<School, Long> {
    List<School> findByNameLike(String name);
    List<School> findByCityLike(String city);
    Optional<School> findByName(String name);
}
