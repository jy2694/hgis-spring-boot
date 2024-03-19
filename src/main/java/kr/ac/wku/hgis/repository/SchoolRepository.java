package kr.ac.wku.hgis.repository;

import kr.ac.wku.hgis.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Long> {
}
