package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class eh extends lh {
    public List h;

    /* renamed from: i, reason: collision with root package name */
    public final Context f4287i;

    public eh(dg dgVar, kd kdVar, int i6, Context context) {
        super(dgVar, "fN18KlRCFMPT8X1qMJmuHpIW+XVsrRSfMnh+5QiArw3xyALVJ87b0VfJ0mW1R0L9", "GJYSDgYrAgCxY14XYxunZiSr8dTk91g66tw4qbpYxV8=", kdVar, i6, 31);
        this.h = null;
        this.f4287i = context;
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void a() {
        kd kdVar = this.f6727d;
        kdVar.i();
        yd.g0((yd) kdVar.f4126t, -1L);
        kd kdVar2 = this.f6727d;
        kdVar2.i();
        yd.c0((yd) kdVar2.f4126t, -1L);
        Context context = this.f4287i;
        if (context == null) {
            context = this.f6724a.f3897a;
        }
        if (this.h == null) {
            this.h = (List) this.f6728e.invoke(null, context);
        }
        List list = this.h;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.f6727d) {
            kd kdVar3 = this.f6727d;
            long jLongValue = ((Long) this.h.get(0)).longValue();
            kdVar3.i();
            yd.g0((yd) kdVar3.f4126t, jLongValue);
            kd kdVar4 = this.f6727d;
            long jLongValue2 = ((Long) this.h.get(1)).longValue();
            kdVar4.i();
            yd.c0((yd) kdVar4.f4126t, jLongValue2);
        }
    }
}
