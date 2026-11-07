package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sn extends tn {
    public sn(String str, String str2, String str3) {
        super(1, str2, str3, str);
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final Object a(JSONObject jSONObject) {
        return jSONObject.optString(this.f9349b, (String) h());
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final Object b(Bundle bundle) {
        String str = this.f9349b;
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? bundle.getString("com.google.android.gms.ads.flag.".concat(str)) : (String) h();
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final Object c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(this.f9349b, (String) h());
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void d(SharedPreferences.Editor editor, Object obj) {
        editor.putString(this.f9349b, (String) obj);
    }
}
