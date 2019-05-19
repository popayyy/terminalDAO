package ua.mamedov.service;

import ua.mamedov.ResponseStatus;
import ua.mamedov.entity.Card;

public interface CardService {

    public Card findCardByNumber (String cardnumber);

    public ResponseStatus cardAuth (String cardnumber, String pin);

    public void updateBalance (Card card, Long balance);

}