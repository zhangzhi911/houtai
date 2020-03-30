package com.taipingyang.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.taipingyang.entity.TUser;


/**
 * <p>
 * 普通用户 Mapper 接口
 * </p>
 *
 * @author Jsl
 * @since 2020-03-27
 */
public interface TUserMapper extends BaseMapper<TUser> {
    void inture(Integer user_id);

    void infalse(Integer user_id);
}
