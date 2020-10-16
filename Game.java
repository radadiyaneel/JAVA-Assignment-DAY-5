package com.quizapplication;

public class Game {

    Question[] questions=new Question[3];
    Player player=new Player();


    public void initGame()
    {
        for(int i=0;i<3;i++){
            questions[i]=new Question();
        }
        questions[0].question="Who is the Stongest Avenger?";
        questions[0].option1="Ironman";
        questions[0].option2="Thor";
        questions[0].option3="Hulk";
        questions[0].option4="Dr Strange";
        questions[0].correctAnswer=2;

        questions[1].question="What is the closest planet to SUN?";
        questions[1].option1="Earth";
        questions[1].option2="Venus";
        questions[1].option3="Mercury";
        questions[1].option4="Jupiter";
        questions[1].correctAnswer=3;

        questions[2].question="What is the capital of australia?";
        questions[2].option1="Sydney";
        questions[2].option2="Melbourne";
        questions[2].option3="Perth";
        questions[2].option4="Canberra";
        questions[2].correctAnswer=4;



    }
    public void play()
    {

            player.getDetails();
            for(int i=0;i<3;i++)
            {
                boolean status=questions[i].askQuestion();
                if(status=true)
                {
                    System.out.println("You Played Well!!!");

                    player.score++;
                }
                else
                    {
                        System.out.println("Better Luck Next Time !!!");
                    }

            }

        System.out.println(player.name+" Your Score is "+player.score);




    }

}
