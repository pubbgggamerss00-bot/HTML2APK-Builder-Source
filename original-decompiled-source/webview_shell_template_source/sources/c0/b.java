package c0;

import androidx.constraintlayout.widget.ConstraintLayout;
import b0.e;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<b0.e> f2059a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public final a f2060b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final b0.f f2061c;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public e.a f2062a;

        /* renamed from: b, reason: collision with root package name */
        public e.a f2063b;

        /* renamed from: c, reason: collision with root package name */
        public int f2064c;

        /* renamed from: d, reason: collision with root package name */
        public int f2065d;

        /* renamed from: e, reason: collision with root package name */
        public int f2066e;

        /* renamed from: f, reason: collision with root package name */
        public int f2067f;

        /* renamed from: g, reason: collision with root package name */
        public int f2068g;
        public boolean h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f2069i;

        /* renamed from: j, reason: collision with root package name */
        public int f2070j;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: c0.b$b, reason: collision with other inner class name */
    public interface InterfaceC0025b {
    }

    public b(b0.f fVar) {
        this.f2061c = fVar;
    }

    public final boolean a(int i6, b0.e eVar, InterfaceC0025b interfaceC0025b) {
        e.a[] aVarArr = eVar.U;
        int[] iArr = eVar.f1926t;
        e.a aVar = aVarArr[0];
        a aVar2 = this.f2060b;
        aVar2.f2062a = aVar;
        aVar2.f2063b = aVarArr[1];
        aVar2.f2064c = eVar.q();
        aVar2.f2065d = eVar.k();
        aVar2.f2069i = false;
        aVar2.f2070j = i6;
        e.a aVar3 = aVar2.f2062a;
        e.a aVar4 = e.a.f1934u;
        boolean z6 = aVar3 == aVar4;
        boolean z7 = aVar2.f2063b == aVar4;
        boolean z8 = z6 && eVar.Y > 0.0f;
        boolean z9 = z7 && eVar.Y > 0.0f;
        e.a aVar5 = e.a.s;
        if (z8 && iArr[0] == 4) {
            aVar2.f2062a = aVar5;
        }
        if (z9 && iArr[1] == 4) {
            aVar2.f2063b = aVar5;
        }
        ((ConstraintLayout.b) interfaceC0025b).b(eVar, aVar2);
        eVar.O(aVar2.f2066e);
        eVar.L(aVar2.f2067f);
        eVar.E = aVar2.h;
        eVar.I(aVar2.f2068g);
        aVar2.f2070j = 0;
        return aVar2.f2069i;
    }

    public final void b(b0.f fVar, int i6, int i7, int i8) {
        fVar.getClass();
        int i9 = fVar.f1900d0;
        int i10 = fVar.f1902e0;
        fVar.f1900d0 = 0;
        fVar.f1902e0 = 0;
        fVar.O(i7);
        fVar.L(i8);
        if (i9 < 0) {
            fVar.f1900d0 = 0;
        } else {
            fVar.f1900d0 = i9;
        }
        if (i10 < 0) {
            fVar.f1902e0 = 0;
        } else {
            fVar.f1902e0 = i10;
        }
        b0.f fVar2 = this.f2061c;
        fVar2.f1939u0 = i6;
        fVar2.R();
    }

    public final void c(b0.f fVar) {
        ArrayList<b0.e> arrayList = this.f2059a;
        arrayList.clear();
        int size = fVar.f1981r0.size();
        for (int i6 = 0; i6 < size; i6++) {
            b0.e eVar = fVar.f1981r0.get(i6);
            e.a[] aVarArr = eVar.U;
            e.a aVar = aVarArr[0];
            e.a aVar2 = e.a.f1934u;
            if (aVar == aVar2 || aVarArr[1] == aVar2) {
                arrayList.add(eVar);
            }
        }
        fVar.f1938t0.f2074b = true;
    }
}
