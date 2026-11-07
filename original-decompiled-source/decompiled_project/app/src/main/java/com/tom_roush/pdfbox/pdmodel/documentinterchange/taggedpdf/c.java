package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import cf.m;

/* loaded from: classes2.dex */
public class c implements jf.c {

    /* renamed from: a, reason: collision with root package name */
    private final cf.a f6930a;

    public c() {
        cf.a aVar = new cf.a();
        this.f6930a = aVar;
        m mVar = m.f5548c;
        aVar.g0(mVar);
        aVar.g0(mVar);
        aVar.g0(mVar);
        aVar.g0(mVar);
    }

    private pf.d c(int i10) {
        cf.b bVarL0 = this.f6930a.l0(i10);
        if (bVarL0 instanceof cf.a) {
            return new pf.d((cf.a) bVarL0);
        }
        return null;
    }

    private void h(int i10, pf.d dVar) {
        this.f6930a.y0(i10, dVar == null ? m.f5548c : dVar.f21444a);
    }

    @Override // jf.c
    public cf.b Z() {
        return this.f6930a;
    }

    public pf.d a() {
        return c(1);
    }

    public pf.d b() {
        return c(0);
    }

    public pf.d d() {
        return c(3);
    }

    public pf.d e() {
        return c(2);
    }

    public void f(pf.d dVar) {
        h(1, dVar);
    }

    public void g(pf.d dVar) {
        h(0, dVar);
    }

    public void i(pf.d dVar) {
        h(3, dVar);
    }

    public void j(pf.d dVar) {
        h(2, dVar);
    }

    public c(cf.a aVar) {
        this.f6930a = aVar;
        if (aVar.f5416b.size() < 4) {
            for (int size = aVar.f5416b.size() - 1; size < 4; size++) {
                this.f6930a.g0(m.f5548c);
            }
        }
    }
}
