package de.kamasys.webmenu.repository;

import de.kamasys.webmenu.model.Allergen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllergenRepository<Long, ID> extends JpaRepository<Allergen, ID> {
}
