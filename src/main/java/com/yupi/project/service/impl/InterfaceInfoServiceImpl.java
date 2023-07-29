package com.yupi.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.project.service.InterfaceInfoService;
import com.yupi.project.model.entity.InterfaceInfo;
import generator.mapper.InterfaceInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author 27143
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2023-07-28 18:43:31
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService {

}



