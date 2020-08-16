package com.atguigu.spring5.dao;

import com.atguigu.spring5.entity.Book;

import java.util.List;

/**
 * @author Leo
 * @date 2020/7/28 - 10:29
 */

public interface BookDao {
    //添加的方法
    void addBook(Book book);

    //修改的方法
    void updateBook(Book book);

    //删除的方法
    void deleteBook(String id);

    //查询表记录数
    int selectCount();

    //查询返回对象
    Book findBookInfo(String id);

    //查询返回集合
    List<Book> findAllBook();

    //批量添加
    void batchAddBook(List<Object[]> batchArgs);

    //批量修改
    void batchUpdateBook(List<Object[]> batchArgs);

    //批量删除
    void batchDeleteBook(List<Object[]> batchArgs);
}
