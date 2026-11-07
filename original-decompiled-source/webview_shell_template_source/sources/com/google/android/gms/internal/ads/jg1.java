package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jg1 extends TimerTask {
    public final /* synthetic */ Timer s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t31 f6062t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ xj1 f6063u;

    public jg1(t31 t31Var, xj1 xj1Var, Timer timer) {
        this.f6063u = xj1Var;
        this.s = timer;
        this.f6062t = t31Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        WebView webView = (WebView) this.f6062t.f9095t;
        int i6 = h2.c.f13280a;
        if (!i2.j.f13357g.d()) {
            throw i2.j.a();
        }
        ((WebViewProviderBoundaryInterface) h2.c.c(webView).f2049t).removeWebMessageListener("omidJsSessionService");
        mb0 mb0Var = ((jb0) this.f6063u.f10619t).s;
        uj1 uj1Var = zzs.zza;
        Objects.requireNonNull(mb0Var);
        uj1Var.post(new u(5, mb0Var));
        this.s.cancel();
    }
}
