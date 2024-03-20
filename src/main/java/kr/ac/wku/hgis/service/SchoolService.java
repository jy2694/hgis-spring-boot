package kr.ac.wku.hgis.service;

import kr.ac.wku.hgis.entity.School;
import kr.ac.wku.hgis.repository.SchoolRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SchoolService {
    private final SchoolRepository schoolRepository;

    public List<School> findByNameLike(String name){
        return schoolRepository.findByNameLike(name);
    }

    public Optional<School> findByName(String name){
        return schoolRepository.findByName(name);
    }

    public List<School> findByCity(String city){
        return schoolRepository.findByCityLike(city);
    }
}
