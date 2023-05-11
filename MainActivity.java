package com.example.mapas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.mapas.R;
import com.google.android.material.textfield.TextInputEditText;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    public CheckBox checkboxArea;
    public CheckBox checkboxPopulacao;
    public CheckBox checkboxIDH;
    public CheckBox checkboxDensidade;
    public RadioButton radioButtonPr;
    public RadioButton radioButtonSc;
    public RadioButton radioButtonRs;
    public RadioGroup estados;

    public TextView idh;
    public TextView populacao;
    public TextView densidade;
    public TextView area;

    public ImageView imagem;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButtonPr = findViewById(R.id.radioButtonPr);
        radioButtonSc = findViewById(R.id.radioButtonSc);
        radioButtonRs = findViewById(R.id.radioButtonRs);

        checkboxIDH = findViewById(R.id.checkboxIDH);
        checkboxPopulacao = findViewById(R.id.checkboxPopulacao);
        checkboxArea = findViewById(R.id.checkboxArea);
        checkboxDensidade = findViewById(R.id.checkboxDensidade);

        imagem = findViewById(R.id.imagem);

        idh = findViewById(R.id.idh);
        populacao = findViewById(R.id.populacao);
        area = findViewById(R.id.area);
        densidade = findViewById(R.id.densidade);

        estados = findViewById(R.id.radioGroupEstados);

        radioButtonListener();
    }

    public void checkBox(String estado){
        if (estado == "pr"){
            imagem.setImageResource(R.drawable.pr);
            if (checkboxIDH.isChecked()){
                idh.setText("IDH: 0,749 [2010]");
            } else {
                idh.setText(" ");
            }

            if (checkboxArea.isChecked()){
                area.setText("Área: 199.298,981 km² [2022]");
            }else {
                area.setText(" ");
            }

            if (checkboxPopulacao.isChecked()){
                populacao.setText("População: 11.597.484 pessoas [2021]");
            }else {
                populacao.setText(" ");
            }

            if (checkboxDensidade.isChecked()){
                densidade.setText("Densidade demográfica: 52,40 hab/km² [2010]");
            }else {
                densidade.setText(" ");
            }
        }

        if (estado == "sc"){
            imagem.setImageResource(R.drawable.sc);
            if (checkboxIDH.isChecked()){
                idh.setText("IDH: 0,774 [2010]");
            }else {
                idh.setText(" ");
            }

            if (checkboxArea.isChecked()){
                area.setText("Área: 95.730,690km² [2022]");
            }else {
                area.setText(" ");
            }

            if (checkboxPopulacao.isChecked()){
                populacao.setText("População: 7.338.473 pessoas [2021]");
            }else {
                populacao.setText(" ");
            }

            if (checkboxDensidade.isChecked()){
                densidade.setText("Densidade demográfica: 65,29 hab/km²  [2010]");
            }else {
                densidade.setText(" ");
            }
        }

        if (estado == "rs"){
            imagem.setImageResource(R.drawable.rs);
            if (checkboxIDH.isChecked()){
                idh.setText("IDH: 0,746 [2010]");
            }else {
                idh.setText(" ");
            }

            if (checkboxArea.isChecked()){
                area.setText("Área: 281.707,151km² [2022]");
            }else {
                area.setText(" ");
            }

            if (checkboxPopulacao.isChecked()){
                populacao.setText("População: 11.466.630 pessoas [2021]");
            }else {
                populacao.setText(" ");
            }

            if (checkboxDensidade.isChecked()){
                densidade.setText("Densidade demográfica: 39,79 hab/km²   [2010]");
            }else {
                densidade.setText(" ");
            }
        }
    }

    public void radioButtonListener(){
        estados.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String estado = "";
                if (checkedId == R.id.radioButtonPr){
                    estado = "pr";
                    checkBox(estado);
                } else if (checkedId == R.id.radioButtonSc){
                    checkBox("sc");
                } else if (checkedId == R.id.radioButtonRs){
                    checkBox("rs");
                }
            }
        });
    }
}
