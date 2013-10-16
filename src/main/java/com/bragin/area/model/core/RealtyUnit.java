package com.bragin.area.model.core;

/**
 * Created with IntelliJ IDEA.
 * User: Bragin
 * Date: 17.09.13
 * Time: 0:23
 * To change this template use File | Settings | File Templates.
 */
import javax.persistence.*;

@MappedSuperclass
public class RealtyUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String summary;

    @ManyToOne
    @JoinColumn (id = "id")
    private User owner;

    @Basic
    private Long price;

    @Basic
    private RenterCathegory acceptableRenter;

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public RenterCathegory getAcceptableRenter() {
        return acceptableRenter;
    }

    public void setAcceptableRenter(RenterCathegory acceptableRenter) {
        this.acceptableRenter = acceptableRenter;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String name) {
        this.summary = name;
    }


}
