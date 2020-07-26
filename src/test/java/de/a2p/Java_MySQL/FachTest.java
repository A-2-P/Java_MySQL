package de.a2p.Java_MySQL;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FachTest {


    @Test
    public void creatReadTest(){
        Database database = new Database();
        IRepository repository = new Repository(database.getConnection());

        database.dropTableFach();
        database.createTableFach();

        Fach mathe = new Fach("Mathe", false);
        repository.addFach(mathe);

        Fach db = new Fach("Datenbanken", true);
        repository.addFach(db);

        Fach os = new Fach("Betriebssysteme", true);
        repository.addFach(os);

        List<Fach> fachlist = repository.getAllFaecherSortedByName();
        assertEquals(3, fachlist.size());
        }
    }

