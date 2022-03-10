package de.kamasys.webmenu.enitiy;

import javax.persistence.*;

@Entity
@Table(name = "allergen", schema = "spring_adminlte")
public class AllergenEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Column(name = "meal_id", insertable = false, updatable = false)
    private Integer mealId;
    @Column(name = "meal_component_id", insertable = false, updatable = false)
    private Integer mealComponentId;
    @ManyToOne
    @JoinColumn(name = "meal_id", referencedColumnName = "id")
    private MealEntity mealByMealId;
    @ManyToOne
    @JoinColumn(name = "meal_component_id", referencedColumnName = "id")
    private MealComponentEntity mealComponentByMealComponentId;


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


    public Integer getMealId() {
        return mealId;
    }


    public void setMealId(Integer mealId) {
        this.mealId = mealId;
    }


    public Integer getMealComponentId() {
        return mealComponentId;
    }


    public void setMealComponentId(Integer mealComponentId) {
        this.mealComponentId = mealComponentId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AllergenEntity that = (AllergenEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (mealId != null ? !mealId.equals(that.mealId) : that.mealId != null) return false;
        if (mealComponentId != null ? !mealComponentId.equals(that.mealComponentId) : that.mealComponentId != null) return false;

        return true;
    }


    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (mealId != null ? mealId.hashCode() : 0);
        result = 31 * result + (mealComponentId != null ? mealComponentId.hashCode() : 0);
        return result;
    }


    public MealEntity getMealByMealId() {
        return mealByMealId;
    }


    public void setMealByMealId(MealEntity mealByMealId) {
        this.mealByMealId = mealByMealId;
    }


    public MealComponentEntity getMealComponentByMealComponentId() {
        return mealComponentByMealComponentId;
    }


    public void setMealComponentByMealComponentId(MealComponentEntity mealComponentByMealComponentId) {
        this.mealComponentByMealComponentId = mealComponentByMealComponentId;
    }
}
