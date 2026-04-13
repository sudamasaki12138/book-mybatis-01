package cn.happy.dao.impl;

import cn.happy.dao.IBookDAO;
import cn.happy.pojo.BookInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class BookkInfoDAOImpl implements IBookDAO {
    @Override
    public List<BookInfo> getAllBooks() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //01/SqlSessionFactoryBuilde 工厂的构建器
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //02,构建SessionFactory工程
        SqlSessionFactory factory = builder.build(is);

        //03，通过工厂构建Session对象
        SqlSession sqlSession = factory.openSession();

        //04,使用SqlSession的selectList()进行执行sql
        List<BookInfo> list = sqlSession.selectList("getBooks");
        return list;
    }
}
