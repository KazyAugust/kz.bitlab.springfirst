package kz.bitlab.springfirst.controller;

import kz.bitlab.springfirst.entity.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String homePage() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item(1L, "Mac Book Pro", "8 GB RAM 255 GB SSD Intel Core i7", 1199.99));
        items.add(new Item(2L, "Mac Book Pro", "16 GB RAM 500 GB SSD Apple M1", 1499.99));
        items.add(new Item(3L, "Mac Book Pro", "16 GB RAM 1 GB SSD Apple M1", 1799.99));
        items.add(new Item(4L, "ASUS Tuf Gaming", "16 GB RAM 500 GB SSD Intel Core i7", 1299.99));
        items.add(new Item(5L, "HP Laser Pro", "8 GB RAM 500 GB SSD Intel Core i5", 999.99));
        items.add(new Item(6L, "Lenovo Legion", "32 GB RAM 512 GB SSD Intel Core i7", 1399.99));

        return "home-page";
    }
}
