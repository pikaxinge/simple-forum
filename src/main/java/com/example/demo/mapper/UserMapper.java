package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
        @Insert("INSERT INTO user (name,account_id,token,gmt_create,gmt_modified) " +
                "VALUES ( #{name},#{accountId},#{token},#{gmtCreate}, #{gmtModified})")
        void insertUser(User user);
        @Select("select * from user where TOKEN = #{token}")
        User findBYToken(@Param("token") String token);

}
