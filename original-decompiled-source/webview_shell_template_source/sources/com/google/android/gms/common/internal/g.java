package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2446a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static x0 f2447b;

    /* renamed from: c, reason: collision with root package name */
    public static HandlerThread f2448c;

    public static x0 a(Context context) {
        synchronized (f2446a) {
            try {
                if (f2447b == null) {
                    f2447b = new x0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2447b;
    }

    public abstract c3.b b(u0 u0Var, n0 n0Var, String str, Executor executor);

    public abstract void c(u0 u0Var, ServiceConnection serviceConnection);
}
