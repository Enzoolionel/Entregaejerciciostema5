package com.tema1;

public class precioConIva {
  public static void main(String[] args) {

    System.out.println(precioConIva(100));

    }
  static double precioConIva(int precio){
    return precio * 1.21;
  }
}
