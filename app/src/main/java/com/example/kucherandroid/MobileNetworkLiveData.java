package com.example.kucherandroid;

import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.lifecycle.LiveData;

public class MobileNetworkLiveData extends LiveData<String> {
    private static MobileNetworkLiveData instance;
    private Context context;

    private MobileNetworkLiveData(Context context) {
        this.context = context;
    }

    private MobileNetworkLiveData() {

    }

    @Override
    protected void onActive() {
        TelephonyManager telephonyManager = (TelephonyManager) context
                .getSystemService(Context.TELEPHONY_SERVICE);
        String networkOperator = telephonyManager.getNetworkOperatorName();
        setValue(networkOperator);
    }

    public static MobileNetworkLiveData getInstance(Context context) {
        if (instance == null) {
            instance = new MobileNetworkLiveData(context);
        }
        return instance;
    }

}
