package com.kuang.service.member.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kuang.common.entity.mybatis.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户关注
 * </p>
 *
 * @author Kuang
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("member_follow_fans")
@ApiModel(value="FollowFans对象", description="用户关注")
public class FollowFans extends BaseEntity {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "关注者ID")
    private String memberFansId;

    @ApiModelProperty(value = "被关注者ID")
    private String memberFollowId;


}
