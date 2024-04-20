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

}
