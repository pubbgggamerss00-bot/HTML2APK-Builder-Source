package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qn extends tn {
    @Override // com.google.android.gms.internal.ads.tn
    public final Object a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(this.f9349b, ((Float) h()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final Object b(Bundle bundle) {
        String str = this.f9349b;
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(str))) : (Float) h();
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final Object c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(this.f9349b, ((Float) h()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void d(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(this.f9349b, ((Float) obj).floatValue());
    }
}
