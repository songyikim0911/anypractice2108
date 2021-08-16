package com.song.anypractice2108.note;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NoteMapTest {
    public static void main(String[] args) {

        Map<String, ArrayList<NoteDTO>> noteMap = new HashMap<>();

        System.out.println(noteMap+"1");
        String who = "user1";
        NoteDTO newbie = NoteDTO.builder().who("user2").whom("user1").content("커피한잔?").build();

        System.out.println(noteMap+"2");
        ArrayList<NoteDTO> noteDTOS = noteMap.get(who);//값만 꺼내는거... 왜 why! m2에서는 이때 연결되는 이유가 뭐지?

        System.out.println(noteMap+"3");
        if(noteDTOS == null){
            ArrayList<NoteDTO> noteList = new ArrayList<>();
            noteList.add(newbie);
            System.out.println(noteMap+"4-1");
            noteMap.put(who,noteList);

            System.out.println(noteMap+"4-2");//값이 들어가는 지점!!!
        }else{
            noteDTOS.add(newbie);

            System.out.println(noteMap+"5");
        }

    }

}
