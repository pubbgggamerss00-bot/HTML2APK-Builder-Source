package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Looper;
import com.google.android.gms.internal.common.zzh;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class f1 extends h {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f6135d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Context f6136e;

    /* renamed from: f, reason: collision with root package name */
    public volatile zzh f6137f;

    /* renamed from: g, reason: collision with root package name */
    public final va.b f6138g;

    /* renamed from: h, reason: collision with root package name */
    public final long f6139h;

    /* renamed from: i, reason: collision with root package name */
    public final long f6140i;

    public f1(Context context, Looper looper) {
        e1 e1Var = new e1(this);
        this.f6136e = context.getApplicationContext();
        this.f6137f = new zzh(looper, e1Var);
        this.f6138g = va.b.a();
        this.f6139h = 5000L;
        this.f6140i = 300000L;
    }

    @Override // com.google.android.gms.common.internal.h
    public final pa.a b(c1 c1Var, v0 v0Var, String str, Executor executor) {
        synchronized (this.f6135d) {
            try {
                d1 d1Var = (d1) this.f6135d.get(c1Var);
                pa.a aVarA = null;
                if (executor == null) {
                    executor = null;
                }
                if (d1Var == null) {
                    d1Var = new d1(this, c1Var);
                    d1Var.f6103a.put(v0Var, v0Var);
                    aVarA = d1.a(d1Var, str, executor);
                    this.f6135d.put(c1Var, d1Var);
                } else {
                    this.f6137f.removeMessages(0, c1Var);
                    if (d1Var.f6103a.containsKey(v0Var)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(c1Var.toString()));
                    }
                    d1Var.f6103a.put(v0Var, v0Var);
                    int i10 = d1Var.f6104b;
                    if (i10 == 1) {
                        v0Var.onServiceConnected(d1Var.f6108f, d1Var.f6106d);
                    } else if (i10 == 2) {
                        aVarA = d1.a(d1Var, str, executor);
                    }
                }
                if (d1Var.f6105c) {
                    return pa.a.f21375e;
                }
                if (aVarA == null) {
                    aVarA = new pa.a(-1);
                }
                return aVarA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.h
    public final void c(c1 c1Var, ServiceConnection serviceConnection) {
        p.g(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f6135d) {
            try {
                d1 d1Var = (d1) this.f6135d.get(c1Var);
                if (d1Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(c1Var.toString()));
                }
                if (!d1Var.f6103a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(c1Var.toString()));
                }
                d1Var.f6103a.remove(serviceConnection);
                if (d1Var.f6103a.isEmpty()) {
                    this.f6137f.sendMessageDelayed(this.f6137f.obtainMessage(0, c1Var), this.f6139h);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
