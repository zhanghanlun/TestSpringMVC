package com.zhanghanlun.dao;

import com.zhanghanlun.entity.Signon;

public interface SignonMapper {

    Signon findSignonByUserId(String userId);

}
