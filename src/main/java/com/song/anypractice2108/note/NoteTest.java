package com.song.anypractice2108.note;

import com.google.gson.Gson;

public class NoteTest {
    public static void main(String[] args) {

        NoteDTO data = NoteDTO.builder().who("A").whom("B").content("커피한잔?").build();

        Command command = Command.builder().oper("ADD").noteDTO(data).build();

        System.out.println(command);

        Gson gson = new Gson();

        System.out.println(gson.toJson(command));

    }

}
