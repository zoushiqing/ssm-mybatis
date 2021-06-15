package net.xdclass.online_class.dao;

import net.xdclass.online_class.domain.Video;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface VideoMapper {
    /**
     * 根据视频id 查找视频对象
     * @param videoId
     * @return
     */
//    Video selectById(@Param("video_id") int videoId);
    Video selectById( int videoId);

    List<Video> selectByPointAndTitleLike(@Param("point") double videoId,@Param("title") String title);

    /**
     * 查询全部视频列表
     * 通过xml
     * @return
     */
    List<Video> selectListByXML();
    /**
     * 查询全部视频列表
     * @return
     */
    @Select("select * from video limit 0,1")
    List<Video> selectList();


}
