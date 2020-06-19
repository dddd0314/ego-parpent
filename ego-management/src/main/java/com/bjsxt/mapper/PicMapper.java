package com.bjsxt.mapper;

import com.bjsxt.pojo.Pic;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface PicMapper {
    @Insert("insert into pic values(default, #{path})")
    int insPic(Pic pic);
    @Select("select * from pic")
    List<Pic> selAll();
    @Delete("delete from pic where id=#{0}")
    int delById(int id);
    @Select("select * from pic where id=#{id}")
    Pic selById(int id);
    @Update("update pic set path=#{path} where id=#{id}")
    int updById(Pic pic);
}
