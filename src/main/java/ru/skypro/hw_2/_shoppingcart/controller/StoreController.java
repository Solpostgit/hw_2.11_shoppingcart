package ru.skypro.hw_2._shoppingcart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.hw_2._shoppingcart.service.StoreService;

import java.util.List;
import java.util.Set;

@RequestMapping("order")
@RestController
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("add")
    public List<Integer> add(@RequestParam("goods") List<Integer> goods) {
        return storeService.add(goods);
    }

    @GetMapping("get")
    public List<Integer> get() {
        return storeService.get();
    }
}
