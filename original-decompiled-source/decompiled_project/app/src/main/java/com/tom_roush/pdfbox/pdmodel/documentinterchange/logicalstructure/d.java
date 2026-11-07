package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

/* loaded from: classes2.dex */
public class d implements jf.c {

    /* renamed from: b, reason: collision with root package name */
    public static final String f6914b = "MCR";

    /* renamed from: a, reason: collision with root package name */
    private final cf.d f6915a;

    public d() {
        cf.d dVar = new cf.d();
        this.f6915a = dVar;
        dVar.R0(cf.l.f5532w2, f6914b);
    }

    @Override // jf.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public cf.d Z() {
        return this.f6915a;
    }

    public int b() {
        return Z().G0(cf.l.f5508q1, null, -1);
    }

    public hf.d c() {
        cf.d dVar = (cf.d) Z().v0(cf.l.O1);
        if (dVar != null) {
            return new hf.d(dVar);
        }
        return null;
    }

    public void d(int i10) {
        Z().N0(cf.l.f5508q1, i10);
    }

    public void e(hf.d dVar) {
        Z().P0(cf.l.O1, dVar);
    }

    public String toString() {
        return "mcid=" + b();
    }

    public d(cf.d dVar) {
        this.f6915a = dVar;
    }
}
