package interfaces;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{
  @Override
  public void save() {
    System.out.println("Metodo save");
  }

  @Override
  public List<String> findAll() {
    System.out.println("Metodo findAll");
    return null;
  }

  @Override
  public void delete() {
    System.out.println("Metodo delete");
  }

}
