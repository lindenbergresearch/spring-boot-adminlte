package de.kamasys.webmenu.model;


import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;


/**
 * Basic Entity .
 *
 * @param <T> Serializable numeric identity type used as PK in DB.
 *            Integer -> int | Long -> bigint
 */
@MappedSuperclass
@ToString
public abstract class AbstractModel<T extends Serializable> implements Serializable {
    /**
     * Generated serial UID.
     */
    private static final long serialVersionUID = -6323358535657100144L;

    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private T id;


    /**
     * @return
     */
    public T getId() {
        return this.id;
    }


    /**
     * @param id
     */
    public void setId(T id) {
        this.id = id;
    }


    /**
     * @return
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        if (id == null) return prime * result;
        return prime * result + id.hashCode();
    }


    /**
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (getClass() != obj.getClass())
            return false;

        AbstractModel<?> other = (AbstractModel<?>) obj;
        if (id == null) {
            return other.id == null;
        }

        return id.equals(other.id);
    }
}
