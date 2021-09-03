package com.es_test;

import com.es_test.document.UserDocument;
import com.es_test.mapper.UserMapper;
import com.es_test.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

@SpringBootTest
class EsTestApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Autowired
    private UserService userService;
    @Autowired
    UserMapper userMapper;
    @Test
    void mybatisTest() throws Exception {
        List<UserDocument> userList = userService.getUserList();
        System.out.println(userService.getUserList());
        for (UserDocument user : userList){
            System.out.println(userMapper.insert(user));
        }
    }

    @Test
    void mybatisTest1(){
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for(int i = 0; i < n; i++){
            String s = in.nextLine();
            if(s.indexOf("subClassOf") != -1){
                list1.add(s);
            }else{
               list2.add(s);
            }
        }
        String search = in.nextLine();
        List<String> list3 = new ArrayList<>();
        list3.add(search);

        for(String s : list1){
                if(s.contains(search) && s.indexOf(search) != 0) {
                    int len = 0;
                    for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(i) != ' ') {
                            len++;
                        }
                    }
                    String sub = s.substring(0, len);
                    list3.add(sub);
                }

        }
        List<String> list4 = new ArrayList<>();
        for(String s : list2){
            if (s.contains(s)){
                int len = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) != ' ') {
                        len++;
                    }
                }
                String sub = s.substring(0, len);
                list4.add(sub);
            }
        }
    }

}
