package EjerciciosTema789;

import java.util.Vector;

public class createVector {
  public static void main(String[] args) {
    Vector<String> vector = new Vector<String>();

    vector.add("Enzo");
    vector.add("Lionel");
    vector.add("Lili");
    vector.add("Emma");
    vector.add("Coco");

    vector.remove(1);
    vector.remove(1);

    for (String item : vector){
      System.out.println(item);
    }

//    El problema de usar un vector con 1000 elementos para ser añadidos es que al añadir esos
//    1000 elementos estos se copian en un arrayList y es una operación muy costosa en materia de
//    y este array duplica su capacidad.
  }
}
