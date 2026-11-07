package c0;

import b0.d;
import b0.e;
import c0.p;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n extends p {

    /* renamed from: k, reason: collision with root package name */
    public f f2103k;

    /* renamed from: l, reason: collision with root package name */
    public a f2104l;

    @Override // c0.p, c0.d
    public final void a(d dVar) {
        float f6;
        float f7;
        float f8;
        int i6;
        if (this.f2119j.ordinal() == 3) {
            b0.e eVar = this.f2112b;
            l(eVar.K, eVar.M, 1);
            return;
        }
        g gVar = this.f2115e;
        boolean z6 = gVar.f2082c;
        e.a aVar = e.a.f1934u;
        if (z6 && !gVar.f2088j && this.f2114d == aVar) {
            b0.e eVar2 = this.f2112b;
            int i7 = eVar2.s;
            if (i7 == 2) {
                b0.e eVar3 = eVar2.V;
                if (eVar3 != null) {
                    if (eVar3.f1901e.f2115e.f2088j) {
                        gVar.d((int) ((r1.f2086g * eVar2.f1932z) + 0.5f));
                    }
                }
            } else if (i7 == 3) {
                g gVar2 = eVar2.f1899d.f2115e;
                if (gVar2.f2088j) {
                    int i8 = eVar2.Z;
                    if (i8 == -1) {
                        f6 = gVar2.f2086g;
                        f7 = eVar2.Y;
                    } else if (i8 == 0) {
                        f8 = gVar2.f2086g * eVar2.Y;
                        i6 = (int) (f8 + 0.5f);
                        gVar.d(i6);
                    } else if (i8 != 1) {
                        i6 = 0;
                        gVar.d(i6);
                    } else {
                        f6 = gVar2.f2086g;
                        f7 = eVar2.Y;
                    }
                    f8 = f6 / f7;
                    i6 = (int) (f8 + 0.5f);
                    gVar.d(i6);
                }
            }
        }
        f fVar = this.h;
        boolean z7 = fVar.f2082c;
        ArrayList arrayList = fVar.f2090l;
        if (z7) {
            f fVar2 = this.f2118i;
            boolean z8 = fVar2.f2082c;
            ArrayList arrayList2 = fVar2.f2090l;
            if (z8) {
                if (fVar.f2088j && fVar2.f2088j && gVar.f2088j) {
                    return;
                }
                if (!gVar.f2088j && this.f2114d == aVar) {
                    b0.e eVar4 = this.f2112b;
                    if (eVar4.f1925r == 0 && !eVar4.y()) {
                        f fVar3 = (f) arrayList.get(0);
                        f fVar4 = (f) arrayList2.get(0);
                        int i9 = fVar3.f2086g + fVar.f2085f;
                        int i10 = fVar4.f2086g + fVar2.f2085f;
                        fVar.d(i9);
                        fVar2.d(i10);
                        gVar.d(i10 - i9);
                        return;
                    }
                }
                if (!gVar.f2088j && this.f2114d == aVar && this.f2111a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar5 = (f) arrayList.get(0);
                    int i11 = (((f) arrayList2.get(0)).f2086g + fVar2.f2085f) - (fVar5.f2086g + fVar.f2085f);
                    int i12 = gVar.f2098m;
                    if (i11 < i12) {
                        gVar.d(i11);
                    } else {
                        gVar.d(i12);
                    }
                }
                if (gVar.f2088j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar6 = (f) arrayList.get(0);
                    f fVar7 = (f) arrayList2.get(0);
                    int i13 = fVar6.f2086g;
                    int i14 = fVar.f2085f + i13;
                    int i15 = fVar7.f2086g;
                    int i16 = fVar2.f2085f + i15;
                    float f9 = this.f2112b.f1906g0;
                    if (fVar6 == fVar7) {
                        f9 = 0.5f;
                    } else {
                        i13 = i14;
                        i15 = i16;
                    }
                    fVar.d((int) ((((i15 - i13) - gVar.f2086g) * f9) + i13 + 0.5f));
                    fVar2.d(fVar.f2086g + gVar.f2086g);
                }
            }
        }
    }

    @Override // c0.p
    public final void d() {
        b0.e eVar;
        b0.e eVar2;
        b0.e eVar3;
        b0.e eVar4;
        f fVar = this.f2103k;
        b0.e eVar5 = this.f2112b;
        boolean z6 = eVar5.f1893a;
        g gVar = this.f2115e;
        if (z6) {
            gVar.d(eVar5.k());
        }
        boolean z7 = gVar.f2088j;
        ArrayList arrayList = gVar.f2089k;
        ArrayList arrayList2 = gVar.f2090l;
        e.a aVar = e.a.f1935v;
        e.a aVar2 = e.a.s;
        e.a aVar3 = e.a.f1934u;
        f fVar2 = this.f2118i;
        f fVar3 = this.h;
        if (!z7) {
            b0.e eVar6 = this.f2112b;
            this.f2114d = eVar6.U[1];
            if (eVar6.E) {
                this.f2104l = new a(this);
            }
            e.a aVar4 = this.f2114d;
            if (aVar4 != aVar3) {
                if (aVar4 == aVar && (eVar4 = this.f2112b.V) != null && eVar4.U[1] == aVar2) {
                    int iK = (eVar4.k() - this.f2112b.K.e()) - this.f2112b.M.e();
                    p.b(fVar3, eVar4.f1901e.h, this.f2112b.K.e());
                    p.b(fVar2, eVar4.f1901e.f2118i, -this.f2112b.M.e());
                    gVar.d(iK);
                    return;
                }
                if (aVar4 == aVar2) {
                    gVar.d(this.f2112b.k());
                }
            }
        } else if (this.f2114d == aVar && (eVar2 = (eVar = this.f2112b).V) != null && eVar2.U[1] == aVar2) {
            p.b(fVar3, eVar2.f1901e.h, eVar.K.e());
            p.b(fVar2, eVar2.f1901e.f2118i, -this.f2112b.M.e());
            return;
        }
        boolean z8 = gVar.f2088j;
        if (z8) {
            b0.e eVar7 = this.f2112b;
            if (eVar7.f1893a) {
                b0.d[] dVarArr = eVar7.R;
                b0.d dVar = dVarArr[2];
                b0.d dVar2 = dVar.f1883f;
                if (dVar2 != null && dVarArr[3].f1883f != null) {
                    if (eVar7.y()) {
                        fVar3.f2085f = this.f2112b.R[2].e();
                        fVar2.f2085f = -this.f2112b.R[3].e();
                    } else {
                        f fVarH = p.h(this.f2112b.R[2]);
                        if (fVarH != null) {
                            p.b(fVar3, fVarH, this.f2112b.R[2].e());
                        }
                        f fVarH2 = p.h(this.f2112b.R[3]);
                        if (fVarH2 != null) {
                            p.b(fVar2, fVarH2, -this.f2112b.R[3].e());
                        }
                        fVar3.f2081b = true;
                        fVar2.f2081b = true;
                    }
                    b0.e eVar8 = this.f2112b;
                    if (eVar8.E) {
                        p.b(fVar, fVar3, eVar8.f1898c0);
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = p.h(dVar);
                    if (fVarH3 != null) {
                        p.b(fVar3, fVarH3, this.f2112b.R[2].e());
                        p.b(fVar2, fVar3, gVar.f2086g);
                        b0.e eVar9 = this.f2112b;
                        if (eVar9.E) {
                            p.b(fVar, fVar3, eVar9.f1898c0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                b0.d dVar3 = dVarArr[3];
                if (dVar3.f1883f != null) {
                    f fVarH4 = p.h(dVar3);
                    if (fVarH4 != null) {
                        p.b(fVar2, fVarH4, -this.f2112b.R[3].e());
                        p.b(fVar3, fVar2, -gVar.f2086g);
                    }
                    b0.e eVar10 = this.f2112b;
                    if (eVar10.E) {
                        p.b(fVar, fVar3, eVar10.f1898c0);
                        return;
                    }
                    return;
                }
                b0.d dVar4 = dVarArr[4];
                if (dVar4.f1883f != null) {
                    f fVarH5 = p.h(dVar4);
                    if (fVarH5 != null) {
                        p.b(fVar, fVarH5, 0);
                        p.b(fVar3, fVar, -this.f2112b.f1898c0);
                        p.b(fVar2, fVar3, gVar.f2086g);
                        return;
                    }
                    return;
                }
                if ((eVar7 instanceof b0.i) || eVar7.V == null || eVar7.i(d.a.f1890x).f1883f != null) {
                    return;
                }
                b0.e eVar11 = this.f2112b;
                p.b(fVar3, eVar11.V.f1901e.h, eVar11.s());
                p.b(fVar2, fVar3, gVar.f2086g);
                b0.e eVar12 = this.f2112b;
                if (eVar12.E) {
                    p.b(fVar, fVar3, eVar12.f1898c0);
                    return;
                }
                return;
            }
        }
        if (z8 || this.f2114d != aVar3) {
            gVar.b(this);
        } else {
            b0.e eVar13 = this.f2112b;
            int i6 = eVar13.s;
            if (i6 == 2) {
                b0.e eVar14 = eVar13.V;
                if (eVar14 != null) {
                    g gVar2 = eVar14.f1901e.f2115e;
                    arrayList2.add(gVar2);
                    gVar2.f2089k.add(gVar);
                    gVar.f2081b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            } else if (i6 == 3 && !eVar13.y()) {
                b0.e eVar15 = this.f2112b;
                if (eVar15.f1925r != 3) {
                    g gVar3 = eVar15.f1899d.f2115e;
                    arrayList2.add(gVar3);
                    gVar3.f2089k.add(gVar);
                    gVar.f2081b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            }
        }
        b0.e eVar16 = this.f2112b;
        b0.d[] dVarArr2 = eVar16.R;
        b0.d dVar5 = dVarArr2[2];
        b0.d dVar6 = dVar5.f1883f;
        if (dVar6 != null && dVarArr2[3].f1883f != null) {
            if (eVar16.y()) {
                fVar3.f2085f = this.f2112b.R[2].e();
                fVar2.f2085f = -this.f2112b.R[3].e();
            } else {
                f fVarH6 = p.h(this.f2112b.R[2]);
                f fVarH7 = p.h(this.f2112b.R[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.f2119j = p.a.f2120t;
            }
            if (this.f2112b.E) {
                c(fVar, fVar3, 1, this.f2104l);
            }
        } else if (dVar6 != null) {
            f fVarH8 = p.h(dVar5);
            if (fVarH8 != null) {
                p.b(fVar3, fVarH8, this.f2112b.R[2].e());
                c(fVar2, fVar3, 1, gVar);
                if (this.f2112b.E) {
                    c(fVar, fVar3, 1, this.f2104l);
                }
                if (this.f2114d == aVar3) {
                    b0.e eVar17 = this.f2112b;
                    if (eVar17.Y > 0.0f) {
                        l lVar = eVar17.f1899d;
                        if (lVar.f2114d == aVar3) {
                            lVar.f2115e.f2089k.add(gVar);
                            arrayList2.add(this.f2112b.f1899d.f2115e);
                            gVar.f2080a = this;
                        }
                    }
                }
            }
        } else {
            b0.d dVar7 = dVarArr2[3];
            if (dVar7.f1883f != null) {
                f fVarH9 = p.h(dVar7);
                if (fVarH9 != null) {
                    p.b(fVar2, fVarH9, -this.f2112b.R[3].e());
                    c(fVar3, fVar2, -1, gVar);
                    if (this.f2112b.E) {
                        c(fVar, fVar3, 1, this.f2104l);
                    }
                }
            } else {
                b0.d dVar8 = dVarArr2[4];
                if (dVar8.f1883f != null) {
                    f fVarH10 = p.h(dVar8);
                    if (fVarH10 != null) {
                        p.b(fVar, fVarH10, 0);
                        c(fVar3, fVar, -1, this.f2104l);
                        c(fVar2, fVar3, 1, gVar);
                    }
                } else if (!(eVar16 instanceof b0.i) && (eVar3 = eVar16.V) != null) {
                    p.b(fVar3, eVar3.f1901e.h, eVar16.s());
                    c(fVar2, fVar3, 1, gVar);
                    if (this.f2112b.E) {
                        c(fVar, fVar3, 1, this.f2104l);
                    }
                    if (this.f2114d == aVar3) {
                        b0.e eVar18 = this.f2112b;
                        if (eVar18.Y > 0.0f) {
                            l lVar2 = eVar18.f1899d;
                            if (lVar2.f2114d == aVar3) {
                                lVar2.f2115e.f2089k.add(gVar);
                                arrayList2.add(this.f2112b.f1899d.f2115e);
                                gVar.f2080a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            gVar.f2082c = true;
        }
    }

    @Override // c0.p
    public final void e() {
        f fVar = this.h;
        if (fVar.f2088j) {
            this.f2112b.f1896b0 = fVar.f2086g;
        }
    }

    @Override // c0.p
    public final void f() {
        this.f2113c = null;
        this.h.c();
        this.f2118i.c();
        this.f2103k.c();
        this.f2115e.c();
        this.f2117g = false;
    }

    @Override // c0.p
    public final boolean k() {
        return this.f2114d != e.a.f1934u || this.f2112b.s == 0;
    }

    public final void m() {
        this.f2117g = false;
        f fVar = this.h;
        fVar.c();
        fVar.f2088j = false;
        f fVar2 = this.f2118i;
        fVar2.c();
        fVar2.f2088j = false;
        f fVar3 = this.f2103k;
        fVar3.c();
        fVar3.f2088j = false;
        this.f2115e.f2088j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f2112b.f1911j0;
    }
}
