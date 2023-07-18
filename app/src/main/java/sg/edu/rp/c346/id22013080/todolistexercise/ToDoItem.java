package sg.edu.rp.c346.id22013080.todolistexercise;

import androidx.annotation.NonNull;

import java.util.Calendar;

public class ToDoItem {
    private String title;
    private Calendar date;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    @NonNull
    @Override
    public String toString() {
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)
                +"/"+date.get(Calendar.YEAR) + " (" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";

        return str;

    }

    private String getDay(int day){
        String dayName  = "";

        if(day == 1){
            dayName = "Monday";
        }
        else if(day == 2){
            dayName = "Tuesday";
        }
        else if(day == 3){
            dayName = "Wednesday";
        }
        else if(day == 4){
            dayName = "Thursday";
        }
        else if(day == 5){
            dayName = "Friday";
        }
        else if(day == 6){
            dayName = "Saturday";
        }
        else if(day == 7){
            dayName = "Sunday";
        }

        return dayName;

    }
}
