package com.song.anypractice2108.note;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NoteDTO {
    private Integer no;
    private String who, whom;
    private String content;

}
