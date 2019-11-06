package com.myblog.blog.entry.somemodel.mapper;

import com.myblog.blog.entry.somemodel.ActicleTable;

public interface ActicleTableMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(ActicleTable record);

    int insertSelective(ActicleTable record);

    ActicleTable selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(ActicleTable record);

    int updateByPrimaryKeyWithBLOBs(ActicleTable record);

    int updateByPrimaryKey(ActicleTable record);
}