package models;

import com.sun.org.apache.xpath.internal.operations.Bool;
import models.enums.Genero;

import java.awt.*;

public class Animal {

    private Genero genero;
    private Color color;
    private Double peso;
    private Double altura;
    private Boolean hiberna;

    //Siempre debe ir un constructor en blanco a menos que se quiera inicializar las variables con datos predefinidos
    public Animal(){
        this.genero = Genero.FEMENINO;
        this.color = Color.BLACK;
        this.peso = 0.1d;
        this.altura = 0.1d;
        this.hiberna = Boolean.FALSE;
        //A las clases que contienen otras clases se llaman wrappers
        //double = primitivo
        //Double = clase

    }

    //Constructor que pide un valor para genero
    public Animal(Genero genero){
        this();
        this.setGenero(genero);
    }

    //Constructor que pide un valor para genero, color
    public Animal(Genero genero, Color color){
        this(genero);
        this.setColor(color);
    }

    //Constructor que pide un valor para genero, color y peso
    public Animal(Genero genero, Color color, Double peso){
        this(genero, color);
        this.setPeso(peso);
    }

    public Animal(Genero genero, Color color, Double peso, Double altura){
        this(genero, color, peso);
        this.setAltura(altura);
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Boolean getHiberna() {
        return hiberna;
    }

    public void setHiberna(Boolean hiberna) {
        this.hiberna = hiberna;
    }
}
