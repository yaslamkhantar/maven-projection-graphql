package elmoukhantar.yass.demoprojectiongraphql.controller;
import elmoukhantar.yass.demoprojectiongraphql.entities.Adherent;
import elmoukhantar.yass.demoprojectiongraphql.repository.adhererentrepo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
@AllArgsConstructor
public class Adherentweb {

    private adhererentrepo adhererentrepo;

    @GetMapping("/adherent")
    public List<Adherent> findAlladherent(){
        return adhererentrepo.findAll();
    }
    @GetMapping("/{cin}")
    public Adherent findbycin(@PathVariable("cin") String cin){
        return adhererentrepo.findById(cin).get();
    }



}
