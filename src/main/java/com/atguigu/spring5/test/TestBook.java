package com.atguigu.spring5.test;

import com.atguigu.spring5.entity.Book;
import com.atguigu.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Leo
 * @date 2020/7/28 - 11:18
 */

public class TestBook {

    @Test
    public void testJdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        //添加
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("java");
//        book.setUstatus("a");
//        bookService.addBook(book);

        //修改
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("javaup");
//        book.setUstatus("atguigu");
//        bookService.updateBook(book);

        //删除
//        bookService.deleteBook("1");

        //查询返回某个值
//        int count = bookService.findCount();
//        System.out.println(count);

        //查询返回对象
//        Book book = bookService.findOne("1");
//        System.out.println(book);

        //查询返回集合
//        List<Book> all = bookService.findAll();
//        System.out.println(all);

        //批量添加
//        List<Object[]> batchArgs = new ArrayList<Object[]>();
//        Object[] o1 = {"3","java","a"};
//        Object[] o2 = {"4","c++","b"};
//        Object[] o3 = {"5","mysql","c"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchAdd(batchArgs);

        //批量修改
//        List<Object[]> batchArgs = new ArrayList<Object[]>();
//        Object[] o1 = {"java333","a3","3"};
//        Object[] o2 = {"c++444","b4","4"};
//        Object[] o3 = {"mysql555","c5","5"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchUpdate(batchArgs);

        //批量删除
        List<Object[]> batchArgs = new ArrayList<Object[]>();
        Object[] o1 = {"3"};
        Object[] o2 = {"4"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        bookService.batchDelete(batchArgs);

    }

}
