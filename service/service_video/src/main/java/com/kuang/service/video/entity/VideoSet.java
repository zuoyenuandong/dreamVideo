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
 * 视频系列
 * </p>
 *
 * @author Kuang
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("video_video_set")
@ApiModel(value="VideoSet对象", description="视频系列")
public class VideoSet extends BaseEntity {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "所属系列ID")
    private String videoId;

    @ApiModelProperty(value = "系列位置")
    private Integer videoSort;

    @ApiModelProperty(value = "视频地址")
    private String videoUrl;

    @ApiModelProperty(value = "乐观锁")
    private Long version;


}
