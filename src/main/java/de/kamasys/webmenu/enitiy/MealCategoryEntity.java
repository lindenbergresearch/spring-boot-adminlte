package de.kamasys.webmenu.enitiy;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "meal_category", schema = "spring_adminlte")
public class MealCategoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "mealCategoryByCategoryId")
    private Collection<MealEntity> mealsById;


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MealCategoryEntity that = (MealCategoryEntity) o;

        if (id != that.id) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }


    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }


    public Collection<MealEntity> getMealsById() {
        return mealsById;
    }


    public void setMealsById(Collection<MealEntity> mealsById) {
        this.mealsById = mealsById;
    }
}
