package c0;

import c0.f;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f2098m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f2084e = f.a.f2091t;
        } else {
            this.f2084e = f.a.f2092u;
        }
    }

    @Override // c0.f
    public final void d(int i6) {
        if (this.f2088j) {
            return;
        }
        this.f2088j = true;
        this.f2086g = i6;
        ArrayList arrayList = this.f2089k;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }
}
