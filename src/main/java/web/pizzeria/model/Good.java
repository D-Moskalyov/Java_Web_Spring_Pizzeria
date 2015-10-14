package web.pizzeria.model;


import javax.persistence.*;

@Entity
@Table(name = "goods")
public class Good {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    String description;
    Float price;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapKeyColumn(name = "CategoryID")
    Category category;
}
