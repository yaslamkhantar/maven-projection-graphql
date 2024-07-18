package elmoukhantar.yass.demoprojectiongraphql.repository;

import elmoukhantar.yass.demoprojectiongraphql.entities.Adherent;
import elmoukhantar.yass.demoprojectiongraphql.projection.Adherentprojection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = Adherentprojection.class)
public interface adhererentrepo extends JpaRepository<Adherent,String> {
}
