package com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent;

import cf.d;
import cf.l;
import java.util.ArrayList;
import java.util.List;
import nf.c;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f6926a;

    /* renamed from: b, reason: collision with root package name */
    private final d f6927b;

    /* renamed from: c, reason: collision with root package name */
    private final List<Object> f6928c;

    public a(l lVar, d dVar) {
        this.f6926a = lVar == null ? null : lVar.f5545b;
        this.f6927b = dVar;
        this.f6928c = new ArrayList();
    }

    public static a d(l lVar, d dVar) {
        return l.f5491m.equals(lVar) ? new com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.a(dVar) : new a(lVar, dVar);
    }

    public void a(a aVar) {
        g().add(aVar);
    }

    public void b(vf.a aVar) {
        g().add(aVar);
    }

    public void c(c cVar) {
        g().add(cVar);
    }

    public String e() {
        if (k() == null) {
            return null;
        }
        return k().K0(l.f5468g);
    }

    public String f() {
        if (k() == null) {
            return null;
        }
        return k().K0(l.f5483k);
    }

    public List<Object> g() {
        return this.f6928c;
    }

    public String h() {
        if (k() == null) {
            return null;
        }
        return k().K0(l.f5515s0);
    }

    public String i() {
        if (k() == null) {
            return null;
        }
        return k().J0(l.f5481j1);
    }

    public int j() {
        if (k() == null) {
            return -1;
        }
        return k().G0(l.f5508q1, null, -1);
    }

    public d k() {
        return this.f6927b;
    }

    public String l() {
        return this.f6926a;
    }

    public String toString() {
        return "tag=" + this.f6926a + ", properties=" + this.f6927b + ", contents=" + this.f6928c;
    }
}
