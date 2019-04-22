package com.example.ap.timerclase;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView countDownText;
    private Button countDownButton;

    private boolean isRunning;
    private long timeMili = 600000; // 10 minutos
    private CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countDownText = findViewById(R.id.countDownText);
        countDownButton = findViewById(R.id.countDownButton);

        countDownButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startStop();
            }
        });

    }

    private void startStop() {
        if(isRunning){
            // Detenerlo
            stopTimer();
        }
        else{
            // Iniciarlo
            startTimer();
        }
    }

    private void startTimer() {
        countDownTimer = new CountDownTimer(timeMili, 1000) {
            @Override
            public void onTick(long lf) {
                timeMili = lf;
                updateTimer();
            }

            @Override
            public void onFinish() {

            }
        }.start();
        isRunning = true;
        countDownButton.setText("Pausar");
    }

    private void updateTimer() {
        int minutos = (int) timeMili / 60000;
        int segundos = (int) timeMili % 60000 / 1000;

        String timeLeft = ""+minutos;
        timeLeft += ":";
        timeLeft += segundos;

        countDownText.setText(timeLeft);
    }

    private void stopTimer() {
        countDownTimer.cancel();
        countDownButton.setText("Re iniciar");
        isRunning = false;
    }
}
