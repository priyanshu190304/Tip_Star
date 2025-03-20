package com.app.tipstar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calculate= findViewById(R.id.calculate);
        EditText bill= findViewById(R.id.billInput);
        EditText tip= findViewById(R.id.tipInput);
        TextView output= findViewById(R.id.output);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String billStr = bill.getText().toString();
                String tipStr = tip.getText().toString();

                if(billStr.isEmpty() || tipStr.isEmpty()){
                    output.setText("Enter the values!!");
                    return;
                }

                Double billDouble = Double.parseDouble(billStr);
                Double tipDouble = Double.parseDouble(tipStr);

                Double tipOutput = tipDouble/billDouble*100;
                Double total= tipOutput+billDouble;

                output.setText("Tip: "+tipOutput +"\nTotal Amount: "+total);

            }
        });

    }
}