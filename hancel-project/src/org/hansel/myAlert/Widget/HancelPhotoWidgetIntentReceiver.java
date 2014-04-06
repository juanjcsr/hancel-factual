package org.hansel.myAlert.Widget;

import org.hansel.myAlert.MainActivity;
import org.hansel.myAlert.R;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

/**
 * Created by Jacek Milewski
 * looksok.wordpress.com
 */

public class HancelPhotoWidgetIntentReceiver extends BroadcastReceiver {

	private static int clickCount = 0;
	
	@Override
	public void onReceive(Context context, Intent intent) {
		
		if(intent.getAction().equals("pl.looksok.intent.action.CHANGE_PICTURE")){
			updateWidgetPictureAndButtonListener(context);
		}
	}

	private void updateWidgetPictureAndButtonListener(Context context) {
	}
	
}
