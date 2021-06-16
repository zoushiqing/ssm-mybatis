package net.xdclass.online_class;

import net.xdclass.online_class.dao.VideoMapper;
import net.xdclass.online_class.domain.Video;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {

        String resouce = "config/mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(resouce);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        try (SqlSession sqlSession = factory.openSession()) {
            VideoMapper videoMapper = sqlSession.getMapper(VideoMapper.class);
//            Video video = videoMapper.selectById(44);
//            System.out.println(video.toString());

//            List<Video> videoList = videoMapper.selectList();
//            System.out.println(videoList.toString());

//            List<Video> videos = videoMapper.selectListByXML();
//            System.out.println(videos.toString());

//            List<Video> videos = videoMapper.selectByPointAndTitleLike(8.7,"HTML");
//            System.out.println(videos.toString());

//            Video video=new Video();
//            video.setTitle("小滴课堂面试专题300道");
//            video.setCoverImg("xdclass.net/aaaa.img");
//            video.setPoint(9.40);
//            video.setCreateTime(new Date());
//            video.setPrice(9900);
//            video.setSummary("面试专题概要");
//            int add = videoMapper.add(video);
//            System.out.println(add);
//            System.out.println(video);
//
//            Video video1=new Video();
//            video1.setTitle("小滴课堂面试专题300道video1");
//            video1.setCoverImg("xdclass.net/aaaa.img");
//            video1.setPoint(9.40);
//            video1.setCreateTime(new Date());
//            video1.setPrice(9900);
//            video1.setSummary("面试专题概要");
//
//            Video video2=new Video();
//            video2.setTitle("小滴课堂面试专题300道video2");
//            video2.setCoverImg("xdclass.net/aaaa.img");
//            video2.setPoint(9.40);
//            video2.setCreateTime(new Date());
//            video2.setPrice(9900);
//            video2.setSummary("面试专题概要");
//
//            List<Video> videos=new ArrayList<>();
//            videos.add(video1);
//            videos.add(video2);
//            int add = videoMapper.addBatch(videos);
//            System.out.println(add);
//            System.out.println(videos);

//            Video video = new Video();
//            video.setId(54);
//            video.setTitle("小滴课堂面试专题300道更新更新更新更新更新更新更新更新");
//            int add = videoMapper.videoUpdate(video);
//            System.out.println(add);
//            System.out.println(video);

            Video video = new Video();
            video.setId(55);
            video.setTitle("小滴课堂面试专题300道更新更新更新更新更新更新更新更新");
            int add = videoMapper.videoUpdateSelective(video);
            System.out.println(add);
            System.out.println(video);
        }
    }
}
