package com.serkanemek.mathgamepractice.dataclass;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPForBackgrounds {

    SharedPreferences sharedPreferencesForMathGameForPractice;

    SharedPreferences sharedPreferencesChosenMathPracticeGame;

    SharedPreferences
            sPCheckSellMathPractice2,sPCheckSellMathPractice3,sPCheckSellMathPractice4;



    public void updateMathGamePracticeBackground(Context context, Integer numberOfBackground){
        try {
            Integer storedMathGamePracticeBackground = -1;
            sharedPreferencesForMathGameForPractice = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            storedMathGamePracticeBackground = numberOfBackground;
            sharedPreferencesForMathGameForPractice.edit().putInt("storedMathGamePracticeBackgroundData" , storedMathGamePracticeBackground).apply();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Integer getMathGamePracticeBackground(Context context){
        Integer storedMathGamePracticeBackground = -1;
        try {
            sharedPreferencesForMathGameForPractice = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            storedMathGamePracticeBackground = sharedPreferencesForMathGameForPractice.getInt("storedMathGamePracticeBackgroundData",1);
            return storedMathGamePracticeBackground;
        }catch (Exception e){
            e.printStackTrace();
        }
        return storedMathGamePracticeBackground;

    }



    public void updatesPCheckSellMathPractice2(Context context, Integer numberOfBackground){ // Give values 1-not sell 2-sell
        try {
            Integer storedSPCheckSell = -1;
            sPCheckSellMathPractice2 = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            storedSPCheckSell = numberOfBackground;
            sPCheckSellMathPractice2.edit().putInt("sPCheckSellMathPractice2" , storedSPCheckSell).apply();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Integer getsPCheckSellMathPractice2(Context context){
        Integer storedSPCheckSell = -1;
        try {
            sPCheckSellMathPractice2 = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            storedSPCheckSell = sPCheckSellMathPractice2.getInt("sPCheckSellMathPractice2",1);
            return storedSPCheckSell;
        }catch (Exception e){
            e.printStackTrace();
        }
        return storedSPCheckSell;

    }

    public void updatesPCheckSellMathPractice3(Context context, Integer numberOfBackground){ // Give values 1-not sell 2-sell
        try {
            Integer storedSPCheckSell = -1;
            sPCheckSellMathPractice3 = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            storedSPCheckSell = numberOfBackground;
            sPCheckSellMathPractice3.edit().putInt("sPCheckSellMathPractice3" , storedSPCheckSell).apply();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Integer getsPCheckSellMathPractice3(Context context){
        Integer storedSPCheckSell = -1;
        try {
            sPCheckSellMathPractice3 = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            storedSPCheckSell = sPCheckSellMathPractice3.getInt("sPCheckSellMathPractice3",1);
            return storedSPCheckSell;
        }catch (Exception e){
            e.printStackTrace();
        }
        return storedSPCheckSell;

    }

    public void updatesPCheckSellMathPractice4(Context context, Integer numberOfBackground){ // Give values 1-not sell 2-sell
        try {
            Integer storedSPCheckSell = -1;
            sPCheckSellMathPractice4 = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            storedSPCheckSell = numberOfBackground;
            sPCheckSellMathPractice4.edit().putInt("sPCheckSellMathPractice4" , storedSPCheckSell).apply();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Integer getsPCheckSellMathPractice4(Context context){
        Integer storedSPCheckSell = -1;
        try {
            sPCheckSellMathPractice4 = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            storedSPCheckSell = sPCheckSellMathPractice4.getInt("sPCheckSellMathPractice4",1);
            return storedSPCheckSell;
        }catch (Exception e){
            e.printStackTrace();
        }
        return storedSPCheckSell;

    }


}