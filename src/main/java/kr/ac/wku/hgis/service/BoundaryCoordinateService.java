package kr.ac.wku.hgis.service;

import kr.ac.wku.hgis.entity.BoundaryCoordinate;
import kr.ac.wku.hgis.entity.City;
import kr.ac.wku.hgis.repository.BoundaryCoordinateRepository;
import kr.ac.wku.hgis.repository.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BoundaryCoordinateService {
    private final BoundaryCoordinateRepository boundaryCoordinateRepository;
    private final CityRepository cityRepository;

    public List<BoundaryCoordinate> getBoundary(String parent, String city){
        Optional<City> cityOptional = cityRepository.findCityByNameAndParent(city, parent);
        if(!cityOptional.isPresent()) return new ArrayList<>();
        return boundaryCoordinateRepository.findAllByCity(cityOptional.get().getId());
    }
}
