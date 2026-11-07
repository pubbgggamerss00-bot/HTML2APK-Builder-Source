package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import cf.t;
import java.io.IOException;

/* loaded from: classes2.dex */
public class e implements jf.c {

    /* renamed from: b, reason: collision with root package name */
    public static final String f6916b = "OBJR";

    /* renamed from: a, reason: collision with root package name */
    private final cf.d f6917a;

    public e() {
        cf.d dVar = new cf.d();
        this.f6917a = dVar;
        dVar.R0(cf.l.f5532w2, f6916b);
    }

    @Override // jf.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public cf.d Z() {
        return this.f6917a;
    }

    public jf.c b() {
        cf.b bVarV0 = Z().v0(cf.l.f5543z1);
        if (!(bVarV0 instanceof cf.d)) {
            return null;
        }
        try {
            if (bVarV0 instanceof t) {
                return nf.c.a((cf.d) bVarV0);
            }
            cf.d dVar = (cf.d) bVarV0;
            uf.a aVarA = uf.a.a((cf.d) bVarV0);
            if (!(aVarA instanceof uf.k) || cf.l.f5487l.equals(dVar.v0(cf.l.f5532w2))) {
                return aVarA;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public void c(nf.c cVar) {
        Z().P0(cf.l.f5543z1, cVar);
    }

    public void d(uf.a aVar) {
        Z().P0(cf.l.f5543z1, aVar);
    }

    public e(cf.d dVar) {
        this.f6917a = dVar;
    }
}
