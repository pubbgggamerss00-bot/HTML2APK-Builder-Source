package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nn extends tn {
    public nn(int i6, String str, Boolean bool, Boolean bool2) {
        super(i6, bool, bool2, str);
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(this.f9349b, ((Boolean) h()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final Object b(Bundle bundle) {
        String str = this.f9349b;
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(str))) : (Boolean) h();
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final Object c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(this.f9349b, ((Boolean) h()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void d(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(this.f9349b, ((Boolean) obj).booleanValue());
    }
}
