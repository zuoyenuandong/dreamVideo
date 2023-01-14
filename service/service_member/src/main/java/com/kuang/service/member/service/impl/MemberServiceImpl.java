package com.kuang.service.member.service.impl;

import com.kuang.service.member.entity.Member;
import com.kuang.service.member.mapper.MemberMapper;
import com.kuang.service.member.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author Kuang
 * @since 2022-10-29
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
