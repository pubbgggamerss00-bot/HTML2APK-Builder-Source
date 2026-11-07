package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzv;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class uv0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f9636a = new JSONObject();

    /* renamed from: b, reason: collision with root package name */
    public List f9637b;

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str != null && this.f9637b.contains(str)) {
            try {
                Object obj = sharedPreferences.getAll().get(str);
                JSONObject jSONObject = this.f9636a;
                if (obj == null) {
                    jSONObject.remove(str);
                } else {
                    jSONObject.put(str, obj);
                }
            } catch (JSONException e6) {
                zzv.zzp().g("InspectorSharedPreferenceCollector.onSharedPreferenceChanged", e6);
            }
        }
    }
}
