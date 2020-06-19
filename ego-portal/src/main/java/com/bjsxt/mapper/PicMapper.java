package com.bjsxt.mapper;

import com.bjsxt.pojo.Pic;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface PicMapper {
    @Select("select * from pic")
    List<Pic> selAll();

    @Insert("insert into pic values(default, #{path})")
    int insPic(Pic pic);

    @Delete("delete from pic where id=#{id}")
    int delById (int id);

    @Update("update pic set path=#{path} where id=#{id}")
    int updById(Pic pic);

}
