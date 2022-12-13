package EjerciciosTema789;

import java.io.*;

public class inputStreamyPrintStream {
  public static void main(String[] args) {

    copiaYPega("C:\\Users\\HP\\OneDrive\\Escritorio\\open bootcamp.txt",
              "C:\\Users\\HP\\OneDrive\\Escritorio\\copia.txt");

  }
  public static String copiaYPega(String fileIn, String fileOut){
    File fichero = new File(fileIn);
    File copia = new File(fileOut);

    try{
      InputStream in = new FileInputStream(fichero);
      OutputStream out = new FileOutputStream(copia);

      byte[] bytes = new byte[124];
      int contador;
      while ((contador = in.read(bytes)) > 0){
        out.write(bytes, 0 , contador);
      }
      in.close();
      out.close();
    }catch (IOException e){
      System.out.println(e);
    }
    return null;
  }
}


