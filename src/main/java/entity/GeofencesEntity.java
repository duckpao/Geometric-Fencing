package entity;

import jakarta.persistence.*;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Data
@Table

public class GeofencesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "zone_name")
    private String zoneName;
    @Column(name = "center_lat")
    private String centerLat;
    @Column(name = "center_lon")
    private String centerLon;

    @Column(name = "radius_meter")
    private String radiusMeter;
    @Column(name = "is_forbidden")
    private String isForbidden;

}