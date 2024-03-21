package kr.ac.wku.hgis.service;

import kr.ac.wku.hgis.entity.City;
import kr.ac.wku.hgis.entity.School;
import kr.ac.wku.hgis.repository.CityRepository;
import kr.ac.wku.hgis.repository.SchoolRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SchoolService {
    private final SchoolRepository schoolRepository;
    private final CityRepository cityRepository;

    public List<School> findByCity(String parent, String name){
        Optional<City> cityOptional = cityRepository.findCityByNameAndParent(name, parent);
        if(!cityOptional.isPresent()) return new ArrayList<>();
        City city = cityOptional.get();
        return schoolRepository.findSchoolByAddressStartsWith(city.getParent() + " " + city.getName());
    }
}
