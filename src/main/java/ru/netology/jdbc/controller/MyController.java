package ru.netology.jdbc.controller;
import org.springframework.web.bind.annotation.*;
import ru.netology.jdbc.entity.Customer;
import ru.netology.jdbc.entity.Order;
import ru.netology.jdbc.model.CustomerForRequest;
import ru.netology.jdbc.model.OrderForRequest;
import ru.netology.jdbc.service.MyService;

@RestController
public class MyController {
    private final MyService service;

    public MyController(MyService service) {
        this.service = service;
    }

    @PostMapping("add/customer")
    public Customer addCustomer(@RequestBody CustomerForRequest customer) {
        return service.addCustomer(customer);
    }

    @PostMapping("add/order")
    public Order addOrder(@RequestBody OrderForRequest order) {
        return service.addOrder(order);
    }

    @GetMapping("products/fetch-product")
    @ResponseBody
    public String getProductName(@RequestParam String name) {
        return service.getProductName(name);
    }
}
