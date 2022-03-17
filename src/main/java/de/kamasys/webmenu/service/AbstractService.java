package de.kamasys.webmenu.service;


import de.kamasys.webmenu.model.AbstractModel;
import org.slf4j.*;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.*;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;


/**
 * Abstract service layer providing basic business logic.
 *
 * @param <A> Entity type.
 * @param <B> ID type used in db.
 */
public abstract class AbstractService<A extends AbstractModel<B>, B extends Serializable> {

    private static final Logger log = LoggerFactory.getLogger(AbstractService.class);

    private static final int PAGE_SIZE = 5;


    /**
     * Returns the current repository.
     *
     * @return
     */
    protected abstract JpaRepository<A, B> getRepository();


    /**
     * Paginate records by page-size.
     *
     * @param pageNumber Current page-number.
     * @return Page as list of T.
     */
    public Page<A> getList(Integer pageNumber) {
        PageRequest pageRequest =
            PageRequest.of(pageNumber - 1, PAGE_SIZE, Direction.ASC, "id");

        return getRepository().findAll(pageRequest);
    }


    /**
     * Persists the given record in db.
     *
     * @param entity The entity to persist.
     * @return The updated entity.
     */
    public A save(A entity) {
        log.debug("save record: {} in repository={}", entity, getRepository().toString());

        return getRepository().save(entity);
    }


    /**
     * Search for record or create it, if not found in db.
     *
     * @param entity Entity instance.
     * @return New or loaded record.
     */
    public A getOrCreate(A entity) {
        log.debug("get or create record: {} in repository={}", entity, getRepository().toString());

        var entityOpt = getRepository().findById(entity.getId());
        return entityOpt.orElseGet(() -> save(entity));
    }


    /**
     * Retrieve record from db.
     *
     * @param id The id of the record.
     * @return Returns null if record not found.
     */
    public A get(B id) {
        log.debug("retrieve record by id={} in repository={}", id, getRepository().toString());

        var entityOpt = getRepository().findById(id);
        return entityOpt.orElse(null);
    }


    /**
     * Save delete entity.
     *
     * @param id The ID of the record in db.
     */
    public boolean delete(B id) {
        log.debug("delete record by id={} in repository={}", id, getRepository().toString());

        var entityOpt = getRepository().findById(id);

        // record does not exist in db
        if (entityOpt.isEmpty()) {
            return false;
        }

        try {
            getRepository().deleteById(id);
        } catch (DataAccessException ignored) {
            log.warn("error while deleting record: {}", entityOpt.get());

            return false;
        }

        return true;
    }


    /**
     * Save delete entity.
     *
     * @param entity The record to delete.
     * @return True if record could be removed.
     */
    public boolean delete(A entity) {
        log.debug("delete record: {}", entity);

        return delete(entity.getId());
    }


    /**
     * Update/Save entity.
     *
     * @param entity An entity bean.
     */
    public void update(A entity) {
        log.debug("save/update record: {}", entity);

        var getEntityOpt = getRepository().findById(entity.getId());

        if (getEntityOpt.isPresent())
            getRepository().save(getEntityOpt.get());
        else
            getRepository().save(entity);
    }
}
