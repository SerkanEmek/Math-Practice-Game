package com.serkanemek.mathgamepractice.dataclass;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPForAdvAndTotalQuestionCounter {


    SharedPreferences sharedPreferencesForMathGameForPracticeTotalQuestion;
    SharedPreferences sharedPreferencesForMathGameForPracticeCorrectAnswers;

    SharedPreferences sharedPreferencesForCheckMusicForOnOff;
    SharedPreferences sharedPreferencesForCheckSoundForOnOff;
    SharedPreferences sharedPreferencesForCheckVibrationOnOff;



    public void updateMathGameForPracticeTotalQuestionData(Context context, Integer counterNumber){
        try {
            Integer storedMathGameForPracticeTotalQuestion = -1;
            sharedPreferencesForMathGameForPracticeTotalQuestion = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            storedMathGameForPracticeTotalQuestion = sharedPreferencesForMathGameForPracticeTotalQuestion.getInt("storedMathGameForPracticeTotalQuestionData",0);
            storedMathGameForPracticeTotalQuestion = storedMathGameForPracticeTotalQuestion + counterNumber;
            sharedPreferencesForMathGameForPracticeTotalQuestion.edit().putInt("storedMathGameForPracticeTotalQuestionData" , storedMathGameForPracticeTotalQuestion).apply();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Integer getMathGameForPracticeTatolQuestionData(Context context){
        Integer storedMathGameForPracticeTotalQuestion = -1;
        try {
            sharedPreferencesForMathGameForPracticeTotalQuestion = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            storedMathGameForPracticeTotalQuestion = sharedPreferencesForMathGameForPracticeTotalQuestion.getInt("storedMathGameForPracticeTotalQuestionData",0);
            return storedMathGameForPracticeTotalQuestion;
        }catch (Exception e){
            e.printStackTrace();
        }
        return storedMathGameForPracticeTotalQuestion;

    }

    public void updateMathGameForPracticeCorrectAnswersData(Context context, Integer counterNumber){
        try {
            Integer storedMathGameForPracticeCorrectAnswers = -1;
            sharedPreferencesForMathGameForPracticeCorrectAnswers = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            storedMathGameForPracticeCorrectAnswers = sharedPreferencesForMathGameForPracticeCorrectAnswers.getInt("storedMathGameForPracticeCorrectAnswersData",0);
            storedMathGameForPracticeCorrectAnswers = storedMathGameForPracticeCorrectAnswers + counterNumber;
            sharedPreferencesForMathGameForPracticeCorrectAnswers.edit().putInt("storedMathGameForPracticeCorrectAnswersData" , storedMathGameForPracticeCorrectAnswers).apply();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Integer getMathGameForPracticeCorrectAnswersData(Context context){
        Integer storedMathGameForPracticeCorrectAnswers = -1;
        try {
            sharedPreferencesForMathGameForPracticeCorrectAnswers = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            storedMathGameForPracticeCorrectAnswers = sharedPreferencesForMathGameForPracticeCorrectAnswers.getInt("storedMathGameForPracticeCorrectAnswersData",0);
            return storedMathGameForPracticeCorrectAnswers;
        }catch (Exception e){
            e.printStackTrace();
        }
        return storedMathGameForPracticeCorrectAnswers;

    }

    public void makeThemAllReset(){
        try {
            sharedPreferencesForMathGameForPracticeTotalQuestion.edit().putInt("storedMathGameForPracticeTotalQuestionData" , 0).apply();
            sharedPreferencesForMathGameForPracticeCorrectAnswers.edit().putInt("storedMathGameForPracticeCorrectAnswersData" , 0).apply();

        }catch (Exception e){
            e.printStackTrace();
        }



    }


    public void updateCheckMusicForOnOff(Context context,Integer integer){  // false is off, true is on.
        try {
            sharedPreferencesForCheckMusicForOnOff = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            sharedPreferencesForCheckMusicForOnOff.edit().putInt("storedCheckMusicOnOffData",integer).apply();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Integer getCheckMusicForOnOff(Context context){
        Integer checkMusic = -1;
        try {
            sharedPreferencesForCheckMusicForOnOff = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            checkMusic = sharedPreferencesForCheckMusicForOnOff.getInt("storedCheckMusicOnOffData", 1);
            return checkMusic;
        }catch (Exception e){
            e.printStackTrace();
        }
        return checkMusic;
    }


    public void updateCheckSoundForOnOff(Context context,Integer integer){  // 0 is off, 1 is on.
        try {
            sharedPreferencesForCheckSoundForOnOff = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            sharedPreferencesForCheckSoundForOnOff.edit().putInt("storedCheckSoundOnOffData",integer).apply();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Integer getCheckSoundForOnOff(Context context){
        Integer checkSound = -1;
        try {
            sharedPreferencesForCheckSoundForOnOff = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            checkSound = sharedPreferencesForCheckSoundForOnOff.getInt("storedCheckSoundOnOffData", 1);
            return checkSound;
        }catch (Exception e){
            e.printStackTrace();
        }
        return checkSound;
    }

    public void updateCheckVibrationForOnOff(Context context,Integer integer){  // 0 is off, 1 is on.
        try {
            sharedPreferencesForCheckVibrationOnOff = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            sharedPreferencesForCheckVibrationOnOff.edit().putInt("storedCheckVibrationOnOffData",integer).apply();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Integer getCheckVibrationForOnOff(Context context){
        Integer checkVibrator = -1;
        try {
            sharedPreferencesForCheckVibrationOnOff = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            checkVibrator = sharedPreferencesForCheckVibrationOnOff.getInt("storedCheckVibrationOnOffData", 1);
            return checkVibrator;
        }catch (Exception e){
            e.printStackTrace();
        }
        return checkVibrator;
    }


}
