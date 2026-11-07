package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x0 extends g {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f2499d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Context f2500e;

    /* renamed from: f, reason: collision with root package name */
    public volatile p3.k f2501f;

    /* renamed from: g, reason: collision with root package name */
    public final h3.a f2502g;
    public final long h;

    /* renamed from: i, reason: collision with root package name */
    public final long f2503i;

    public x0(Context context, Looper looper) {
        w0 w0Var = new w0(this);
        this.f2500e = context.getApplicationContext();
        p3.k kVar = new p3.k(looper, w0Var);
        Looper.getMainLooper();
        this.f2501f = kVar;
        this.f2502g = h3.a.a();
        this.h = 5000L;
        this.f2503i = 300000L;
    }

    @Override // com.google.android.gms.common.internal.g
    public final c3.b b(u0 u0Var, n0 n0Var, String str, Executor executor) {
        c3.b bVarA;
        HashMap map = this.f2499d;
        synchronized (map) {
            try {
                v0 v0Var = (v0) map.get(u0Var);
                if (executor == null) {
                    executor = null;
                }
                if (v0Var == null) {
                    v0Var = new v0(this, u0Var);
                    v0Var.f2490a.put(n0Var, n0Var);
                    bVarA = v0Var.a(str, executor);
                    map.put(u0Var, v0Var);
                } else {
                    this.f2501f.removeMessages(0, u0Var);
                    if (v0Var.f2490a.containsKey(n0Var)) {
                        String string = u0Var.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    v0Var.f2490a.put(n0Var, n0Var);
                    int i6 = v0Var.f2491b;
                    if (i6 == 1) {
                        n0Var.onServiceConnected(v0Var.f2495f, v0Var.f2493d);
                    } else if (i6 == 2) {
                        bVarA = v0Var.a(str, executor);
                    }
                    bVarA = null;
                }
                if (v0Var.f2492c) {
                    return c3.b.f2165x;
                }
                if (bVarA == null) {
                    bVarA = new c3.b(-1, null, null);
                }
                return bVarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.g
    public final void c(u0 u0Var, ServiceConnection serviceConnection) {
        l.g("ServiceConnection must not be null", serviceConnection);
        HashMap map = this.f2499d;
        synchronized (map) {
            try {
                v0 v0Var = (v0) map.get(u0Var);
                if (v0Var == null) {
                    String string = u0Var.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!v0Var.f2490a.containsKey(serviceConnection)) {
                    String string2 = u0Var.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                v0Var.f2490a.remove(serviceConnection);
                if (v0Var.f2490a.isEmpty()) {
                    this.f2501f.sendMessageDelayed(this.f2501f.obtainMessage(0, u0Var), this.h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
