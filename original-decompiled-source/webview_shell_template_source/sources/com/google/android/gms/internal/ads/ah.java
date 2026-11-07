package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ah extends lh {
    public final xj0 h;

    public ah(dg dgVar, kd kdVar, int i6, xj0 xj0Var) {
        super(dgVar, "nIerOxKbHFkrAwaPfnOcaC2yUxDu3vgr+V6+Lz8BbuDzBx+zj9iucf6iyn5uQniV", "dvq2wU3xdgVVjZT9gC/0PMuBLs8WhmySJmrq8zzkkwM=", kdVar, i6, 94);
        this.h = xj0Var;
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void a() {
        Method method = this.f6728e;
        xj0 xj0Var = this.h;
        List list = (List) xj0Var.f10617t;
        xj0Var.f10617t = Collections.EMPTY_LIST;
        int iIntValue = ((Integer) method.invoke(null, list)).intValue();
        synchronized (this.f6727d) {
            kd kdVar = this.f6727d;
            int iE = bq.e(iIntValue);
            kdVar.i();
            yd.s0((yd) kdVar.f4126t, iE);
        }
    }
}
