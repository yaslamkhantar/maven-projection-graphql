package elmoukhantar.yass.demoprojectiongraphql.entities;

import jakarta.persistence.Entity;
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
@Data

public class SalleSport {
    @Id
    private String ref;
    private String name;
    private String owner;
    private String city;
    private Integer capacite;

}
