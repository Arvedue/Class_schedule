package com.company;

import com.company.Service.impl.MenuService;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuService menuService = new MenuService();
        menuService.chooseOption();
    }
}
