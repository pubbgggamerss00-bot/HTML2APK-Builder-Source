package com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent;

import cf.d;
import cf.l;
import jf.c;

/* loaded from: classes2.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    protected final d f6929a;

    public b() {
        this.f6929a = new d();
    }

    public static b a(d dVar) {
        cf.b bVarH0 = dVar.H0(l.f5532w2);
        if (l.B1.equals(bVarH0)) {
            sf.a aVar = new sf.a(dVar);
            cf.b bVarH02 = dVar.H0(l.f5532w2);
            l lVar = l.B1;
            if (bVarH02.equals(lVar)) {
                return aVar;
            }
            throw new IllegalArgumentException("Provided dictionary is not of type '" + lVar + "'");
        }
        if (!l.C1.equals(bVarH0)) {
            return new b(dVar);
        }
        sf.b bVar = new sf.b(dVar);
        cf.b bVarH03 = dVar.H0(l.f5532w2);
        l lVar2 = l.C1;
        if (bVarH03.equals(lVar2)) {
            return bVar;
        }
        throw new IllegalArgumentException("Provided dictionary is not of type '" + lVar2 + "'");
    }

    @Override // jf.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d Z() {
        return this.f6929a;
    }

    public b(d dVar) {
        this.f6929a = dVar;
    }
}
