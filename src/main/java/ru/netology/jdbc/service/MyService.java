package ru.netology.jdbc.service;

import org.springframework.stereotype.Service;
import ru.netology.jdbc.entity.Customer;
import ru.netology.jdbc.entity.Order;
import ru.netology.jdbc.model.CustomerForRequest;
import ru.netology.jdbc.model.OrderForRequest;
import ru.netology.jdbc.repository.Rep;
import ru.netology.jdbc.repository.RepForHibernate;


@Service
public class MyService {
    private final Rep repository;

    public MyService(RepForHibernate repository) {
        this.repository = repository;
    }

    public String getProductName(String name) {
        return repository.getProductName(name);
    }

    public Customer addCustomer(CustomerForRequest customer) {
        return repository.addCustomer(customer);
    }

    public Order addOrder(OrderForRequest order) {
        return repository.addOrder(order);
    }

    public String welcome(){return "Welcome to my app!";}

    public String read(){return "You can read";}

    public String write(){return "You can write";}

    public String delete(){return "You can delete";}

    public String superMethod(String userName){return "You are superUser - " + userName;}

}
