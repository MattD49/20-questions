import java.util.Scanner;
public class twentyquestions {
    public static void main(String[] args) {
        System.out.println("Bullying Quiz");
        
        System.out.println("Dont forget to capitalize all of your words!");
        
        System.out.println("Answer these twenty questions.");
        
        System.out.println("If you get at least 18 questions right, you win!");
        
        Scanner reader = new Scanner(System.in);
        
        int score;
        score = 0;
        
        String skycolor;
        System.out.println("What is a serious problem in all schools?");
        skycolor = reader.nextLine();
        
        if (skycolor.equals("Bullying")){
       
            System.out.println("Correct! You get one point!");
            score = score + 1;
        
        }
        else
        {
            System.out.println("INCORRECT! The answer was Bullying!");
        }
        String yay;
        System.out.println("What type of bullying happens online?");
        
        yay = reader.nextLine();
        
        if (yay.equals("Cyber Bullying"))
        { 
            System.out.println("Correct! You get one point!");
            score = score + 1;
            
        }
        else 
        {
             System.out.println("INCORRECT! The answer was Cyber Bullying!");
        }   
        String hi;
        System.out.println("What type of bullying uses words?");
        hi = reader.nextLine();
        
        if (hi.equals("Verbal Bullying"))
        {
            System.out.println("Correct! You get one point!");
                       score = score + 1;

        }   
        else
        {
            System.out.println("INCORRECT! The answer was Verbal Bullying!");
        }
        
        String ok;
        System.out.println("What type of bullying involves hand gestures, kicking ect?");
        ok = reader.nextLine();
    
        if (ok.equals("Physical Bullying"))
        {
            System.out.println("Correct! You get one point!");
                        score = score + 1;
       
        } 
        else 
        {     
             System.out.println("INCORRECT! The answer was Physical Bullying!"); 
        }    
        String oh;
        System.out.println("What percent of kids in grades 9-12 are bullied?");
        oh = reader.nextLine(); 
            
        if (oh.equals("19%"))
        {
            System.out.println("Correct! You get one point!");
            score = score + 1;
           
        }
        else
        {
            System.out.println("INCORRECT! The answer was 19%!");
        }       
        String md;
        System.out.println("Which of the following is a sign of a child that is being bullied: A) Increase in grade percentage B) Sudden loss of friends C) There are no signs. [write your answer without the parentheses]");
        md = reader.nextLine();
          
        if (md.equals("C"))
        {
            System.out.println("Correct! You got one point!");
            score = score + 1;
     
       }   
        else
        {
            System.out.println("INCORRECT! The answer was C!");
        }     
              
              String sl;
              System.out.println("What do you call someone who witnesses bullying and doesnt do anything?");
              sl = reader.nextLine();
              
              if (sl.equals("Bystander"))
              {
                    System.out.println("Correct! You get one point!");
                          score = score + 1;
                
              }
               else
               {
               System.out.println("INCORRECT! The answer was Bystander!");
               
               }
               String we;
               System.out.println("What do you call the person who was bullied?");
               we = reader.nextLine();
               
               if (we.equals("Victim"))
               {
               System.out.println("Correct! You get one point!");
                        score = score + 1;
               }
               else
               {
               System.out.println("INCORRECT! The answer was Victim!");
               }
               
                String sr;
               System.out.println("Is bullying illegal?");
               sr = reader.nextLine();
               
               if (sr.equals("Yes"))
               {
               System.out.println("Correct! You get one point!");
     score =score + 1;
               }
               else
               {
               System.out.println("INCORRECT! The correct answer was Yes!");
               }
               
                String dg;
               System.out.println("What is the most popular pet in America?");
               dg = reader.nextLine();
               
               if (dg.equals("Dog"))
               {
               System.out.println("Correct! You get one point!");
            score = score + 1;
               }
               else
               {
               System.out.println("INCORRECT! NO POINTS!");
               }
                  String gg;
               System.out.println("What is the most popular car in America?");
               gg = reader.nextLine();
               
               if (gg.equals("Corola"))
               {
               System.out.println("Correct! You get one point!");
            score = score + 1;
               }
               else
               {
               System.out.println("INCORRECT! NO POINTS!");
               }
               
                String tr;
               System.out.println("How many sides does a septagon?");
               tr = reader.nextLine();
               
               if (tr.equals("Seven"))
               {
               System.out.println("Correct! You get one point!");
               score = score + 1;
               }
               else
               {
               System.out.println("INCORRECT! NO POINTS!");
               }
               
                String po;
               System.out.println("What is the 2nd biggest country in the world?");
               po = reader.nextLine();
               
               if (po.equals("Canada"))
               {
               System.out.println("Correct! You get one point!");
             score = score + 1;
               }
               else
               {
               System.out.println("INCORRECT! NO POINTS!");
               }
               
                String op;
               System.out.println("What are the 2 political parties? HINT: (R before D)");
               op = reader.nextLine();
               
               if (op.equals("Republicans and Democrats"))
               {
               System.out.println("Correct! You get one point!");
           score = score + 1;
               }
               else
               {
               System.out.println("INCORRECT! NO POINTS!");
               }
               
                String ba;
               System.out.println("Who was the first black president?");
               ba = reader.nextLine();
               
               if (ba.equals("Barack Obama"))
               {
               System.out.println("Correct! You get one point!");
               score = score + 1;
             
               }
               else
               {
               System.out.println("INCORRECT! NO POINTS!");
               }
               
                String oi;
               System.out.println("What are the names of the creators of this quiz? HINT: (S before M)");
               oi = reader.nextLine();
               
               if (oi.equals("Sean and Matthew"))
               {
               System.out.println("Correct! You get one point!");
               score = score + 1;
               
               }
               else
               {
               System.out.println("INCORRECT! NO POINTS!");
               }
               
                String xy;
               System.out.println("What is the 14th state?");
               xy = reader.nextLine();
               
               if (xy.equals("Vermont"))
               {
               System.out.println("Correct! You get one point!");
               score = score + 1;
           
               }
               else
               {
               System.out.println("INCORRECT! NO POINTS!");
               }
               
                String go;
               System.out.println("What was the 7th continent to be discovered?");
               go = reader.nextLine();
               
               if (go.equals("Antarctica"))
               {
               System.out.println("Correct! You get one point!");
               score = score + 1;
           
               }
               else
               {
               System.out.println("INCORRECT! NO POINTS!");
               }
               
                String pk;
               System.out.println("WHo is the creator of Apple?");
               pk = reader.nextLine();
               
               if (pk.equals("Steve Jobs"))
               {
               System.out.println("Correct! You get one point!");
               score = score + 1;
              
               }
               else
               {
               System.out.println("INCORRECT! NO POINTS!");
               }
               
               
                String ed;
               System.out.println("For 2 points, what are the middle name of both the creators HINT: (J before P, 'and' in the middle)");
               ed = reader.nextLine();
               
               if (ed.equals("Joeseph and Patrick"))
               {
               System.out.println("Correct! You get one point!");
               score = score + 2;
            
               }
               else
               {
               System.out.println("INCORRECT! NO POINTS!");
               }
               
               System.out.println("Your score is " + score);
               System.out.println("Created by Matthew Derosier");
               System.out.println("Thank you for particapating!");
               System.out.println("It took me hours to make this, hope you enjoyed :)");
               System.out.println("It was very hard work, so I hope it was worth it.  Now, goodbye.");
               System.out.println("System Shutting Down");
        }
     }