package com.company;

import com.company.Service.OutputService;

public class Main {

    public static void main(String[] args) {
	// write your code here

        OutputService outputService = new OutputService();
        outputService.printAllObjects();
        outputService.printSchedule();

    }
}
