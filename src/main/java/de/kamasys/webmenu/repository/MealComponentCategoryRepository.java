package de.kamasys.webmenu.repository;

import de.kamasys.webmenu.model.MealComponentCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MealComponentCategoryRepository<ID> extends JpaRepository<MealComponentCategory, ID> {

    Optional<MealComponentCategory> findByName(String name);


    MealComponentCategory findByIdEquals(ID id);


    @Override
    boolean existsById(ID id);


    boolean existsByName(String name);
}
