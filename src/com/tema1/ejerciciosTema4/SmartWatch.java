package com.tema1.ejerciciosTema4;

public class SmartWatch extends SmartDevice{


  String colorCinta;

  public SmartWatch() {
  }

  public SmartWatch(String color, double pantalla, int memoria, boolean camara, String colorCinta) {
    super(color, pantalla, memoria, camara);
    this.colorCinta = colorCinta;
  }
}
