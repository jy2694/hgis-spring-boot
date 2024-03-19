package kr.ac.wku.hgis;

import kr.ac.wku.hgis.entity.City;
import kr.ac.wku.hgis.repository.CityRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DBTest {

    @Autowired
    private CityRepository cityRepository;

    @Test
    void citySave(){
        City city = City.builder()
                .id(1L)
                .parent("서울특별시")
                .name("강서구")
                .polygon("test polygon")
                .coordinateLength(10L)
                .build();

        cityRepository.save(city);

        City find = cityRepository.findById(city.getId()).get();
        assertEquals("강서구", find.getName());
    }
}
