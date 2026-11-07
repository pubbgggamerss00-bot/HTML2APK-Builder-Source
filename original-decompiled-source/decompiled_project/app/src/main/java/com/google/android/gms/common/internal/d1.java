package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class d1 implements ServiceConnection, g1 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6103a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f6104b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6105c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f6106d;

    /* renamed from: e, reason: collision with root package name */
    public final c1 f6107e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f6108f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f1 f6109g;

    public d1(f1 f1Var, c1 c1Var) {
        this.f6109g = f1Var;
        this.f6107e = c1Var;
    }

    public static pa.a a(d1 d1Var, String str, Executor executor) throws RemoteException {
        try {
            Intent intentA = d1Var.f6107e.a(d1Var.f6109g.f6136e);
            d1Var.f6104b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(wa.h.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                f1 f1Var = d1Var.f6109g;
                boolean zC = f1Var.f6138g.c(f1Var.f6136e, str, intentA, d1Var, 4225, executor);
                d1Var.f6105c = zC;
                if (zC) {
                    d1Var.f6109g.f6137f.sendMessageDelayed(d1Var.f6109g.f6137f.obtainMessage(1, d1Var.f6107e), d1Var.f6109g.f6140i);
                    pa.a aVar = pa.a.f21375e;
                    StrictMode.setVmPolicy(vmPolicy);
                    return aVar;
                }
                d1Var.f6104b = 2;
                try {
                    f1 f1Var2 = d1Var.f6109g;
                    f1Var2.f6138g.b(f1Var2.f6136e, d1Var);
                } catch (IllegalArgumentException unused) {
                }
                pa.a aVar2 = new pa.a(16);
                StrictMode.setVmPolicy(vmPolicy);
                return aVar2;
            } catch (Throwable th2) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th2;
            }
        } catch (q0 e10) {
            return e10.f6186a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f6109g.f6135d) {
            try {
                this.f6109g.f6137f.removeMessages(1, this.f6107e);
                this.f6106d = iBinder;
                this.f6108f = componentName;
                Iterator it = this.f6103a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f6104b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f6109g.f6135d) {
            try {
                this.f6109g.f6137f.removeMessages(1, this.f6107e);
                this.f6106d = null;
                this.f6108f = componentName;
                Iterator it = this.f6103a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f6104b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
