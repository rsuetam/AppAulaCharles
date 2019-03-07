package com.example.test1;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tts =new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

                tts.setLanguage(Locale.UK);
            }
        });

    }

    public void onclick(View V){
        tts.speak("Como o seu dia está? ",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void onclick1(View V){
        tts.speak("Vamos almoçar juntos?",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void onclick2(View V){
        tts.speak("Boa noite meu consagrado !",TextToSpeech.QUEUE_FLUSH,null);
    }


}

