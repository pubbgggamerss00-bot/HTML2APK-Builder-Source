package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
import java.net.ProtocolException;
import kotlin.jvm.internal.j;

/* loaded from: classes2.dex */
public final class zzex {
    private final zzfm zza;

    /* JADX WARN: Multi-variable type inference failed */
    public zzex() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final zzew zza(String str) throws ProtocolException, zzbd {
        try {
            HttpURLConnection httpURLConnectionZza = this.zza.zza(str);
            httpURLConnectionZza.setRequestMethod("POST");
            httpURLConnectionZza.setDoOutput(true);
            httpURLConnectionZza.setRequestProperty("Content-Type", "application/x-protobuffer");
            return new zzew(httpURLConnectionZza);
        } catch (zzbd e10) {
            throw e10;
        } catch (Exception e11) {
            throw new zzbd(zzbb.zzc, zzba.zzai, e11.getMessage());
        }
    }

    public /* synthetic */ zzex(zzfm zzfmVar, int i10, j jVar) {
        this.zza = new zzfm();
    }
}
