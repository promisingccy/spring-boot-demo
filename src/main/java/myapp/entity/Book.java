package myapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @ClassName Book
 * @Description //TODO
 * @Author ccy
 * @Date 2019/12/9 15:21
 * @Version 1.0
 **/
@Entity  //表明是一个 JPA 实体
public class Book {
    @Id //唯一标识
    @GeneratedValue(strategy = GenerationType.AUTO) //自动生成值
    private Long id;
    private String reader;//
    private String isbn;//
    private String title;//
    private String author;//
    private String description;//


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReader() {
        return reader;
    }

    public void setReader(String reader) {
        this.reader = reader;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
