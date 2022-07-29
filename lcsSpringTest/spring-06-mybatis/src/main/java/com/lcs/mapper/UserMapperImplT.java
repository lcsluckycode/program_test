package com.lcs.mapper;

import com.lcs.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImplT extends SqlSessionDaoSupport implements UserMapper{


    @Override
    public List<User> selectUserList() {
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUserList();
    }

}
