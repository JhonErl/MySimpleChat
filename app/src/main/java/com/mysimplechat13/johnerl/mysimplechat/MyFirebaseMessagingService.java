package com.mysimplechat13.johnerl.mysimplechat;

/**
 * Created by JohnErl on 07/10/2017.
 */
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService {

  private static final String TAG = "MyFMService";

  public void onMessageReceived(RemoteMessage remoteMessage) {
    // Handle data payload of FCM messages.
    Log.d(TAG, "FCM Message Id: " + remoteMessage.getMessageId());
    Log.d(TAG, "FCM Notification Message: " + remoteMessage.getNotification());
    Log.d(TAG, "FCM Data Message: " + remoteMessage.getData());
  }

}
