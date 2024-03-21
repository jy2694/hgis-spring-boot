package kr.ac.wku.hgis.controller;

import kr.ac.wku.hgis.service.BoundaryCoordinateService;
import kr.ac.wku.hgis.service.CityService;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CityController {

    private final CityService cityService;
    private final BoundaryCoordinateService boundaryCoordinateService;

    @GetMapping("api/city")
    public ResponseEntity<Object> findCity(@RequestParam String parent, @RequestParam(required = false) String name){
        if(name == null){
            return ResponseEntity.ok(cityService.findByParent(parent));
        } else {
            return ResponseEntity.ok(cityService.findByNameAndParent(name, parent));
        }
    }

    @GetMapping("api/boundary")
    public ResponseEntity<Object> findCityBoundary(@RequestParam String parent, @RequestParam String name){
        return ResponseEntity.ok(boundaryCoordinateService.getBoundary(parent, name));
    }
}
