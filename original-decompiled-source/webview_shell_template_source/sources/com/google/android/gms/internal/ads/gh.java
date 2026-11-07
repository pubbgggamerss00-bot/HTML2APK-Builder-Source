package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gh extends lh {
    public final StackTraceElement[] h;

    public gh(dg dgVar, kd kdVar, int i6, StackTraceElement[] stackTraceElementArr) {
        super(dgVar, "xFbi3+W8aerwW3eqFbTnh9hURu39XqgquwTPQwngps2D/g9L7GAvkI7gDJEB4z+M", "K8GEBKnLvE9ILfJGB5b9krvXjFIAigM9H8Mu/ozNfRc=", kdVar, i6, 45);
        this.h = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void a() {
        StackTraceElement[] stackTraceElementArr = this.h;
        if (stackTraceElementArr != null) {
            xf xfVar = new xf((String) this.f6728e.invoke(null, stackTraceElementArr));
            synchronized (this.f6727d) {
                try {
                    kd kdVar = this.f6727d;
                    long jLongValue = xfVar.f10552t.longValue();
                    kdVar.i();
                    yd.O((yd) kdVar.f4126t, jLongValue);
                    if (xfVar.f10553u.booleanValue()) {
                        kd kdVar2 = this.f6727d;
                        int i6 = true != xfVar.f10554v.booleanValue() ? 2 : 1;
                        kdVar2.i();
                        yd.q0((yd) kdVar2.f4126t, i6);
                    } else {
                        kd kdVar3 = this.f6727d;
                        kdVar3.i();
                        yd.q0((yd) kdVar3.f4126t, 3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
