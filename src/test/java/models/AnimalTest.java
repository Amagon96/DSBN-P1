package models;

import models.enums.Genero;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Andree
 */
public class AnimalTest {
    //Pruebas unitarias
    //Anotación en codigo: Manera de identificar una propiedad adicional de una clase metodo propiedad o atributo

    @Test
    public void instanciaAnimalTest(){
        Animal animal = new Animal();
        //Se debe escribir una prueba que falle y otra que no
        Assert.assertTrue(Genero.FEMENINO.equals(animal.getGenero()));
        Assert.assertFalse(Genero.MASCULINO.equals(animal.getGenero()));
    }

    @Test
    public void generoAnimalTest(){
        Assert.assertTrue(Genero.FEMENINO.getAmamanta());
    }
}
