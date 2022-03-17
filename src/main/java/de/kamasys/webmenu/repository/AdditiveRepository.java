package de.kamasys.webmenu.repository;

import de.kamasys.webmenu.model.Additive;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdditiveRepository<ID> extends JpaRepository<Additive, ID> {
}
