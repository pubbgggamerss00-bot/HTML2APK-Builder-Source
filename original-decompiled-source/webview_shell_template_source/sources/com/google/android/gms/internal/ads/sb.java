package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sb {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f8874a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f8875b;

    /* renamed from: c, reason: collision with root package name */
    public final PriorityBlockingQueue f8876c;

    /* renamed from: d, reason: collision with root package name */
    public final PriorityBlockingQueue f8877d;

    /* renamed from: e, reason: collision with root package name */
    public final ic f8878e;

    /* renamed from: f, reason: collision with root package name */
    public final cc f8879f;

    /* renamed from: g, reason: collision with root package name */
    public final jb[] f8880g;
    public cb h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f8881i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f8882j;

    /* renamed from: k, reason: collision with root package name */
    public final xj1 f8883k;

    public sb(ic icVar, cc ccVar) {
        xj1 xj1Var = new xj1(new Handler(Looper.getMainLooper()));
        this.f8874a = new AtomicInteger();
        this.f8875b = new HashSet();
        this.f8876c = new PriorityBlockingQueue();
        this.f8877d = new PriorityBlockingQueue();
        this.f8881i = new ArrayList();
        this.f8882j = new ArrayList();
        this.f8878e = icVar;
        this.f8879f = ccVar;
        this.f8880g = new jb[4];
        this.f8883k = xj1Var;
    }

    public final void a(pb pbVar) {
        pbVar.zzf(this);
        synchronized (this.f8875b) {
            this.f8875b.add(pbVar);
        }
        pbVar.zzg(this.f8874a.incrementAndGet());
        pbVar.zzm("add-to-queue");
        b();
        this.f8876c.add(pbVar);
    }

    public final void b() {
        synchronized (this.f8882j) {
            try {
                ArrayList arrayList = this.f8882j;
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    ((qb) obj).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        cb cbVar = this.h;
        if (cbVar != null) {
            cbVar.f3505v = true;
            cbVar.interrupt();
        }
        jb[] jbVarArr = this.f8880g;
        for (int i6 = 0; i6 < 4; i6++) {
            jb jbVar = jbVarArr[i6];
            if (jbVar != null) {
                jbVar.f6009v = true;
                jbVar.interrupt();
            }
        }
        cb cbVar2 = new cb(this.f8876c, this.f8877d, this.f8878e, this.f8883k);
        this.h = cbVar2;
        cbVar2.start();
        for (int i7 = 0; i7 < 4; i7++) {
            jb jbVar2 = new jb(this.f8877d, this.f8879f, this.f8878e, this.f8883k);
            this.f8880g[i7] = jbVar2;
            jbVar2.start();
        }
    }
}
