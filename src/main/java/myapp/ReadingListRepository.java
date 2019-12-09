package myapp;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName ReadingListRepository
 * @Description //TODO
 * @Author ccy
 * @Date 2019/12/9 15:28
 * @Version 1.0
 **/
//定义仓库接口
public interface ReadingListRepository extends JpaRepository<Book, Long> {
    //根据读者的用户名来查找阅读列表
    List<Book> findByReader(String reader);
}
