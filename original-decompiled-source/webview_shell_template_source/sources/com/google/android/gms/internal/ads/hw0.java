package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hw0 {

    /* renamed from: e, reason: collision with root package name */
    public static hw0 f5504e;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f5505a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f5506b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Object f5507c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public int f5508d = 0;

    public hw0(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new com.google.android.gms.ads.internal.util.m(1, this), intentFilter);
    }

    public static synchronized hw0 b(Context context) {
        try {
            if (f5504e == null) {
                f5504e = new hw0(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5504e;
    }

    public static /* synthetic */ void c(hw0 hw0Var, int i6) {
        synchronized (hw0Var.f5507c) {
            try {
                if (hw0Var.f5508d == i6) {
                    return;
                }
                hw0Var.f5508d = i6;
                Iterator it = hw0Var.f5506b.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    mk2 mk2Var = (mk2) weakReference.get();
                    if (mk2Var != null) {
                        nk2.c(mk2Var.f7186a, i6);
                    } else {
                        hw0Var.f5506b.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int a() {
        int i6;
        synchronized (this.f5507c) {
            i6 = this.f5508d;
        }
        return i6;
    }
}
