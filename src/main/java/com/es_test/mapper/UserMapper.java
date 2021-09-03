package com.es_test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.es_test.document.UserDocument;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<UserDocument> {
}
