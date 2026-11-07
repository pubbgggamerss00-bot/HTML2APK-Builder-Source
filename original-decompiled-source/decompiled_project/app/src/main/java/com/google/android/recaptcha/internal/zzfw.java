package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import ph.h;
import ph.i0;

/* loaded from: classes2.dex */
public final class zzfw {
    private final WebView zza;
    private final i0 zzb;

    public zzfw(WebView webView, i0 i0Var) {
        this.zza = webView;
        this.zzb = i0Var;
    }

    public final void zzb(String str, String... strArr) {
        h.c(this.zzb, null, null, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3);
    }
}
