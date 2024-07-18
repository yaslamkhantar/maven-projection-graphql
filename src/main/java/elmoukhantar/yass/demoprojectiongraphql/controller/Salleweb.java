package elmoukhantar.yass.demoprojectiongraphql.controller;
import elmoukhantar.yass.demoprojectiongraphql.entities.SalleSport;
import elmoukhantar.yass.demoprojectiongraphql.repository.sallerepository;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@AllArgsConstructor
public class Salleweb {
    private sallerepository sallerepository;

    @QueryMapping
    public List<SalleSport> getall(){
        return sallerepository.findAll();
    }
   @QueryMapping
    public SalleSport getsallesportbyowner(@Argument String owner){
        return sallerepository.findByOwner(owner);
    }

}
