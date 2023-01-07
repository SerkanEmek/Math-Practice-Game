package com.serkanemek.mathgamepractice.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.serkanemek.mathgamepractice.R;
import com.serkanemek.mathgamepractice.dataclass.SharedPForAdvAndTotalQuestionCounter;
import com.serkanemek.mathgamepractice.mediaplayer.MyMediaPlayerForCorrectAnswer;
import com.serkanemek.mathgamepractice.mediaplayer.MyMediaPlayerForMainMenu;
import com.serkanemek.mathgamepractice.util.Vibration;

public class MainActivity extends AppCompatActivity {


    MyMediaPlayerForMainMenu myMediaPlayerForMainMenu;
    MyMediaPlayerForCorrectAnswer myMediaPlayerForCorrectAnswer;

    private static final int FILTERED_GREY = Color.argb(155, 185, 185, 185);
    private static final int TRANSPARENT_GREY = Color.argb(0, 185, 185, 185);

    ImageView imageView_MusicOnOff,imageView_Setting_SoundOnOff,imageView_Setting_VibrationOnOff;

    ImageView imageView_For_MathGamePractice;
    Vibration vibration;

    Integer checkMusicOnOff;
    Integer checkSoundOnOff;
    Integer checkVibrationOnOff;

    SharedPForAdvAndTotalQuestionCounter sharedPForAdvAndTotalQuestionCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        initializing();




    }


    public void mathgameforpractice(View view){
        imageView_For_MathGamePractice.setColorFilter(FILTERED_GREY);
        Intent intentToExercise = new Intent(getApplicationContext(), MathLevelCheckActivity.class);
        intentToExercise.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intentToExercise);
        finish();
        vibration.getVibrator(75,getApplicationContext());
    }

    private void initializing(){
        imageView_For_MathGamePractice = findViewById(R.id.imageView_For_MathGamePractice);
        imageView_For_MathGamePractice.setColorFilter(TRANSPARENT_GREY);
        vibration = new Vibration();
        myMediaPlayerForMainMenu = new MyMediaPlayerForMainMenu();
        myMediaPlayerForCorrectAnswer = new MyMediaPlayerForCorrectAnswer();

        imageView_MusicOnOff = findViewById(R.id.imageView_Setting_MusicOnOff);
        imageView_Setting_SoundOnOff = findViewById(R.id.imageView_Setting_SoundOnOff);
        imageView_Setting_VibrationOnOff = findViewById(R.id.imageView_Setting_VibrationOnOff);

        sharedPForAdvAndTotalQuestionCounter = new SharedPForAdvAndTotalQuestionCounter();

        checkMusicOnOff = sharedPForAdvAndTotalQuestionCounter.getCheckMusicForOnOff(this);
        if(checkMusicOnOff == 1){
            imageView_MusicOnOff.setImageResource(R.drawable.musiciconon);
        }else{
            imageView_MusicOnOff.setImageResource(R.drawable.musiciconoff);
        }

        checkSoundOnOff = sharedPForAdvAndTotalQuestionCounter.getCheckSoundForOnOff(this);
        if(checkSoundOnOff == 1){
            imageView_Setting_SoundOnOff.setImageResource(R.drawable.soundon);
        }else{
            imageView_Setting_SoundOnOff.setImageResource(R.drawable.soundoff);
        }

        checkVibrationOnOff = sharedPForAdvAndTotalQuestionCounter.getCheckVibrationForOnOff(this);
        if(checkVibrationOnOff == 1){
            imageView_Setting_VibrationOnOff.setImageResource(R.drawable.vibrationon);
        }else{
            imageView_Setting_VibrationOnOff.setImageResource(R.drawable.vibrationoff);
        }


    }


    public void buttonCheckMusic(View view){
        myMediaPlayerForCorrectAnswer.stopCorrectAnswerSound();
        vibration.getVibrator(75,this);
        Integer integer = sharedPForAdvAndTotalQuestionCounter.getCheckMusicForOnOff(this);
        if(integer == 1){
            sharedPForAdvAndTotalQuestionCounter.updateCheckMusicForOnOff(this, 0);
            myMediaPlayerForMainMenu.pauseBackgroundMusic();
            imageView_MusicOnOff.setImageResource(R.drawable.musiciconoff);
        }else{
            sharedPForAdvAndTotalQuestionCounter.updateCheckMusicForOnOff(this,1);
            myMediaPlayerForMainMenu.playBackgroundMusic(this);
            imageView_MusicOnOff.setImageResource(R.drawable.musiciconon);
        }
    }


    public void buttonCheckSound(View view){
        myMediaPlayerForCorrectAnswer.stopCorrectAnswerSound();
        vibration.getVibrator(75,this);
        Integer integer = sharedPForAdvAndTotalQuestionCounter.getCheckSoundForOnOff(this);
        if(integer == 1){
            sharedPForAdvAndTotalQuestionCounter.updateCheckSoundForOnOff(this, 0);
            imageView_Setting_SoundOnOff.setImageResource(R.drawable.soundoff);
        }else{
            sharedPForAdvAndTotalQuestionCounter.updateCheckSoundForOnOff(this, 1);
            imageView_Setting_SoundOnOff.setImageResource(R.drawable.soundon);
            myMediaPlayerForCorrectAnswer.playCorrectAnswerSound(getApplicationContext());
        }
    }

    public void vibration_Setting(View view){
        myMediaPlayerForCorrectAnswer.stopCorrectAnswerSound();
        Integer integer = sharedPForAdvAndTotalQuestionCounter.getCheckVibrationForOnOff(this);
        if(integer == 1){
            sharedPForAdvAndTotalQuestionCounter.updateCheckVibrationForOnOff(this, 0);
            imageView_Setting_VibrationOnOff.setImageResource(R.drawable.vibrationoff);
        }else {
            sharedPForAdvAndTotalQuestionCounter.updateCheckVibrationForOnOff(this, 1);
            imageView_Setting_VibrationOnOff.setImageResource(R.drawable.vibrationon);
        }
        vibration.getVibrator(200,this);
    }


    @Override
    protected void onStart() {
        super.onStart();
        if (checkMusicOnOff == 1){
            myMediaPlayerForMainMenu.playBackgroundMusic(getApplicationContext());
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        myMediaPlayerForMainMenu.pauseBackgroundMusic();
    }

}