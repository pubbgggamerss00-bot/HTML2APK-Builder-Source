package e0;

import d0.m1;
import d0.p1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class l implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f8220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8221b;

    public l(b bVar, boolean z10) {
        this.f8220a = bVar;
        this.f8221b = z10;
    }

    @Override // d0.m1
    public final int a() {
        b bVar = this.f8220a;
        return (int) (bVar.l().getOrientation() == v.t0.f30083a ? bVar.l().b() & BodyPartID.bodyIdMax : bVar.l().b() >> 32);
    }

    @Override // d0.m1
    public final float b() {
        return d0.b1.b(this.f8220a);
    }

    @Override // d0.m1
    public final int c() {
        b bVar = this.f8220a;
        return bVar.l().c() + bVar.l().d();
    }

    @Override // d0.m1
    public final Object d(int i10, p1 p1Var) {
        b bVar = this.f8220a;
        Object objC = bVar.c(t.b1.f25167a, new a1(bVar, i10, null), p1Var);
        ug.a aVar = ug.a.f29706a;
        if (objC != aVar) {
            objC = pg.f0.f21461a;
        }
        return objC == aVar ? objC : pg.f0.f21461a;
    }

    @Override // d0.m1
    public final float e() {
        b bVar = this.f8220a;
        return e1.a(bVar.l(), bVar.m());
    }

    @Override // d0.m1
    public final q2.b f() {
        boolean z10 = this.f8221b;
        b bVar = this.f8220a;
        return z10 ? new q2.b(bVar.m(), 1) : new q2.b(1, bVar.m());
    }
}
