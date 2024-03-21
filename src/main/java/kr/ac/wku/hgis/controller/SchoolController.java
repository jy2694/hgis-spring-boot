package kr.ac.wku.hgis.controller;

import kr.ac.wku.hgis.service.SchoolService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class SchoolController {
    private final SchoolService schoolService;

    @GetMapping("api/school")
    public ResponseEntity<Object> getSchool(@RequestParam(required = false) String parent, @RequestParam(required = false) String name){
        if(name == null || parent == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(schoolService.findByCity(parent, name));
    }
}
