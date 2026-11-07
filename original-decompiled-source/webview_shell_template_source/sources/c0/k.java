package c0;

import c0.f;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k extends p {
    @Override // c0.p, c0.d
    public final void a(d dVar) {
        b0.a aVar = (b0.a) this.f2112b;
        int i6 = aVar.f1858t0;
        f fVar = this.h;
        ArrayList arrayList = fVar.f2090l;
        int size = arrayList.size();
        int i7 = 0;
        int i8 = -1;
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            int i10 = ((f) obj).f2086g;
            if (i8 == -1 || i10 < i8) {
                i8 = i10;
            }
            if (i7 < i10) {
                i7 = i10;
            }
        }
        if (i6 == 0 || i6 == 2) {
            fVar.d(i8 + aVar.f1860v0);
        } else {
            fVar.d(i7 + aVar.f1860v0);
        }
    }

    @Override // c0.p
    public final void d() {
        b0.e eVar = this.f2112b;
        if (eVar instanceof b0.a) {
            f fVar = this.h;
            fVar.f2081b = true;
            ArrayList arrayList = fVar.f2090l;
            b0.a aVar = (b0.a) eVar;
            int i6 = aVar.f1858t0;
            boolean z6 = aVar.f1859u0;
            int i7 = 0;
            if (i6 == 0) {
                fVar.f2084e = f.a.f2093v;
                while (i7 < aVar.f1972s0) {
                    b0.e eVar2 = aVar.f1971r0[i7];
                    if (z6 || eVar2.f1909i0 != 8) {
                        f fVar2 = eVar2.f1899d.h;
                        fVar2.f2089k.add(fVar);
                        arrayList.add(fVar2);
                    }
                    i7++;
                }
                m(this.f2112b.f1899d.h);
                m(this.f2112b.f1899d.f2118i);
                return;
            }
            if (i6 == 1) {
                fVar.f2084e = f.a.f2094w;
                while (i7 < aVar.f1972s0) {
                    b0.e eVar3 = aVar.f1971r0[i7];
                    if (z6 || eVar3.f1909i0 != 8) {
                        f fVar3 = eVar3.f1899d.f2118i;
                        fVar3.f2089k.add(fVar);
                        arrayList.add(fVar3);
                    }
                    i7++;
                }
                m(this.f2112b.f1899d.h);
                m(this.f2112b.f1899d.f2118i);
                return;
            }
            if (i6 == 2) {
                fVar.f2084e = f.a.f2095x;
                while (i7 < aVar.f1972s0) {
                    b0.e eVar4 = aVar.f1971r0[i7];
                    if (z6 || eVar4.f1909i0 != 8) {
                        f fVar4 = eVar4.f1901e.h;
                        fVar4.f2089k.add(fVar);
                        arrayList.add(fVar4);
                    }
                    i7++;
                }
                m(this.f2112b.f1901e.h);
                m(this.f2112b.f1901e.f2118i);
                return;
            }
            if (i6 != 3) {
                return;
            }
            fVar.f2084e = f.a.f2096y;
            while (i7 < aVar.f1972s0) {
                b0.e eVar5 = aVar.f1971r0[i7];
                if (z6 || eVar5.f1909i0 != 8) {
                    f fVar5 = eVar5.f1901e.f2118i;
                    fVar5.f2089k.add(fVar);
                    arrayList.add(fVar5);
                }
                i7++;
            }
            m(this.f2112b.f1901e.h);
            m(this.f2112b.f1901e.f2118i);
        }
    }

    @Override // c0.p
    public final void e() {
        b0.e eVar = this.f2112b;
        if (eVar instanceof b0.a) {
            int i6 = ((b0.a) eVar).f1858t0;
            f fVar = this.h;
            if (i6 == 0 || i6 == 1) {
                eVar.f1894a0 = fVar.f2086g;
            } else {
                eVar.f1896b0 = fVar.f2086g;
            }
        }
    }

    @Override // c0.p
    public final void f() {
        this.f2113c = null;
        this.h.c();
    }

    @Override // c0.p
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.h;
        fVar2.f2089k.add(fVar);
        fVar.f2090l.add(fVar2);
    }
}
