package de.kamasys.webmenu.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class Allergen extends AbstractModel<Long> {
    @Column(nullable = false)
    String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "meal_id")
    Meal meal;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "meal_component_id")
    MealComponent mealComponent;
}
