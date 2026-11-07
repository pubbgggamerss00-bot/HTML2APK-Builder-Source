package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class as0 {

    /* renamed from: a, reason: collision with root package name */
    public final el0 f2836a;

    /* renamed from: b, reason: collision with root package name */
    public final xo0 f2837b;

    /* renamed from: c, reason: collision with root package name */
    public final vq0 f2838c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f2839d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f2840e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f2841f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2842g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2843i;

    public as0(Looper looper, el0 el0Var, vq0 vq0Var) {
        this(new CopyOnWriteArraySet(), looper, el0Var, vq0Var, true);
    }

    public final void a(Object obj) {
        synchronized (this.f2842g) {
            try {
                if (this.h) {
                    return;
                }
                this.f2839d.add(new mr0(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        e();
        ArrayDeque arrayDeque = this.f2841f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        xo0 xo0Var = this.f2837b;
        if (!xo0Var.zzg()) {
            xo0Var.f(xo0Var.zzb(1));
        }
        ArrayDeque arrayDeque2 = this.f2840e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(final int i6, final eq0 eq0Var) {
        e();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f2839d);
        this.f2841f.add(new Runnable() { // from class: com.google.android.gms.internal.ads.sp0
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    mr0 mr0Var = (mr0) it.next();
                    if (!mr0Var.f7217d) {
                        int i7 = i6;
                        if (i7 != -1) {
                            mr0Var.f7215b.a(i7);
                        }
                        mr0Var.f7216c = true;
                        eq0Var.mo6zza(mr0Var.f7214a);
                    }
                }
            }
        });
    }

    public final void d() {
        e();
        synchronized (this.f2842g) {
            this.h = true;
        }
        Iterator it = this.f2839d.iterator();
        while (it.hasNext()) {
            mr0 mr0Var = (mr0) it.next();
            vq0 vq0Var = this.f2838c;
            mr0Var.f7217d = true;
            if (mr0Var.f7216c) {
                mr0Var.f7216c = false;
                vq0Var.e(mr0Var.f7214a, mr0Var.f7215b.b());
            }
        }
        this.f2839d.clear();
    }

    public final void e() {
        if (this.f2843i) {
            y5.r(Thread.currentThread() == this.f2837b.zza().getThread());
        }
    }

    public as0(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, el0 el0Var, vq0 vq0Var, boolean z6) {
        this.f2836a = el0Var;
        this.f2839d = copyOnWriteArraySet;
        this.f2838c = vq0Var;
        this.f2842g = new Object();
        this.f2840e = new ArrayDeque();
        this.f2841f = new ArrayDeque();
        this.f2837b = el0Var.a(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.ep0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                as0 as0Var = this.s;
                Iterator it = as0Var.f2839d.iterator();
                while (it.hasNext()) {
                    mr0 mr0Var = (mr0) it.next();
                    vq0 vq0Var2 = as0Var.f2838c;
                    if (!mr0Var.f7217d && mr0Var.f7216c) {
                        dj2 dj2VarB = mr0Var.f7215b.b();
                        mr0Var.f7215b = new vy0();
                        mr0Var.f7216c = false;
                        vq0Var2.e(mr0Var.f7214a, dj2VarB);
                    }
                    if (as0Var.f2837b.zzg()) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.f2843i = z6;
    }
}
