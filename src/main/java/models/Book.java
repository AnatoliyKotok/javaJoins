package models;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name="tbl_books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 250,nullable = false)
    private String name;
    @ManyToMany(mappedBy = "books")
    private Set<Author> authors = new HashSet<Author>();
}
