package i0;

import f3.b;
import g2.g1;
import h1.h;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import t2.b;
import x2.f;

/* loaded from: classes.dex */
public final class y0 implements g2.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i2 f13683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.l<t2.h0, pg.f0> f13684b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y2.c0 f13685c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y2.v f13686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f3.d f13687e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13688f;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13689a = new a(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ pg.f0 invoke(g1.a aVar) {
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y0(i2 i2Var, eh.l<? super t2.h0, pg.f0> lVar, y2.c0 c0Var, y2.v vVar, f3.d dVar, int i10) {
        this.f13683a = i2Var;
        this.f13684b = lVar;
        this.f13685c = c0Var;
        this.f13686d = vVar;
        this.f13687e = dVar;
        this.f13688f = i10;
    }

    @Override // g2.l0
    public final int c(g2.q qVar, List<? extends g2.p> list, int i10) {
        i2 i2Var = this.f13683a;
        i2Var.f13337a.a(qVar.getLayoutDirection());
        t2.m mVar = i2Var.f13337a.f13734j;
        if (mVar != null) {
            return a3.a(mVar.c());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f3  */
    @Override // g2.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g2.m0 h(g2.o0 o0Var, List<? extends g2.k0> list, long j10) {
        long j11;
        i2 i2Var;
        t2.h0 h0Var;
        l4 l4Var;
        t2.h0 h0Var2;
        t2.h0 h0Var3;
        y0 y0Var;
        i2 i2Var2;
        int i10;
        i2 i2Var3 = this.f13683a;
        h1.h hVarA = h.a.a();
        eh.l<Object, pg.f0> lVarE = hVarA != null ? hVarA.e() : null;
        h1.h hVarB = h.a.b(hVarA);
        try {
            l4 l4VarD = i2Var3.d();
            t2.h0 h0Var4 = l4VarD != null ? l4VarD.f13418a : null;
            z2 z2Var = i2Var3.f13337a;
            f3.r layoutDirection = o0Var.getLayoutDirection();
            int i11 = z2Var.f13730f;
            boolean z10 = z2Var.f13729e;
            int i12 = z2Var.f13727c;
            if (h0Var4 != null) {
                t2.l lVar = h0Var4.f27820b;
                t2.g0 g0Var = h0Var4.f27819a;
                t2.b bVar = z2Var.f13725a;
                t2.l0 l0Var = z2Var.f13726b;
                List<b.c<t2.u>> list2 = z2Var.f13733i;
                f3.d dVar = z2Var.f13731g;
                f.a aVar = z2Var.f13732h;
                t2.h0 h0Var5 = h0Var4;
                if (lVar.f27843a.a()) {
                    j11 = j10;
                    i2Var = i2Var3;
                } else {
                    t2.b bVar2 = g0Var.f27809a;
                    i2Var = i2Var3;
                    long j12 = g0Var.f27818j;
                    if (kotlin.jvm.internal.r.a(bVar2, bVar) && g0Var.f27810b.c(l0Var) && kotlin.jvm.internal.r.a(g0Var.f27811c, list2) && g0Var.f27812d == i12 && g0Var.f27813e == z10 && g0Var.f27814f == i11 && kotlin.jvm.internal.r.a(g0Var.f27815g, dVar) && g0Var.f27816h == layoutDirection && kotlin.jvm.internal.r.a(g0Var.f27817i, aVar) && f3.b.k(j10) == f3.b.k(j12) && ((!z10 && i11 != 2) || (f3.b.i(j10) == f3.b.i(j12) && f3.b.h(j10) == f3.b.h(j12)))) {
                        h0Var3 = new t2.h0(new t2.g0(g0Var.f27809a, z2Var.f13726b, g0Var.f27811c, g0Var.f27812d, g0Var.f27813e, g0Var.f27814f, g0Var.f27815g, g0Var.f27816h, g0Var.f27817i, j10), lVar, f3.c.d(j10, (a3.a(lVar.f27847e) & BodyPartID.bodyIdMax) | (a3.a(lVar.f27846d) << 32)));
                        h0Var2 = h0Var5;
                        l4Var = l4VarD;
                        long j13 = h0Var3.f27821c;
                        Integer numValueOf = Integer.valueOf((int) (j13 >> 32));
                        Integer numValueOf2 = Integer.valueOf((int) (j13 & BodyPartID.bodyIdMax));
                        int iIntValue = numValueOf.intValue();
                        int iIntValue2 = numValueOf2.intValue();
                        if (kotlin.jvm.internal.r.a(h0Var2, h0Var3)) {
                            i2Var2 = i2Var;
                            i2Var2.f13345i.setValue(new l4(l4Var != null ? l4Var.f13420c : null, h0Var3));
                            i10 = 0;
                            i2Var2.f13352p = false;
                            y0Var = this;
                            y0Var.f13684b.invoke(h0Var3);
                            q1.g(i2Var2, y0Var.f13685c, y0Var.f13686d);
                        } else {
                            y0Var = this;
                            i2Var2 = i2Var;
                            i10 = 0;
                        }
                        i2Var2.f13343g.setValue(new f3.h(y0Var.f13687e.u(y0Var.f13688f != 1 ? a3.a(h0Var3.f27820b.b(i10)) : i10)));
                        return o0Var.i0(iIntValue, iIntValue2, qg.k0.d(new pg.n(g2.b.f11314a, Integer.valueOf(Math.round(h0Var3.f27822d))), new pg.n(g2.b.f11315b, Integer.valueOf(Math.round(h0Var3.f27823e)))), a.f13689a);
                    }
                    j11 = j10;
                }
                h0Var = h0Var5;
            } else {
                j11 = j10;
                i2Var = i2Var3;
                h0Var = h0Var4;
            }
            z2Var.a(layoutDirection);
            int iK = f3.b.k(j11);
            int i13 = ((z10 || i11 == 2) && f3.b.e(j11)) ? f3.b.i(j11) : Integer.MAX_VALUE;
            int i14 = (z10 || i11 != 2) ? i12 : 1;
            if (iK != i13) {
                t2.m mVar = z2Var.f13734j;
                if (mVar == null) {
                    throw new IllegalStateException("layoutIntrinsics must be called first");
                }
                i13 = jh.j.m(a3.a(mVar.c()), iK, i13);
            }
            t2.m mVar2 = z2Var.f13734j;
            if (mVar2 == null) {
                throw new IllegalStateException("layoutIntrinsics must be called first");
            }
            t2.l lVar2 = new t2.l(mVar2, b.a.b(0, i13, 0, f3.b.h(j11)), i14, z2Var.f13730f);
            long jD = f3.c.d(j11, (a3.a(lVar2.f27846d) << 32) | (a3.a(lVar2.f27847e) & BodyPartID.bodyIdMax));
            h0Var2 = h0Var;
            l4Var = l4VarD;
            h0Var3 = new t2.h0(new t2.g0(z2Var.f13725a, z2Var.f13726b, z2Var.f13733i, z2Var.f13727c, z2Var.f13729e, z2Var.f13730f, z2Var.f13731g, layoutDirection, z2Var.f13732h, j11), lVar2, jD);
            long j132 = h0Var3.f27821c;
            Integer numValueOf3 = Integer.valueOf((int) (j132 >> 32));
            Integer numValueOf22 = Integer.valueOf((int) (j132 & BodyPartID.bodyIdMax));
            int iIntValue3 = numValueOf3.intValue();
            int iIntValue22 = numValueOf22.intValue();
            if (kotlin.jvm.internal.r.a(h0Var2, h0Var3)) {
            }
            i2Var2.f13343g.setValue(new f3.h(y0Var.f13687e.u(y0Var.f13688f != 1 ? a3.a(h0Var3.f27820b.b(i10)) : i10)));
            return o0Var.i0(iIntValue3, iIntValue22, qg.k0.d(new pg.n(g2.b.f11314a, Integer.valueOf(Math.round(h0Var3.f27822d))), new pg.n(g2.b.f11315b, Integer.valueOf(Math.round(h0Var3.f27823e)))), a.f13689a);
        } finally {
            h.a.d(hVarA, hVarB, lVarE);
        }
    }
}
