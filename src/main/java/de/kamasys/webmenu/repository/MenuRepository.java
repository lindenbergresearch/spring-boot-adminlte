package de.kamasys.webmenu.repository;

import de.kamasys.webmenu.model.Menu;
import org.springframework.data.repository.CrudRepository;

public interface MenuRepository<Long, ID> extends CrudRepository<Menu, ID> {
}
