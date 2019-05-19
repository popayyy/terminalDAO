package ua.mamedov.service;

import ua.mamedov.ResponseStatus;
import ua.mamedov.entity.Card;
import ua.mamedov.entity.Operation;

import java.util.List;

public interface OperationService {

    public List<Operation> getOperationByCard(String cardnumber);

    public Operation insertOperation(Operation operation);

    public ResponseStatus makeTransfer (Card in, Card out, Long sum);


}