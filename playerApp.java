import java.util.*;

class player
{
private int id;
private String name;
private int runs;


public void setId(int i)
{
id=i;
}
public int getId(){
return id;
}


public void setName(String n)
{
name=n;
}
public String getName(){
return name;
}

public void setRuns(int r)
{
runs=r;
}
public int getRuns(){
return runs;
}

}



class team
{
player pl[];

void setplayer(player...p){
pl=p;

}

void show(){
for(int i=0;i<pl.length;i++){
System.out.printf("%s,%d,%d\n",pl[i].getName(),
pl[i].getId(),
pl[i].getRuns());

}

}
}



public class playerApp{
public static void main(String args[]){
team t=new team();
player play1=new player();
play1.setId(1);
play1.setName("ab");
play1.setRuns(450);

player play2=new player();
play2.setId(2);
play2.setName("daa");
play2.setRuns(550);
t.setplayer(play1,play2);
t.show();
}
}