package garozproductions.timer;

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
    private long timeMili = 600000; // 10 minutos en milisegundos
    private CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countDownText = findViewById(R.id.buttonG);
        countDownButton = findViewById(R.id.countDownButtton);

        countDownButton.setOnClickListener (new View.onClickListener()){
            public void onClick(View view){
                startStop();
            }
        }
    }

    private void startTimer(){
        countDownTimer = new CountDownTimer(timeMili, countDownInterval 1000){

            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {

            }
        }
    }
}