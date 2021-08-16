package com.song.anypractice2108.quiz;

public class QuizService {

    public QuizDTO makeQuiz(){

        return new QuizDTO(getNum(),getNum());
    }

    private int getNum(){
        return(int)(Math.random()*100) + 1;
    }

    public boolean grading(QuizDTO quizDTO, int answer){
        int correctAnswer = quizDTO.getNum1() * quizDTO.getNum2();
        return answer == correctAnswer;
    }
}
