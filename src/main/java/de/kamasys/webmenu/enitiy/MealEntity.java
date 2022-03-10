package de.kamasys.webmenu.enitiy;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "meal", schema = "spring_adminlte")
public class MealEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "date")
    private Timestamp date;
    @Basic
    @Column(name = "name")
    private String name;
    @Column(name = "category_id", insertable = false, updatable = false)
    private Integer categoryId;
    @Column(name = "menu_id", insertable = false, updatable = false)
    private Integer menuId;
    @Column(name = "nutritional_values_id", insertable = false, updatable = false)
    private Integer nutritionalValuesId;
    @OneToMany(mappedBy = "mealByMealId")
    private Collection<AdditiveEntity> additivesById;
    @OneToMany(mappedBy = "mealByMealId")
    private Collection<AllergenEntity> allergensById;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private MealCategoryEntity mealCategoryByCategoryId;
    @ManyToOne
    @JoinColumn(name = "menu_id", referencedColumnName = "id")
    private MenuEntity menuByMenuId;
    @ManyToOne
    @JoinColumn(name = "nutritional_values_id", referencedColumnName = "id")
    private NutritionalValuesEntity nutritionalValuesByNutritionalValuesId;
    @OneToMany(mappedBy = "mealByMealId")
    private Collection<MealComponentEntity> mealComponentsById;


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public Timestamp getDate() {
        return date;
    }


    public void setDate(Timestamp date) {
        this.date = date;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Integer getCategoryId() {
        return categoryId;
    }


    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }


    public Integer getMenuId() {
        return menuId;
    }


    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
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

        MealEntity that = (MealEntity) o;

        if (id != that.id) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (menuId != null ? !menuId.equals(that.menuId) : that.menuId != null) return false;
        if (nutritionalValuesId != null ? !nutritionalValuesId.equals(that.nutritionalValuesId) : that.nutritionalValuesId != null) return false;

        return true;
    }


    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        result = 31 * result + (menuId != null ? menuId.hashCode() : 0);
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


    public MealCategoryEntity getMealCategoryByCategoryId() {
        return mealCategoryByCategoryId;
    }


    public void setMealCategoryByCategoryId(MealCategoryEntity mealCategoryByCategoryId) {
        this.mealCategoryByCategoryId = mealCategoryByCategoryId;
    }


    public MenuEntity getMenuByMenuId() {
        return menuByMenuId;
    }


    public void setMenuByMenuId(MenuEntity menuByMenuId) {
        this.menuByMenuId = menuByMenuId;
    }


    public NutritionalValuesEntity getNutritionalValuesByNutritionalValuesId() {
        return nutritionalValuesByNutritionalValuesId;
    }


    public void setNutritionalValuesByNutritionalValuesId(NutritionalValuesEntity nutritionalValuesByNutritionalValuesId) {
        this.nutritionalValuesByNutritionalValuesId = nutritionalValuesByNutritionalValuesId;
    }


    public Collection<MealComponentEntity> getMealComponentsById() {
        return mealComponentsById;
    }


    public void setMealComponentsById(Collection<MealComponentEntity> mealComponentsById) {
        this.mealComponentsById = mealComponentsById;
    }
}
