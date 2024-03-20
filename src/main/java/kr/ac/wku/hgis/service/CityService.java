package kr.ac.wku.hgis.service;

import kr.ac.wku.hgis.entity.City;
import kr.ac.wku.hgis.repository.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CityService {

    private final CityRepository cityRepository;

    public Optional<City> findByName(String name){
        return cityRepository.findCityByName(name);
    }

    public List<City> findByParent(String name){
        return cityRepository.findAllByParentContaining(name);
    }
}
