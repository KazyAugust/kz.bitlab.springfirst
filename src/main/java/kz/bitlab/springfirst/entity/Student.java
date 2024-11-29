package kz.bitlab.springfirst.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Student {
   private long id;
   private String name;
   private String surname;
   private int exam;
   private String mark;

}
