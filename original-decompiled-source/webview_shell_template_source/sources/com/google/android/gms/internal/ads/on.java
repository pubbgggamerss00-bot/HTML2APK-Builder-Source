package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class on extends tn {
    @Override // com.google.android.gms.internal.ads.tn
    public final Object a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(this.f9349b, ((Integer) h()).intValue()));
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final Object b(Bundle bundle) {
        String str = this.f9349b;
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(str))) : (Integer) h();
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final Object c(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(this.f9349b, ((Integer) h()).intValue()));
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void d(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(this.f9349b, ((Integer) obj).intValue());
    }
}
