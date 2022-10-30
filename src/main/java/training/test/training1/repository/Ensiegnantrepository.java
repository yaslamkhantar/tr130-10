package training.test.training1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import training.test.training1.entity.Enseignant;
@RepositoryRestResource
public interface Ensiegnantrepository extends JpaRepository<Enseignant,String>
{
}
