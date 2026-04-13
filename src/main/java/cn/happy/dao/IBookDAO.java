package cn.happy.dao;

import cn.happy.pojo.BookInfo;

import java.util.List;

public interface IBookDAO {
    public List<BookInfo> getAllBooks() throws Exception;
}
