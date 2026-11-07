package l0;

import f3.r;
import i0.a3;
import java.util.List;
import l0.c;
import org.bouncycastle.asn1.cmc.BodyPartID;
import qg.n0;
import qg.z;
import t2.b;
import t2.g0;
import t2.h0;
import t2.l0;
import t2.m;
import t2.u;
import x2.f;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public t2.b f16575a;

    /* renamed from: b, reason: collision with root package name */
    public f.a f16576b;

    /* renamed from: c, reason: collision with root package name */
    public int f16577c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16578d;

    /* renamed from: e, reason: collision with root package name */
    public int f16579e;

    /* renamed from: f, reason: collision with root package name */
    public int f16580f;

    /* renamed from: g, reason: collision with root package name */
    public List<b.c<u>> f16581g;

    /* renamed from: h, reason: collision with root package name */
    public c f16582h;

    /* renamed from: j, reason: collision with root package name */
    public f3.d f16584j;

    /* renamed from: k, reason: collision with root package name */
    public l0 f16585k;

    /* renamed from: l, reason: collision with root package name */
    public m f16586l;

    /* renamed from: m, reason: collision with root package name */
    public r f16587m;

    /* renamed from: n, reason: collision with root package name */
    public h0 f16588n;

    /* renamed from: i, reason: collision with root package name */
    public long f16583i = a.f16563a;

    /* renamed from: o, reason: collision with root package name */
    public int f16589o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f16590p = -1;

    public e(t2.b bVar, l0 l0Var, f.a aVar, int i10, boolean z10, int i11, int i12, List list) {
        this.f16575a = bVar;
        this.f16576b = aVar;
        this.f16577c = i10;
        this.f16578d = z10;
        this.f16579e = i11;
        this.f16580f = i12;
        this.f16581g = list;
        this.f16585k = l0Var;
    }

    public final int a(int i10, r rVar) {
        int i11 = this.f16589o;
        int i12 = this.f16590p;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        long jA = f3.c.a(0, i10, 0, Integer.MAX_VALUE);
        if (this.f16580f > 1) {
            c cVar = this.f16582h;
            l0 l0Var = this.f16585k;
            f3.d dVar = this.f16584j;
            kotlin.jvm.internal.r.b(dVar);
            c cVarA = c.a.a(cVar, rVar, l0Var, dVar, this.f16576b);
            this.f16582h = cVarA;
            jA = cVarA.a(this.f16580f, jA);
        }
        int iA = a3.a(b(jA, rVar).f27847e);
        int iJ = f3.b.j(jA);
        if (iA < iJ) {
            iA = iJ;
        }
        this.f16589o = i10;
        this.f16590p = iA;
        return iA;
    }

    public final t2.l b(long j10, r rVar) {
        m mVarD = d(rVar);
        long jA = b.a(j10, this.f16578d, this.f16577c, mVarD.c());
        boolean z10 = this.f16578d;
        int i10 = this.f16577c;
        int i11 = this.f16579e;
        return new t2.l(mVarD, jA, ((z10 || !(i10 == 2 || i10 == 4 || i10 == 5)) && i11 >= 1) ? i11 : 1, i10);
    }

    public final void c(f3.d dVar) {
        long jA;
        f3.d dVar2 = this.f16584j;
        if (dVar != null) {
            int i10 = a.f16564b;
            jA = a.a(dVar.getDensity(), dVar.G0());
        } else {
            jA = a.f16563a;
        }
        if (dVar2 == null) {
            this.f16584j = dVar;
            this.f16583i = jA;
        } else if (dVar == null || this.f16583i != jA) {
            this.f16584j = dVar;
            this.f16583i = jA;
            this.f16586l = null;
            this.f16588n = null;
            this.f16590p = -1;
            this.f16589o = -1;
        }
    }

    public final m d(r rVar) {
        m mVar = this.f16586l;
        if (mVar == null || rVar != this.f16587m || mVar.a()) {
            this.f16587m = rVar;
            t2.b bVar = this.f16575a;
            l0 l0VarE = n0.e(this.f16585k, rVar);
            f3.d dVar = this.f16584j;
            kotlin.jvm.internal.r.b(dVar);
            f.a aVar = this.f16576b;
            List list = this.f16581g;
            if (list == null) {
                list = z.f22752a;
            }
            mVar = new m(bVar, l0VarE, list, dVar, aVar);
        }
        this.f16586l = mVar;
        return mVar;
    }

    public final h0 e(r rVar, long j10, t2.l lVar) {
        float fMin = Math.min(lVar.f27843a.c(), lVar.f27846d);
        t2.b bVar = this.f16575a;
        l0 l0Var = this.f16585k;
        List list = this.f16581g;
        if (list == null) {
            list = z.f22752a;
        }
        int i10 = this.f16579e;
        boolean z10 = this.f16578d;
        int i11 = this.f16577c;
        f3.d dVar = this.f16584j;
        kotlin.jvm.internal.r.b(dVar);
        return new h0(new g0(bVar, l0Var, list, i10, z10, i11, dVar, rVar, this.f16576b, j10), lVar, f3.c.d(j10, (a3.a(fMin) << 32) | (a3.a(lVar.f27847e) & BodyPartID.bodyIdMax)));
    }

    public final void f(t2.b bVar, l0 l0Var, f.a aVar, int i10, boolean z10, int i11, int i12, List list) {
        this.f16575a = bVar;
        boolean zC = l0Var.c(this.f16585k);
        this.f16585k = l0Var;
        if (!zC) {
            this.f16586l = null;
            this.f16588n = null;
            this.f16590p = -1;
            this.f16589o = -1;
        }
        this.f16576b = aVar;
        this.f16577c = i10;
        this.f16578d = z10;
        this.f16579e = i11;
        this.f16580f = i12;
        this.f16581g = list;
        this.f16586l = null;
        this.f16588n = null;
        this.f16590p = -1;
        this.f16589o = -1;
    }
}
