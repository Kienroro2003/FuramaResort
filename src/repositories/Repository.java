package repositories;

import entities.Person;

import java.util.List;

public interface Repository<T> {
    void add(T e);
    void remove(T e);
    List<T> getAll();
    T findById(int id);
}
