package de.a2p.Java_MySQL;

import java.util.UUID;

public class Klasse {
    private final UUID id;
private String name;

    public Klasse(String name) {
        this(name,UUID.randomUUID());
    }

    public Klasse(String name, UUID id) {
        this.name = name;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public UUID getId() {
        return id;
    }
}
