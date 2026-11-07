package l0;

import f3.r;
import i0.a3;
import l0.c;
import org.bouncycastle.asn1.cmc.BodyPartID;
import qg.n0;
import qg.z;
import t2.l0;
import t2.q;
import x2.f;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public String f16591a;

    /* renamed from: b, reason: collision with root package name */
    public l0 f16592b;

    /* renamed from: c, reason: collision with root package name */
    public f.a f16593c;

    /* renamed from: d, reason: collision with root package name */
    public int f16594d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16595e;

    /* renamed from: f, reason: collision with root package name */
    public int f16596f;

    /* renamed from: g, reason: collision with root package name */
    public int f16597g;

    /* renamed from: i, reason: collision with root package name */
    public f3.d f16599i;

    /* renamed from: j, reason: collision with root package name */
    public t2.a f16600j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16601k;

    /* renamed from: l, reason: collision with root package name */
    public long f16602l;

    /* renamed from: m, reason: collision with root package name */
    public c f16603m;

    /* renamed from: n, reason: collision with root package name */
    public q f16604n;

    /* renamed from: o, reason: collision with root package name */
    public r f16605o;

    /* renamed from: h, reason: collision with root package name */
    public long f16598h = a.f16563a;

    /* renamed from: p, reason: collision with root package name */
    public long f16606p = f3.c.h(0, 0, 0, 0);

    /* renamed from: q, reason: collision with root package name */
    public int f16607q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f16608r = -1;

    public f(String str, l0 l0Var, f.a aVar, int i10, boolean z10, int i11, int i12) {
        this.f16591a = str;
        this.f16592b = l0Var;
        this.f16593c = aVar;
        this.f16594d = i10;
        this.f16595e = z10;
        this.f16596f = i11;
        this.f16597g = i12;
        long j10 = 0;
        this.f16602l = (j10 & BodyPartID.bodyIdMax) | (j10 << 32);
    }

    public static long e(f fVar, long j10, r rVar) {
        l0 l0Var = fVar.f16592b;
        c cVar = fVar.f16603m;
        f3.d dVar = fVar.f16599i;
        kotlin.jvm.internal.r.b(dVar);
        c cVarA = c.a.a(cVar, rVar, l0Var, dVar, fVar.f16593c);
        fVar.f16603m = cVarA;
        return cVarA.a(fVar.f16597g, j10);
    }

    public final int a(int i10, r rVar) {
        int i11 = this.f16607q;
        int i12 = this.f16608r;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        long jA = f3.c.a(0, i10, 0, Integer.MAX_VALUE);
        if (this.f16597g > 1) {
            jA = e(this, jA, rVar);
        }
        q qVarD = d(rVar);
        long jA2 = b.a(jA, this.f16595e, this.f16594d, qVarD.c());
        boolean z10 = this.f16595e;
        int i13 = this.f16594d;
        int i14 = this.f16596f;
        int iA = a3.a(new t2.a((b3.c) qVarD, ((z10 || !(i13 == 2 || i13 == 4 || i13 == 5)) && i14 >= 1) ? i14 : 1, i13, jA2).d());
        int iJ = f3.b.j(jA);
        if (iA < iJ) {
            iA = iJ;
        }
        this.f16607q = i10;
        this.f16608r = iA;
        return iA;
    }

    public final void b() {
        this.f16600j = null;
        this.f16604n = null;
        this.f16605o = null;
        this.f16607q = -1;
        this.f16608r = -1;
        this.f16606p = f3.c.h(0, 0, 0, 0);
        long j10 = 0;
        this.f16602l = (j10 & BodyPartID.bodyIdMax) | (j10 << 32);
        this.f16601k = false;
    }

    public final void c(f3.d dVar) {
        long jA;
        f3.d dVar2 = this.f16599i;
        if (dVar != null) {
            int i10 = a.f16564b;
            jA = a.a(dVar.getDensity(), dVar.G0());
        } else {
            jA = a.f16563a;
        }
        if (dVar2 == null) {
            this.f16599i = dVar;
            this.f16598h = jA;
        } else if (dVar == null || this.f16598h != jA) {
            this.f16599i = dVar;
            this.f16598h = jA;
            b();
        }
    }

    public final q d(r rVar) {
        q cVar = this.f16604n;
        if (cVar == null || rVar != this.f16605o || cVar.a()) {
            this.f16605o = rVar;
            String str = this.f16591a;
            l0 l0VarE = n0.e(this.f16592b, rVar);
            f3.d dVar = this.f16599i;
            kotlin.jvm.internal.r.b(dVar);
            f.a aVar = this.f16593c;
            z zVar = z.f22752a;
            cVar = new b3.c(str, l0VarE, zVar, zVar, aVar, dVar);
        }
        this.f16604n = cVar;
        return cVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f16600j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        long j10 = this.f16598h;
        int i10 = a.f16564b;
        sb.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j10 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)) + ')'));
        sb.append(')');
        return sb.toString();
    }
}
