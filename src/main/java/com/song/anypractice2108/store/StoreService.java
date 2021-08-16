package com.song.anypractice2108.store;

import java.util.Arrays;
import java.util.Optional;

public class StoreService {
    private StoreDTO[] storeDTOS;
    public StoreService(StoreDTO[] storeDTOS){this.storeDTOS = storeDTOS;}
    public StoreService(){

    }

    public StoreDTO findByMenuName(String menuName){
        Optional<StoreDTO> result =
                Arrays.stream(this.storeDTOS).filter(storeDTO -> storeDTO.getMenu().indexOf(menuName) >=0).findFirst();

        if(result.isPresent()){
            return result.get();
        }else{
            return null;
        }
    }

}
