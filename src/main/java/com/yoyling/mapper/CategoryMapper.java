package com.yoyling.mapper;

import com.yoyling.domain.Category;

public interface CategoryMapper {
    int deleteByPrimaryKey(Integer cgid);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer cgid);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}