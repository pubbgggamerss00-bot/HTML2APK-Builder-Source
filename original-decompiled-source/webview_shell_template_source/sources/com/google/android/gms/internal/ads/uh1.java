package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Collections;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class uh1 extends ph1 {
    @Override // com.google.android.gms.internal.ads.qh1, android.os.AsyncTask
    /* renamed from: a */
    public final void onPostExecute(String str) {
        rg1 rg1Var;
        if (!TextUtils.isEmpty(str) && (rg1Var = rg1.f8631c) != null) {
            for (fg1 fg1Var : Collections.unmodifiableCollection(rg1Var.f8632a)) {
                if (this.f8076c.contains(fg1Var.f4657g)) {
                    ch1 ch1Var = fg1Var.f4654d;
                    if (this.f8078e >= ch1Var.f3578c) {
                        ch1Var.f3579d = 2;
                        xg1.a(ch1Var.a(), "setNativeViewHierarchy", str, ch1Var.f3576a);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        s70 s70Var = this.f8389b;
        JSONObject jSONObject = (JSONObject) s70Var.f8823t;
        JSONObject jSONObject2 = this.f8077d;
        if (gh1.e(jSONObject2, jSONObject)) {
            return null;
        }
        s70Var.f8823t = jSONObject2;
        return jSONObject2.toString();
    }
}
