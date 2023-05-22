package honeybee.spring.libraryspringboot.service;

import honeybee.spring.libraryspringboot.model.Library;

import java.util.List;

public interface LibraryService {
    List<Library> showLibrary(int cpage);
    int countLibrary();
    boolean newLibrary(Library lb);
    Library readOneLibrary(int lbno);
}
