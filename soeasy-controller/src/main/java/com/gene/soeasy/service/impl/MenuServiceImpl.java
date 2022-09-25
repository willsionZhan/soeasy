package com.gene.soeasy.service.impl;

import com.gene.soeasy.entity.Menu;
import com.gene.soeasy.mapper.MenuMapper;
import com.gene.soeasy.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单(权限) 服务实现类
 * </p>
 *
 * @author gene
 * @since 2022-09-25
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
