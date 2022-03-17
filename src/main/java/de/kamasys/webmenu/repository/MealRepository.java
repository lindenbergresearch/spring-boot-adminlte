package de.kamasys.webmenu.repository;

import de.kamasys.webmenu.model.*;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MealRepository<ID> extends JpaRepository<Meal, ID> {


    List<Meal> findByMealCategory(MealCategory mc, Sort sort);
}
