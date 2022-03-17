package de.kamasys.webmenu.repository;

import de.kamasys.webmenu.model.MealCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface MealCategoryRepository<ID> extends JpaRepository<MealCategory, ID> {

    Optional<MealCategory> findByName(String name);


    MealCategory findByIdEquals(ID id);


    @Override
    boolean existsById(ID id);


    boolean existsByName(String name);
}
