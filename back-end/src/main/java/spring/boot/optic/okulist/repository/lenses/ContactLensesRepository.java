package spring.boot.optic.okulist.repository.lenses;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.boot.optic.okulist.model.lenses.ContactLenses;

@Repository
public interface ContactLensesRepository extends JpaRepository<ContactLenses, Long> {
    List<ContactLenses> findAll(Specification<ContactLenses> specification);

    List<ContactLenses> findByNameAndIsDeletedFalse(String name);

    Optional<ContactLenses> findByIdentifier(String identifier);

    List<ContactLenses> findAllByOrderByIdDesc(Pageable pageable);
}
