package EjerciciosTema789;

public class reverseText {
  public static void main(String[] args) {

    reverse("hola");

  }
  public static String reverse(String texto) {

    String cadenaInvertida = "";
    for (int x = texto.length() - 1; x >= 0; x--)
      cadenaInvertida += texto.charAt(x);

    System.out.println(cadenaInvertida);
    return null;
  }
}
