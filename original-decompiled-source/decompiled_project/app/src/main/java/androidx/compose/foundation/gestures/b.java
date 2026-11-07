package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.a;
import androidx.compose.foundation.gestures.f;
import c2.b0;
import c2.r;
import c2.s0;
import c2.t;
import c2.u0;
import c2.y0;
import eh.l;
import i2.i2;
import i2.m;
import kotlin.jvm.internal.s;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import pg.q;
import v.t0;
import v.v;

/* loaded from: classes.dex */
public abstract class b extends m implements i2 {
    public u0 A;

    /* renamed from: s, reason: collision with root package name */
    public t0 f839s;

    /* renamed from: t, reason: collision with root package name */
    public l<? super b0, Boolean> f840t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f841v;

    /* renamed from: w, reason: collision with root package name */
    public x.m f842w;

    /* renamed from: x, reason: collision with root package name */
    public rh.c f843x;

    /* renamed from: y, reason: collision with root package name */
    public x.b f844y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f845z;

    public static final class a extends s implements l<b0, Boolean> {
        public a() {
            super(1);
        }

        @Override // eh.l
        public final Boolean invoke(b0 b0Var) {
            return b.this.f840t.invoke(b0Var);
        }
    }

    public b(l<? super b0, Boolean> lVar, boolean z10, x.m mVar, t0 t0Var) {
        this.f839s = t0Var;
        this.f840t = lVar;
        this.f841v = z10;
        this.f842w = mVar;
        new a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object W1(b bVar, vg.c cVar) {
        v vVar;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i10 = vVar.f30096d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                vVar.f30096d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                vVar = new v(bVar, cVar);
            }
        }
        Object obj = vVar.f30094b;
        ug.a aVar = ug.a.f29706a;
        int i11 = vVar.f30096d;
        if (i11 == 0) {
            q.b(obj);
            x.b bVar2 = bVar.f844y;
            if (bVar2 != null) {
                x.m mVar = bVar.f842w;
                if (mVar != null) {
                    x.a aVar2 = new x.a(bVar2);
                    vVar.f30093a = bVar;
                    vVar.f30096d = 1;
                    if (mVar.c(aVar2, vVar) == aVar) {
                        return aVar;
                    }
                }
            }
            bVar.c2(0L);
            return f0.f21461a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bVar = vVar.f30093a;
        q.b(obj);
        bVar.f844y = null;
        bVar.c2(0L);
        return f0.f21461a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object X1(b bVar, a.c cVar, vg.c cVar2) {
        d dVar;
        x.m mVar;
        x.b bVar2;
        b bVar3;
        x.b bVar4;
        if (cVar2 instanceof d) {
            dVar = (d) cVar2;
            int i10 = dVar.f871f;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f871f = i10 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(bVar, cVar2);
            }
        }
        Object obj = dVar.f869d;
        ug.a aVar = ug.a.f29706a;
        int i11 = dVar.f871f;
        if (i11 == 0) {
            q.b(obj);
            x.b bVar5 = bVar.f844y;
            if (bVar5 != null && (mVar = bVar.f842w) != null) {
                x.a aVar2 = new x.a(bVar5);
                dVar.f866a = bVar;
                dVar.f867b = cVar;
                dVar.f871f = 1;
                if (mVar.c(aVar2, dVar) != aVar) {
                }
                return aVar;
            }
            bVar.f844y = bVar2;
            bVar.b2(cVar.f837a);
            return f0.f21461a;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar4 = dVar.f868c;
            cVar = dVar.f867b;
            bVar3 = dVar.f866a;
            q.b(obj);
            bVar2 = bVar4;
            bVar = bVar3;
            bVar.f844y = bVar2;
            bVar.b2(cVar.f837a);
            return f0.f21461a;
        }
        cVar = dVar.f867b;
        bVar = dVar.f866a;
        q.b(obj);
        bVar2 = new x.b();
        x.m mVar2 = bVar.f842w;
        if (mVar2 != null) {
            dVar.f866a = bVar;
            dVar.f867b = cVar;
            dVar.f868c = bVar2;
            dVar.f871f = 2;
            if (mVar2.c(bVar2, dVar) != aVar) {
                bVar3 = bVar;
                bVar4 = bVar2;
                bVar2 = bVar4;
                bVar = bVar3;
            }
            return aVar;
        }
        bVar.f844y = bVar2;
        bVar.b2(cVar.f837a);
        return f0.f21461a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Y1(b bVar, a.d dVar, vg.c cVar) {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i10 = eVar.f876e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                eVar.f876e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                eVar = new e(bVar, cVar);
            }
        }
        Object obj = eVar.f874c;
        ug.a aVar = ug.a.f29706a;
        int i11 = eVar.f876e;
        if (i11 == 0) {
            q.b(obj);
            x.b bVar2 = bVar.f844y;
            if (bVar2 != null) {
                x.m mVar = bVar.f842w;
                if (mVar != null) {
                    x.c cVar2 = new x.c(bVar2);
                    eVar.f872a = bVar;
                    eVar.f873b = dVar;
                    eVar.f876e = 1;
                    if (mVar.c(cVar2, eVar) == aVar) {
                        return aVar;
                    }
                }
            }
            bVar.c2(dVar.f838a);
            return f0.f21461a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dVar = eVar.f873b;
        bVar = eVar.f872a;
        q.b(obj);
        bVar.f844y = null;
        bVar.c2(dVar.f838a);
        return f0.f21461a;
    }

    @Override // i2.i2
    public void J(r rVar, t tVar, long j10) {
        if (this.f841v && this.A == null) {
            c cVar = new c(this);
            r rVar2 = s0.f4692a;
            y0 y0Var = new y0(null, null, cVar);
            T1(y0Var);
            this.A = y0Var;
        }
        u0 u0Var = this.A;
        if (u0Var != null) {
            u0Var.J(rVar, tVar, j10);
        }
    }

    @Override // androidx.compose.ui.d.c
    public final void M1() {
        this.f845z = false;
        Z1();
    }

    public final void Z1() {
        x.b bVar = this.f844y;
        if (bVar != null) {
            x.m mVar = this.f842w;
            if (mVar != null) {
                mVar.a(new x.a(bVar));
            }
            this.f844y = null;
        }
    }

    public abstract Object a2(f.a aVar, f fVar);

    public abstract void b2(long j10);

    public abstract void c2(long j10);

    public abstract boolean d2();

    public final void e2(l<? super b0, Boolean> lVar, boolean z10, x.m mVar, t0 t0Var, boolean z11) {
        u0 u0Var;
        this.f840t = lVar;
        boolean z12 = true;
        if (this.f841v != z10) {
            this.f841v = z10;
            if (!z10) {
                Z1();
                u0 u0Var2 = this.A;
                if (u0Var2 != null) {
                    U1(u0Var2);
                }
                this.A = null;
            }
            z11 = true;
        }
        if (!kotlin.jvm.internal.r.a(this.f842w, mVar)) {
            Z1();
            this.f842w = mVar;
        }
        if (this.f839s != t0Var) {
            this.f839s = t0Var;
        } else {
            z12 = z11;
        }
        if (!z12 || (u0Var = this.A) == null) {
            return;
        }
        u0Var.F1();
    }

    @Override // i2.i2
    public final void r0() {
        u0 u0Var = this.A;
        if (u0Var != null) {
            u0Var.r0();
        }
    }
}
