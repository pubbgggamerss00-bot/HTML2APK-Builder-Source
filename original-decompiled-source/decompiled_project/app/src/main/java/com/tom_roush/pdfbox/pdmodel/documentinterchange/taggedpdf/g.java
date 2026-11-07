package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import cf.l;
import cf.n;
import cf.u;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class g extends com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a {

    /* renamed from: c, reason: collision with root package name */
    protected static final float f6999c = -1.0f;

    public g() {
    }

    public void A(String str, float[] fArr) {
        cf.a aVar = new cf.a();
        for (float f10 : fArr) {
            aVar.g0(new cf.f(f10));
        }
        cf.b bVarD0 = Z().D0(str);
        cf.d dVarZ = Z();
        dVarZ.getClass();
        dVarZ.O0(l.g0(str), aVar);
        j(bVarD0, Z().D0(str));
    }

    public void B(String str, String[] strArr) {
        cf.b bVarD0 = Z().D0(str);
        cf.a aVar = new cf.a();
        for (String str2 : strArr) {
            aVar.g0(new u(str2));
        }
        cf.d dVarZ = Z();
        dVarZ.getClass();
        dVarZ.O0(l.g0(str), aVar);
        j(bVarD0, Z().D0(str));
    }

    public void C(String str, pf.d dVar) {
        cf.b bVarD0 = Z().D0(str);
        cf.d dVarZ = Z();
        dVarZ.getClass();
        dVarZ.P0(l.g0(str), dVar);
        j(bVarD0, dVar == null ? null : dVar.f21444a);
    }

    public void D(String str, c cVar) {
        cf.b bVarD0 = Z().D0(str);
        cf.d dVarZ = Z();
        dVarZ.getClass();
        dVarZ.P0(l.g0(str), cVar);
        j(bVarD0, cVar == null ? null : cVar.Z());
    }

    public void E(String str, int i10) {
        cf.b bVarD0 = Z().D0(str);
        cf.d dVarZ = Z();
        dVarZ.getClass();
        dVarZ.N0(l.g0(str), i10);
        j(bVarD0, Z().D0(str));
    }

    public void F(String str, String str2) {
        cf.b bVarD0 = Z().D0(str);
        cf.d dVarZ = Z();
        dVarZ.getClass();
        dVarZ.R0(l.g0(str), str2);
        j(bVarD0, Z().D0(str));
    }

    public void G(String str, float f10) {
        cf.b bVarD0 = Z().D0(str);
        cf.d dVarZ = Z();
        dVarZ.getClass();
        dVarZ.M0(l.g0(str), f10);
        j(bVarD0, Z().D0(str));
    }

    public void H(String str, int i10) {
        cf.b bVarD0 = Z().D0(str);
        cf.d dVarZ = Z();
        dVarZ.getClass();
        dVarZ.N0(l.g0(str), i10);
        j(bVarD0, Z().D0(str));
    }

    public void I(String str, String str2) {
        cf.b bVarD0 = Z().D0(str);
        cf.d dVarZ = Z();
        dVarZ.getClass();
        dVarZ.S0(l.g0(str), str2);
        j(bVarD0, Z().D0(str));
    }

    public String[] m(String str) {
        cf.b bVarD0 = Z().D0(str);
        if (!(bVarD0 instanceof cf.a)) {
            return null;
        }
        cf.a aVar = (cf.a) bVarD0;
        ArrayList arrayList = aVar.f5416b;
        String[] strArr = new String[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            strArr[i10] = ((l) aVar.l0(i10)).f5545b;
        }
        return strArr;
    }

    public pf.d n(String str) {
        cf.a aVar = (cf.a) Z().D0(str);
        if (aVar != null) {
            return new pf.d(aVar);
        }
        return null;
    }

    public Object o(String str) {
        cf.a aVar = (cf.a) Z().D0(str);
        if (aVar == null) {
            return null;
        }
        ArrayList arrayList = aVar.f5416b;
        if (arrayList.size() == 3) {
            return new pf.d(aVar);
        }
        if (arrayList.size() == 4) {
            return new c(aVar);
        }
        return null;
    }

    public int p(String str, int i10) {
        cf.d dVarZ = Z();
        dVarZ.getClass();
        return dVarZ.G0(l.g0(str), null, i10);
    }

    public String q(String str) {
        cf.d dVarZ = Z();
        dVarZ.getClass();
        return dVarZ.J0(l.g0(str));
    }

    public String r(String str, String str2) {
        cf.d dVarZ = Z();
        dVarZ.getClass();
        String strJ0 = dVarZ.J0(l.g0(str));
        return strJ0 == null ? str2 : strJ0;
    }

    public Object s(String str, String str2) {
        cf.b bVarD0 = Z().D0(str);
        if (!(bVarD0 instanceof cf.a)) {
            return bVarD0 instanceof l ? ((l) bVarD0).f5545b : str2;
        }
        cf.a aVar = (cf.a) bVarD0;
        ArrayList arrayList = aVar.f5416b;
        String[] strArr = new String[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            cf.b bVarL0 = aVar.l0(i10);
            if (bVarL0 instanceof l) {
                strArr[i10] = ((l) bVarL0).f5545b;
            }
        }
        return strArr;
    }

    public float t(String str) {
        cf.d dVarZ = Z();
        dVarZ.getClass();
        return dVarZ.F0(l.g0(str), f6999c);
    }

    public float u(String str, float f10) {
        cf.d dVarZ = Z();
        dVarZ.getClass();
        return dVarZ.F0(l.g0(str), f10);
    }

    public Object v(String str, float f10) {
        cf.b bVarD0 = Z().D0(str);
        if (!(bVarD0 instanceof cf.a)) {
            if (bVarD0 instanceof n) {
                return Float.valueOf(((n) bVarD0).g0());
            }
            if (f10 == f6999c) {
                return null;
            }
            return Float.valueOf(f10);
        }
        cf.a aVar = (cf.a) bVarD0;
        ArrayList arrayList = aVar.f5416b;
        float[] fArr = new float[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            cf.b bVarL0 = aVar.l0(i10);
            if (bVarL0 instanceof n) {
                fArr[i10] = ((n) bVarL0).g0();
            }
        }
        return fArr;
    }

    public Object w(String str, String str2) {
        cf.b bVarD0 = Z().D0(str);
        return bVarD0 instanceof n ? Float.valueOf(((n) bVarD0).g0()) : bVarD0 instanceof l ? ((l) bVarD0).f5545b : str2;
    }

    public String x(String str) {
        cf.d dVarZ = Z();
        dVarZ.getClass();
        return dVarZ.K0(l.g0(str));
    }

    public boolean y(String str) {
        return Z().D0(str) != null;
    }

    public void z(String str, String[] strArr) {
        cf.b bVarD0 = Z().D0(str);
        cf.a aVar = new cf.a();
        for (String str2 : strArr) {
            aVar.g0(l.g0(str2));
        }
        cf.d dVarZ = Z();
        dVarZ.getClass();
        dVarZ.O0(l.g0(str), aVar);
        j(bVarD0, Z().D0(str));
    }

    public g(cf.d dVar) {
        super(dVar);
    }
}
