package ua.mamedov.service;

import ua.mamedov.ResponseStatus;
import ua.mamedov.entity.Service;

import java.util.List;

public interface ServiceService {

    public List<Service> getServices();

    public Service getById (Long id);

    public ResponseStatus checkService (Service service, String account);
}