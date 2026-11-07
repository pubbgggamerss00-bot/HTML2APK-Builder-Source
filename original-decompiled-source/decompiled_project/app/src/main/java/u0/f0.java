package u0;

import j1.d;
import j1.f;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import t0.z5;

/* loaded from: classes.dex */
public final class f0 implements j3.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f28990a;

    /* renamed from: b, reason: collision with root package name */
    public final f3.d f28991b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28992c;

    /* renamed from: d, reason: collision with root package name */
    public final t0.u f28993d;

    /* renamed from: e, reason: collision with root package name */
    public final j f28994e;

    /* renamed from: f, reason: collision with root package name */
    public final j f28995f;

    /* renamed from: g, reason: collision with root package name */
    public final y1 f28996g;

    /* renamed from: h, reason: collision with root package name */
    public final y1 f28997h;

    /* renamed from: i, reason: collision with root package name */
    public final k f28998i;

    /* renamed from: j, reason: collision with root package name */
    public final k f28999j;

    /* renamed from: k, reason: collision with root package name */
    public final k f29000k;

    /* renamed from: l, reason: collision with root package name */
    public final z1 f29001l;

    /* renamed from: m, reason: collision with root package name */
    public final z1 f29002m;

    public f0() {
        throw null;
    }

    public f0(long j10, f3.d dVar, t0.u uVar) {
        int iB1 = dVar.b1(z5.f27518a);
        this.f28990a = j10;
        this.f28991b = dVar;
        this.f28992c = iB1;
        this.f28993d = uVar;
        int iB12 = dVar.b1(Float.intBitsToFloat((int) (j10 >> 32)));
        f.a aVar = d.a.f14614m;
        this.f28994e = new j(aVar, aVar, iB12);
        f.a aVar2 = d.a.f14616o;
        this.f28995f = new j(aVar2, aVar2, iB12);
        this.f28996g = new y1(j1.a.f14598c);
        this.f28997h = new y1(j1.a.f14599d);
        int iB13 = dVar.b1(Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)));
        f.b bVar = d.a.f14611j;
        f.b bVar2 = d.a.f14613l;
        this.f28998i = new k(bVar, bVar2, iB13);
        this.f28999j = new k(bVar2, bVar, iB13);
        this.f29000k = new k(d.a.f14612k, bVar, iB13);
        this.f29001l = new z1(bVar, iB1);
        this.f29002m = new z1(bVar2, iB1);
    }

    @Override // j3.o0
    public final long a(f3.n nVar, long j10, f3.r rVar, long j11) {
        f3.n nVar2;
        long j12;
        char c10;
        int iA;
        int i10;
        char c11 = ' ';
        int i11 = (int) (j10 >> 32);
        int i12 = 0;
        List listJ = qg.p.j(this.f28994e, this.f28995f, ((int) (nVar.a() >> 32)) < i11 / 2 ? this.f28996g : this.f28997h);
        int size = listJ.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                nVar2 = nVar;
                j12 = j10;
                c10 = c11;
                iA = 0;
                break;
            }
            r0 r0Var = (r0) listJ.get(i13);
            int i14 = (int) (j11 >> c11);
            int i15 = size;
            c10 = c11;
            j12 = j10;
            int i16 = i13;
            nVar2 = nVar;
            iA = r0Var.a(nVar2, j12, i14, rVar);
            if (i16 == qg.p.i(listJ) || (iA >= 0 && i14 + iA <= i11)) {
                break;
            }
            i13 = i16 + 1;
            size = i15;
            c11 = c10;
        }
        int iA2 = (int) (nVar2.a() & BodyPartID.bodyIdMax);
        int i17 = (int) (j12 & BodyPartID.bodyIdMax);
        List listJ2 = qg.p.j(this.f28998i, this.f28999j, this.f29000k, iA2 < i17 / 2 ? this.f29001l : this.f29002m);
        int size2 = listJ2.size();
        for (int i18 = 0; i18 < size2; i18++) {
            s0 s0Var = (s0) listJ2.get(i18);
            int i19 = (int) (j11 & BodyPartID.bodyIdMax);
            int iA3 = s0Var.a(nVar2, j12, i19);
            if (i18 == qg.p.i(listJ2) || (iA3 >= (i10 = this.f28992c) && i19 + iA3 <= i17 - i10)) {
                i12 = iA3;
                break;
            }
        }
        long j13 = (iA << c10) | (i12 & BodyPartID.bodyIdMax);
        this.f28993d.invoke(nVar2, f3.o.a(j13, j11));
        return j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f28990a == f0Var.f28990a && kotlin.jvm.internal.r.a(this.f28991b, f0Var.f28991b) && this.f28992c == f0Var.f28992c && kotlin.jvm.internal.r.a(this.f28993d, f0Var.f28993d);
    }

    public final int hashCode() {
        return this.f28993d.hashCode() + androidx.datastore.preferences.protobuf.a1.a(this.f28992c, (this.f28991b.hashCode() + (Long.hashCode(this.f28990a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) f3.j.a(this.f28990a)) + ", density=" + this.f28991b + ", verticalMargin=" + this.f28992c + ", onPositionCalculated=" + this.f28993d + ')';
    }
}
