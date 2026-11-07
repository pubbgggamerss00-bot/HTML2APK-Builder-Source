package b0;

import c0.o;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class i extends e {

    /* renamed from: r0, reason: collision with root package name */
    public e[] f1971r0 = new e[4];

    /* renamed from: s0, reason: collision with root package name */
    public int f1972s0 = 0;

    public final void R(int i6, o oVar, ArrayList arrayList) {
        for (int i7 = 0; i7 < this.f1972s0; i7++) {
            e eVar = this.f1971r0[i7];
            ArrayList<e> arrayList2 = oVar.f2106a;
            if (!arrayList2.contains(eVar)) {
                arrayList2.add(eVar);
            }
        }
        for (int i8 = 0; i8 < this.f1972s0; i8++) {
            c0.i.a(this.f1971r0[i8], i6, arrayList, oVar);
        }
    }

    public void S() {
    }
}
