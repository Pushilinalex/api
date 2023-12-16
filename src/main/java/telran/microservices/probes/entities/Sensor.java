package telran.microservices.probes.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sensors")
public class Sensor {
    @Id
    long id;
    @Column(nullable = false, unique = true)
    String purpose;
    @Column(name="min_value")
    double minValue;
    @Column(name="max_value")
    double maxValue;

}
