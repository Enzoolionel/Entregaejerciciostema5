package com.tema1.ejerciciosTema4;

public class SmartPhone extends SmartDevice{

  Boolean Funda;
  String colorFunda;


  public SmartPhone() {
  }

  public SmartPhone(String color, double pantalla, int memoria, boolean camara, Boolean funda,String colorFunda) {
    super(color, pantalla, memoria, camara);
    this.Funda = funda;
    this.colorFunda = colorFunda;
  }

  @Override
  public String toString() {
    return "SmartPhone{" +
            "Funda=" + Funda +
            ", colorFunda='" + colorFunda + '\'' +
            ", color='" + color + '\'' +
            ", pantalla=" + pantalla +
            ", memoria=" + memoria +
            ", camara=" + camara +
            '}';
  }
}

