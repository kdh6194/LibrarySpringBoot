package honeybee.spring.libraryspringboot.dao;

import honeybee.spring.libraryspringboot.model.Library;

import java.util.List;

public interface LibraryDAO {
    List<Library> selectLibrary(int cpage);
    int countLibrary();
    int insertLibrary(Library lb);
    Library readOneLibrary(int lbno);

}
