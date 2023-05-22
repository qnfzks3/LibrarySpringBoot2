package exam2.springboot.jpa.libraryspringboot2.repository;

import exam2.springboot.jpa.libraryspringboot2.model.Library;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;



public interface LibraryRepository extends PagingAndSortingRepository<Library,Long> { //jpa에서 레포지터리 가져온다.

    Page findAll(Pageable paging);    //page 으로 전체를 가져와라   , page 클래스


    @Query("select ceil(count (lbno)/25) from Library ")
    int countLibraryBy();
    



}
