package elmoukhantar.yass.demoprojectiongraphql.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString


public class SalleSport {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String owner;
    private String city;
    private Integer capacite;
public SalleSport(String name, String owner, String city, Integer capacite) {
    this.name = name;
    this.owner = owner;
    this.city = city;
    this.capacite = capacite;
}


}
