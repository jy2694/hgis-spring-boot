package kr.ac.wku.hgis.controller;

import kr.ac.wku.hgis.service.CityService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CityController {

    private final CityService cityService;

    @GetMapping("api/city")
    public ResponseEntity<Object> findCity(@RequestParam(required = false) String name, @RequestParam(required = false) String parent){
        if(name == null && parent == null) return ResponseEntity.notFound().build();
        if(name != null){
            return ResponseEntity.ok(cityService.findByName(name));
        } else {
            return ResponseEntity.ok(cityService.findByParent(parent));
        }
    }
}
