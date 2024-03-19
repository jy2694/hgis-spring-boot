package io.cloudtype.Demo.repository;

import io.cloudtype.Demo.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Long> {
}
