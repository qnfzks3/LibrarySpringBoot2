package exam2.springboot.jpa.libraryspringboot2.service;


import exam2.springboot.jpa.libraryspringboot2.dao.LibraryDAO;
import exam2.springboot.jpa.libraryspringboot2.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("lbsrv")
public class LibraryServiceImpl implements LibraryService{

    @Autowired
    LibraryDAO lbdao; //자동으로 값을 받아온다?


    @Override
    public List<Library> readLibrary(int cpg) {
        return lbdao.selectLibrary(cpg - 1);
        //페이지 클레스로 레포지토리에서 데이터 가져왔지만 cpg를 그냥쓰면 안나온다. 홈페이지 상에선 1부터 시작하기때문
        // 소스안에서는 0부터 시작이기 때문에 첫번째 데이터 화면을 출력하기위해 -1을 해준다.
    }

    @Override
    public int countLibrary() {
        return lbdao.countLibrary();   //dao 호출 숫자 출력
    }
}
