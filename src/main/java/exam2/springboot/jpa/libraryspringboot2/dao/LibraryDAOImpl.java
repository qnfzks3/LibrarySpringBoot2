package exam2.springboot.jpa.libraryspringboot2.dao;

import exam2.springboot.jpa.libraryspringboot2.model.Library;
import exam2.springboot.jpa.libraryspringboot2.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


@Repository("lbdao")
public class LibraryDAOImpl implements LibraryDAO{

    @Autowired
    LibraryRepository libraryRepository;  //자동으로 값을 받아온다?


    @Override
    public Map<String, Object> selectLibrary(int cpg) {
        Pageable paging = PageRequest.of(cpg,25, Sort.by("lbno").descending());

        List<Library>  lblist=libraryRepository.findAll(paging).getContent();

        int cntpg = libraryRepository.findAll(paging).getTotalPages();

        Map<String,Object> libs = new HashMap<>();

        libs.put("lblist",lblist); //html로 보냄
        libs.put("cutpg",cntpg);

        return libs;
    }

    /*
    @Override
    public int countLibrary() {


        return libraryRepository.countLibraryBy();
    }
    */
}
