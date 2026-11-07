package kf;

import cf.d;
import cf.f;
import cf.i;
import cf.l;
import jf.c;

/* loaded from: classes2.dex */
public class a implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final String f16303b = "S";

    /* renamed from: c, reason: collision with root package name */
    public static final String f16304c = "D";

    /* renamed from: a, reason: collision with root package name */
    private final d f16305a;

    public a() {
        this.f16305a = new d();
    }

    @Override // jf.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public d Z() {
        return this.f16305a;
    }

    public pf.a b() {
        d dVar = this.f16305a;
        l lVar = l.C;
        cf.a aVar = (cf.a) dVar.v0(lVar);
        if (aVar == null) {
            aVar = new cf.a();
            i iVar = i.f5441e;
            aVar.g0(iVar);
            aVar.g0(iVar);
            aVar.g0(iVar);
            this.f16305a.O0(lVar, aVar);
        }
        return new pf.a(aVar.D0(), pf.c.f21442b);
    }

    public String c() {
        String strJ0 = this.f16305a.J0(l.f5459d2);
        return strJ0 == null ? f16303b : strJ0;
    }

    public float d() {
        return this.f16305a.F0(l.C2, 1.0f);
    }

    public nf.a e() {
        d dVar = this.f16305a;
        l lVar = l.f5453c0;
        cf.a aVar = (cf.a) dVar.v0(lVar);
        if (aVar == null) {
            aVar = new cf.a();
            aVar.g0(i.f5442f);
            this.f16305a.O0(lVar, aVar);
        }
        cf.a aVar2 = new cf.a();
        aVar2.g0(aVar);
        return new nf.a(aVar2);
    }

    public void f(pf.a aVar) {
        cf.a aVar2;
        if (aVar != null) {
            aVar2 = new cf.a();
            float[] fArr = aVar.f21440a;
            aVar2.f5416b.clear();
            for (float f10 : fArr) {
                aVar2.g0(new f(f10));
            }
        } else {
            aVar2 = null;
        }
        this.f16305a.O0(l.C, aVar2);
    }

    public void g(String str) {
        this.f16305a.R0(l.f5459d2, str);
    }

    public void h(float f10) {
        this.f16305a.M0(l.C2, f10);
    }

    public void i(cf.a aVar) {
        if (aVar == null) {
            aVar = null;
        }
        this.f16305a.O0(l.f5453c0, aVar);
    }

    public a(d dVar) {
        this.f16305a = dVar;
    }
}
