package helloworld.ehb.be.hellloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter;
    private Button btnCounter, btnDecrease;
    private TextView tvTitle;


    //inner Class gebruiken, om een interface te implementeren
    //Onclick, wat doen indien op de knop geklikt
    private View.OnClickListener counterListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           counter++;
           tvTitle.setText(""+counter);//(String.valueOf(counter))

        }
    };

    private View.OnClickListener decreaseListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           tvTitle.setText(String.valueOf(--counter));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = 0;
        //verwijzingen naar wat in het scherm zit
        btnCounter = findViewById(R.id.btn_counter);
        btnDecrease = findViewById(R.id.btn_decrease);
        tvTitle = findViewById(R.id.tv_title);

        //acties koppelen aan button
        btnCounter.setOnClickListener(counterListener);
        btnDecrease.setOnClickListener(decreaseListener);



    }
}
