package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes2.dex */
final class zzc extends zza {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zza
    public final URLConnection zza(URL url, String str) throws IOException {
        return url.openConnection();
    }

    private zzc() {
    }
}
