package io.cloudtype.Demo.repository;

import io.cloudtype.Demo.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
