package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v0 implements ServiceConnection, y0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2490a;

    /* renamed from: b, reason: collision with root package name */
    public int f2491b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2492c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f2493d;

    /* renamed from: e, reason: collision with root package name */
    public final u0 f2494e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f2495f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0 f2496g;

    public v0(x0 x0Var, u0 u0Var) {
        Objects.requireNonNull(x0Var);
        this.f2496g = x0Var;
        this.f2494e = u0Var;
        this.f2490a = new HashMap();
        this.f2491b = 2;
    }

    public final c3.b a(String str, Executor executor) throws Throwable {
        try {
            Intent intentA = j0.a(this.f2496g.f2500e, this.f2494e);
            this.f2491b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(i3.j.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                x0 x0Var = this.f2496g;
                h3.a aVar = x0Var.f2502g;
                Context context = x0Var.f2500e;
                u0 u0Var = this.f2494e;
                try {
                    boolean zC = aVar.c(context, str, intentA, this, 4225, executor);
                    this.f2492c = zC;
                    if (zC) {
                        x0Var.f2501f.sendMessageDelayed(x0Var.f2501f.obtainMessage(1, u0Var), x0Var.f2503i);
                        c3.b bVar = c3.b.f2165x;
                        StrictMode.setVmPolicy(vmPolicy);
                        return bVar;
                    }
                    this.f2491b = 2;
                    try {
                        x0Var.f2502g.b(x0Var.f2500e, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    c3.b bVar2 = new c3.b(16, null, null);
                    StrictMode.setVmPolicy(vmPolicy);
                    return bVar2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (h0 e6) {
            return e6.s;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        x0 x0Var = this.f2496g;
        synchronized (x0Var.f2499d) {
            try {
                x0Var.f2501f.removeMessages(1, this.f2494e);
                this.f2493d = iBinder;
                this.f2495f = componentName;
                Iterator it = this.f2490a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f2491b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        x0 x0Var = this.f2496g;
        synchronized (x0Var.f2499d) {
            try {
                x0Var.f2501f.removeMessages(1, this.f2494e);
                this.f2493d = null;
                this.f2495f = componentName;
                Iterator it = this.f2490a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f2491b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
