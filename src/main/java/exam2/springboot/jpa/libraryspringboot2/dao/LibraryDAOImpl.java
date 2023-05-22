package exam2.springboot.jpa.libraryspringboot2.dao;

import exam2.springboot.jpa.libraryspringboot2.model.Library;
import exam2.springboot.jpa.libraryspringboot2.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository("lbdao")
public class LibraryDAOImpl implements LibraryDAO{

    @Autowired
    LibraryRepository libraryRepository;  //자동으로 값을 받아온다?


    @Override
    public List<Library> selectLibrary(int cpg) {
        Pageable paging = PageRequest.of(cpg,25, Sort.by("lbno").descending());

        return libraryRepository.findAll(paging).getContent();
    }


}
