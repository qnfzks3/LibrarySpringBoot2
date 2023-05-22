package exam2.springboot.jpa.libraryspringboot2.service;

import exam2.springboot.jpa.libraryspringboot2.model.Library;

import java.util.List;

public interface LibraryService {


    List<Library> readLibrary(int cpg);

}
