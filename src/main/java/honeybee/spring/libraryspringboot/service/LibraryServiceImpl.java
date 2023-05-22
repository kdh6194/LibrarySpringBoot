package honeybee.spring.libraryspringboot.service;

import honeybee.spring.libraryspringboot.dao.LibraryDAO;
import honeybee.spring.libraryspringboot.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("lbsrv")
public class LibraryServiceImpl implements LibraryService {
@Autowired
private LibraryDAO lbdao;

    @Override
    public List<Library> showLibrary(int cpage) {
        return lbdao.selectLibrary(cpage-1);
    }

    @Override
    public int countLibrary() {
        return lbdao.countLibrary();
    }

    @Override
    public boolean newLibrary(Library lb) {
        boolean result = false;
        if(lbdao.insertLibrary(lb) > 0) {
            result = true;
        }
        return result;
    }

    @Override
    public Library readOneLibrary(int lbno) {
        return lbdao.readOneLibrary(lbno);
    }
}
