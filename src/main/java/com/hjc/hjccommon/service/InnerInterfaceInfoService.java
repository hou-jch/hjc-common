package com.hjc.hjccommon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hjc.hjccommon.model.entity.InterfaceInfo;
import javax.annotation.Resource;


/**
* @author hou-jch
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-07-28 17:27:02
*/
public interface InnerInterfaceInfoService {

    /**
     * 从数据库查询该接口是否存在（路径，方法，参数）
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path,String method);
}
