package kr.ac.wku.hgis.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@AllArgsConstructor
@Entity
public class City {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String parent;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String polygon;

    @Column(nullable = false)
    private Long coordinateLength;

}
