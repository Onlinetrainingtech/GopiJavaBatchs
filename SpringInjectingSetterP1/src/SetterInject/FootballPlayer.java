package SetterInject;

public class FootballPlayer
{
   private String football;

public String getFootball() {
	return football;
}

public void setFootball(String football) {
	this.football = football;
}
   public void play()
   {
	   System.out.println("This is Play function");
   }
}
