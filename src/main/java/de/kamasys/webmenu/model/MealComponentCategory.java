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
public class MealComponentCategory extends AbstractModel<Long> {
    @Column(nullable = false, unique = true)
    String name;

    @OneToMany(mappedBy = "mealComponentCategory", cascade = CascadeType.ALL)
    List<MealComponent> mealComponents = new ArrayList<>();

    /* -------------------------------------------------------- */


    public MealComponentCategory(String name) {
        this.name = name;
    }
}
