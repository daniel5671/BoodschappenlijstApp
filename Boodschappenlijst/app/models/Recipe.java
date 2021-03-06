package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "recipe")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "procedure")
    private String procedure;

    @Column(name = "secret")
    private boolean secret;

   /* @OneToMany
    @JoinColumn(name = "post_id")
    private List<Necessity> necessities; */

    public Recipe() {

    }

    public Recipe(String name, String procedure, boolean secret) {
        this.name = name;
        this.procedure = procedure;
        this.secret = secret;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public boolean isSecret() {
        return secret;
    }

    public void setSecret(boolean secret) {
        this.secret = secret;
    }

   /* public List<Necessity> getNecessities() {
        return necessities;
    }

    public void setNecessities(List<Necessity> necessities) {
        this.necessities = necessities;
    } */
}
