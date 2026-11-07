package u4;

import androidx.activity.c0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e extends c0 {
    @Override // androidx.activity.c0
    public final void e(n nVar, float f6, float f7) {
        float f8 = f7 * f6;
        nVar.d(f8, 180.0f, 90.0f);
        double d7 = f8;
        nVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d7), (float) (Math.sin(Math.toRadians(0.0f)) * d7));
    }
}
