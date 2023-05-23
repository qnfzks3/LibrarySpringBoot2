package exam2.springboot.jpa.libraryspringboot2.service;

import exam2.springboot.jpa.libraryspringboot2.model.Library;

import java.util.List;
import java.util.Map;

public interface LibraryService {


    Map<String , Object> readLibrary(int cpg); //데이터 출력

    //int countLibrary(); //페이지 네이션
}
