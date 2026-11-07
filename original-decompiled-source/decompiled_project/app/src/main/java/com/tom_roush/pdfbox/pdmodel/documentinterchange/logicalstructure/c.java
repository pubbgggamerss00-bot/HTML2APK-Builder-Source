package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

/* loaded from: classes2.dex */
public class c implements jf.c {

    /* renamed from: a, reason: collision with root package name */
    private final cf.d f6913a;

    public c() {
        this.f6913a = new cf.d();
    }

    @Override // jf.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public cf.d Z() {
        return this.f6913a;
    }

    public boolean b() {
        cf.d dVar = this.f6913a;
        dVar.getClass();
        return dVar.i0(cf.l.g0("Marked"));
    }

    public boolean c() {
        cf.d dVar = this.f6913a;
        dVar.getClass();
        return dVar.i0(cf.l.g0("Suspects"));
    }

    public void d(boolean z10) {
        cf.d dVar = this.f6913a;
        dVar.getClass();
        dVar.O0(cf.l.g0("Marked"), z10 ? cf.c.f5420e : cf.c.f5421f);
    }

    public void e(boolean z10) {
        cf.d dVar = this.f6913a;
        dVar.getClass();
        dVar.O0(cf.l.g0("Suspects"), cf.c.f5421f);
    }

    public void f(boolean z10) {
        cf.d dVar = this.f6913a;
        dVar.getClass();
        dVar.O0(cf.l.g0(j.f6922c), z10 ? cf.c.f5420e : cf.c.f5421f);
    }

    public boolean g() {
        cf.d dVar = this.f6913a;
        dVar.getClass();
        return dVar.i0(cf.l.g0(j.f6922c));
    }

    public c(cf.d dVar) {
        this.f6913a = dVar;
    }
}
