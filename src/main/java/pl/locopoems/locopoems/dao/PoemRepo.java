package pl.locopoems.locopoems.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.locopoems.locopoems.dao.Entity.Poem;

@Repository
public interface PoemRepo extends CrudRepository<Poem,Long> {
}
