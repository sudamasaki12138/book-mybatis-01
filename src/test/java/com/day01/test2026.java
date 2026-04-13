package com.day01;

import cn.happy.dao.IBookDAO;
import cn.happy.dao.impl.BookkInfoDAOImpl;
import cn.happy.pojo.BookInfo;
import org.junit.jupiter.api.Test;

import java.util.List;

public class test2026 {
    @Test
    public void testAll() throws  Exception{
        IBookDAO bookDAO = new BookkInfoDAOImpl();
        List<BookInfo> list = bookDAO.getAllBooks();
        for (BookInfo Info : list) {
            System.out.println(Info);
        }

    }
}
