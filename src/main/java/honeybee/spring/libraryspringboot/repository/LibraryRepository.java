package honeybee.spring.libraryspringboot.repository;

import honeybee.spring.libraryspringboot.model.Library;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LibraryRepository extends PagingAndSortingRepository<Library,Long> {
//    @Query("select round(count(lbno)/25,0) from Library ")
//    int countLibraryBy();

    Page findAll(Pageable paging);

}
