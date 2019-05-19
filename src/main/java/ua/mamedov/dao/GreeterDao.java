package ua.mamedov.dao;

import java.util.List;

import ua.mamedov.entity.Greeter;

/**
 * Database layer.
 */
public interface GreeterDao {
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
