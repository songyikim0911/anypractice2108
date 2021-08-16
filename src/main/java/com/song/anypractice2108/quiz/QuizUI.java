package com.song.anypractice2108.quiz;

import lombok.AllArgsConstructor;

import java.util.Scanner;

@AllArgsConstructor
public class QuizUI {
    private Scanner scanner;
    private QuizService quizService;

    public void resolve(){
        System.out.println("Would you like to try a question?");

        String choice = scanner.nextLine();

        if(choice.equalsIgnoreCase("n")){
            return;
        }
        QuizDTO quizDTO = quizService.makeQuiz();

        System.out.println(quizDTO.getNum1() + "*" + quizDTO.getNum2());

        System.out.println("Answer?");

        int userAnswer = Integer.parseInt(scanner.nextLine());

        boolean result = quizService.grading(quizDTO, userAnswer);

        if(result){
            System.out.println("Correct!");
        }else{
            System.out.println("Incorrect...");
        }

        this.resolve();
    }
}
