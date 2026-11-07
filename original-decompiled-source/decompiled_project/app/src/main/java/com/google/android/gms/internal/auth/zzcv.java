package com.google.android.gms.internal.auth;

import android.util.Log;
import e.e;

/* loaded from: classes2.dex */
final class zzcv extends zzdc {
    public zzcv(zzcz zzczVar, String str, Long l10, boolean z10) {
        super(zzczVar, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbA = e.a("Invalid long value for ", this.zzc, ": ");
            sbA.append((String) obj);
            Log.e("PhenotypeFlag", sbA.toString());
            return null;
        }
    }
}
