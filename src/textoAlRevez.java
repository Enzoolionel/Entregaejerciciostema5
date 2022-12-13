//import java.sql.Array;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class textoAlRevez {
  public static void main(String[] args) {


//    Vector<Integer> vector = new Vector(5,1);
//    vector.add(1);
//    vector.add(2);
//    vector.add(3);
//    vector.add(3);
//    vector.add(3);
//    vector.add(3);
//    System.out.println("Tamaño del vector: " + vector.size() + " y capacidad: " + vector.capacity());
//
//    En listas como en vectores no se hace nameList[i] sino se hace nameList.get(i)
//
//
//    ArrayList<String> newList = new ArrayList<String>();
//    newList.add(0,"s");
//    System.out.println(newList);
//
//    LinkedList<String> linkedlist = new LinkedList<String>();
//    linkedlist.add("Enzo");
//    linkedlist.add("Enzoo");
//    linkedlist.add("Enzooo");
//    linkedlist.add("Enzoooo");
//    linkedlist.add("Enzooooo");
//    linkedlist.add("Enzoooooo");
//    System.out.println(linkedlist);
//    for (int i = 0;i<linkedlist.size();i++){
//      System.out.println("indice: " + i + ", contenido: " + linkedlist.get(i));
//    }


//    Mapa en java son Objetos en JavaScript

//    HashMap<Integer,String> mapa = new HashMap<>();
//
//    mapa.put(0,"Enzo");
//    mapa.put(1,"Emma");
//    mapa.put(2,"Lili");
//
//    System.out.println(mapa);
//
//    for (Map.Entry<Integer, String> elemento : mapa.entrySet()){
//      System.out.println("Indice: " + elemento.getKey() + ", valor: " + elemento.getValue());
//    }
//

try {


  boolean ok = false;
  do {
    Scanner scanner = new Scanner(System.in);
    System.out.println("mete dos numeros: ");
    try {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      ok = true;
    } catch (InputMismatchException e) {
      System.out.println("Error " + e);
    }
  } while (!ok);
}catch (Exception e){
  System.out.println(e);
}
  }
}
