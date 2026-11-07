package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hh extends lh {
    public final jg h;

    /* renamed from: i, reason: collision with root package name */
    public final long f5386i;

    public hh(dg dgVar, kd kdVar, int i6, jg jgVar) {
        super(dgVar, "IhZL/A+AP3q6BJHYZzhe50ZZY+joh9QA4Yw9iPAZ5epuj4PBIlbCfCRKNYc+Lpx6", "aH+LkkSrrb3t9z/9chsxYBmeH34qaSymsmB0IYlZ8kA=", kdVar, i6, 53);
        this.h = jgVar;
        if (jgVar != null) {
            if (jgVar.D <= -2) {
                WeakReference weakReference = jgVar.f6059z;
                if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                    jgVar.D = -3L;
                }
            }
            this.f5386i = jgVar.D;
        }
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void a() {
        if (this.h != null) {
            long jLongValue = ((Long) this.f6728e.invoke(null, Long.valueOf(this.f5386i))).longValue();
            kd kdVar = this.f6727d;
            kdVar.i();
            yd.Y((yd) kdVar.f4126t, jLongValue);
        }
    }
}
