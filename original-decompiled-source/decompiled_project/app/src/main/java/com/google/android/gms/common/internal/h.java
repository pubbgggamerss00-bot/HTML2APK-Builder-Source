package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f6143a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static f1 f6144b;

    /* renamed from: c, reason: collision with root package name */
    public static HandlerThread f6145c;

    public static f1 a(Context context) {
        synchronized (f6143a) {
            try {
                if (f6144b == null) {
                    f6144b = new f1(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f6144b;
    }

    public abstract pa.a b(c1 c1Var, v0 v0Var, String str, Executor executor);

    public abstract void c(c1 c1Var, ServiceConnection serviceConnection);
}
