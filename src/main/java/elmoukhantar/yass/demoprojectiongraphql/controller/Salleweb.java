package elmoukhantar.yass.demoprojectiongraphql.controller;
import elmoukhantar.yass.demoprojectiongraphql.entities.SalleSport;
import elmoukhantar.yass.demoprojectiongraphql.repository.sallerepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class Salleweb {
    private sallerepository sallerepository;

    @GetMapping("/getall")
    public List<SalleSport> getall(){
        return sallerepository.findAll();
    }
    @GetMapping("/{owner}")
    public SalleSport getonesallesport(@PathVariable String owner){
        return sallerepository.findByOwner(owner);
    }

}
