package com.tema1;

public class concatenarTexto {
  public static void main(String[] args) {

    String[] nombres = {"enzo","emma","lili"};

    String concatenado = "";
    for (String nombre : nombres){
      concatenado += " " + nombre;
    }
    System.out.println(concatenado);
  }
}
