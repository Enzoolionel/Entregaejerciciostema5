package com.tema1.ejerciciosTema4;

public class SmartDevice {

  String color;
  double pantalla;
  int memoria;
  boolean camara;

  public SmartDevice() {}

  public SmartDevice(String color, double pantalla, int memoria, boolean camara){
    this.color = color;
    this.pantalla = pantalla;
    this.memoria = memoria;
    this.camara = camara;
  }

  @Override
  public String toString() {
    return "SmartDevice{" +
            "color='" + color + '\'' +
            ", pantalla=" + pantalla +
            ", memoria=" + memoria +
            ", camara=" + camara +
            '}';
  }
}
