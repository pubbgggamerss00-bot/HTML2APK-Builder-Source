package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dh extends lh {
    public static volatile String h;

    /* renamed from: i, reason: collision with root package name */
    public static final Object f3935i = new Object();

    public dh(dg dgVar, kd kdVar, int i6) {
        super(dgVar, "IDxTpItZJ7MAk3i5HMuj4prUf4vKa3D9/OjYTr4UdlN9pm9gEn8oAVH4br8ui6F4", "/bkPoQedf8H6er/z22s5Ugb2zQK/aJlVqqMiarhu0YY=", kdVar, i6, 1);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void a() {
        kd kdVar = this.f6727d;
        kdVar.i();
        yd.K((yd) kdVar.f4126t, "E");
        if (h == null) {
            synchronized (f3935i) {
                try {
                    if (h == null) {
                        h = (String) this.f6728e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f6727d) {
            kd kdVar2 = this.f6727d;
            String str = h;
            kdVar2.i();
            yd.K((yd) kdVar2.f4126t, str);
        }
    }
}
