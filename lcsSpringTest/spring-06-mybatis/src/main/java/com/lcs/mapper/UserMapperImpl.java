package com.lcs.mapper;

import com.lcs.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{

    //我们所有的操作，都使用sqlSessionTemplate执行
    private SqlSessionTemplate sqlSession;

    @Override
    public List<User> selectUserList() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUserList();
    }

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }
}
