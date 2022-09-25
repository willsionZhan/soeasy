package com.gene.soeasy.tools;

import com.gene.soeasy.entity.Menu;

import java.util.ArrayList;
import java.util.List;

public class MenuRestructure {

    //子节点
    private List<Menu> menuList = new ArrayList<Menu>();

    public MenuRestructure(List<Menu> menuList){
        this.menuList=menuList;
    }


    public List<Menu> buildTree(){
        List<Menu> treeMenus = new ArrayList<Menu>();
        for (Menu menuNode : getRootNode()) {
            menuNode = buildChildTree(menuNode);
            treeMenus.add(menuNode);
        }
        return treeMenus;
    }

    private Menu buildChildTree(Menu pNode) {
        List<Menu> childMenus = new ArrayList<Menu>();
        for (Menu menuNode : menuList) {
            if (menuNode.getMenuPID().equals(pNode.getMenuID())) {
                childMenus.add(buildChildTree(menuNode));
            }
        }
        pNode.setMenuList(childMenus);
        return pNode;
    }


    private List<Menu> getRootNode() {
        List<Menu> rootMenuLists = new ArrayList<Menu>();
        for (Menu menuNode : menuList) {
            if (menuNode.getMenuPID()==0) {
                rootMenuLists.add(menuNode);
            }
        }
        return rootMenuLists;
    }
}
