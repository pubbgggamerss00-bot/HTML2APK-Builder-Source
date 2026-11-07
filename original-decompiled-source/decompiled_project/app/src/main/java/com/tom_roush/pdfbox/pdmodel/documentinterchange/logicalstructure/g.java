package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import cf.n;
import cf.o;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public class g extends h {

    /* renamed from: b, reason: collision with root package name */
    public static final String f6919b = "StructElem";

    public g(String str, h hVar) {
        super(f6919b);
        f0(str);
        d0(hVar);
    }

    private Map<String, Object> G() {
        i iVarI = I();
        if (iVarI != null) {
            return iVarI.v();
        }
        return null;
    }

    private i I() {
        h hVarE = E();
        while (hVarE instanceof g) {
            hVarE = ((g) hVarE).E();
        }
        if (hVarE instanceof i) {
            return (i) hVarE;
        }
        return null;
    }

    public String A() {
        return Z().K0(cf.l.V0);
    }

    public String B() {
        return Z().K0(cf.l.f5515s0);
    }

    public String C() {
        return Z().K0(cf.l.f5481j1);
    }

    public hf.d D() {
        cf.b bVarV0 = Z().v0(cf.l.O1);
        if (bVarV0 instanceof cf.d) {
            return new hf.d((cf.d) bVarV0);
        }
        return null;
    }

    public h E() {
        cf.b bVarV0 = Z().v0(cf.l.G1);
        if (bVarV0 instanceof cf.d) {
            return h.d((cf.d) bVarV0);
        }
        return null;
    }

    public int F() {
        return Z().G0(cf.l.T1, null, 0);
    }

    public String H() {
        String strJ = J();
        if (G().containsKey(strJ)) {
            Object obj = G().get(strJ);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return strJ;
    }

    public String J() {
        return Z().J0(cf.l.f5459d2);
    }

    public String K() {
        return Z().K0(cf.l.f5517s2);
    }

    public void L() {
        e0(F() + 1);
    }

    public void M(cf.i iVar, Object obj) {
        j(iVar, obj);
    }

    public void N(d dVar, Object obj) {
        l(dVar, obj);
    }

    public void O(e eVar, Object obj) {
        l(eVar, obj);
    }

    public void P(a aVar) {
        cf.l lVar = cf.l.f5464f;
        cf.b bVarV0 = Z().v0(lVar);
        if (bVarV0 instanceof cf.a) {
            cf.a aVar2 = (cf.a) bVarV0;
            aVar2.v0(aVar.Z());
            if (aVar2.f5416b.size() == 2 && aVar2.k0(1, -1) == 0) {
                Z().O0(lVar, aVar2.l0(0));
            }
        } else {
            if (bVarV0 instanceof o) {
                bVarV0 = ((o) bVarV0).f5549b;
            }
            if (aVar.Z().equals(bVarV0)) {
                Z().L0(lVar);
            }
        }
        aVar.l(null);
    }

    public void Q(String str) {
        if (str == null) {
            return;
        }
        cf.l lVar = cf.l.C;
        cf.b bVarV0 = Z().v0(lVar);
        cf.l lVarG0 = cf.l.g0(str);
        if (!(bVarV0 instanceof cf.a)) {
            if (bVarV0 instanceof o) {
                bVarV0 = ((o) bVarV0).f5549b;
            }
            if (lVarG0.equals(bVarV0)) {
                Z().L0(lVar);
                return;
            }
            return;
        }
        cf.a aVar = (cf.a) bVarV0;
        aVar.v0(lVarG0);
        if (aVar.f5416b.size() == 2 && aVar.k0(1, -1) == 0) {
            Z().O0(lVar, aVar.l0(0));
        }
    }

    public void R(cf.i iVar) {
        m(iVar);
    }

    public void S(d dVar) {
        o(dVar);
    }

    public void T(e eVar) {
        o(eVar);
    }

    public void U(String str) {
        Z().S0(cf.l.f5468g, str);
    }

    public void V(String str) {
        Z().S0(cf.l.f5483k, str);
    }

    public void W(l<a> lVar) {
        cf.l lVar2 = cf.l.f5464f;
        if (lVar.g() == 1 && lVar.d(0) == 0) {
            a aVarB = lVar.b(0);
            aVarB.l(this);
            Z().P0(lVar2, aVarB);
            return;
        }
        cf.a aVar = new cf.a();
        for (int i10 = 0; i10 < lVar.g(); i10++) {
            a aVarB2 = lVar.b(i10);
            aVarB2.l(this);
            int iD = lVar.d(i10);
            if (iD < 0) {
                throw new IllegalArgumentException("The revision number shall be > -1");
            }
            aVar.f5416b.add(aVarB2.Z());
            aVar.g0(cf.i.q0(iD));
        }
        Z().O0(lVar2, aVar);
    }

    public void X(l<String> lVar) {
        if (lVar == null) {
            return;
        }
        cf.l lVar2 = cf.l.C;
        if (lVar.g() == 1 && lVar.d(0) == 0) {
            Z().R0(lVar2, lVar.b(0));
            return;
        }
        cf.a aVar = new cf.a();
        for (int i10 = 0; i10 < lVar.g(); i10++) {
            String strB = lVar.b(i10);
            int iD = lVar.d(i10);
            if (iD < 0) {
                throw new IllegalArgumentException("The revision number shall be > -1");
            }
            aVar.g0(cf.l.g0(strB));
            aVar.g0(cf.i.q0(iD));
        }
        Z().O0(lVar2, aVar);
    }

    public void Y(String str) {
        Z().S0(cf.l.V0, str);
    }

    public void a0(String str) {
        Z().S0(cf.l.f5515s0, str);
    }

    public void b0(String str) {
        Z().S0(cf.l.f5481j1, str);
    }

    public void c0(hf.d dVar) {
        Z().P0(cf.l.O1, dVar);
    }

    public final void d0(h hVar) {
        Z().P0(cf.l.G1, hVar);
    }

    public void e0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("The revision number shall be > -1");
        }
        Z().N0(cf.l.T1, i10);
    }

    public final void f0(String str) {
        Z().R0(cf.l.f5459d2, str);
    }

    public void g0(String str) {
        Z().S0(cf.l.f5517s2, str);
    }

    public void q(a aVar) {
        cf.a aVar2;
        cf.l lVar = cf.l.f5464f;
        aVar.l(this);
        cf.b bVarV0 = Z().v0(lVar);
        if (bVarV0 instanceof cf.a) {
            aVar2 = (cf.a) bVarV0;
        } else {
            cf.a aVar3 = new cf.a();
            if (bVarV0 != null) {
                aVar3.g0(bVarV0);
                aVar3.g0(cf.i.q0(0L));
            }
            aVar2 = aVar3;
        }
        Z().O0(lVar, aVar2);
        aVar2.f5416b.add(aVar.Z());
        aVar2.g0(cf.i.q0(F()));
    }

    public void r(String str) {
        cf.a aVar;
        if (str == null) {
            return;
        }
        cf.l lVar = cf.l.C;
        cf.b bVarV0 = Z().v0(lVar);
        if (bVarV0 instanceof cf.a) {
            aVar = (cf.a) bVarV0;
        } else {
            cf.a aVar2 = new cf.a();
            if (bVarV0 != null) {
                aVar2.g0(bVarV0);
                aVar2.g0(cf.i.q0(0L));
            }
            aVar = aVar2;
        }
        Z().O0(lVar, aVar);
        aVar.g0(cf.l.g0(str));
        aVar.g0(cf.i.q0(F()));
    }

    public void s(d dVar) {
        c(dVar);
    }

    public void t(e eVar) {
        c(eVar);
    }

    public void u(com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.a aVar) {
        if (aVar == null) {
            return;
        }
        a(cf.i.q0(aVar.j()));
    }

    public void v(a aVar) {
        cf.l lVar = cf.l.f5464f;
        cf.b bVarV0 = Z().v0(lVar);
        if (!(bVarV0 instanceof cf.a)) {
            cf.a aVar2 = new cf.a();
            aVar2.g0(bVarV0);
            aVar2.g0(cf.i.q0(F()));
            Z().O0(lVar, aVar2);
            return;
        }
        cf.a aVar3 = (cf.a) bVarV0;
        for (int i10 = 0; i10 < aVar3.f5416b.size(); i10++) {
            if (aVar3.l0(i10).equals(aVar.Z())) {
                int i11 = i10 + 1;
                if (aVar3.i0(i11) instanceof cf.i) {
                    aVar3.y0(i11, cf.i.q0(F()));
                }
            }
        }
    }

    public String w() {
        return Z().K0(cf.l.f5468g);
    }

    public String x() {
        return Z().K0(cf.l.f5483k);
    }

    public l<a> y() {
        l<a> lVar = new l<>();
        cf.b bVarV0 = Z().v0(cf.l.f5464f);
        if (bVarV0 instanceof cf.a) {
            ArrayList arrayList = ((cf.a) bVarV0).f5416b;
            int size = arrayList.size();
            a aVarD = null;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                cf.b bVar = (cf.b) obj;
                if (bVar instanceof o) {
                    bVar = ((o) bVar).f5549b;
                }
                if (bVar instanceof cf.d) {
                    aVarD = a.d((cf.d) bVar);
                    aVarD.l(this);
                    lVar.a(aVarD, 0);
                } else if (bVar instanceof cf.i) {
                    lVar.f(aVarD, ((n) bVar).k0());
                }
            }
        }
        if (bVarV0 instanceof cf.d) {
            a aVarD2 = a.d((cf.d) bVarV0);
            aVarD2.l(this);
            lVar.a(aVarD2, 0);
        }
        return lVar;
    }

    public l<String> z() {
        cf.l lVar = cf.l.C;
        l<String> lVar2 = new l<>();
        cf.b bVarV0 = Z().v0(lVar);
        if (bVarV0 instanceof cf.l) {
            lVar2.a(((cf.l) bVarV0).f5545b, 0);
        }
        if (bVarV0 instanceof cf.a) {
            ArrayList arrayList = ((cf.a) bVarV0).f5416b;
            int size = arrayList.size();
            String str = null;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                cf.b bVar = (cf.b) obj;
                if (bVar instanceof o) {
                    bVar = ((o) bVar).f5549b;
                }
                if (bVar instanceof cf.l) {
                    str = ((cf.l) bVar).f5545b;
                    lVar2.a(str, 0);
                } else if (bVar instanceof cf.i) {
                    lVar2.f(str, (int) ((cf.i) bVar).f5445b);
                }
            }
        }
        return lVar2;
    }

    public g(cf.d dVar) {
        super(dVar);
    }
}
