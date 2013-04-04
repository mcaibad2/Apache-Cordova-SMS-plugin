package com.phonegap.plugins.sms;

import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.telephony.SmsManager;

public class SmsPlugin extends CordovaPlugin 
{
	@Override
	public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException 
	{
		if (action.equals("send")) 
		{
            final String number = args.getString(0); 
            final String text = args.getString(1); 
            
            if (number != null && !number.equals(""))
            {
            	if (text != null && !text.equals(""))
                {
            		 cordova.getActivity().runOnUiThread(new Runnable() 
                     {
                         public void run() 
                         {
                        	 sendSMS(number, text);
                         }
                     });
                }
            }
            
            return true;
        }
        
		return false;
	}

	 private void sendSMS(String number, String text) 
	 {
		 SmsManager smsManager = SmsManager.getDefault();
		 smsManager.sendTextMessage(number, null, text, null, null);
	 }
}