package net.xdclass.online_class;

import net.xdclass.online_class.dao.VideoMapper;
import net.xdclass.online_class.domain.Video;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {

        String resouce="config/mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(resouce);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        try (SqlSession sqlSession = factory.openSession()){
            VideoMapper videoMapper = sqlSession.getMapper(VideoMapper.class);
//            Video video = videoMapper.selectById(44);
//            System.out.println(video.toString());
            List<Video> videoList = videoMapper.selectList();
            System.out.println(videoList.toString());
        }
    }
}
