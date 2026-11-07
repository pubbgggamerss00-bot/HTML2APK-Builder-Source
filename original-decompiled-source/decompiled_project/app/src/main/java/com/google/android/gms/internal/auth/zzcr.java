package com.google.android.gms.internal.auth;

import android.net.Uri;
import p.a;

/* loaded from: classes2.dex */
public final class zzcr {
    private static final a zza = new a();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized Uri zza(String str) {
        a aVar = zza;
        Uri uri = (Uri) aVar.get("com.google.android.gms.auth_account");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
        aVar.put("com.google.android.gms.auth_account", uri2);
        return uri2;
    }
}
