package com.es_test.controller;

import com.es_test.document.UserDocument;
import com.es_test.service.UserService;
import org.apache.catalina.loader.ResourceEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //创建索引
//    @PostMapping("/createUserIndex")
//    public ResponseEntity<Boolean> createUserIndex(@RequestParam(value = "index") String index) throws Exception{
//
//        return ResponseEntity.status(HttpStatus.SC_CREATED).body(userService.createUserIndex(index));
//    }

    //删除索引
    @PostMapping("/deleteUserIndex")
    public ResponseEntity<Boolean> deleteUserIndex(@RequestParam(value = "index") String index) throws Exception{
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.deleteUserIndex(index));
    }

    //新增文档
    @PostMapping("/createUserDocument")
    public ResponseEntity<Boolean> createUserDocument(@RequestBody UserDocument document) throws Exception{
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUserDocument(document));
    }

    //批量新增文档
    @PostMapping("/bulkCreateUserDocument")
    public ResponseEntity<Boolean> bulkCreateUserDocument(@RequestBody List<UserDocument> document) throws Exception {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.bulkCreateUserDocument(document));
    }

    //删除文档
    @PostMapping("/deleteUserDocument")
    public String deleteUserDocument(@RequestParam String id) throws Exception {
        return userService.deleteUserDocument(id);
    }

    //更新文档
    @PostMapping("/updateUserDocument")
    public ResponseEntity<Boolean> updateUserDocument(@RequestBody UserDocument document) throws Exception {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.updateUserDocument(document));
    }

    //获取文档
    @GetMapping("/getUserDocument")
    public UserDocument getUserDocument(@RequestParam String id) throws Exception {
        return userService.getUserDocument(id);
    }

    //用户列表
    @GetMapping("/getUserList")
    public List<UserDocument> getUserList() throws Exception {
        return userService.getUserList();
    }

    //通过城市名搜索
    @GetMapping("/searchUserByCity")
    public List<UserDocument> searchUserByCity(@RequestParam(value = "city") String city) throws Exception {
        return userService.searchUserByCity(city);
    }
}
