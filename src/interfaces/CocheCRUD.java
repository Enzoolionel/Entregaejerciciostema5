package interfaces;

import java.util.List;

public interface CocheCRUD {

  void save();

  List<String> findAll();

  void delete();
}
