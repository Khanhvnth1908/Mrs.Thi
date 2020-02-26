/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlLap01;


/**
 *
 * @author User
 */
public class Time {
    private int hour;
    private int minute;
    private int seconds;
    
    public Time(){
        
    }
    
    public Time(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    
    public void setTime(int Newhour, int Newminute, int Newseconds){
        this.hour = Newhour;
        this.minute = Newminute;
        this.seconds = Newseconds;
    }

    @Override
    public String toString() {
        return "Time {" + "hour=" + hour + ", minute=" + minute + ", seconds=" + seconds + '}';
          
    }
    
    public Time nextSeconds(){
        if( seconds >=0&&seconds <=59){
            return seconds ++;
        }else{
            System.out.println("Does not exist");
        }
        return null;                  
    }
    public Time previusSeconds(){
        if( seconds >=0&&seconds <=59){
            return seconds --;
        }else{
            System.out.println("Does not exist");
        }
        return null; 
    }
}
