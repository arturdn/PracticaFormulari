package com.example.artur2.practicaformulari;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import android.content.Intent;import android.content.Intent;

public class PracticaFormulari extends Activity implements SeekBar.OnSeekBarChangeListener{

    public final static String NOM = "com.mycompany.PracticaFormulari.nom";
    public final static String COGNOMS = "com.mycompany.PracticaFormulari.cognoms";
    public final static String radioButton = "com.mycompany.PracticaFormulari.radioButton";
    public final static String radioButton2 = "com.mycompany.PracticaFormulari.radioButton2";
    public final static String checkBox = "com.mycompany.PracticaFormulari.checkBox";
    public final static String checkBox2 = "com.mycompany.PracticaFormulari.checkBox2";
    public final static String switch1 = "com.mycompany.PracticaFormulari.switch1";
    public final static String peso = "com.mycompany.PracticaFormulari.peso";
    public final static String data = "com.mycompany.PracticaFormulari.data";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica_formulari);
        ((SeekBar)findViewById(R.id.barra)).setOnSeekBarChangeListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_practica_formulari, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        ((TextView)findViewById(R.id.peso)).setText("Peso: " + i + "Kg");

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText editText = (EditText) findViewById(R.id.nom);
        String message = editText.getText().toString();
        intent.putExtra(NOM, message);

        editText = (EditText) findViewById(R.id.cognoms);
        message = editText.getText().toString();
        intent.putExtra(COGNOMS, message);

        RadioButton radB = (RadioButton) findViewById(R.id.radioButton);
        message = "no";
        if (radB.isChecked())
            message = "yes";
        intent.putExtra(radioButton, message);

        RadioButton radB2 = (RadioButton) findViewById(R.id.radioButton2);
        message = "no";
        if (radB2.isChecked())
            message = "yes";
        intent.putExtra(radioButton2, message);

        CheckBox cb = (CheckBox) findViewById(R.id.checkBox);
        message = "no";
        if (cb.isChecked())
            message = "yes";
        intent.putExtra(checkBox, message);

        CheckBox cb2 = (CheckBox) findViewById(R.id.checkBox2);
        message = "no";
        if (cb2.isChecked())
            message = "yes";
        intent.putExtra(checkBox2, message);

        Switch sw = (Switch) findViewById(R.id.switch1);
        message = "no";
        if (sw.isChecked())
            message = "yes";
        intent.putExtra(switch1, message);

        editText = (EditText) findViewById(R.id.peso);
        message = editText.getText().toString();
        intent.putExtra(peso, message);

        editText = (EditText) findViewById(R.id.data);
        message = editText.getText().toString();
        intent.putExtra(data, message);

        startActivity(intent);

    }
}
