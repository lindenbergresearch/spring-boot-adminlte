package de.kamasys.webmenu.repository;

import de.kamasys.webmenu.model.MealComponent;
import org.springframework.data.repository.CrudRepository;

public interface MealComponentRepository<ID> extends CrudRepository<MealComponent, ID> {
}
