package de.kamasys.webmenu.model;

import lombok.*;

import javax.persistence.*;
import java.util.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MealCategory extends AbstractModel<Long> {
    @Column(nullable = false, unique = true)
    String name;

    @OneToMany(mappedBy = "mealCategory", cascade = CascadeType.ALL)
    List<Meal> meals = new ArrayList<>();


    /**
     * @param name
     */
    public MealCategory(String name) {
        this.name = name;
    }


    /**
     * @param name
     * @param meal
     */
    public MealCategory(String name, Meal meal) {
        this.name = name;
        this.meals.add(meal);
    }
}
