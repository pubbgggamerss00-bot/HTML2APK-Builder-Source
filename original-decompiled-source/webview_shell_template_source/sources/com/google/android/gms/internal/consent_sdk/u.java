package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.o30;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u extends WebView {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f11908v = 0;
    public final Handler s;

    /* renamed from: t, reason: collision with root package name */
    public final y f11909t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f11910u;

    public u(w wVar, Handler handler, y yVar) {
        super(wVar);
        this.f11910u = false;
        this.s = handler;
        this.f11909t = yVar;
    }

    public final void a(String str, String str2) {
        this.s.post(new o30(5, this, str + "(" + str2 + ");"));
    }
}
