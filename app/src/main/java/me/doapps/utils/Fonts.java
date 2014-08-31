package me.doapps.utils;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by jnolascob on 31/08/2014.
 */
public class Fonts {
    public static Typeface setRobotoBold(Context context){
        return Typeface.createFromAsset(context.getAssets(),"fonts/Roboto-Light.ttf");
    }
    public static Typeface setAngryBird(Context context){
        return Typeface.createFromAsset(context.getAssets(),"fonts/angrybirds-regular.ttf");
    }
}
