package telran.microservices.probes.entities;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name="persons")
public class Person {
    @Id
    long id;
    @Column(nullable = false, unique = true)
    String email;
    String name;
    @ManyToOne
    @JoinColumn(name = "sensor_id")
    Sensor sensor;

}
