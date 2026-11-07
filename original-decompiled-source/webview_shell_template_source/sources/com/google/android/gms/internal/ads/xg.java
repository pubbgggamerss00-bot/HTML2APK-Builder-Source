package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xg extends lh {
    public final Map h;

    /* renamed from: i, reason: collision with root package name */
    public final View f10558i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f10559j;

    public xg(dg dgVar, kd kdVar, int i6, HashMap map, View view, Context context) {
        super(dgVar, "SGrqoKjotUFKi0Pm8mPdGLEIFA6B5bcdqpg0gya/IITzjxrSi23eKYMffqn0zLlM", "JlPicGd8nbcQ8ZbmhNqFQR3s817OLQa0+uauZ8OF17M=", kdVar, i6, 85);
        this.h = map;
        this.f10558i = view;
        this.f10559j = context;
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void a() {
        Map map = this.h;
        long jLongValue = map.containsKey(1) ? ((Long) map.get(1)).longValue() : Long.MIN_VALUE;
        Map map2 = this.h;
        long[] jArr = {jLongValue, map2.containsKey(2) ? ((Long) map2.get(2)).longValue() : Long.MIN_VALUE};
        Context context = this.f10559j;
        if (context == null) {
            context = this.f6724a.f3897a;
        }
        long[] jArr2 = (long[]) this.f6728e.invoke(null, jArr, context, this.f10558i);
        long j6 = jArr2[0];
        this.h.put(1, Long.valueOf(jArr2[1]));
        long j7 = jArr2[2];
        this.h.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.f6727d) {
            kd kdVar = this.f6727d;
            kdVar.i();
            yd.E((yd) kdVar.f4126t, j6);
            kd kdVar2 = this.f6727d;
            kdVar2.i();
            yd.D((yd) kdVar2.f4126t, j7);
        }
    }
}
