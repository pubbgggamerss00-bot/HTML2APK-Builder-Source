package com.google.android.gms.internal.auth;

import android.util.Log;
import e.e;

/* loaded from: classes2.dex */
final class zzcx extends zzdc {
    public zzcx(zzcz zzczVar, String str, Double d10, boolean z10) {
        super(zzczVar, str, d10, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbA = e.a("Invalid double value for ", this.zzc, ": ");
            sbA.append((String) obj);
            Log.e("PhenotypeFlag", sbA.toString());
            return null;
        }
    }
}
