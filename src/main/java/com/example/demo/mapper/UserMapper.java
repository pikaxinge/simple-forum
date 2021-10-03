package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
        @Insert("INSERT INTO user (name,account_id,token,gmt_created,gmt_modified) " +
                "VALUES ( #{name},#{accountId},#{token},#{gmtCreated}, #{gmtModified})")
        void insertUser(User user);
}
