
public class MySolutions{
    
public void celsuisToFahrenheit(){
    System.out.println("MySolutions mySolution1 = new MySolutions();");
    double c=30.0;
    double f=c*9/5+32;
    System.out.println(c+"°C="+f+"°F");
}

public void elapsedTime(){
    int hour=12;
    int minute=0;
    int second=0;
    int totalSecond=24*3600;
    int secondPassed=hour*3600;
    int secondRemained=totalSecond-secondPassed;
    double percentageOfDay=(double)secondPassed/(double)totalSecond*100;
    System.out.print("The current time is "+hour+":"+minute+":"+second+".");
    System.out.println(" It has been "+secondPassed+" seconds since the day began.");
    System.out.println("There are "+secondRemained+" seconds left in the day.");
    System.out.println("The day is "+percentageOfDay+"% done.");
}

public void secondsToHMS(){
    int second=5000;
    int hour;
    int minute;
    int secondRemained;
    hour=second/3600;
    minute=second%3600/60;
    secondRemained=second%3600-minute*60;
    System.out.println(second+" seconds= "+hour+" hours, "+minute+" minutes,and "+secondRemained+" seconds.");
}
}


