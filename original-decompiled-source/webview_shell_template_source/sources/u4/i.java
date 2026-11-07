package u4;

import androidx.activity.c0;
import u4.n;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i extends c0 {
    @Override // androidx.activity.c0
    public final void e(n nVar, float f6, float f7) {
        float f8 = f7 * f6;
        nVar.d(f8, 180.0f, 90.0f);
        float f9 = f8 * 2.0f;
        nVar.getClass();
        n.c cVar = new n.c(0.0f, 0.0f, f9, f9);
        cVar.f14686f = 180.0f;
        cVar.f14687g = 90.0f;
        nVar.f14676f.add(cVar);
        n.a aVar = new n.a(cVar);
        float f10 = 180.0f + 90.0f;
        boolean z6 = 90.0f < 0.0f;
        float f11 = z6 ? (180.0f + 180.0f) % 360.0f : 180.0f;
        float f12 = z6 ? (180.0f + f10) % 360.0f : f10;
        nVar.a(f11);
        nVar.f14677g.add(aVar);
        nVar.f14674d = f12;
        double d7 = f10;
        nVar.f14672b = (((f9 - 0.0f) / 2.0f) * ((float) Math.cos(Math.toRadians(d7)))) + ((0.0f + f9) * 0.5f);
        nVar.f14673c = (((f9 - 0.0f) / 2.0f) * ((float) Math.sin(Math.toRadians(d7)))) + ((0.0f + f9) * 0.5f);
    }
}
