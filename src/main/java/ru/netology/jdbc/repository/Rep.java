package ru.netology.jdbc.repository;

import ru.netology.jdbc.entity.Customer;
import ru.netology.jdbc.entity.Order;
import ru.netology.jdbc.model.CustomerForRequest;
import ru.netology.jdbc.model.OrderForRequest;

public interface Rep {
    public Customer addCustomer(CustomerForRequest customer);
    public Order addOrder(OrderForRequest order);
    public String getProductName(String name);
}
