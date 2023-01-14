package com.kuang.service.video.service.impl;

import com.kuang.service.video.entity.Video;
import com.kuang.service.video.mapper.VideoMapper;
import com.kuang.service.video.service.VideoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 视频 服务实现类
 * </p>
 *
 * @author Kuang
 * @since 2022-10-29
 */
@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements VideoService {

}
