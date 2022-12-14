package training.test.training1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class Enseignant {

    @Id
    private String id;
    private String name;
    private String prenom;
    private String sexe;
    private String matiere;

    @OneToMany(targetEntity = Courses.class,mappedBy = "enseignant")
    private List<Courses> cours=new ArrayList<>();
}
