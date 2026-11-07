package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.b;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class bx0 implements b.a, b.InterfaceC0030b {

    /* renamed from: a, reason: collision with root package name */
    public final o70 f3317a = new o70();

    /* renamed from: b, reason: collision with root package name */
    public final Object f3318b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3319c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3320d = false;

    /* renamed from: e, reason: collision with root package name */
    public r30 f3321e;

    /* renamed from: f, reason: collision with root package name */
    public x20 f3322f;

    public static void b(Context context, o70 o70Var, Executor executor) {
        if (((Boolean) lp.f6814j.c()).booleanValue() || ((Boolean) lp.h.c()).booleanValue()) {
            o70Var.addListener(new as1(0, o70Var, new cl0(context)), executor);
        }
    }

    public final void a() {
        synchronized (this.f3318b) {
            try {
                this.f3320d = true;
                if (this.f3322f.isConnected() || this.f3322f.isConnecting()) {
                    this.f3322f.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void n(int i6) {
        zzo.zze("Cannot connect to remote service, fallback to local instance.");
    }

    @Override // com.google.android.gms.common.internal.b.InterfaceC0030b
    public void r(c3.b bVar) {
        zzo.zze("Disconnected from remote ad request service.");
        this.f3317a.b(new ix0(1));
    }
}
