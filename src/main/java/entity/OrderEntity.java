package entity;

import enums.Status;
import jakarta.persistence.*;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Table
@Data
@Getter
@Setter
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "delivery_address")
    private String deliverAdd;
    @Column(name = "dest_lat")
    private String desLat;
    @Column(name = "dest_lon")
    private String desLon;
    @Column(name = "status")
    private Status status;

    @Column(name = "shipper_id")
    private ShipperEntity shipper;
}