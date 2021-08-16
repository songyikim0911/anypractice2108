package com.song.anypractice2108.store;

import java.util.Scanner;

public class StoreUI {

    private Scanner scanner;

    private StoreService storeService;

    public StoreUI(Scanner scanner, StoreService storeService){
        this.scanner = scanner;
        this.storeService = storeService;
    }

    public void fnMenu(){
        System.out.println("원하시는 메뉴가 뭔가요?");
        String menuStr = this.scanner.nextLine();
        StoreDTO storeDTO = this.storeService.findByMenuName(menuStr);
        System.out.println(storeDTO);
    }
}
