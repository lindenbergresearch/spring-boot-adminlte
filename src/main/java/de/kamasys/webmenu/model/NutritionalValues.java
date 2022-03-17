package de.kamasys.webmenu.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class NutritionalValues extends AbstractModel<Long> {
    int kiloJoule;
    int kiloCalorie;
    float carboHydrates;
    float fat;
    float fattyAcids;
    float protein;
    float sugar;
    float salt;

    @OneToOne(mappedBy = "nutritionalValues")
    Meal meal;

    @OneToOne(mappedBy = "nutritionalValues")
    MealComponent mealComponent;
}
