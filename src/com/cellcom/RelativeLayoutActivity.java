package com.cellcom;

import android.app.Activity;
import android.os.Bundle;

import com.roxstudio.proxycomponent.Proxied;

public class RelativeLayoutActivity extends Proxied<Activity> {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.relative_layout);
	}

}
