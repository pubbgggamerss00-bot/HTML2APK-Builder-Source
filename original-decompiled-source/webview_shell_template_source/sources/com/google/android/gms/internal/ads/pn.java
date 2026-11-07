package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pn extends tn {
    @Override // com.google.android.gms.internal.ads.tn
    public final Object a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(this.f9349b, ((Long) h()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final Object b(Bundle bundle) {
        String str = this.f9349b;
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(str))) : (Long) h();
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final Object c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(this.f9349b, ((Long) h()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void d(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(this.f9349b, ((Long) obj).longValue());
    }
}
