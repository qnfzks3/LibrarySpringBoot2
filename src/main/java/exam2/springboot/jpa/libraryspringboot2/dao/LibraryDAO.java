package exam2.springboot.jpa.libraryspringboot2.dao;

import exam2.springboot.jpa.libraryspringboot2.model.Library;

import java.util.List;

public interface LibraryDAO {

    List<Library> selectLibrary(int cpg);



}
