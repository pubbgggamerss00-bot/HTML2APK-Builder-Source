package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class lh implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final dg f6724a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6725b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6726c;

    /* renamed from: d, reason: collision with root package name */
    public final kd f6727d;

    /* renamed from: e, reason: collision with root package name */
    public Method f6728e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6729f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6730g;

    public lh(dg dgVar, String str, String str2, kd kdVar, int i6, int i7) {
        this.f6724a = dgVar;
        this.f6725b = str;
        this.f6726c = str2;
        this.f6727d = kdVar;
        this.f6729f = i6;
        this.f6730g = i7;
    }

    public abstract void a();

    public void b() {
        int i6;
        dg dgVar = this.f6724a;
        try {
            long jNanoTime = System.nanoTime();
            Method methodD = dgVar.d(this.f6725b, this.f6726c);
            this.f6728e = methodD;
            if (methodD == null) {
                return;
            }
            a();
            ef efVar = dgVar.f3908m;
            if (efVar == null || (i6 = this.f6729f) == Integer.MIN_VALUE) {
                return;
            }
            efVar.a(this.f6730g, i6, (System.nanoTime() - jNanoTime) / 1000, null, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        b();
        return null;
    }
}
