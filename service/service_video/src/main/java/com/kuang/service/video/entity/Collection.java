package com.kuang.service.video.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kuang.common.entity.mybatis.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 视频收藏
 * </p>
 *
 * @author Kuang
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("video_collection")
@ApiModel(value="Collection对象", description="视频收藏")
public class Collection extends BaseEntity {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "视频ID")
    private String videoId;

    @ApiModelProperty(value = "收藏者ID")
    private String memberCollectionId;


}
