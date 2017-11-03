package janie.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;

public class DateParty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_party);
        setTitle("Set date");

        Log.i(".DateParty", "Entering Set date");
    }

    public void setDate(View view) {
        DatePicker dateInput = findViewById(R.id.datePicker);
        String date = dateInput.toString();

        Intent timeIntent = getIntent();
        String time = timeIntent.getStringExtra("Time");

        Intent intent = new Intent(this, Party.class);
        intent.putExtra("Time", time);
        intent.putExtra("Date", date);
        startActivity(intent);
    }
}