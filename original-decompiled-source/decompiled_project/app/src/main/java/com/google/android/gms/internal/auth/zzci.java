package com.google.android.gms.internal.auth;

import android.net.Uri;
import p.b1;

/* loaded from: classes2.dex */
public final class zzci {
    private final b1 zza;

    public zzci(b1 b1Var) {
        this.zza = b1Var;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        b1 b1Var;
        if (uri != null) {
            b1Var = (b1) this.zza.get(uri.toString());
        } else {
            b1Var = null;
        }
        if (b1Var == null) {
            return null;
        }
        return (String) b1Var.get("".concat(str3));
    }
}
