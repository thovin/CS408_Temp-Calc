package com.example.lab02b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.lab02b.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        View view = binding.getRoot();
        setContentView(view);

        //TODO
        binding.convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                convert();
            }
        });
    }

    private void convert() {
        String farString = binding.farInput.getText().toString();
        String celString = binding.celInput.getText().toString();

        double total;
        double far;
        double cel;
        if (!farString.equals("")) {
            far = Double.parseDouble(farString);
            total = (far - 32) * 5 / 9;
            binding.celInput.setText(String.valueOf(total));

        } else if (farString.equals("") && !celString.equals("")) {
            cel = Double.parseDouble(celString);
            total = (cel * 9) / 5 + 32;
            binding.farInput.setText(String.valueOf(total));

        }

    }
}