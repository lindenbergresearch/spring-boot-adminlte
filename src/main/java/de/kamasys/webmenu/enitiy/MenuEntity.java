package de.kamasys.webmenu.enitiy;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "menu", schema = "spring_adminlte")
public class MenuEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "valid_from")
    private Timestamp validFrom;
    @Basic
    @Column(name = "valid_to")
    private Timestamp validTo;
    @OneToMany(mappedBy = "menuByMenuId")
    private Collection<MealEntity> mealsById;


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public Timestamp getValidFrom() {
        return validFrom;
    }


    public void setValidFrom(Timestamp validFrom) {
        this.validFrom = validFrom;
    }


    public Timestamp getValidTo() {
        return validTo;
    }


    public void setValidTo(Timestamp validTo) {
        this.validTo = validTo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuEntity that = (MenuEntity) o;

        if (id != that.id) return false;
        if (validFrom != null ? !validFrom.equals(that.validFrom) : that.validFrom != null) return false;
        if (validTo != null ? !validTo.equals(that.validTo) : that.validTo != null) return false;

        return true;
    }


    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (validFrom != null ? validFrom.hashCode() : 0);
        result = 31 * result + (validTo != null ? validTo.hashCode() : 0);
        return result;
    }


    public Collection<MealEntity> getMealsById() {
        return mealsById;
    }


    public void setMealsById(Collection<MealEntity> mealsById) {
        this.mealsById = mealsById;
    }
}
