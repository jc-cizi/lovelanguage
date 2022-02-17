package com.example.lovelanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.charset.Charset;
import java.text.BreakIterator;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String line = "name\t\t\tlanguage\t\t\tpercentage\n";
    ImageView image;
    Random ran;
    private BreakIterator number;
    TextView textt;
    Button kabse;
    String text;
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
        text=parent.getItemAtPosition(position).toString();

        Toast.makeText(parent.getContext(), text, Toast.LENGTH_LONG).show();






    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner= findViewById(R.id.Languagespin);
        ArrayAdapter <CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.CodingLanguages, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(R.layout.spinner_text);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        textt= findViewById(R.id.percentage);
        kabse=findViewById(R.id.button);



        kabse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random=new Random();
                int value= random.nextInt(101);
                textt.setText(Integer.toString(value)+"%");
                EditText name = findViewById(R.id.usern);
                TextView final_table = findViewById(R.id.table);
                if (text.equals("Choose language")){
                    image.setVisibility(View.GONE);
                }else {


                    if (text.equals("Java")) {
                        if (image != null) {
                            image.setVisibility(View.GONE);
                        }
                        image = findViewById(R.id.java);
                        image.setAlpha(0f);
                        image.setVisibility(View.VISIBLE);
                        image.animate().alpha(1f).setDuration(2000).setListener(null);
                        ran = null;
                        line+= name.getText().toString()+"\t\t\t\t"+text+"\t\t\t\t\t\t\t\t"+textt.getText().toString()+"\n";
                        final_table.setText(line);

                    } else if (text.equals("C++")) {
                        if (image != null) {
                            image.setVisibility(View.GONE);
                        }
                        image = findViewById(R.id.cpp);
                        image.setAlpha(0f);
                        image.setVisibility(View.VISIBLE);
                        image.animate().alpha(1f).setDuration(2000).setListener(null);
                        ran = null;
                        line+= name.getText().toString()+"\t\t\t\t"+text+"\t\t\t\t\t\t\t\t\t\t"+textt.getText().toString()+"\n";
                        final_table.setText(line);


                    } else if (text.equals("C#")) {
                        if (image != null) {
                            image.setVisibility(View.GONE);
                        }
                        image = findViewById(R.id.csharp);
                        image.setAlpha(0f);
                        image.setVisibility(View.VISIBLE);
                        image.animate().alpha(1f).setDuration(2000).setListener(null);
                        ran = null;
                        line+= name.getText().toString()+"\t\t\t\t"+text+"\t\t\t\t\t\t\t\t\t\t"+textt.getText().toString()+"\n";
                        final_table.setText(line);

                    } else if (text.equals("C")) {
                        if (image != null) {
                            image.setVisibility(View.GONE);
                        }
                        image = findViewById(R.id.c);
                        image.setAlpha(0f);
                        image.setVisibility(View.VISIBLE);
                        image.animate().alpha(1f).setDuration(2000).setListener(null);
                        ran = null;
                        line+= name.getText().toString()+"\t\t\t\t"+text+"\t\t\t\t\t\t\t\t\t\t"+textt.getText().toString()+"\n";
                        final_table.setText(line);


                    } else if (text.equals("JavaScript")) {
                        if (image != null) {
                            image.setVisibility(View.GONE);
                        }
                        image = findViewById(R.id.javas);
                        image.setAlpha(0f);
                        image.setVisibility(View.VISIBLE);
                        image.animate().alpha(1f).setDuration(2000).setListener(null);
                        ran = null;
                        line+= name.getText().toString()+"\t\t\t\t"+text+"\t\t\t\t\t\t\t\t\t\t"+textt.getText().toString()+"\n";
                        final_table.setText(line);


                    } else if (text.equals("Python")) {
                        if (image != null) {
                            image.setVisibility(View.GONE);
                        }
                        image = findViewById(R.id.python);
                        image.setAlpha(0f);
                        image.setVisibility(View.VISIBLE);
                        image.animate().alpha(1f).setDuration(2000).setListener(null);
                        ran = null;
                        line+= name.getText().toString()+"\t\t\t\t"+text+"\t\t\t\t\t\t\t\t\t\t"+textt.getText().toString()+"\n";
                        final_table.setText(line);


                    }

                }
            }
        });

    }


    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}