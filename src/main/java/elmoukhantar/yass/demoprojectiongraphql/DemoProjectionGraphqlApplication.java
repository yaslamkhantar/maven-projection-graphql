package elmoukhantar.yass.demoprojectiongraphql;

import elmoukhantar.yass.demoprojectiongraphql.entities.Adherent;
import elmoukhantar.yass.demoprojectiongraphql.entities.SalleSport;
import elmoukhantar.yass.demoprojectiongraphql.repository.adhererentrepo;
import elmoukhantar.yass.demoprojectiongraphql.repository.sallerepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoProjectionGraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoProjectionGraphqlApplication.class, args);
    }

    @Bean
    CommandLineRunner start(sallerepository sallerepositor, adhererentrepo adherentrepository){
        return args->{

           sallerepositor.save(new SalleSport("punchbybadrhari","CCC","casablanca",400));
            sallerepositor.save(new SalleSport("passagefitness","BBB","Tanger",700));
            sallerepositor.save(new SalleSport("plazza","AAA","FES",200));


            adherentrepository.save(new Adherent("pald","elmoukhantar","yassine","casablanca","068347474"));
            adherentrepository.save(new Adherent("palx","bennali","mouaad","tanger","9484848484"));
            adherentrepository.save(new Adherent("pbol","abidar","yassine","marrakesh","093374747"));
            adherentrepository.save(new Adherent("spal","azami","omar","fes","833838833"));
            adherentrepository.save(new Adherent("apoi","laklalech","taha","fes","0833353534"));




        };
    }

}
