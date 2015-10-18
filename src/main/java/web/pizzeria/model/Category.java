package web.pizzeria.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;

    public Integer getId() {
        return id;
    }

    public List<Good> getGoods() {
        return goods;
    }

    @OneToMany(mappedBy = "category")
    List<Good> goods;

    public String getName() {
        return name;
    }
}
