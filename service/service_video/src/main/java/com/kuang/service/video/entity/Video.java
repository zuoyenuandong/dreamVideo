package com.kuang.service.video.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.kuang.common.entity.mybatis.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 视频
 * </p>
 *
 * @author Kuang
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("video_video")
@ApiModel(value="Video对象", description="视频")
public class Video extends BaseEntity {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "课程类型，0：单视频，1：系列")
    private Integer videoType;

    @ApiModelProperty(value = "视频名称")
    private String videoTitle;

    @ApiModelProperty(value = "视频封面")
    private String videoCover;

    @ApiModelProperty(value = "视频连接")
    private String videoUrl;

    @ApiModelProperty(value = "发布状态，0：未发布，1：已发布")
    private Integer videoStatus;

    @ApiModelProperty(value = "视频点击次数")
    private Integer videoCount;

    @ApiModelProperty(value = "乐观锁")
    private Long version;

    @ApiModelProperty(value = "逻辑删除 1（true）已删除， 0（false）未删除")
    @TableField("is_deleted")
    @TableLogic
    private Boolean deleted;


}
