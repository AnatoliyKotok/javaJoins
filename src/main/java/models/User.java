package models;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Data
@Entity
@Table(name="tbl_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 250,nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name="role_id", nullable=false)
    private Role role;
}
