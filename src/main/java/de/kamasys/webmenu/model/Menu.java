package de.kamasys.webmenu.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.*;

import static javax.persistence.CascadeType.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class Menu extends AbstractModel<Long> {
    LocalDate validFrom;
    LocalDate validTo;
    String name;

    @OneToMany(mappedBy = "menu", cascade = ALL)
    List<Meal> meals = new ArrayList<>();
}
