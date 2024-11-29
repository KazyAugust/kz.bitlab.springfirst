package kz.bitlab.springfirst.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Item {
    private long id;
    private String name;
    private String description;
    private double price;
}
