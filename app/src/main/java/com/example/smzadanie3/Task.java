package com.example.smzadanie3;

import android.os.Bundle;
import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;

    public Task() {
        id = UUID.randomUUID();
        date = new Date();
    }
    public void setName(String name){
        this.name = name;
    }
    public Date getDate(){
        return this.date;
    }
    public void setDate(Date date) {this.date = date;}

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean isChecked) {
        this.done = isChecked;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) { this.id = id;}

}
