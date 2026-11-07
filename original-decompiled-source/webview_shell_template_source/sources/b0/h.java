package b0;

import b0.d;
import b0.e;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h extends e {

    /* renamed from: r0, reason: collision with root package name */
    public float f1965r0 = -1.0f;

    /* renamed from: s0, reason: collision with root package name */
    public int f1966s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public int f1967t0 = -1;

    /* renamed from: u0, reason: collision with root package name */
    public d f1968u0 = this.K;

    /* renamed from: v0, reason: collision with root package name */
    public int f1969v0 = 0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f1970w0;

    public h() {
        this.S.clear();
        this.S.add(this.f1968u0);
        int length = this.R.length;
        for (int i6 = 0; i6 < length; i6++) {
            this.R[i6] = this.f1968u0;
        }
    }

    @Override // b0.e
    public final boolean A() {
        return this.f1970w0;
    }

    @Override // b0.e
    public final boolean B() {
        return this.f1970w0;
    }

    @Override // b0.e
    public final void Q(z.c cVar, boolean z6) {
        if (this.V == null) {
            return;
        }
        d dVar = this.f1968u0;
        cVar.getClass();
        int iN = z.c.n(dVar);
        if (this.f1969v0 == 1) {
            this.f1894a0 = iN;
            this.f1896b0 = 0;
            L(this.V.k());
            O(0);
            return;
        }
        this.f1894a0 = 0;
        this.f1896b0 = iN;
        O(this.V.q());
        L(0);
    }

    public final void R(int i6) {
        this.f1968u0.l(i6);
        this.f1970w0 = true;
    }

    public final void S(int i6) {
        if (this.f1969v0 == i6) {
            return;
        }
        this.f1969v0 = i6;
        ArrayList<d> arrayList = this.S;
        arrayList.clear();
        if (this.f1969v0 == 1) {
            this.f1968u0 = this.J;
        } else {
            this.f1968u0 = this.K;
        }
        arrayList.add(this.f1968u0);
        d[] dVarArr = this.R;
        int length = dVarArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            dVarArr[i7] = this.f1968u0;
        }
    }

    @Override // b0.e
    public final void b(z.c cVar, boolean z6) {
        f fVar = (f) this.V;
        if (fVar == null) {
            return;
        }
        Object objI = fVar.i(d.a.s);
        Object objI2 = fVar.i(d.a.f1887u);
        e eVar = this.V;
        e.a aVar = e.a.f1933t;
        boolean z7 = eVar != null && eVar.U[0] == aVar;
        if (this.f1969v0 == 0) {
            objI = fVar.i(d.a.f1886t);
            objI2 = fVar.i(d.a.f1888v);
            e eVar2 = this.V;
            z7 = eVar2 != null && eVar2.U[1] == aVar;
        }
        if (this.f1970w0) {
            d dVar = this.f1968u0;
            if (dVar.f1880c) {
                z.e eVarK = cVar.k(dVar);
                cVar.d(eVarK, this.f1968u0.d());
                if (this.f1966s0 != -1) {
                    if (z7) {
                        cVar.f(cVar.k(objI2), eVarK, 0, 5);
                    }
                } else if (this.f1967t0 != -1 && z7) {
                    z.e eVarK2 = cVar.k(objI2);
                    cVar.f(eVarK, cVar.k(objI), 0, 5);
                    cVar.f(eVarK2, eVarK, 0, 5);
                }
                this.f1970w0 = false;
                return;
            }
        }
        if (this.f1966s0 != -1) {
            z.e eVarK3 = cVar.k(this.f1968u0);
            cVar.e(eVarK3, cVar.k(objI), this.f1966s0, 8);
            if (z7) {
                cVar.f(cVar.k(objI2), eVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.f1967t0 != -1) {
            z.e eVarK4 = cVar.k(this.f1968u0);
            z.e eVarK5 = cVar.k(objI2);
            cVar.e(eVarK4, eVarK5, -this.f1967t0, 8);
            if (z7) {
                cVar.f(eVarK4, cVar.k(objI), 0, 5);
                cVar.f(eVarK5, eVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.f1965r0 != -1.0f) {
            z.e eVarK6 = cVar.k(this.f1968u0);
            z.e eVarK7 = cVar.k(objI2);
            float f6 = this.f1965r0;
            z.b bVarL = cVar.l();
            bVarL.f15390d.f(eVarK6, -1.0f);
            bVarL.f15390d.f(eVarK7, f6);
            cVar.c(bVarL);
        }
    }

    @Override // b0.e
    public final boolean c() {
        return true;
    }

    @Override // b0.e
    public final d i(d.a aVar) {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                }
            }
            if (this.f1969v0 == 0) {
                return this.f1968u0;
            }
            return null;
        }
        if (this.f1969v0 == 1) {
            return this.f1968u0;
        }
        return null;
    }
}
