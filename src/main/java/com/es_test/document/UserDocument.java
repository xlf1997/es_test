package com.es_test.document;



import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "user_document")
public class UserDocument {
//    @TableId(type = IdType.AUTO)
    private String id;
    private String name;
    private String sex;
    private Integer age;
    private String city;
}
