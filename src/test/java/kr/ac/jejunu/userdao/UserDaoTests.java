package kr.ac.jejunu.userdao;


import org.hamcrest.core.IsNull;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;

public class UserDaoTests {
    String name = "hulk";
    String password = "1234";
    @Test
    public void testGet() throws SQLException, ClassNotFoundException {
        Integer id = 1;
        UserDao userDao = new UserDao();
        User user = userDao.get(id);
        assertThat(user.getId(), is(id));
        assertThat(user.getName(), is(name));
        assertThat(user.getPassword(), is(password));
    }

    @Test
    public void testInsert() throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        User user = new User();
        user.setName(name);
        user.setPassword(password);

        userDao.insert(user);

        User insertedUser = userDao.get(user.getId());
        assertThat(insertedUser.getId(), greaterThan(0));
        assertThat(insertedUser.getName(), is(name));
        assertThat(insertedUser.getPassword(), is(password));
    }








//    @Test
//    public void update() throws SQLException {
//        User user = new User();
//        user.setName(name);
//        user.setPassword(password);
//        userDao.insert(user);
//
//        String updatedName = "허윤호";
//        user.setName(updatedName);
//        String updatedPassword = "1111";
//        user.setPassword(updatedPassword);
//
//        userDao.update(user);
//
//        User updatedUser = userDao.get(user.getId());
//        assertThat(updatedUser.getName(), is(updatedName));
//        assertThat(updatedUser.getPassword(), is(updatedPassword));
//    }
//
//    @Test
//    public void delete() throws SQLException {
//        User user = new User();
//        user.setName(name);
//        user.setPassword(password);
//        userDao.insert(user);
//
//        userDao.delete(user.getId());
//
//        User deletedUser = userDao.get(user.getId());
//
//        assertThat(deletedUser, IsNull.nullValue());
//    }
}