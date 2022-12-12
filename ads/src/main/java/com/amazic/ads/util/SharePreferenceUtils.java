package com.amazic.ads.util;
import android.content.Context;
import android.content.SharedPreferences;
public class SharePreferenceUtils {
    private final static String PREF_NAME = "ad_pref";
    private final static String KEY_CURRENT_TOTAL_REVENUE_001_AD = "KEY_CURRENT_TOTAL_REVENUE_001_AD";

    public static void updateCurrentTotalRevenue001Ad(Context context, float revenue) {
        SharedPreferences pre = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        pre.edit().putFloat(KEY_CURRENT_TOTAL_REVENUE_001_AD, revenue).apply();
    }
}
