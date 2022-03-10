package de.kamasys.webmenu;


import de.kamasys.webmenu.enitiy.MealCategoryEntity;
import de.kamasys.webmenu.enitiy.MealEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Timestamp;

public class Main {
    public static void main(String[] args) {

        MealCategoryEntity mce = new MealCategoryEntity();
        mce.setName("Gericht 12");

        MealEntity me = new MealEntity();
        me.setDate(new Timestamp(System.nanoTime()));
        me.setName("Speise1");
        me.setMealCategoryByCategoryId(mce);


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(mce);
        entityManager.persist(me);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
