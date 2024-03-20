package kr.ac.wku.hgis.repository;

import kr.ac.wku.hgis.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SchoolRepository extends JpaRepository<School, Long> {
    List<School> findSchoolByNameContaining(String name);

    List<School> findSchoolsByCityContaining(String city);
    Optional<School> findSchoolByName(String name);
}
