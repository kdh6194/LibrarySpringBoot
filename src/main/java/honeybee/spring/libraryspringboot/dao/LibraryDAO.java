package honeybee.spring.libraryspringboot.dao;

import honeybee.spring.libraryspringboot.model.Library;

import java.util.List;
import java.util.Map;

public interface LibraryDAO {
    Map<String, Object> selectLibrary(int cpage);
//    int countLibrary(); M
    int insertLibrary(Library lb);
    Library readOneLibrary(int lbno);

}
