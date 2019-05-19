package ua.mamedov.dao;

import ua.mamedov.entity.Greeter;

import java.util.List;

/**
 * Database layer.
 */
public interface OperationDAO {
    /**
     * Adds some greet to the database.
     * @param g Greeting data.
     */
    void addGreet(Greeter g);

    /**
     * Returns all greetings.
     * @return List with all greetings in the database.
     */
    List<Greeter> getGreetings();
}
