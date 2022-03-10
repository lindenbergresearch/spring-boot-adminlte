package de.kamasys.webmenu.enitiy;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "meal_component_category", schema = "spring_adminlte")
public class MealComponentCategoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "mealComponentCategoryByMealComponentCategoryId")
    private Collection<MealComponentEntity> mealComponentsById;


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

        MealComponentCategoryEntity that = (MealComponentCategoryEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }


    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }


    public Collection<MealComponentEntity> getMealComponentsById() {
        return mealComponentsById;
    }


    public void setMealComponentsById(Collection<MealComponentEntity> mealComponentsById) {
        this.mealComponentsById = mealComponentsById;
    }
}
