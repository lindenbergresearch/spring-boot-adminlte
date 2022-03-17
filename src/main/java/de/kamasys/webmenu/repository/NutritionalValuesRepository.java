package de.kamasys.webmenu.repository;

import de.kamasys.webmenu.model.NutritionalValues;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NutritionalValuesRepository<ID> extends JpaRepository<NutritionalValues, ID> {
}
