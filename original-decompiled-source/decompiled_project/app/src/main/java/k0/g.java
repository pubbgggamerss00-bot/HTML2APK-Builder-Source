package k0;

import i0.i2;
import i0.l4;
import i0.v1;
import i2.k2;
import j2.z4;
import java.util.List;
import k1.m;
import m0.x2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import x0.x1;

/* loaded from: classes.dex */
public final class g extends i2.m implements k2 {
    public y2.o A;
    public o1.c0 B;

    /* renamed from: s, reason: collision with root package name */
    public y2.o0 f15826s;

    /* renamed from: t, reason: collision with root package name */
    public y2.c0 f15827t;

    /* renamed from: v, reason: collision with root package name */
    public i2 f15828v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f15829w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f15830x;

    /* renamed from: y, reason: collision with root package name */
    public y2.v f15831y;

    /* renamed from: z, reason: collision with root package name */
    public x2 f15832z;

    public static final class a extends kotlin.jvm.internal.s implements eh.a<Boolean> {
        public a() {
            super(0);
        }

        @Override // eh.a
        public final Boolean invoke() {
            g.this.f15832z.d();
            return Boolean.TRUE;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // eh.a
        public final Boolean invoke() {
            g.this.f15832z.m();
            return Boolean.TRUE;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.l<t2.b, Boolean> {
        public c() {
            super(1);
        }

        @Override // eh.l
        public final Boolean invoke(t2.b bVar) {
            g gVar = g.this;
            x1 x1Var = gVar.f15828v.f13356t;
            Boolean bool = Boolean.TRUE;
            x1Var.setValue(bool);
            gVar.f15828v.f13355s.setValue(bool);
            g.W1(gVar, gVar.f15828v, bVar.f27761b, gVar.f15829w, gVar.f15830x);
            return bool;
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements eh.l<List<t2.h0>, Boolean> {
        public d() {
            super(1);
        }

        @Override // eh.l
        public final Boolean invoke(List<t2.h0> list) {
            boolean z10;
            List<t2.h0> list2 = list;
            g gVar = g.this;
            if (gVar.f15828v.d() != null) {
                l4 l4VarD = gVar.f15828v.d();
                kotlin.jvm.internal.r.b(l4VarD);
                list2.add(l4VarD.f13418a);
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final class e extends kotlin.jvm.internal.s implements eh.l<t2.b, Boolean> {
        public e() {
            super(1);
        }

        @Override // eh.l
        public final Boolean invoke(t2.b bVar) {
            g gVar = g.this;
            g.W1(gVar, gVar.f15828v, bVar.f27761b, gVar.f15829w, gVar.f15830x);
            return Boolean.TRUE;
        }
    }

    public static final class f extends kotlin.jvm.internal.s implements eh.l<t2.b, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q2.d0 f15839b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(q2.d0 d0Var) {
            super(1);
            this.f15839b = d0Var;
        }

        @Override // eh.l
        public final Boolean invoke(t2.b bVar) {
            t2.b bVar2 = bVar;
            g gVar = g.this;
            if (gVar.f15829w || !gVar.f15830x) {
                return Boolean.FALSE;
            }
            y2.n0 n0Var = gVar.f15828v.f13341e;
            pg.f0 f0Var = null;
            if (n0Var != null) {
                List<? extends y2.i> listJ = qg.p.j(new y2.l(), new y2.a(bVar2, 1));
                i2 i2Var = gVar.f15828v;
                y2.j jVar = i2Var.f13340d;
                i2.b bVar3 = i2Var.f13358v;
                y2.c0 c0VarA = jVar.a(listJ);
                n0Var.a(null, c0VarA);
                bVar3.invoke(c0VarA);
                f0Var = pg.f0.f21461a;
            }
            if (f0Var == null) {
                y2.c0 c0Var = gVar.f15827t;
                String str = c0Var.f33682a.f27761b;
                long j10 = c0Var.f33683b;
                int i10 = t2.j0.f27838c;
                String string = mh.x.M(str, (int) (j10 >> 32), (int) (j10 & BodyPartID.bodyIdMax), bVar2).toString();
                int length = bVar2.f27761b.length() + ((int) (gVar.f15827t.f33683b >> 32));
                gVar.f15828v.f13358v.invoke(new y2.c0(string, t2.k0.a(length, length), 4));
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: k0.g$g, reason: collision with other inner class name */
    public static final class C0158g extends kotlin.jvm.internal.s implements eh.q<Integer, Integer, Boolean, Boolean> {
        public C0158g() {
            super(3);
        }

        @Override // eh.q
        public final Boolean b(Integer num, Integer num2, Boolean bool) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            boolean zBooleanValue = bool.booleanValue();
            g gVar = g.this;
            if (!zBooleanValue) {
                iIntValue = gVar.f15831y.a(iIntValue);
            }
            if (!zBooleanValue) {
                iIntValue2 = gVar.f15831y.a(iIntValue2);
            }
            boolean z10 = false;
            if (gVar.f15830x) {
                long j10 = gVar.f15827t.f33683b;
                int i10 = t2.j0.f27838c;
                if (iIntValue != ((int) (j10 >> 32)) || iIntValue2 != ((int) (j10 & BodyPartID.bodyIdMax))) {
                    if (Math.min(iIntValue, iIntValue2) < 0 || Math.max(iIntValue, iIntValue2) > gVar.f15827t.f33682a.f27761b.length()) {
                        x2 x2Var = gVar.f15832z;
                        x2Var.q(false);
                        x2Var.o(v1.f13646a);
                    } else {
                        if (zBooleanValue || iIntValue == iIntValue2) {
                            x2 x2Var2 = gVar.f15832z;
                            x2Var2.q(false);
                            x2Var2.o(v1.f13646a);
                        } else {
                            gVar.f15832z.f(true);
                        }
                        gVar.f15828v.f13358v.invoke(new y2.c0(gVar.f15827t.f33682a, t2.k0.a(iIntValue, iIntValue2), (t2.j0) null));
                        z10 = true;
                    }
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final class h extends kotlin.jvm.internal.s implements eh.a<Boolean> {
        public h() {
            super(0);
        }

        @Override // eh.a
        public final Boolean invoke() {
            g gVar = g.this;
            gVar.f15828v.f13359w.invoke(new y2.n(gVar.A.f33757e));
            return Boolean.TRUE;
        }
    }

    public static final class i extends kotlin.jvm.internal.s implements eh.a<Boolean> {
        public i() {
            super(0);
        }

        @Override // eh.a
        public final Boolean invoke() {
            z4 z4Var;
            g gVar = g.this;
            i2 i2Var = gVar.f15828v;
            o1.c0 c0Var = gVar.B;
            boolean z10 = gVar.f15829w;
            if (!i2Var.b()) {
                o1.c0.b(c0Var);
            } else if (!z10 && (z4Var = i2Var.f13339c) != null) {
                z4Var.a();
            }
            return Boolean.TRUE;
        }
    }

    public static final class j extends kotlin.jvm.internal.s implements eh.a<Boolean> {
        public j() {
            super(0);
        }

        @Override // eh.a
        public final Boolean invoke() {
            g.this.f15832z.f(true);
            return Boolean.TRUE;
        }
    }

    public static final class k extends kotlin.jvm.internal.s implements eh.a<Boolean> {
        public k() {
            super(0);
        }

        @Override // eh.a
        public final Boolean invoke() {
            g.this.f15832z.b(true);
            return Boolean.TRUE;
        }
    }

    public static final void W1(g gVar, i2 i2Var, String str, boolean z10, boolean z11) {
        if (z10 || !z11) {
            return;
        }
        y2.n0 n0Var = i2Var.f13341e;
        i2.b bVar = i2Var.f13358v;
        pg.f0 f0Var = null;
        if (n0Var != null) {
            y2.c0 c0VarA = i2Var.f13340d.a(qg.p.j(new y2.f(), new y2.a(str, 1)));
            n0Var.a(null, c0VarA);
            bVar.invoke(c0VarA);
            f0Var = pg.f0.f21461a;
        }
        if (f0Var == null) {
            int length = str.length();
            bVar.invoke(new y2.c0(str, t2.k0.a(length, length), 4));
        }
    }

    @Override // i2.k2
    public final void X(q2.d0 d0Var) {
        t2.b bVar = this.f15827t.f33682a;
        kh.i<Object>[] iVarArr = q2.a0.f21754a;
        q2.c0<t2.b> c0Var = q2.w.C;
        kh.i<Object>[] iVarArr2 = q2.a0.f21754a;
        kh.i<Object> iVar = iVarArr2[16];
        c0Var.getClass();
        d0Var.c(c0Var, bVar);
        t2.b bVar2 = this.f15826s.f33759a;
        q2.c0<t2.b> c0Var2 = q2.w.D;
        kh.i<Object> iVar2 = iVarArr2[17];
        c0Var2.getClass();
        d0Var.c(c0Var2, bVar2);
        long j10 = this.f15827t.f33683b;
        q2.c0<t2.j0> c0Var3 = q2.w.E;
        kh.i<Object> iVar3 = iVarArr2[18];
        t2.j0 j0Var = new t2.j0(j10);
        c0Var3.getClass();
        d0Var.c(c0Var3, j0Var);
        q2.c0<k1.m> c0Var4 = q2.w.f21836q;
        kh.i<Object> iVar4 = iVarArr2[8];
        c0Var4.getClass();
        d0Var.c(c0Var4, m.a.f15934a);
        d0Var.c(q2.k.f21779g, new q2.a(null, new c()));
        if (!this.f15830x) {
            d0Var.c(q2.w.f21828i, pg.f0.f21461a);
        }
        boolean z10 = this.f15830x && !this.f15829w;
        q2.c0<Boolean> c0Var5 = q2.w.L;
        kh.i<Object> iVar5 = iVarArr2[24];
        Boolean boolValueOf = Boolean.valueOf(z10);
        c0Var5.getClass();
        d0Var.c(c0Var5, boolValueOf);
        q2.a0.c(d0Var, new d());
        if (z10) {
            d0Var.c(q2.k.f21782j, new q2.a(null, new e()));
            d0Var.c(q2.k.f21786n, new q2.a(null, new f(d0Var)));
        }
        d0Var.c(q2.k.f21781i, new q2.a(null, new C0158g()));
        int i10 = this.A.f33757e;
        h hVar = new h();
        d0Var.c(q2.w.F, new y2.n(i10));
        d0Var.c(q2.k.f21787o, new q2.a(null, hVar));
        d0Var.c(q2.k.f21774b, new q2.a(null, new i()));
        d0Var.c(q2.k.f21775c, new q2.a(null, new j()));
        if (!t2.j0.b(this.f15827t.f33683b)) {
            d0Var.c(q2.k.f21788p, new q2.a(null, new k()));
            if (this.f15830x && !this.f15829w) {
                d0Var.c(q2.k.f21789q, new q2.a(null, new a()));
            }
        }
        if (!this.f15830x || this.f15829w) {
            return;
        }
        d0Var.c(q2.k.f21790r, new q2.a(null, new b()));
    }

    @Override // i2.k2
    public final boolean w1() {
        return true;
    }
}
