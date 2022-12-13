package EjerciciosTema789;

public class arrayBidimensionalDeEnteros {
  public static void main(String[] args) {

    int arrayDeNumeros[][] = {
            {1,3,5,7,9},
            {0,2,4,6,8}
    };

    for (int i = 0; i < arrayDeNumeros.length; i++){
      for (int j = 0; j < arrayDeNumeros[i].length; j++){
        System.out.println("El array es: " + i + " la posición es: "
                + j + " y el valor es: " + arrayDeNumeros[i][j]);
      }
    }

  }
}
