package models;

import models.animals.Deer;
import models.animals.Elephant;
import models.animals.Lion;
import models.animals.Zebra;
import models.enums.Desplazamiento;
import models.enums.Genero;
import models.interfaces.Consumidor;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


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

    @Test
    public void desplazamientoTest(){
        Animal animal = new Animal();
        Assert.assertFalse(Desplazamiento.AEREO.equals(animal.getDesplazamiento()));
        Assert.assertTrue(Desplazamiento.TERRESTRE.equals(animal.getDesplazamiento()));
    }
    
    @Test
    public void testComer(){
        //Listas
        List<Consumidor> animals = new ArrayList<>();
        Deer d = new Deer();
        Elephant e = new Elephant();
        Lion l = new Lion();
        Zebra z = new Zebra();
        z.correr(5,"recio", "despacio", "rapido");

        animals.add(d);
        animals.add(e);
        animals.add(l);

        //Imprimir una lista de objetos de una forma primitiva
        System.out.println("--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--");
        for(int i =0;i<animals.size();i++){
            System.out.println("animals.get(i) = " + animals.get(i));
        }

        System.out.println("--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--");
        Animal animal = new Animal(Genero.MASCULINO);
        System.out.println("animal = " + animal);




        System.out.println("--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--");
        //Una lista se puede imprimir con iteraciones
        for (Consumidor a : animals){
            a.comer();
        }
        System.out.println("--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--");
        //Stream toma tu lista y genera un buffer que da la posibilidad de procesar las lambdas
        animals.stream().forEach((Consumidor x)->{
            x.comer();
        });
        //Una lambda es un metodo que recibe una función anonima que va a ejecutar
        System.out.println("--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--");

    }
}
