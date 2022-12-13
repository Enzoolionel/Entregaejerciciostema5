package EjerciciosTema789;

import java.util.ArrayList;

public class arrayListDeTipoInt {
  public static void main(String[] args) {

    ArrayList<Integer> arrayDeEnteros = new ArrayList<>();

    for (int i = 1; i <= 10; i++){
      arrayDeEnteros.add(i);
    }

    for (int i = 0; i < arrayDeEnteros.size();i++){
      if (arrayDeEnteros.get(i) % 2 == 0){
        arrayDeEnteros.remove(i);
      }
    }
    System.out.println(arrayDeEnteros);
  }
}
