package EjerciciosTema789;

public class funcionDividePorCero {
  public static void main(String[] args) {

    int numero1 = 200;
    int numero2 = 0;

  try {
    System.out.println(dividePorCero(numero1,numero2));
  }catch (ArithmeticException e){
    System.out.println("Esto no puede hacerse");
  }finally {
    System.out.println("Demo de código");
  }

  }
  public static int dividePorCero(int num1, int num2)throws ArithmeticException {
    return num1 / num2;
  }
}
