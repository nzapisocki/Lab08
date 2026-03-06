package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // test if Calgary is added
        assertTrue(list.hasCity(calgary));
        // remove calgary
        list.delete(calgary);
        // test to see if Calgary is removed
        assertFalse(list.hasCity(calgary));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");
        City balzac = new City("Balzac", "AB");
        City morinville = new City("Morinville", "AB");
        list.addCity(calgary);
        list.addCity(edmonton);
        list.addCity(balzac);
        list.addCity(morinville);
        // This will fail initially because hasCity() doesn't exist
        assertEquals(4, list.countCities());
    }
}
