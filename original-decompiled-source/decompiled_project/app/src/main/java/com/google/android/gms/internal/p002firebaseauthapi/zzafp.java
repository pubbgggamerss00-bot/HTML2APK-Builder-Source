package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.p;
import java.security.NoSuchAlgorithmException;
import wa.a;
import wa.c;

/* loaded from: classes2.dex */
public final class zzafp {
    private final String zza;
    private final String zzb;

    public zzafp(Context context) {
        this(context, context.getPackageName());
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    private zzafp(Context context, String str) throws NoSuchAlgorithmException {
        p.f(context);
        p.d(str);
        this.zza = str;
        try {
            byte[] bArrA = a.a(context, str);
            if (bArrA != null) {
                this.zzb = c.a(bArrA);
                return;
            }
            Log.e("FBA-PackageInfo", "single cert required: " + str);
            this.zzb = null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: " + str);
            this.zzb = null;
        }
    }
}
