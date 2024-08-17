package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@ToString
public class Customer {
    private String id;
    private String name;
    private String address;
    private String number;
    private String title;
    private LocalDate dob;
}
