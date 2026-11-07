package u0;

import com.google.protobuf.DescriptorProtos;
import com.yalantis.ucrop.view.CropImageView;
import e3.l;
import q1.d2;
import q1.e2;
import q1.i2;
import s.y1;
import x0.r3;

/* loaded from: classes.dex */
public final class z0 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t2.l0 f29187a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2.l0 f29188b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f29189c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r3<q1.b1> f29190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f29191e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f29192f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r3<q1.b1> f29193g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(t2.l0 l0Var, t2.l0 l0Var2, float f10, y1.d dVar, eh.p pVar, boolean z10, y1.d dVar2) {
        super(2);
        this.f29187a = l0Var;
        this.f29188b = l0Var2;
        this.f29189c = f10;
        this.f29190d = dVar;
        this.f29191e = pVar;
        this.f29192f = z10;
        this.f29193g = dVar2;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        t2.w wVar;
        t2.v vVar;
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            t2.l0 l0Var = this.f29187a;
            t2.b0 b0Var = l0Var.f27852a;
            t2.l0 l0Var2 = this.f29188b;
            t2.b0 b0Var2 = l0Var2.f27852a;
            e3.l lVar = t2.d0.f27796d;
            e3.l lVar2 = b0Var.f27775a;
            e3.l lVar3 = b0Var2.f27775a;
            boolean z10 = lVar2 instanceof e3.b;
            e3.l bVar = l.a.f8369a;
            float f10 = this.f29189c;
            if (!z10 && !(lVar3 instanceof e3.b)) {
                long jG = c2.n0.g(lVar2.j(), lVar3.j(), f10);
                if (jG != 16) {
                    bVar = new e3.c(jG);
                }
            } else if (z10 && (lVar3 instanceof e3.b)) {
                e3.b bVar2 = (e3.b) lVar2;
                e3.b bVar3 = (e3.b) lVar3;
                q1.u0 u0Var = (q1.u0) t2.d0.b(bVar2.f8346a, bVar3.f8346a, f10);
                float fB = h3.b.b(bVar2.f8347b, bVar3.f8347b, f10);
                if (u0Var != null) {
                    if (u0Var instanceof i2) {
                        long jA = e3.k.a(fB, ((i2) u0Var).f21711a);
                        if (jA != 16) {
                            bVar = new e3.c(jA);
                        }
                    } else {
                        if (!(u0Var instanceof d2)) {
                            throw new pg.l();
                        }
                        bVar = new e3.b((d2) u0Var, fB);
                    }
                }
            } else {
                bVar = (e3.l) t2.d0.b(lVar2, lVar3, f10);
            }
            e3.l lVar4 = bVar;
            x2.f fVar = (x2.f) t2.d0.b(b0Var.f27780f, b0Var2.f27780f, f10);
            long jC = t2.d0.c(b0Var.f27776b, b0Var2.f27776b, f10);
            x2.p pVar = b0Var.f27777c;
            if (pVar == null) {
                pVar = x2.p.f32030c;
            }
            x2.p pVar2 = b0Var2.f27777c;
            if (pVar2 == null) {
                pVar2 = x2.p.f32030c;
            }
            x2.p pVar3 = new x2.p(jh.j.m(h3.b.c(f10, pVar.f32037a, pVar2.f32037a), 1, DescriptorProtos.Edition.EDITION_2023_VALUE));
            x2.n nVar = (x2.n) t2.d0.b(b0Var.f27778d, b0Var2.f27778d, f10);
            x2.o oVar = (x2.o) t2.d0.b(b0Var.f27779e, b0Var2.f27779e, f10);
            String str = (String) t2.d0.b(b0Var.f27781g, b0Var2.f27781g, f10);
            long jC2 = t2.d0.c(b0Var.f27782h, b0Var2.f27782h, f10);
            e3.a aVar = b0Var.f27783i;
            float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
            float f12 = aVar != null ? aVar.f8345a : 0.0f;
            e3.a aVar2 = b0Var2.f27783i;
            if (aVar2 != null) {
                f11 = aVar2.f8345a;
            }
            float fB2 = h3.b.b(f12, f11, f10);
            e3.m mVar = b0Var.f27784j;
            e3.m mVar2 = e3.m.f8372c;
            if (mVar == null) {
                mVar = mVar2;
            }
            e3.m mVar3 = b0Var2.f27784j;
            if (mVar3 != null) {
                mVar2 = mVar3;
            }
            e3.m mVar4 = new e3.m(h3.b.b(mVar.f8373a, mVar2.f8373a, f10), h3.b.b(mVar.f8374b, mVar2.f8374b, f10));
            a3.c cVar = (a3.c) t2.d0.b(b0Var.f27785k, b0Var2.f27785k, f10);
            long jG2 = c2.n0.g(b0Var.f27786l, b0Var2.f27786l, f10);
            e3.i iVar = (e3.i) t2.d0.b(b0Var.f27787m, b0Var2.f27787m, f10);
            e2 e2Var = b0Var.f27788n;
            if (e2Var == null) {
                e2Var = new e2();
            }
            e2 e2Var2 = b0Var2.f27788n;
            if (e2Var2 == null) {
                e2Var2 = new e2();
            }
            e2 e2Var3 = new e2(c2.n0.g(e2Var.f21688a, e2Var2.f21688a, f10), p1.d.c(e2Var.f21689b, e2Var2.f21689b, f10), h3.b.b(e2Var.f21690c, e2Var2.f21690c, f10));
            t2.w wVar2 = b0Var.f27789o;
            t2.w wVar3 = b0Var2.f27789o;
            if (wVar2 == null && wVar3 == null) {
                wVar = null;
            } else {
                if (wVar2 == null) {
                    wVar2 = t2.w.f27888a;
                }
                wVar = wVar2;
            }
            t2.b0 b0Var3 = new t2.b0(lVar4, jC, pVar3, nVar, oVar, fVar, str, jC2, new e3.a(fB2), mVar4, cVar, jG2, iVar, e2Var3, wVar, (s1.f) t2.d0.b(b0Var.f27790p, b0Var2.f27790p, f10));
            t2.s sVar = l0Var.f27853b;
            t2.s sVar2 = l0Var2.f27853b;
            int i10 = t2.t.f27885b;
            int i11 = ((e3.h) t2.d0.b(new e3.h(sVar.f27875a), new e3.h(sVar2.f27875a), f10)).f8363a;
            int i12 = ((e3.j) t2.d0.b(new e3.j(sVar.f27876b), new e3.j(sVar2.f27876b), f10)).f8368a;
            long jC3 = t2.d0.c(sVar.f27877c, sVar2.f27877c, f10);
            e3.n nVar2 = sVar.f27878d;
            if (nVar2 == null) {
                nVar2 = e3.n.f8375c;
            }
            e3.n nVar3 = sVar2.f27878d;
            if (nVar3 == null) {
                nVar3 = e3.n.f8375c;
            }
            e3.n nVar4 = new e3.n(t2.d0.c(nVar2.f8376a, nVar3.f8376a, f10), t2.d0.c(nVar2.f8377b, nVar3.f8377b, f10));
            t2.v vVar2 = sVar.f27879e;
            t2.v vVar3 = sVar2.f27879e;
            if (vVar2 == null && vVar3 == null) {
                vVar = null;
            } else {
                if (vVar2 == null) {
                    vVar2 = t2.v.f27886b;
                }
                t2.v vVar4 = vVar2;
                if (vVar3 == null) {
                    vVar3 = t2.v.f27886b;
                }
                if (vVar4.f27887a == vVar3.f27887a) {
                    vVar = vVar4;
                } else {
                    ((t2.h) t2.d0.b(new t2.h(), new t2.h(), f10)).getClass();
                    vVar = new t2.v(((Boolean) t2.d0.b(Boolean.valueOf(vVar4.f27887a), Boolean.valueOf(vVar3.f27887a), f10)).booleanValue());
                }
            }
            t2.l0 l0Var3 = new t2.l0(b0Var3, new t2.s(i11, i12, jC3, nVar4, vVar, (e3.f) t2.d0.b(sVar.f27880f, sVar2.f27880f, f10), ((e3.e) t2.d0.b(new e3.e(sVar.f27881g), new e3.e(sVar2.f27881g), f10)).f8351a, ((e3.d) t2.d0.b(new e3.d(sVar.f27882h), new e3.d(sVar2.f27882h), f10)).f8349a, (e3.o) t2.d0.b(sVar.f27883i, sVar2.f27883i, f10)));
            if (this.f29192f) {
                l0Var3 = t2.l0.a(l0Var3, this.f29193g.getValue().f21656a, 0L, null, null, 0L, 0L, null, null, 16777214);
            }
            t1.b(this.f29190d.getValue().f21656a, l0Var3, this.f29191e, jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
