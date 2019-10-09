package by.pvt.epam.task4;

/* Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
        изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых
        значений. В случае недопустимых значений полей поле устанавливается в значение 0. Создать
        методы изменения времени на заданное количество часов, минут и секунд. */

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public void waitFor(int p, int q, int r){
        seconds += r;
        if(seconds >= 60){
            seconds = seconds % 60;
            minutes++;
        }

        minutes += q;
        if(minutes >= 60){
            minutes = minutes % 60;
            hours++;
        }

        hours += p;
        if(hours >= 24){
            hours = hours % 24;
        }
    }

    public String takeBeatifulPrint(){
        String hourPrint = hours + "";
        if(hours <= 9){
            hourPrint = "0" + hours;
        }

        String minPrint = minutes + "";
        if(minutes <= 9){
            minPrint = "0" + minutes;
        }

        String secPrint = seconds + "";
        if(seconds <= 9){
            secPrint = "0" + seconds;
        }
        return hourPrint + ":" +  minPrint + ":" + secPrint;
    }

    public void setHours(int hours) {
        if(hours < 0 || hours > 24) {
            this.hours = 0;
            return;
        }
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        if(minutes < 0 || minutes > 60) {
            this.minutes = 0;
            return;
        }
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if(seconds < 0 || seconds > 60) {
            this.seconds = 0;
            return;
        }
        this.seconds = seconds;
    }
}

