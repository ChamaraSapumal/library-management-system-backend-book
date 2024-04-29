package edu.lib.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "book")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private String isbn;
    private String title;
    private String Author;
    private String category;
    private Integer qty;
}
