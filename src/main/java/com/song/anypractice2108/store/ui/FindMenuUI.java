package com.song.anypractice2108.store.ui;

import com.song.anypractice2108.store.StoreDTO;
import com.song.anypractice2108.store.StoreService;

import java.util.Scanner;

public class FindMenuUI extends AbstractMenuUI{

    public FindMenuUI(Scanner scanner, StoreService storeService){
        super(scanner, storeService);
    }

    @Override
    public void doJob() {
      String menuName = readLine("메뉴 이름을 입력하세요.");

      StoreDTO result = storeService.findByMenuName(menuName);

        System.out.println(result);
    }
}
