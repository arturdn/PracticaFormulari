package com.example.artur2.practicaformulari;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class DisplayMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

        //ImageView iv = (ImageView) new ImageView(this);
        //iv.setImageResource();

        String message = intent.getStringExtra(PracticaFormulari.NOM);
        TextView nom = (TextView) new TextView(this);
        nom.setTextSize(30);
        nom.setText(message);

        message = intent.getStringExtra(PracticaFormulari.COGNOMS);
        TextView cognoms = (TextView) new TextView(this);
        cognoms.setTextSize(30);
        cognoms.setText(message);

        TextView sex = (TextView) new TextView(this);
        sex.setTextSize(30);
        sex.setText("android");
        message = intent.getStringExtra(PracticaFormulari.radioButton);
        if (message.equals("yes")) {
            sex.setText("Dona");
        }
        message = intent.getStringExtra(PracticaFormulari.radioButton2);
        if (message.equals("yes")) {
            sex.setText("Home");
        }

        TextView treballa = (TextView) new TextView(this);
        treballa.setTextSize(30);
        treballa.setText("no treballa");
        message = intent.getStringExtra(PracticaFormulari.checkBox);
        if (message.equals("yes")) {
            treballa.setText("Treballa");
        }

        TextView estudia = (TextView) new TextView(this);
        estudia.setTextSize(30);
        estudia.setText("no estudia");
        message = intent.getStringExtra(PracticaFormulari.checkBox2);
        if (message.equals("yes")) {
            estudia.setText("Estudia");
        }

        TextView uni = (TextView) new TextView(this);
        uni.setTextSize(30);
        uni.setText("No tiene estudios universitarios");
        message = intent.getStringExtra(PracticaFormulari.switch1);
        if (message.equals("yes")) {
            uni.setText("Tiene estudios universitarios");
        }

        message = intent.getStringExtra(PracticaFormulari.peso);
        TextView peso = (TextView) new TextView(this);
        peso.setTextSize(30);
        peso.setText(message);

        message = intent.getStringExtra(PracticaFormulari.data);
        TextView data = (TextView) new TextView(this);
        data.setTextSize(30);
        data.setText(message);

        LinearLayout lv = new LinearLayout(this);
        lv.setOrientation(LinearLayout.VERTICAL);
        lv.addView(nom);
        lv.addView(cognoms);
        lv.addView(sex);
        lv.addView(estudia);
        lv.addView(treballa);
        lv.addView(uni);
        lv.addView(peso);
        lv.addView(data);
        setContentView(lv);
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
}
