package elmoukhantar.yass.demoprojectiongraphql;

import elmoukhantar.yass.demoprojectiongraphql.entities.SalleSport;
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
    CommandLineRunner start(sallerepository sallerepositor){
        return args->{
        /*    sallerepositor.save(new SalleSport("123H","punchbybadrhari","anis","casablanca",400,null));
            sallerepositor.save(new SalleSport("14OP","passagefitness","mouad","Tanger",700,null));
            sallerepositor.save(new SalleSport("HUIP","plazza","laklalech","FES",200,null));
            adherentrepository.save(new Adherent(13,"elmoukhantar","masculin",27,sallerepositor.findById("123H").get()));*/
            sallerepositor.save(new SalleSport("123H","punchbybadrhari","anis","casablanca",400));
            sallerepositor.save(new SalleSport("14OP","passagefitness","mouad","Tanger",700));
            sallerepositor.save(new SalleSport("HUIP","plazza","laklalech","FES",200));



          /*  Adherent ad1=new Adherent(13,"elmoukhantar","masculin",27,null);
            Adherent ad2=new Adherent(98,"smail","masculin",29,null);
            Adherent ad3=new Adherent(99,"souad","femme",18,null);
            sallerepositor.save(new SalleSport("123H","punchbybadrhari","anis","casablanca",400,ad2));*/



        };
    }

}
