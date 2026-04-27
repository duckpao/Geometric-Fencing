package entity;

import enums.IsOnline;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@Table(name = "shippers")
public class ShipperEntity {
    @Id
    private int Id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "is_online")
    private IsOnline isOnline;
    @Column(name = "phone")
    private String phoneNumber;
    @Column(name = "vehicle_number")
    private String vehicleNumber;
    @Column(name = "created_at")
    private Date createDt;

}
