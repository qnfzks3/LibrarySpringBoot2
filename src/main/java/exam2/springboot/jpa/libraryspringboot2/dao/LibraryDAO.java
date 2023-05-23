package exam2.springboot.jpa.libraryspringboot2.dao;

import exam2.springboot.jpa.libraryspringboot2.model.Library;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface LibraryDAO {

    //List<Library> selectLibrary(int cpg);


    Map<String , Object> selectLibrary(int cpg);
    //int countLibrary

}
