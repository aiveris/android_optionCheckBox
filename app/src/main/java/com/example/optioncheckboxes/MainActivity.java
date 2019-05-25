package com.example.optioncheckboxes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton rd1,rd2,rd3;
    CheckBox chk1,chk2,chk3,chk4,chk5,chk6;
    RadioGroup rdg;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rd1 = findViewById(R.id.radioButton1);
        rd2 = findViewById(R.id.radioButton2);
        rd3 = findViewById(R.id.radioButton3);
        rdg = findViewById(R.id.rdg);

        chk1 = findViewById(R.id.checkBox1);
        chk2 = findViewById(R.id.checkBox2);
        chk3 = findViewById(R.id.checkBox3);
        chk4 = findViewById(R.id.checkBox11);
        chk5 = findViewById(R.id.checkBox22);
        chk6 = findViewById(R.id.checkBox33);
        btn = findViewById(R.id.button);
    }

    public void submit(View v){
        String radioAns=null, chkboxAns=null;
        if(rd1.isChecked()){
            radioAns = "Male";
        }
        else if(rd2.isChecked()){
            radioAns = "FeMale";
        }
        else if(rd3.isChecked()){
            radioAns = "None";
        }
        Log.e("SUBMIT", "Sex selected is: " + radioAns);
        String[] selections = new String[6];
        selections[0] =(chk1.isChecked())? "CheckBox1" : "xxxxxxxxxxxx";
        selections[1] =(chk2.isChecked())? "CheckBox2" : "xxxxxxxxxxxx";
        selections[2] =(chk3.isChecked())? "CheckBox3" : "xxxxxxxxxxxx";
        selections[3] =(chk4.isChecked())? "CheckBox4" : "xxxxxxxxxxxx";
        selections[4] =(chk5.isChecked())? "CheckBox5" : "xxxxxxxxxxxx";
        selections[5] =(chk6.isChecked())? "CheckBox6" : "xxxxxxxxxxxx";

        Log.e("SUBMIT", "CheckBoxes checked: ");
        for(int j=0; j<6;j++){
            Log.e("SUBMIT", selections[j]);
        }
    }

    public void checkBoxesClick(View v){
        CheckBox tempChkBox = (CheckBox)v;
        if( tempChkBox.isChecked() )  {
            Log.e("checkBxCLICK","Value Selected: " + tempChkBox.getText());
        }

        if(chk1.isChecked() && chk2.isChecked()){
            tempChkBox.setChecked(false);
            Toast.makeText(this,"Both Not Allowed",Toast.LENGTH_SHORT).show();
        }
        if(chk4.isChecked() && chk5.isChecked()){
            tempChkBox.setChecked(false);
            Toast.makeText(this,"Both Not Allowed",Toast.LENGTH_SHORT).show();
        }
    }
}
