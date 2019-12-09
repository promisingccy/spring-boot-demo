package myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @ClassName ReadingListController
 * @Description //TODO
 * @Author ccy
 * @Date 2019/12/9 15:35
 * @Version 1.0
 **/
@Controller
@RequestMapping("/")
public class ReadingListController {
    private ReadingListRepository readingListRepository;

    //构造函数
    @Autowired
    public ReadingListController(ReadingListRepository readingListRepository) {
        this.readingListRepository = readingListRepository;
    }

    @RequestMapping(value = "/{reader}", method = RequestMethod.GET)
    public String readBooks(@PathVariable("reader") String reader, Model model){
        List<Book> readingList = readingListRepository.findByReader(reader);
        if (readingList != null) {
            model.addAttribute("books", readingList);
        }
        return "readingList";
    }

    //添加读者和要读的书
    @RequestMapping(value = "/{reader}", method = RequestMethod.POST)
    public String addToReadingList(@PathVariable("reader") String reader, Book book){
        book.setReader(reader);//设置对象属性
        readingListRepository.save(book);//对象保存
        return "redirect:/{reader}";//跳转到列表页
    }


}
