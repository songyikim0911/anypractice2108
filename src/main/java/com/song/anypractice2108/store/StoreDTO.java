package com.song.anypractice2108.store;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StoreDTO {

    private String name;
    private double lat, lng;
    private String menu;
    private double score;

}
