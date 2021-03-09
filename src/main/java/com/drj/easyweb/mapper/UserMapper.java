package com.drj.easyweb.mapper;

import com.drj.easyweb.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {

    @Select("select * from user where id=#{id}")
    User getUserById(int id);
}
