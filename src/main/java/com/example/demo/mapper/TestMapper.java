package com.example.demo.mapper;

import com.example.demo.entity.TestEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMapper {
    List<TestEntity> testSelect1(String str);
}
