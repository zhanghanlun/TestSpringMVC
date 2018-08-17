package com.zhanghanlun.dao;

import com.zhanghanlun.entity.Status;

public interface StatusMapper {

    Status findStatusByUserId(String UserId);

}
