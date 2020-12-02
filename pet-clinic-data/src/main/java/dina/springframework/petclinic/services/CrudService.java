package dina.springframework.petclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {
    T findById(ID id);
    T save(T var);
    Set<T> findAll();
    long count();
    void deleteById(ID id);
    void delete(T var);
}
