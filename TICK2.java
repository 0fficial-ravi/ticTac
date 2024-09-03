import java.util.*;
public class TICK2
{   
        String a[]=new String[]{"","|","","|",""};
        String b[]=new String[]{"","|","","|",""};
        String d[]=new String[]{"","|","","|",""};

    int c=0;int c2=0;
    int rep_c(int i,String f)
    {      if(i>=0 && i<3)
           c=i*2;
           else if(i>=3 && i<6)
           c=(i*2)-1;
           else if(i>=6 && i<9)
           c=(i*2)-2;
           else
           c=0;
              if(i>=0 && i<3)
              {
                  if(a[c].equals("X")||a[c].equals("x")||a[c].equals("O")||a[c].equals("o"))
                  return(0);
                  else
                  {
                      a[c]=f;
                      return(1);
                    }
                }
                 else if(i>=3 && i<6)
                  {
                  if(b[c-5].equals("X")||b[c-5].equals("x")||b[c-5].equals("O")||b[c-5].equals("o"))
                  return(0);
                  else
                  {
                      b[c-5]=f;
                      return(1);
                    }
                }
             else if(i>=6 && i<9)
              {
                  if(d[c-10].equals("X")||d[c-10].equals("x")||d[c-10].equals("O")||d[c-10].equals("o"))
                  return(0);
                  else
                  {
                      d[c-10]=f;
                      return(1);
                    }
                }
               else
               return(0);
    }
    int rep_h(int i,String f)
    {      if(i>0 && i<=3)
           c2=(i*2)-2;
           else if(i>3 && i<=6)
           c2=(i*2)-3;
           else if(i>6 && i<=9)
           c2=(i*2)-4;
           else
           c2=0;
              if(i>0 && i<=3)
              {
                  if(a[c2].equals("X")||a[c2].equals("x")||a[c2].equals("O")||a[c2].equals("o"))
                  return(0);
                  else
                  {
                      a[c2]=f;
                      return(1);
                    }
                }
                 if(i>3 && i<=6)
              {
                  if(b[c2-5].equals("X")||b[c2-5].equals("x")||b[c2-5].equals("O")||b[c2-5].equals("o"))
                  return(0);
                  else
                  {
                      b[c2-5]=f;
                      return(1);
                    }
                }
             if(i>6 && i<=9)
              {
                  if(d[c2-10].equals("X")||d[c2-10].equals("x")||d[c2-10].equals("O")||d[c2-10].equals("o"))
                  return(0);
                  else
                  {
                      d[c2-10]=f;
                      return(1);
                  }
                }
                return(0);
    }
    String hum_mar(int p)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("ENTER YOUR MARK HUMAN("+p+") [X] OR [O]");
            String mark=sc.nextLine();
            return(mark);
        }
    String cpu_mar(String g)
        {
            if(g.equals("X"))
            return("O");
            else if(g.equals("x"))
            return("o");
            else if(g.equals("O"))
            return("X");
            else if(g.equals("o"))
            return("x");
            else
            return("E");
        }            
    int toss()
    {
        int win=(int)(Math.random()*2);   
        return(win);
    }
    int hum_mov()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("PLAYERS 1'S INPUT");
        int h_m=sc.nextInt();
        return(h_m);
    }
    int hum_mov2()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("PLAYER 2'S INPUT");
        int h_m2=sc.nextInt();
        return(h_m2);
    }        
    int cpu_mov()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("CPU MOVING PRESS ENTER");
    String s2=sc.nextLine();
    if(b[2].equals(""))
    return(4);
    else if(a[0].equals("") && a[2].equals("")&& a[4].equals("")&&b[0].equals("")&& b[2].equals("") && b[4].equals("")&& d[0].equals("")&& d[2].equals("")&& d[4].equals(""))
    return(4);
    
    //for P DIAGONAL
    else if(a[0].equals(b[2]) && d[4].equals(""))
    return(8);
    else if(a[0].equals(d[4]) && b[2].equals(""))
    return(4);
    else if(d[4].equals(b[2]) && a[0].equals(""))
    return(0);    
    //for DIAGONAL 2
    else if(a[4].equals(b[2]) && d[0].equals(""))
    return(6);
    else if(a[4].equals(d[0]) && b[2].equals(""))
    return(4);
    else if(d[0].equals(b[2]) && a[4].equals(""))
    return(2);    
    //for ROW 1
    else if(a[0].equals(a[2])&& a[4].equals("")&&(a[2].equals("X")||a[2].equals("x"))&& a[4].equals(""))
    return(2);
    else if(a[0].equals(a[2])&& a[4].equals("")&&(a[2].equals("O")||a[2].equals("o"))&& a[4].equals(""))
    return(2);
    else if(a[0].equals(a[4])&& a[2].equals("")&&(a[4].equals("X")||a[4].equals("x"))&& a[2].equals(""))
    return(1);
    else if(a[0].equals(a[4])&& a[2].equals("")&&(a[4].equals("O")||a[4].equals("o"))&& a[2].equals(""))
    return(1);
    else if(a[4].equals(a[2])&& a[0].equals("")&&(a[2].equals("X")||a[2].equals("x"))&& a[0].equals(""))
    return(0);
    else if(a[4].equals(a[2])&& a[0].equals("")&&(a[2].equals("O")||a[2].equals("o"))&& a[0].equals(""))
    return(0);
    
    //for ROW 2
    else if(b[0].equals(b[2])&& b[4].equals("")&&((b[2].equals("X")||b[2].equals("x"))&& b[4].equals("")))
    return(5);
    else if(b[0].equals(b[2])&& b[4].equals("")&&((b[2].equals("O")||b[2].equals("o"))&& b[4].equals("")))
    return(5);
    else if(b[0].equals(b[4])&& b[2].equals("")&&((b[4].equals("X")||b[4].equals("x"))&& b[2].equals("")))
    return(4);
    else if(b[0].equals(b[4])&& b[2].equals("")&&((b[4].equals("O")||b[4].equals("o"))&& b[2].equals("")))
    return(4);
    else if(b[4].equals(b[2])&& b[0].equals("")&&((b[2].equals("X")||b[2].equals("x"))&& b[0].equals("")))
    return(3);
    else if(b[4].equals(b[2])&& b[0].equals("")&&((b[2].equals("O")||b[2].equals("o"))&& b[0].equals("")))
    return(3); 
    //for ROW 3
    else if(d[0].equals(d[2])&& d[4].equals("")&&((d[0].equals("X")||d[0].equals("x"))&& d[4].equals("")))
    return(8);
    else if(d[0].equals(d[2])&& d[4].equals("")&&((d[0].equals("O")||d[0].equals("o"))&& d[4].equals("")))
    return(8);
    else if(d[0].equals(d[4])&& d[2].equals("")&&((d[4].equals("X")||d[4].equals("x"))&& d[2].equals("")))
    return(7);
    else if(d[0].equals(d[4])&& d[2].equals("")&&((d[4].equals("O")||d[4].equals("o"))&& d[2].equals("")))
    return(7);
    else if(d[4].equals(d[2])&& d[0].equals("")&&((d[2].equals("X")||d[2].equals("x"))&& d[0].equals("")))
    return(6);  
    else if(d[4].equals(d[2])&& d[0].equals("")&&((d[2].equals("O")||d[2].equals("o"))&& d[0].equals("")))
    return(6);
    
    //for COLUMN 1
    else if(a[0].equals(b[0])&& d[0].equals("")&& ((a[0].equals("X")||a[0].equals("x"))&& d[0].equals("")))
    return(6);
    else if(a[0].equals(b[0])&& d[0].equals("")&& ((a[0].equals("O")||a[0].equals("o"))&& d[0].equals("")))
    return(6);
    else if(a[0].equals(d[0])&& b[0].equals("")&& ((a[0].equals("X")||a[0].equals("x"))&& b[0].equals("")))
    return(3);
    else if(a[0].equals(d[0])&& b[0].equals("")&& ((a[0].equals("O")||a[0].equals("o"))&& b[0].equals("")))
    return(3);
    else if(b[0].equals(d[0])&& a[0].equals("")&& ((b[0].equals("X")||b[0].equals("x"))&& a[0].equals("")))
    return(0);   
    else if(b[0].equals(d[0])&& a[0].equals("")&& ((b[0].equals("O")||b[0].equals("o"))&& a[0].equals("")))
    return(0);  
    
    //for COLUMN 2
    else if(a[2].equals(b[2])&& d[2].equals("")&&((a[2].equals("X")||a[2].equals("x"))&& d[2].equals("")))
    return(7);
    else if(a[2].equals(b[2])&& d[2].equals("")&&((a[2].equals("O")||a[2].equals("o"))&& d[2].equals("")))
    return(7);
    else if(a[2].equals(d[2])&& b[2].equals("")&&((a[2].equals("X")||a[2].equals("x"))&& b[2].equals("")))
    return(4);
    else if(a[2].equals(d[2])&& b[2].equals("")&&((a[2].equals("O")||a[2].equals("o"))&& b[2].equals("")))
    return(4);
    else if(b[2].equals(d[2])&& a[2].equals("")&&((b[2].equals("X")||b[2].equals("x"))&& a[2].equals("")))
    return(1);
    else if(b[2].equals(d[2])&& a[2].equals("")&&((b[2].equals("O")||b[2].equals("o"))&& a[2].equals("")))
    return(1);
    
    //for COLUMN 3
    else if(a[4].equals(b[4])&& d[4].equals("")&&((b[4].equals("X")||b[4].equals("x"))&& d[4].equals("")))
    return(8);
    else if(a[4].equals(b[4])&& d[4].equals("")&&((b[4].equals("O")||b[4].equals("o"))&& d[4].equals("")))
    return(8);
    else if(a[4].equals(d[4])&& b[4].equals("")&&((d[4].equals("X")||d[4].equals("x"))&& b[4].equals("")))
    return(5);
    else if(a[4].equals(d[4])&& b[4].equals("")&&((d[4].equals("O")||d[4].equals("o"))&& b[4].equals("")))
    return(5);
    else if(b[4].equals(d[4])&& a[4].equals("")&&((d[4].equals("X")||d[4].equals("x"))&& a[4].equals("")))
    return(2);
    else if(b[4].equals(d[4])&& a[4].equals("")&&((d[4].equals("X")||d[4].equals("x"))&& a[4].equals("")))
    return(2);
    else{       
    int c_m=(int)(Math.random()*9);
    int c_m2=c_m+1;    
    return(c_m);
    }
}
    void Print()
    {
          //FOR SEPERATOR 1
    for(int i=0;i<5;i++)
    {
    System.out.print("\t"+a[i]);
    }
    System.out.println();
    //FOR UNDERLINE 1
    System.out.print("\t------------------------------------");
    System.out.println();
    //FOR SEPERATOR 2
    for(int i=0;i<5;i++)
    {
    System.out.print("\t"+b[i]);
    }
    System.out.println();
    //FOR UNDERLINE 2
    System.out.print("\t------------------------------------");
    System.out.println();
    //FOR SEPERATOR 3
    for(int i=0;i<5;i++)
    {
    System.out.print("\t"+d[i]);
    }
    System.out.println();
}
String check()
{
    if(a[0].equals(b[2]) && b[2].equals(d[4]))
    {
    return(a[0]);
    }
    else if(a[4].equals(b[2])&& b[2].equals(d[0]))
    {
        return(a[4]);
    }
    else if(a[0].equals(a[2])&& a[2].equals(a[4]))
    {
        return(a[0]);
    }
    else if(b[0].equals(b[2])&& b[2].equals(b[4]))
    {
        return(b[0]);
    }
    else if(d[0].equals(d[2])&& d[2].equals(d[4]))
    {
        return(d[0]);
    }
    else if(a[0].equals(b[0])&& b[0].equals(d[0]))
    {
        return(a[0]);
    }
    else if(a[2].equals(b[2])&& b[2].equals(d[2]))
    {
        return(a[2]);
    }
    else if(a[4].equals(b[4])&& b[4].equals(d[4]))
    {
        return(a[4]);
    }
    else
    return("no");
}
                   //MAIN METHOD:
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);      
        System.out.println("------------------[WELCOME TO THE TICK TACK GAME]---------------");
        String men=sc.nextLine();
        
        TICK2 ob=new TICK2();
        
        System.out.println("ENTER HOW U WANT TO PLAY 1)HUMAN VS HUMAN 2)HUMAN VS COMPUTER");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                   System.out.println("HUMAN 1 NAME");
                   String name0=sc.nextLine();
                   String name1=sc.nextLine();
                   System.out.println("HUMAN 2 NAME");
                   String name2=sc.nextLine();
                   String hum_mark1="";
                   String hum_mark2="";                                     
                   int win_hum=0;                   
                   hum_mark1=ob.hum_mar(1);
                   if(hum_mark1.equals("X"))
                   hum_mark2="O";
                   else if(hum_mark1.equals("x"))
                   hum_mark2="o";
                   else if(hum_mark1.equals("O"))
                   hum_mark2="X";
                   else if(hum_mark1.equals("o"))
                   hum_mark2="x";
                   win_hum=ob.toss();                   
                   int hum1_mov=0;
                   int hum2_mov=0;
                   int n2=0;
                   int k2=0;
                   int j2=0;
                   String u2="";  
                   ob.Print();
         while(n2!=9)
            {   
                u2=ob.check();
                if(u2.equals(hum_mark1))
                {
                System.out.println(name1+":\tIS THE WINNER");               
                break;
                }
                else if(u2.equals(hum_mark2))
                {                
                System.out.println(name2+":\tIS THE WINNER");               
                break;
                 }
                if(win_hum==0){
                    u2=ob.check();                 
                    hum1_mov=ob.hum_mov();
                    k2=ob.rep_h(hum1_mov,hum_mark1);
                    while(k2!=1)
                    {
                        System.out.println("ERROR:\t"+name1+"\tTRYING TO OVER PLACE MARK,PRESS ENTER");
                        hum1_mov=ob.hum_mov();
                        k2=ob.rep_h(hum1_mov,hum_mark1);
                    }
                    System.out.println("\f");
                    ob.Print();
                    
                  }
        if(win_hum==1)      
            {
                u2=ob.check();
                hum2_mov=ob.hum_mov2();
                j2=ob.rep_h(hum2_mov,hum_mark2);
                while(j2!=1)
                    {
                        System.out.println("ERROR:\t"+name2+"\tIS TRYING TO OVER PLACE MARK,PRESS ENTER");
                        hum2_mov=ob.hum_mov2();
                        j2=ob.rep_h(hum2_mov,hum_mark2);
                    }
                System.out.println("\f");
                ob.Print();  
                
            }        
            n2++;
            if(win_hum==1)
            win_hum=0;
            else if(win_hum==0)
            win_hum=1;
            u2=ob.check();
                if(u2.equals(hum_mark1))
                {
                System.out.println("\n"+name1+":\tIS THE WINNER\t");               
                break;
                }
                else if(u2.equals(hum_mark2))
                {                
                System.out.println("\n"+name2+":\tIS THE WINNER\t");               
                break;
                 }
            if(n2==9 && u2.equals("no"))
                 {
                 
                 System.out.println("\n\t\tMATCH DRAW\n");                
                 break;
                }               
            }
            //END OF WHILE LOOP(HUMAN VS HUMAN):
            System.out.println("\t\t\t\t\t\t\t\nThank You For Playing (:\n\n");
            break;
                   
                   
                   
