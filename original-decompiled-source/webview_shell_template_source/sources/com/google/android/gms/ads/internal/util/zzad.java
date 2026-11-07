package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.ak1;
import com.google.android.gms.internal.ads.bk1;
import com.google.android.gms.internal.ads.ck1;
import com.google.android.gms.internal.ads.cm1;
import com.google.android.gms.internal.ads.ml1;
import com.google.android.gms.internal.ads.zn;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzad {
    public static Bundle zza(Context context, String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return zzb(context, str);
    }

    public static Bundle zzb(Context context, String str) {
        JSONArray jSONArray;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (TextUtils.isEmpty(str)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e6) {
                zzo.zzf("JSON parsing error", e6);
            }
        }
        if (jSONArray == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i6);
            String strOptString = jSONObjectOptJSONObject.optString("bk");
            String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt("type", -1);
            int i7 = iOptInt != 0 ? iOptInt != 1 ? iOptInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && i7 != 0) {
                List listB = cm1.a(new ml1('/')).b(strOptString2);
                if (listB.size() > 2 || listB.isEmpty()) {
                    obj = null;
                } else {
                    if (listB.size() == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str2 = (String) listB.get(0);
                    } else {
                        sharedPreferences = context.getSharedPreferences((String) listB.get(0), 0);
                        str2 = (String) listB.get(1);
                    }
                    obj = sharedPreferences.getAll().get(str2);
                }
                if (obj != null) {
                    int i8 = i7 - 1;
                    if (i8 != 0) {
                        if (i8 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(strOptString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(strOptString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strOptString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(strOptString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(strOptString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    public static void zzc(Context context) throws IOException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.f11364b6)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            ak1 ak1VarF = ak1.f(context);
            bk1 bk1VarG = bk1.g(context);
            ck1 ck1VarE = ck1.e(context);
            ak1VarF.getClass();
            synchronized (ak1.class) {
                ak1VarF.d(false);
            }
            synchronized (ak1.class) {
                ak1VarF.d(true);
            }
            bk1VarG.h();
            ck1VarE.f();
        } catch (IOException e6) {
            com.google.android.gms.ads.internal.zzv.zzp().h("clearStorageOnIdlessMode", e6);
        }
        try {
            if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
            } else {
                throw new IOException("Failed to remove query_info_shared_prefs");
            }
        } catch (IOException e7) {
            com.google.android.gms.ads.internal.zzv.zzp().h("clearStorageOnIdlessMode_scar", e7);
        }
    }
}
