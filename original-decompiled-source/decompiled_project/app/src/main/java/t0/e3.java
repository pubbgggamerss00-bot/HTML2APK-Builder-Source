package t0;

import j1.d;
import j1.f;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class e3 implements j3.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final f3.d f25781a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25782b;

    /* renamed from: c, reason: collision with root package name */
    public final x0.n1 f25783c;

    /* renamed from: d, reason: collision with root package name */
    public final z2 f25784d;

    /* renamed from: e, reason: collision with root package name */
    public final u0.j f25785e;

    /* renamed from: f, reason: collision with root package name */
    public final u0.j f25786f;

    /* renamed from: g, reason: collision with root package name */
    public final u0.y1 f25787g;

    /* renamed from: h, reason: collision with root package name */
    public final u0.y1 f25788h;

    /* renamed from: i, reason: collision with root package name */
    public final u0.k f25789i;

    /* renamed from: j, reason: collision with root package name */
    public final u0.k f25790j;

    /* renamed from: k, reason: collision with root package name */
    public final u0.z1 f25791k;

    /* renamed from: l, reason: collision with root package name */
    public final u0.z1 f25792l;

    public e3() {
        throw null;
    }

    public e3(f3.d dVar, int i10, x0.n1 n1Var, z2 z2Var) {
        int iB1 = dVar.b1(z5.f27518a);
        this.f25781a = dVar;
        this.f25782b = i10;
        this.f25783c = n1Var;
        this.f25784d = z2Var;
        f.a aVar = d.a.f14614m;
        this.f25785e = new u0.j(aVar, aVar, 0);
        f.a aVar2 = d.a.f14616o;
        this.f25786f = new u0.j(aVar2, aVar2, 0);
        this.f25787g = new u0.y1(j1.a.f14598c);
        this.f25788h = new u0.y1(j1.a.f14599d);
        f.b bVar = d.a.f14611j;
        f.b bVar2 = d.a.f14613l;
        this.f25789i = new u0.k(bVar, bVar2, 0);
        this.f25790j = new u0.k(bVar2, bVar, 0);
        this.f25791k = new u0.z1(bVar, iB1);
        this.f25792l = new u0.z1(bVar2, iB1);
    }

    @Override // j3.o0
    public final long a(f3.n nVar, long j10, f3.r rVar, long j11) {
        f3.n nVar2;
        char c10;
        long j12;
        int iA;
        x0.n1 n1Var = this.f25783c;
        if (n1Var != null) {
            n1Var.getValue();
        }
        char c11 = ' ';
        long j13 = BodyPartID.bodyIdMax;
        long j14 = (((int) (j10 >> 32)) << 32) | ((((int) (j10 & BodyPartID.bodyIdMax)) + this.f25782b) & BodyPartID.bodyIdMax);
        int i10 = (int) (j14 >> 32);
        int i11 = 0;
        List listJ = qg.p.j(this.f25785e, this.f25786f, ((int) (nVar.a() >> 32)) < i10 / 2 ? this.f25787g : this.f25788h);
        int size = listJ.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                nVar2 = nVar;
                c10 = c11;
                j12 = j13;
                iA = 0;
                break;
            }
            c10 = c11;
            j12 = j13;
            int i13 = (int) (j11 >> c10);
            int i14 = size;
            int i15 = i12;
            nVar2 = nVar;
            List list = listJ;
            iA = ((u0.r0) listJ.get(i12)).a(nVar2, j14, i13, rVar);
            if (i15 == qg.p.i(list) || (iA >= 0 && i13 + iA <= i10)) {
                break;
            }
            i12 = i15 + 1;
            listJ = list;
            size = i14;
            c11 = c10;
            j13 = j12;
        }
        int i16 = (int) (j14 & j12);
        List listJ2 = qg.p.j(this.f25789i, this.f25790j, ((int) (nVar2.a() & j12)) < i16 / 2 ? this.f25791k : this.f25792l);
        int size2 = listJ2.size();
        for (int i17 = 0; i17 < size2; i17++) {
            int i18 = (int) (j11 & j12);
            int iA2 = ((u0.s0) listJ2.get(i17)).a(nVar2, j14, i18);
            if (i17 == qg.p.i(listJ2) || (iA2 >= 0 && i18 + iA2 <= i16)) {
                i11 = iA2;
                break;
            }
        }
        long j15 = (iA << c10) | (i11 & j12);
        this.f25784d.invoke(nVar2, f3.o.a(j15, j11));
        return j15;
    }
}
