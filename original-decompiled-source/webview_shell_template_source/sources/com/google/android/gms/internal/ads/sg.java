package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sg extends lh {
    public static volatile Long h;

    /* renamed from: i, reason: collision with root package name */
    public static final Object f8921i = new Object();

    public sg(dg dgVar, kd kdVar, int i6) {
        super(dgVar, "bOzndz3UfjWA1SOXZmjVl3/OkFAGVqfkIFIBgylpbuzJ4v1NDammFGLj1en8A5TJ", "UcBsIyWJ1ILWxlv+9MafJ7lcNPMojMcMoBQJnzvSyQQ=", kdVar, i6, 44);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void a() {
        if (h == null) {
            synchronized (f8921i) {
                try {
                    if (h == null) {
                        h = (Long) this.f6728e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f6727d) {
            kd kdVar = this.f6727d;
            long jLongValue = h.longValue();
            kdVar.i();
            yd.O0((yd) kdVar.f4126t, jLongValue);
        }
    }
}
