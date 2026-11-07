package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import androidx.room.y0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p5.g0;

/* loaded from: classes2.dex */
public final class zzajc {
    public static zzaci zza(Exception exc, String str, String str2) {
        String message = exc.getMessage();
        StringBuilder sbA = y0.a("Failed to parse ", str, " for string [", str2, "] with exception: ");
        sbA.append(message);
        Log.e(str, sbA.toString());
        return new zzaci(g0.a("Failed to parse ", str, " for string [", str2, "]"), exc);
    }

    public static List<String> zza(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(jSONArray.getString(i10));
            }
        }
        return arrayList;
    }

    public static void zza(JSONObject jSONObject) throws JSONException {
        jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
    }

    public static void zza(JSONObject jSONObject, String str, String str2) throws JSONException {
        jSONObject.put(str, str2);
        jSONObject.put("recaptchaVersion", "RECAPTCHA_ENTERPRISE");
        jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
    }
}
