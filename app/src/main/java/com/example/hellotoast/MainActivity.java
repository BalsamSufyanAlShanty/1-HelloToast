package com.example.hellotoast;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView txv;
    private Button btnZero, btnCount;
    public static int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txv = findViewById(R.id.textView);
        btnZero = findViewById(R.id.btnZero);
        btnCount = findViewById(R.id.btnCount);

        txv.setText(String.valueOf(x));

        btnZero.setBackgroundColor(ContextCompat.getColor(this, R.color.gray));
    }

    public void btnToast(View view) {
        Toast.makeText(this, txv.getText(), Toast.LENGTH_SHORT).show();
    }

    public void btnZero(View view) {
        x = 0;
        txv.setText("0");

        btnZero.setBackgroundColor(ContextCompat.getColor(this, R.color.gray));

        btnCount.setBackgroundColor(ContextCompat.getColor(this, R.color.teal_200));
    }

    public void btnCount(View view) {
        x = Integer.parseInt(txv.getText().toString());
        x++;
        txv.setText(String.valueOf(x));

        if (x % 2 == 0) {
            btnCount.setBackgroundColor(ContextCompat.getColor(this, R.color.blue));
        } else {
            btnCount.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
        }

        btnZero.setBackgroundColor(ContextCompat.getColor(this, R.color.orange));
    }
}


