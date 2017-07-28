package com.study.mappers;

import com.study.enums.SexEnum;
import com.study.enums.UserLevelEnum;
import com.study.model.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserMapperTest extends MapperTestBase{


    @Test
    public void testUserMapper(){
        User user = new User();
        user.setName("testUser");
        user.setPassword("123");
        user.setEmail("testEmail");
        user.setAge(24);
        user.setSex(SexEnum.Male);
        user.setLevel(UserLevelEnum.GENERAL);
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        assertEquals(1, userMapper.saveUser(user));
        User dbUser1 = userMapper.getUserByEmail(user.getEmail(), user.getPassword());
        User dbUser2 = userMapper.getUserByName(user.getName(), user.getPassword());
        assertTrue(user.equals(dbUser1));
        assertTrue(user.equals(dbUser2));
        userMapper.deleteUserById(dbUser1.getId());
        dbUser1 = userMapper.getUserByName(user.getName(), user.getPassword());
        assertEquals(null, dbUser1);
    }

}
