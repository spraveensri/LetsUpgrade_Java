package com.javacode;
import java.util.Scanner;
class Player{
	Scanner sc=new Scanner(System.in);
    String name;
    int score=0;

    public void getDetails(){

        System.out.println("Enter player name");
        name=sc.next();

    }
}
class Question{
	Scanner sc=new Scanner(System.in);
    String question,option1,option2,option3,option4;
    int correctAnswer,userAnswer;

    public boolean askQuestion()
    {
        System.out.println(question);
        System.out.println("1. "+option1);
        System.out.println("2. "+option2);
        System.out.println("3. "+option3);
        System.out.println("4. "+option4);
        System.out.println("please choose an option");
        userAnswer=sc.nextInt();
        if(userAnswer==correctAnswer){
            return true;
        }
       return false;
    }


public class Game {

	    Question[] questions=new Question[3];
	    Player player=new Player();

	    String[] questionsdata={"What is the national game of india?","Who is Captain America?","Famous quote in Avengers?","What is the native place of thor?"};
	    String[] options1={"Cricket","Hockey","Football"};
	    String[] options2={"Steve Rogers","Tony Stark","Bruce Banner"};
	    String[] options3={"Assemble! Avengers!","Avengers! Assemble!","Revenge! Avengers!"};
	    String[] options4={"Earth","Mars","Asgard"};
	    int[] answers={2,3,4};


	    public void initGame()
	    {
	        for(int i=0;i<3;i++){
	            questions[i]=new Question();
	        }

	        for(int i=0;i<3;i++)
	        {

	            questions[i].question=questionsdata[i];
	            questions[i].option1=options1[i];
	            questions[i].option2=options2[i];
	            questions[i].option3=options3[i];
	            questions[i].option4=options4[i];
	            questions[i].correctAnswer=answers[i];
	        }

	    }
	    public void play()
	    {

	          player.getDetails();
	          for(int i=0;i<3;i++)
	          {
	              boolean status=questions[i].askQuestion();
	              if(status==true)
	              {
	                  System.out.println("You have played very cool!!");
	                  player.score=player.score+5;
	              }
	              else{
	                  System.out.println("Sorry I can't help you!!");
	                  player.score=player.score-5;
	              }
	          }

	        System.out.println(player.name+" your score is "+player.score);

	    }

	}
public class Quiz {

    public void main(String[] args) {
        Game game=new Game();
        game.initGame();
        game.play();
    }
}
}


