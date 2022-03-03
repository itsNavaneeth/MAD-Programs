package com.example.customcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    RadioButton ratedradioButton;
    RadioGroup radioGroup;
    CheckBox box1, box2, box3, box4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
    }

    public void onclickbuttonMethod(View v){
        int selectedId = radioGroup.getCheckedRadioButtonId();
        ratedradioButton = (RadioButton) findViewById(selectedId);

        box1=(CheckBox)findViewById(R.id.checkBox);
        box2=(CheckBox)findViewById(R.id.checkBox2);
        box3=(CheckBox)findViewById(R.id.checkBox3);
        box4=(CheckBox)findViewById(R.id.checkBox4);

        StringBuilder result = new StringBuilder();
        result.append("Selected radio button: ");

        if(selectedId==-1){
            result.append("None");
        }
        else{
           result.append(ratedradioButton.getText());
        }

        result.append("\nCheckbox choices: ");

        if(box1.isChecked()){
            result.append("\n").append(box1.getText()).append(": YES");
        }
        else{
            result.append("\n").append(box1.getText()).append(": NO");
        }

        if(box2.isChecked()){
            result.append("\n").append(box2.getText()).append(": YES");
        }
        else{
            result.append("\n"+box2.getText()+": NO");
        }

        if(box3.isChecked()){
            result.append("\n"+box3.getText()+": YES");
        }
        else{
            result.append("\n"+box3.getText()+": NO");
        }

        if(box4.isChecked()){
            result.append("\n"+box4.getText()+": YES");
        }
        else{
            result.append("\n"+box4.getText()+": NO");
        }

        Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
    }

}