package training.test.training1.controlleur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import training.test.training1.entity.Enseignant;
import training.test.training1.repository.Ensiegnantrepository;

import java.util.List;

@RestController
public class EnseignantControler {

    private Ensiegnantrepository ensiegnantrepository;
    private EnseignantControler(Ensiegnantrepository ensiegnantrepository){
        this.ensiegnantrepository=ensiegnantrepository;
    }

    @PostMapping(value ="/enseignants")
    public void addEnseignant(@RequestBody Enseignant enseignant){
        this.ensiegnantrepository.save(enseignant);
    }
    @GetMapping(value ="/enseignants")
    public List<Enseignant> getallenseignant(Enseignant enseignant){
        return this.ensiegnantrepository.findAll();
    }

}
