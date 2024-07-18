package elmoukhantar.yass.demoprojectiongraphql.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Adherent {
    @Id
    private String cin;
    private String nom;
    private String prenom;
    private String ville;
    private String telephone;
}
