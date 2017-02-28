package com.myapp.mehrnaz.appapp;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
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
							long[] pattern = {0, 100, 1000};
							v.vibrate(pattern, 0);
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
			String path="file:///sdcard/Songs/ARR Hits/hosannatamil.mp3";
			   // Even you can refer resource in res/raw directory
			//Uri myUri = Uri.parse("android.resource://com.prgguru.example/" + R.raw.hosannatamil); 
			Uri myUri1 = Uri.parse(path);
			MediaPlayer	mPlayer = new MediaPlayer();
			mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
			try {
				mPlayer.setDataSource(context, myUri1);
			} catch (IllegalArgumentException e) {
				//Toast.makeText(getApplicationContext(), "You might not set the URI correctly!", Toast.LENGTH_LONG).show();
			} catch (SecurityException e) {
				//Toast.makeText(getApplicationContext(), "You might not set the URI correctly!", Toast.LENGTH_LONG).show();
			} catch (IllegalStateException e) {
				//Toast.makeText(getApplicationContext(), "You might not set the URI correctly!", Toast.LENGTH_LONG).show();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				mPlayer.prepare();
			} catch (IllegalStateException e) {
			//	Toast.makeText(getApplicationContext(), "You might not set the URI correctly!", Toast.LENGTH_LONG).show();
			} catch (IOException e) {
			//	Toast.makeText(getApplicationContext(), "You might not set the URI correctly!", Toast.LENGTH_LONG).show();
			}
			mPlayer.start();
		}
	}
	
	
}