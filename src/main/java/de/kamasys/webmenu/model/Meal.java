package de.kamasys.webmenu.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Meal extends AbstractModel<Long> {
    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    LocalDate date;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "meal_category_id")
    MealCategory mealCategory;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "menu_id")
    Menu menu;

    @OneToMany(mappedBy = "meal", cascade = CascadeType.ALL)
    List<MealComponent> mealComponents = new ArrayList<>();

    @OneToMany(mappedBy = "meal", cascade = CascadeType.ALL)
    List<Additive> additives = new ArrayList<>();

    @OneToMany(mappedBy = "meal", cascade = CascadeType.ALL)
    List<Allergen> allergens = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "nutritional_values_id", referencedColumnName = "id")
    NutritionalValues nutritionalValues;


    /**
     * @param name
     */
    public Meal(String name) {
        this.name = name;
        this.date = LocalDate.now();
    }


    /**
     * @param name
     * @param mealCategory
     */
    public Meal(String name, MealCategory mealCategory) {
        this.name = name;
        this.date = LocalDate.now();
        this.mealCategory = mealCategory;
    }


    /**
     * @param name
     * @param date
     */
    public Meal(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }
}
