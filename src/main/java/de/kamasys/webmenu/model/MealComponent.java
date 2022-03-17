package de.kamasys.webmenu.model;

import lombok.*;

import javax.persistence.*;
import java.util.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class MealComponent extends AbstractModel<Long> {
    String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "meal_id")
    Meal meal;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "meal_component_category_ID")
    MealComponentCategory mealComponentCategory;

    @OneToMany(mappedBy = "meal", cascade = CascadeType.ALL)
    List<Additive> additives = new ArrayList<>();

    @OneToMany(mappedBy = "meal", cascade = CascadeType.ALL)
    List<Allergen> allergens = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "nutritional_values_id", referencedColumnName = "id")
    NutritionalValues nutritionalValues;
}
