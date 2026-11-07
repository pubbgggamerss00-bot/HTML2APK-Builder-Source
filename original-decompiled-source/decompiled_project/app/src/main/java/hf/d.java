package hf;

import android.util.Log;
import cf.l;
import cf.n;
import cf.t;

/* loaded from: classes2.dex */
public final class d implements jf.c {

    /* renamed from: a, reason: collision with root package name */
    public final cf.d f13007a;

    /* renamed from: b, reason: collision with root package name */
    public g f13008b;

    /* renamed from: c, reason: collision with root package name */
    public final a f13009c;

    /* renamed from: d, reason: collision with root package name */
    public jf.g f13010d;

    public d() {
        this(jf.g.f15717b);
    }

    @Override // jf.c
    public final cf.b Z() {
        return this.f13007a;
    }

    public final jf.g a() {
        cf.b bVarA = f.a(l.f5447a0, this.f13007a);
        if (!(bVarA instanceof cf.a)) {
            return b();
        }
        jf.g gVar = new jf.g((cf.a) bVarA);
        jf.g gVarB = b();
        jf.g gVar2 = new jf.g();
        float fA = gVarB.a();
        cf.a aVar = gVarB.f15718a;
        cf.f fVar = new cf.f(Math.max(fA, gVar.a()));
        cf.a aVar2 = gVar2.f15718a;
        aVar2.y0(0, fVar);
        aVar2.y0(1, new cf.f(Math.max(gVarB.b(), gVar.b())));
        float fG0 = ((n) aVar.i0(2)).g0();
        cf.a aVar3 = gVar.f15718a;
        aVar2.y0(2, new cf.f(Math.min(fG0, ((n) aVar3.i0(2)).g0())));
        aVar2.y0(3, new cf.f(Math.min(((n) aVar.i0(3)).g0(), ((n) aVar3.i0(3)).g0())));
        return gVar2;
    }

    public final jf.g b() {
        if (this.f13010d == null) {
            cf.b bVarA = f.a(l.f5512r1, this.f13007a);
            if (bVarA instanceof cf.a) {
                this.f13010d = new jf.g((cf.a) bVarA);
            } else {
                Log.d("PdfBox-Android", "Can't find MediaBox, will use U.S. Letter");
                this.f13010d = jf.g.f15717b;
            }
        }
        return this.f13010d;
    }

    public final g c() {
        if (this.f13008b == null) {
            cf.b bVarA = f.a(l.W1, this.f13007a);
            if (bVarA instanceof cf.d) {
                this.f13008b = new g((cf.d) bVarA, this.f13009c);
            }
        }
        return this.f13008b;
    }

    public final int d() {
        cf.b bVarA = f.a(l.Z1, this.f13007a);
        if (!(bVarA instanceof n)) {
            return 0;
        }
        int iK0 = ((n) bVarA).k0();
        if (iK0 % 90 == 0) {
            return ((iK0 % 360) + 360) % 360;
        }
        return 0;
    }

    public final boolean e() {
        cf.b bVarV0 = this.f13007a.v0(l.W);
        return bVarV0 instanceof t ? ((t) bVarV0).f5423b.size() > 0 : (bVarV0 instanceof cf.a) && ((cf.a) bVarV0).f5416b.size() > 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f13007a == this.f13007a;
    }

    public final int hashCode() {
        return this.f13007a.hashCode();
    }

    public d(jf.g gVar) {
        cf.d dVar = new cf.d();
        this.f13007a = dVar;
        dVar.O0(l.f5532w2, l.H1);
        dVar.P0(l.f5512r1, gVar);
    }

    public d(cf.d dVar) {
        this.f13007a = dVar;
    }

    public d(cf.d dVar, a aVar) {
        this.f13007a = dVar;
        this.f13009c = aVar;
    }
}
