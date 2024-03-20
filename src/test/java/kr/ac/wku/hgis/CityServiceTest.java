package kr.ac.wku.hgis;

import kr.ac.wku.hgis.entity.City;
import kr.ac.wku.hgis.service.CityService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CityServiceTest {

    @Autowired
    private CityService cityService;

    @Test
    void cityServiceFindByName(){

        City find = cityService.findByName("강서구").get();
        System.out.println(find);
        assertEquals("강서구", find.getName());
    }

    @Test
    void cityServiceFindByParent(){

        List<City> find = cityService.findByParent("서울특별시");
        assertEquals(1, find.size());
    }
}
