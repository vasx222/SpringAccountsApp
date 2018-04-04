package ru.liga.domain;

public class Account {
    private Long id;
    private String name;
    private Long owner;
    private Double volume;

    public Account(Long id, String name, Long owner, Double volume) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.volume = volume;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(Long owner) {
        this.owner = owner;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getOwner() {
        return owner;
    }

    public Double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", owner=" + owner +
                ", volume=" + volume +
                '}';
    }
}
