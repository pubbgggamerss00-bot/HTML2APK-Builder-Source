package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.d32;
import d3.f;
import d3.g;
import d3.i;
import d3.j;
import e3.l0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends i> extends f<R> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2402a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f2403b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<f.a> f2404c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public R f2405d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2406e;

    @KeepName
    private l0 mResultGuardian;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @VisibleForTesting
    public static class a<R extends i> extends o3.f {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i6 = message.what;
            if (i6 == 1) {
                Pair pair = (Pair) message.obj;
                j jVar = (j) pair.first;
                i iVar = (i) pair.second;
                try {
                    jVar.a();
                    return;
                } catch (RuntimeException e6) {
                    BasePendingResult.f(iVar);
                    throw e6;
                }
            }
            if (i6 == 2) {
                ((BasePendingResult) message.obj).b(Status.f2397y);
                return;
            }
            StringBuilder sb = new StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(i6);
            Log.wtf("BasePendingResult", sb.toString(), new Exception());
        }
    }

    static {
        new d32(2);
    }

    @Deprecated
    public BasePendingResult() {
        new AtomicReference();
        new a(Looper.getMainLooper());
        new WeakReference(null);
    }

    public static void f(i iVar) {
        if (iVar instanceof g) {
            try {
                ((g) iVar).release();
            } catch (RuntimeException e6) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(iVar)), e6);
            }
        }
    }

    public abstract i a();

    @Deprecated
    public final void b(Status status) {
        synchronized (this.f2402a) {
            try {
                if (!c()) {
                    d(a());
                    this.f2406e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        return this.f2403b.getCount() == 0;
    }

    public final void d(R r5) {
        synchronized (this.f2402a) {
            try {
                if (this.f2406e) {
                    f(r5);
                    return;
                }
                c();
                l.h("Results have already been set", !c());
                l.h("Result has already been consumed", !false);
                e(r5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(R r5) {
        this.f2405d = r5;
        r5.getStatus();
        this.f2403b.countDown();
        if (this.f2405d instanceof g) {
            this.mResultGuardian = new l0(this);
        }
        ArrayList<f.a> arrayList = this.f2404c;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.get(i6).a();
        }
        this.f2404c.clear();
    }
}
