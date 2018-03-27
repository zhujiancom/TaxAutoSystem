package com.ey.tax.service.impl;

import com.ey.tax.core.dao.MenuDAO;
import com.ey.tax.model.MenuModel;
import com.ey.tax.service.IMenuService;
import com.ey.tax.vo.MenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class MenuServiceImpl implements IMenuService {
    @Autowired
    private MenuDAO menuDAO;

    @Override
    public List<MenuVo> loadMenus(Long userId) {
        List<MenuModel> menuModels = menuDAO.findMenuItemsByUserId(userId);

        Map<Integer,List<MenuModel>> menuListGroupByLevel = menuModels.stream().collect(Collectors.groupingBy(MenuModel::getMenuLevel));
        return null;
    }

    private List<MenuVo> loadNextLevelMenu(MenuVo firstMenu){
        List<MenuVo> result = new ArrayList<>();

        return result;
    }
}
