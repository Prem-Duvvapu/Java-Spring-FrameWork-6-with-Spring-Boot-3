package org.example;

import jakarta.persistence.*;

import java.util.List;

//ClassName -> EntityName -> TableName

//This will change entity name and table name
//@Entity(name="alien_table")

//This will change only tableName
//@Entity
//@Table(name="alien_table")

@Entity
public class Alien {

    @Id
    private int aid;

    //To change columnName use this annotation
//    @Column(name="alien_name")
    private String aname;

//    To not store this in db
//    @Transient
    private String tech;

//    @OneToOne
//    private Laptop laptop;

//    @OneToMany(mappedBy = "alien")
//    private List<Laptop> laptops;

    @ManyToMany
    private List<Laptop> laptops;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptops +
                '}';
    }
}
