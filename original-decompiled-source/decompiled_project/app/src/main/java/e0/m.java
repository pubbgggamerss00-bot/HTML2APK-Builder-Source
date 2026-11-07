package e0;

import j1.d;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final int f8222a;

    /* renamed from: b, reason: collision with root package name */
    public final List<g2.g1> f8223b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8224c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8225d;

    /* renamed from: e, reason: collision with root package name */
    public final d.b f8226e;

    /* renamed from: f, reason: collision with root package name */
    public final d.c f8227f;

    /* renamed from: g, reason: collision with root package name */
    public final f3.r f8228g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8229h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8230i;

    /* renamed from: j, reason: collision with root package name */
    public final int f8231j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f8232k;

    /* renamed from: l, reason: collision with root package name */
    public int f8233l;

    /* renamed from: m, reason: collision with root package name */
    public int f8234m;

    public m() {
        throw null;
    }

    public m(int i10, int i11, List list, long j10, Object obj, v.t0 t0Var, d.b bVar, d.c cVar, f3.r rVar, boolean z10) {
        this.f8222a = i10;
        this.f8223b = list;
        this.f8224c = j10;
        this.f8225d = obj;
        this.f8226e = bVar;
        this.f8227f = cVar;
        this.f8228g = rVar;
        this.f8229h = z10;
        this.f8230i = t0Var == v.t0.f30083a;
        int size = list.size();
        int iMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            g2.g1 g1Var = (g2.g1) list.get(i12);
            iMax = Math.max(iMax, !this.f8230i ? g1Var.f11383b : g1Var.f11382a);
        }
        this.f8231j = iMax;
        this.f8232k = new int[this.f8223b.size() * 2];
        this.f8234m = PKIFailureInfo.systemUnavail;
    }

    public final void a(int i10) {
        this.f8233l += i10;
        int[] iArr = this.f8232k;
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            boolean z10 = this.f8230i;
            if ((z10 && i11 % 2 == 1) || (!z10 && i11 % 2 == 0)) {
                iArr[i11] = iArr[i11] + i10;
            }
        }
    }

    public final void b(int i10, int i11, int i12) {
        int i13;
        this.f8233l = i10;
        boolean z10 = this.f8230i;
        this.f8234m = z10 ? i12 : i11;
        List<g2.g1> list = this.f8223b;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            g2.g1 g1Var = list.get(i14);
            int i15 = i14 * 2;
            int[] iArr = this.f8232k;
            if (z10) {
                d.b bVar = this.f8226e;
                if (bVar == null) {
                    y.c.b("null horizontalAlignment");
                    throw new pg.g();
                }
                iArr[i15] = bVar.a(g1Var.f11382a, i11, this.f8228g);
                iArr[i15 + 1] = i10;
                i13 = g1Var.f11383b;
            } else {
                iArr[i15] = i10;
                int i16 = i15 + 1;
                d.c cVar = this.f8227f;
                if (cVar == null) {
                    y.c.b("null verticalAlignment");
                    throw new pg.g();
                }
                iArr[i16] = cVar.a(g1Var.f11383b, i12);
                i13 = g1Var.f11382a;
            }
            i10 += i13;
        }
    }

    @Override // e0.n
    public final int getIndex() {
        return this.f8222a;
    }

    @Override // e0.n
    public final int getOffset() {
        return this.f8233l;
    }
}
