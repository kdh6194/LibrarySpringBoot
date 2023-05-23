package honeybee.spring.libraryspringboot.service;

import honeybee.spring.libraryspringboot.model.Library;

import java.util.List;
import java.util.Map;

public interface LibraryService {
    Map<String, Object> showLibrary(int cpage);
//    int countLibrary();
    boolean newLibrary(Library lb);
    Library readOneLibrary(int lbno);
}
