package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

/* loaded from: classes2.dex */
public class k extends jf.d {

    /* renamed from: b, reason: collision with root package name */
    private final j f6923b;

    public k(j jVar) {
        this.f6923b = jVar;
    }

    private boolean e(Object obj, Object obj2) {
        return obj == null ? obj2 != null : !obj.equals(obj2);
    }

    private void g(Object obj, Object obj2) {
        if (e(obj, obj2)) {
            this.f6923b.q(this);
        }
    }

    public String b() {
        return Z().K0(cf.l.A0);
    }

    public String c() {
        return Z().J0(cf.l.f5527v1);
    }

    public cf.b d() {
        return Z().v0(cf.l.A2);
    }

    @Override // jf.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        j jVar = this.f6923b;
        if (jVar == null) {
            if (kVar.f6923b != null) {
                return false;
            }
        } else if (!jVar.equals(kVar.f6923b)) {
            return false;
        }
        return true;
    }

    public boolean f() {
        return Z().i0(cf.l.R0);
    }

    public void h(String str) {
        g(b(), str);
        Z().S0(cf.l.A0, str);
    }

    @Override // jf.d
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        j jVar = this.f6923b;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public void i(boolean z10) {
        g(Boolean.valueOf(f()), Boolean.valueOf(z10));
        cf.d dVarZ = Z();
        cf.l lVar = cf.l.R0;
        dVarZ.getClass();
        dVarZ.O0(lVar, z10 ? cf.c.f5420e : cf.c.f5421f);
    }

    public void j(String str) {
        g(c(), str);
        Z().R0(cf.l.f5527v1, str);
    }

    public void k(cf.b bVar) {
        g(d(), bVar);
        Z().O0(cf.l.A2, bVar);
    }

    public String toString() {
        return "Name=" + c() + ", Value=" + d() + ", FormattedValue=" + b() + ", Hidden=" + f();
    }

    public k(cf.d dVar, j jVar) {
        super(dVar);
        this.f6923b = jVar;
    }
}
