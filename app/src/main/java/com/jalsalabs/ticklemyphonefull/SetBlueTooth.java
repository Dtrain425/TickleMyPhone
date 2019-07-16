package com.jalsalabs.ticklemyphonefull;

import android.app.Activity;
import android.os.Bundle;

public class SetBlueTooth extends Activity {
    public String message;
    public String phoneNo;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            TML_Library.TurnBluetooth(this, TML_Library.GetParameter("BODY2NDTOKEN"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        finish();
    }
}