case 2:         String mark=ob.hum_mar(1);                                    //TO GET HUMAN MARK
                String mark2=ob.cpu_mar(mark);                               //TO GET CPU MARK
                System.out.println();
                System.out.println("CPU MARK="+mark2);
                int l=ob.toss();
                int t_win=l;
                int cp_mo=0;
                int hu_mo=0;
                int n=0;
                int k=1;int j=1;
                ob.Print();
                String u="";
                //FOR CPU AND PLAYER       
        while(n!=9)
            {   
                u=ob.check();
                if(u.equals(mark)){
                System.out.println("YOU ARE THE WINNER ('v')");
                break;
                 }
                else if(u.equals(mark2))
                {                
                System.out.println("YOU LOSE (ioi),CPU IS THE WINNER");               
                break;
                 }
                if(t_win==0){
                    u=ob.check();
                    System.out.println("CPU'S TURN");
                    cp_mo=ob.cpu_mov();                    
                    k=ob.rep_c(cp_mo,mark2);
                    while(k!=1)
                    {
                        System.out.println("ERROR:CPU TRYING TO OVER PLACE MARK,PRESS ENTER");                        
                        cp_mo=ob.cpu_mov();
                        System.out.println("\f");                        
                        k=ob.rep_c(cp_mo,mark2);
                        ob.Print();
                    }
                    System.out.println("\f");
                    ob.Print();
                   }
        if(t_win==1)      
            {
                u=ob.check();
                System.out.println("YOUR TURN");
                hu_mo=ob.hum_mov();
                j=ob.rep_h(hu_mo,mark);
                while(j!=1)
                    {
                        System.out.println("ERROR:YOU ARE TRYING TO OVER PLACE MARK,PRESS ENTER");                        
                        hu_mo=ob.hum_mov();
                        System.out.println("\f");                        
                        j=ob.rep_h(hu_mo,mark);
                        ob.Print();
                    }
                System.out.println("\f");
                ob.Print();                
            }        
            n++;
            if(t_win==1)
            t_win=0;
            else if(t_win==0)
            t_win=1;
            u=ob.check();
                if(u.equals(mark)){                   
                System.out.println("YOU ARE THE WINNER ('v')");
                 break;
                 }
                else if(u.equals(mark2))
                {                
                System.out.println("YOU LOSE (ioi),CPU IS THE WINNER");               
                break;
                 }
            if(n==9 && u.equals("no"))
                 {                 
                    System.out.println("\n\t\tMATCH DRAW\n");                  
                 break;
                }
                
            }
            //END OF WHILE LOOP:
            System.out.println("\t\t\t\t\t\t\t\nThank You For Playing (: \n\n ");
            break;            
}
}
}
