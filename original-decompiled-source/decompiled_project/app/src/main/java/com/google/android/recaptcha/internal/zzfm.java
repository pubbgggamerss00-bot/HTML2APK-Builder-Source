package com.google.android.recaptcha.internal;

import e9.w0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.r;
import pg.j;

/* loaded from: classes2.dex */
public final class zzfm {
    private final j zza;

    public zzfm() {
        int i10 = zzav.zza;
        this.zza = w0.b(zzfl.zza);
    }

    public final HttpURLConnection zza(String str) throws IOException, zzbd {
        if (!((zzfk) this.zza.getValue()).zzb(str)) {
            throw new zzbd(zzbb.zzc, zzba.zzQ, null);
        }
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        r.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) uRLConnectionOpenConnection;
    }
}
