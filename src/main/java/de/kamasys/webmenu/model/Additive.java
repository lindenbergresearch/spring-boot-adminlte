package de.kamasys.webmenu.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class Additive extends AbstractModel<Long> {
    @Column(nullable = false)
    String name;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "meal_id")
    Meal meal;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "meal_component_id")
    MealComponent mealComponent;
}
