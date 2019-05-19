package ua.mamedov.dao;

import ua.mamedov.entity.Card;

import java.util.List;

/**
 * Database layer.
 */
public interface CardDAO {
    /**
     * Adds Добавить новую карту
     * @param card объект Card
     */
    void addCard(Card card);

    /**
     * Получить список всех карт
     * @return Список со всеми картами в базе данных
     */
    List<Card> getAll();
}
