package com.entrega1;

public class Carro extends Caracteristica {

    public Carro(String modelo, String marca, String cor, int ano) {
        super(modelo, marca, cor, ano);
        
    }

    public void status() {
        System.out.println("Modelo: " + this.getModelo() + "/n Marca: " + this.getMarca() + "/n Cor: " + this.getCor() + "/n Ano: " + this.getAno()); 
    }

    


    

}
