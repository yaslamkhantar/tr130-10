package training.test.training1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

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
}
