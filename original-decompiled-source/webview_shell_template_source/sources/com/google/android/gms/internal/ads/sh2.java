package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sh2 {

    /* renamed from: a, reason: collision with root package name */
    public final oh2 f8938a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f8939b;

    public sh2(CopyOnWriteArrayList copyOnWriteArrayList, oh2 oh2Var) {
        this.f8939b = copyOnWriteArrayList;
        this.f8938a = oh2Var;
    }

    public final void a(jm0 jm0Var) {
        Iterator it = this.f8939b.iterator();
        while (it.hasNext()) {
            rh2 rh2Var = (rh2) it.next();
            Object obj = rh2Var.f8638b;
            Handler handler = rh2Var.f8637a;
            q qVar = new q(13, jm0Var, obj);
            int i6 = j31.f5914a;
            if (handler.getLooper().getThread().isAlive()) {
                if (handler.getLooper() == Looper.myLooper()) {
                    qVar.run();
                } else {
                    handler.post(qVar);
                }
            }
        }
    }
}
