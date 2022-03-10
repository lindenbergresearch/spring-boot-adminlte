package de.kamasys.webmenu.enitiy;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "nutritional_values", schema = "spring_adminlte")
public class NutritionalValuesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "kj")
    private Integer kj;
    @Basic
    @Column(name = "kcal")
    private Integer kcal;
    @Basic
    @Column(name = "carbohydrates")
    private Double carbohydrates;
    @Basic
    @Column(name = "fat")
    private Double fat;
    @Basic
    @Column(name = "fatty_acids")
    private Double fattyAcids;
    @Basic
    @Column(name = "protein")
    private Double protein;
    @Basic
    @Column(name = "sugar")
    private Double sugar;
    @Basic
    @Column(name = "salt")
    private Double salt;
    @OneToMany(mappedBy = "nutritionalValuesByNutritionalValuesId")
    private Collection<MealEntity> mealsById;
    @OneToMany(mappedBy = "nutritionalValuesByNutritionalValuesId")
    private Collection<MealComponentEntity> mealComponentsById;


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public Integer getKj() {
        return kj;
    }


    public void setKj(Integer kj) {
        this.kj = kj;
    }


    public Integer getKcal() {
        return kcal;
    }


    public void setKcal(Integer kcal) {
        this.kcal = kcal;
    }


    public Double getCarbohydrates() {
        return carbohydrates;
    }


    public void setCarbohydrates(Double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }


    public Double getFat() {
        return fat;
    }


    public void setFat(Double fat) {
        this.fat = fat;
    }


    public Double getFattyAcids() {
        return fattyAcids;
    }


    public void setFattyAcids(Double fattyAcids) {
        this.fattyAcids = fattyAcids;
    }


    public Double getProtein() {
        return protein;
    }


    public void setProtein(Double protein) {
        this.protein = protein;
    }


    public Double getSugar() {
        return sugar;
    }


    public void setSugar(Double sugar) {
        this.sugar = sugar;
    }


    public Double getSalt() {
        return salt;
    }


    public void setSalt(Double salt) {
        this.salt = salt;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NutritionalValuesEntity that = (NutritionalValuesEntity) o;

        if (id != that.id) return false;
        if (kj != null ? !kj.equals(that.kj) : that.kj != null) return false;
        if (kcal != null ? !kcal.equals(that.kcal) : that.kcal != null) return false;
        if (carbohydrates != null ? !carbohydrates.equals(that.carbohydrates) : that.carbohydrates != null) return false;
        if (fat != null ? !fat.equals(that.fat) : that.fat != null) return false;
        if (fattyAcids != null ? !fattyAcids.equals(that.fattyAcids) : that.fattyAcids != null) return false;
        if (protein != null ? !protein.equals(that.protein) : that.protein != null) return false;
        if (sugar != null ? !sugar.equals(that.sugar) : that.sugar != null) return false;
        if (salt != null ? !salt.equals(that.salt) : that.salt != null) return false;

        return true;
    }


    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (kj != null ? kj.hashCode() : 0);
        result = 31 * result + (kcal != null ? kcal.hashCode() : 0);
        result = 31 * result + (carbohydrates != null ? carbohydrates.hashCode() : 0);
        result = 31 * result + (fat != null ? fat.hashCode() : 0);
        result = 31 * result + (fattyAcids != null ? fattyAcids.hashCode() : 0);
        result = 31 * result + (protein != null ? protein.hashCode() : 0);
        result = 31 * result + (sugar != null ? sugar.hashCode() : 0);
        result = 31 * result + (salt != null ? salt.hashCode() : 0);
        return result;
    }


    public Collection<MealEntity> getMealsById() {
        return mealsById;
    }


    public void setMealsById(Collection<MealEntity> mealsById) {
        this.mealsById = mealsById;
    }


    public Collection<MealComponentEntity> getMealComponentsById() {
        return mealComponentsById;
    }


    public void setMealComponentsById(Collection<MealComponentEntity> mealComponentsById) {
        this.mealComponentsById = mealComponentsById;
    }
}
