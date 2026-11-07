package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pg extends lh {

    /* renamed from: i, reason: collision with root package name */
    public static final v31 f8060i = new v31();
    public final Context h;

    public pg(dg dgVar, kd kdVar, int i6, Context context) {
        super(dgVar, "dWdd1c55O832EgswVA7EDPTVX/IpvF08MBnEPy7r0t3O9D/V1qjYDXzsPAH/Vbkj", "bxwXOoEQUxH5XWh5SE6sIt1AlD2mR+aN5LSYX3ZGs5Q=", kdVar, i6, 29);
        this.h = context;
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void a() {
        kd kdVar = this.f6727d;
        kdVar.i();
        yd.N0((yd) kdVar.f4126t, "E");
        AtomicReference atomicReferenceN = f8060i.n(this.h.getPackageName());
        if (atomicReferenceN.get() == null) {
            synchronized (atomicReferenceN) {
                try {
                    if (atomicReferenceN.get() == null) {
                        atomicReferenceN.set((String) this.f6728e.invoke(null, this.h));
                    }
                } finally {
                }
            }
        }
        String str = (String) atomicReferenceN.get();
        synchronized (this.f6727d) {
            kd kdVar2 = this.f6727d;
            String strEncodeToString = Base64.encodeToString(str.getBytes(), 11);
            kdVar2.i();
            yd.N0((yd) kdVar2.f4126t, strEncodeToString);
        }
    }
}
