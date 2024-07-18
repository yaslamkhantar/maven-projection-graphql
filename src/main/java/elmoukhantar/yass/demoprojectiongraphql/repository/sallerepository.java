package elmoukhantar.yass.demoprojectiongraphql.repository;

import elmoukhantar.yass.demoprojectiongraphql.entities.SalleSport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface sallerepository extends JpaRepository<SalleSport, Integer> {
   SalleSport findByOwner(String owner);
}
