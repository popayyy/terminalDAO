package ua.mamedov.service;

import ua.mamedov.ResponseStatus;
import ua.mamedov.entity.Card;
import ua.mamedov.entity.Service;

public interface ProcessingService {

    public ResponseStatus makePayment(Card card, Long sum, Service service);


}