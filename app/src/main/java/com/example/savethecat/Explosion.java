package com.example.savethecat;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;

public class Explosion {

    Bitmap explosion[] = new Bitmap[4];
    int explosionFrame = 0;
    int explosionX ,explosionY , explosionVelocity;
    Random random;

    public explosion(Context context){
        explosion[0] = BitmapFactory.decodeResource(context.getResources(),R.drawable.explode2);
        explosion[1] = BitmapFactory.decodeResource(context.getResources(),R.drawable.explode1);
        explosion[2] = BitmapFactory.decodeResource(context.getResources(),R.drawable.explode3);
        explosion[3] = BitmapFactory.decodeResource(context.getResources(),R.drawable.explode4);
    }
    public Bitmap getExplosion(int explosionFrame){
        return explosion[explosionFrame];
    }
}
