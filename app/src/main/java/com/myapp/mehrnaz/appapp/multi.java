package com.myapp.mehrnaz.appapp;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Vibrator;

import java.io.IOException;

public class multi {
	//<uses-permission android:name="android.permission.VIBRATE"/>
	public void VibrationStart (int in , Context context, Boolean check)
	{
		if (check==true)
		{

			//in==1 short || in==2 long ||....
			Vibrator v = (Vibrator) context.getSystemService(context.VIBRATOR_SERVICE);
			 switch (in)
				   {
					   case 1:
						   v.vibrate(400);
						   break;
					   case 2:
							long[] pattern2 = {0, 100, 1000};
							v.vibrate(pattern2,1);
						   break;
				   }
		}
	}
	
	public void VibrationCancel ( Context context)
	{
		Vibrator v = (Vibrator) context.getSystemService(context.VIBRATOR_SERVICE);
		v.cancel();
	}
	
	public void Sound(int in , Boolean check,Context context)
	{
		if (check==true)
		{

				try {
					Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
					Ringtone r = RingtoneManager.getRingtone(context, notification);
					r.play();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

	}
	
	
}