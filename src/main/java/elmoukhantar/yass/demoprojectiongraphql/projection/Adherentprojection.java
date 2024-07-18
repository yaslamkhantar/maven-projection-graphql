package elmoukhantar.yass.demoprojectiongraphql.projection;

import elmoukhantar.yass.demoprojectiongraphql.entities.Adherent;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "adherentwithprojection", types = {Adherent.class})
public interface Adherentprojection {
    String getCin();
    String getName();
    String getVille();
}
