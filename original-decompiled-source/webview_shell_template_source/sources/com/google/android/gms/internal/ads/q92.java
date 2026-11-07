package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q92 extends me {

    /* renamed from: t, reason: collision with root package name */
    public final Logger f8281t;

    public q92(String str) {
        super(11);
        this.f8281t = Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void f(String str) {
        this.f8281t.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
