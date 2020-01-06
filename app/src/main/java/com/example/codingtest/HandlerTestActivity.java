package com.example.codingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

public class HandlerTestActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_handler_test);

		new WorkerThread(this).run();
	}

	private void callFromHandler() {
		Toast.makeText(this, "Call from handler in thread", Toast.LENGTH_LONG).show();
	}

	private class WorkerThread extends Thread {

		private Handler handler;
		private HandlerTestActivity activity;

		WorkerThread(HandlerTestActivity activity) {
			this.activity = activity;
		}

		@Override
		public void run() {
			handler = new Handler();
			handler.post(new Runnable() {
				@Override
				public void run() {
					activity.callFromHandler();
				}
			});
		}
	}
}
