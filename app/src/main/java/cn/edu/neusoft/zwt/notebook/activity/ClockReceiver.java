package cn.edu.neusoft.zwt.notebook.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ClockReceiver extends BroadcastReceiver {

	public void onReceive(Context context, Intent intent) {
		intent.setClass(context, ClockAlertActivity.class);
		intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		context.startActivity(intent);
	}
}
