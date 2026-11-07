package c0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j extends p {
    @Override // c0.p, c0.d
    public final void a(d dVar) {
        f fVar = this.h;
        if (fVar.f2082c && !fVar.f2088j) {
            fVar.d((int) ((((f) fVar.f2090l.get(0)).f2086g * ((b0.h) this.f2112b).f1965r0) + 0.5f));
        }
    }

    @Override // c0.p
    public final void d() {
        b0.e eVar = this.f2112b;
        b0.h hVar = (b0.h) eVar;
        int i6 = hVar.f1966s0;
        int i7 = hVar.f1967t0;
        int i8 = hVar.f1969v0;
        f fVar = this.h;
        if (i8 == 1) {
            if (i6 != -1) {
                fVar.f2090l.add(eVar.V.f1899d.h);
                this.f2112b.V.f1899d.h.f2089k.add(fVar);
                fVar.f2085f = i6;
            } else if (i7 != -1) {
                fVar.f2090l.add(eVar.V.f1899d.f2118i);
                this.f2112b.V.f1899d.f2118i.f2089k.add(fVar);
                fVar.f2085f = -i7;
            } else {
                fVar.f2081b = true;
                fVar.f2090l.add(eVar.V.f1899d.f2118i);
                this.f2112b.V.f1899d.f2118i.f2089k.add(fVar);
            }
            m(this.f2112b.f1899d.h);
            m(this.f2112b.f1899d.f2118i);
            return;
        }
        if (i6 != -1) {
            fVar.f2090l.add(eVar.V.f1901e.h);
            this.f2112b.V.f1901e.h.f2089k.add(fVar);
            fVar.f2085f = i6;
        } else if (i7 != -1) {
            fVar.f2090l.add(eVar.V.f1901e.f2118i);
            this.f2112b.V.f1901e.f2118i.f2089k.add(fVar);
            fVar.f2085f = -i7;
        } else {
            fVar.f2081b = true;
            fVar.f2090l.add(eVar.V.f1901e.f2118i);
            this.f2112b.V.f1901e.f2118i.f2089k.add(fVar);
        }
        m(this.f2112b.f1901e.h);
        m(this.f2112b.f1901e.f2118i);
    }

    @Override // c0.p
    public final void e() {
        b0.e eVar = this.f2112b;
        int i6 = ((b0.h) eVar).f1969v0;
        f fVar = this.h;
        if (i6 == 1) {
            eVar.f1894a0 = fVar.f2086g;
        } else {
            eVar.f1896b0 = fVar.f2086g;
        }
    }

    @Override // c0.p
    public final void f() {
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
