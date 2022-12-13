package EjerciciosTema789;

import java.util.ArrayList;
import java.util.LinkedList;

public class arrayListDeTipoString {
  public static void main(String[] args) {

    ArrayList<Integer> arrayListDeInteger = new ArrayList<Integer>();
    LinkedList<Integer> linkedListDeInteger = new LinkedList<Integer>();

    arrayListDeInteger.add(10);
    arrayListDeInteger.add(20);
    arrayListDeInteger.add(30);
    arrayListDeInteger.add(40);
    arrayListDeInteger.add(50);

    for (int i = 0; i < arrayListDeInteger.size();i++){
      linkedListDeInteger.add(arrayListDeInteger.get(i));
    }

    for (Integer datoArrayList : arrayListDeInteger){
      System.out.println("Datos de ArrayList: " + datoArrayList);
    }

    for (Integer datoLinkedList : linkedListDeInteger){
      System.out.println("Datos de LinkedList: " + datoLinkedList);
    }

  }
}
