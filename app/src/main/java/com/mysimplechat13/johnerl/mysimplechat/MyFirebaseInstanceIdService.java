package com.mysimplechat13.johnerl.mysimplechat;

/**
 * Created by JohnErl on 07/10/2017.
 */
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.messaging.FirebaseMessaging;


public class MyFirebaseInstanceIdService {
  private static final String TAG = "MyFirebaseIIDService";
  private static final String FRIENDLY_ENGAGE_TOPIC = "friendly_engage";

  /**
   * The Application's current Instance ID token is no longer valid and thus a new one must be requested.
   */
  public void onTokenRefresh() {
  }
}