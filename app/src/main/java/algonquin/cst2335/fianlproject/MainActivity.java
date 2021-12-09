package algonquin.cst2335.fianlproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnCovid = findViewById(R.id.button3);
        Button btnOwl = findViewById(R.id.button2);

        Snackbar snackbar = Snackbar
                .make(findViewById(R.id.rootlayout), "Welcome to Final Project", Snackbar.LENGTH_LONG);

        snackbar.show();


        btnOwl.setOnClickListener((click) -> {
            Context context = getApplicationContext();
            CharSequence text = "Welcome to OwlBot Dictionary";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            startActivity(new Intent(MainActivity.this, algonquin.cst2335.fianlproject.OwlBotActivity.class));
        });

        btnCovid.setOnClickListener(click -> {
            Context context = getApplicationContext();
            CharSequence text = "Welcome to Covid-19 Information Tracker";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        });



    }
}