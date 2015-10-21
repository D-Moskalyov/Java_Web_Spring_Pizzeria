package web.pizzeria.model;


import javax.persistence.*;

@Entity
@Table(name = "goods")
public class Good {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    Integer id;

    @Column(name = "Name")
    String name;
    //String description;
    //Float price;

    @ManyToOne(cascade = CascadeType.ALL)
//    @MapKeyColumn(name = "CategorieID")
    @JoinColumn(name ="CategorieID")
    Category category;

    public Category getCategory() {
        return category;
    }
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
