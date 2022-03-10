package de.kamasys.webmenu.enitiy;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "meal_component", schema = "spring_adminlte")
public class MealComponentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "name")
    private String name;

    @Column(name = "meal_id", insertable = false, updatable = false)
    private Integer mealId;

    @Column(name = "meal_component_category_id", insertable = false, updatable = false)
    private Integer mealComponentCategoryId;

    @Column(name = "nutritional_values_id", insertable = false, updatable = false)
    private Integer nutritionalValuesId;

    @OneToMany(mappedBy = "mealComponentByMealComponentId")
    private Collection<AdditiveEntity> additivesById;


    @OneToMany(mappedBy = "mealComponentByMealComponentId")
    private Collection<AllergenEntity> allergensById;


    @ManyToOne
    @JoinColumn(name = "meal_id", referencedColumnName = "id")
    private MealEntity mealByMealId;


    @ManyToOne
    @JoinColumn(name = "meal_component_category_id", referencedColumnName = "id")
    private MealComponentCategoryEntity mealComponentCategoryByMealComponentCategoryId;


    @ManyToOne
    @JoinColumn(name = "nutritional_values_id", referencedColumnName = "id")
    private NutritionalValuesEntity nutritionalValuesByNutritionalValuesId;


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


    public Integer getMealComponentCategoryId() {
        return mealComponentCategoryId;
    }


    public void setMealComponentCategoryId(Integer mealComponentCategoryId) {
        this.mealComponentCategoryId = mealComponentCategoryId;
    }


    public Integer getNutritionalValuesId() {
        return nutritionalValuesId;
    }


    public void setNutritionalValuesId(Integer nutritionalValuesId) {
        this.nutritionalValuesId = nutritionalValuesId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MealComponentEntity that = (MealComponentEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (mealId != null ? !mealId.equals(that.mealId) : that.mealId != null) return false;
        if (mealComponentCategoryId != null ? !mealComponentCategoryId.equals(that.mealComponentCategoryId) : that.mealComponentCategoryId != null)
            return false;
        if (nutritionalValuesId != null ? !nutritionalValuesId.equals(that.nutritionalValuesId) : that.nutritionalValuesId != null) return false;

        return true;
    }


    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (mealId != null ? mealId.hashCode() : 0);
        result = 31 * result + (mealComponentCategoryId != null ? mealComponentCategoryId.hashCode() : 0);
        result = 31 * result + (nutritionalValuesId != null ? nutritionalValuesId.hashCode() : 0);
        return result;
    }


    public Collection<AdditiveEntity> getAdditivesById() {
        return additivesById;
    }


    public void setAdditivesById(Collection<AdditiveEntity> additivesById) {
        this.additivesById = additivesById;
    }


    public Collection<AllergenEntity> getAllergensById() {
        return allergensById;
    }


    public void setAllergensById(Collection<AllergenEntity> allergensById) {
        this.allergensById = allergensById;
    }


    public MealEntity getMealByMealId() {
        return mealByMealId;
    }


    public void setMealByMealId(MealEntity mealByMealId) {
        this.mealByMealId = mealByMealId;
    }


    public MealComponentCategoryEntity getMealComponentCategoryByMealComponentCategoryId() {
        return mealComponentCategoryByMealComponentCategoryId;
    }


    public void setMealComponentCategoryByMealComponentCategoryId(MealComponentCategoryEntity mealComponentCategoryByMealComponentCategoryId) {
        this.mealComponentCategoryByMealComponentCategoryId = mealComponentCategoryByMealComponentCategoryId;
    }


    public NutritionalValuesEntity getNutritionalValuesByNutritionalValuesId() {
        return nutritionalValuesByNutritionalValuesId;
    }


    public void setNutritionalValuesByNutritionalValuesId(NutritionalValuesEntity nutritionalValuesByNutritionalValuesId) {
        this.nutritionalValuesByNutritionalValuesId = nutritionalValuesByNutritionalValuesId;
    }
}
