package t;

import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import i2.i2;
import i2.k2;
import i2.o2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import x.o;

/* loaded from: classes.dex */
public abstract class a extends i2.m implements i2, a2.e, k2, o2 {
    public static final C0279a K = new C0279a();
    public c2.u0 A;
    public i2.j B;
    public o.b C;
    public x.i D;
    public final p.c0<o.b> E;
    public long F;
    public x.m G;
    public boolean H;
    public final C0279a I;

    /* renamed from: s, reason: collision with root package name */
    public x.m f25142s;

    /* renamed from: t, reason: collision with root package name */
    public y0 f25143t;

    /* renamed from: v, reason: collision with root package name */
    public String f25144v;

    /* renamed from: w, reason: collision with root package name */
    public q2.i f25145w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f25146x;

    /* renamed from: y, reason: collision with root package name */
    public eh.a<pg.f0> f25147y;

    /* renamed from: z, reason: collision with root package name */
    public final j0 f25148z;

    /* renamed from: t.a$a, reason: collision with other inner class name */
    public static final class C0279a {
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // eh.a
        public final Boolean invoke() {
            a.this.f25147y.invoke();
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ class c extends kotlin.jvm.internal.p implements eh.l<Boolean, pg.f0> {
        /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
        @Override // eh.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final pg.f0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = (a) this.receiver;
            p.c0<o.b> c0Var = aVar.E;
            if (zBooleanValue) {
                aVar.Z1();
            } else {
                if (aVar.f25142s != null) {
                    Object[] objArr = c0Var.f20679c;
                    long[] jArr = c0Var.f20677a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j10 = jArr[i10];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length)) >>> 31);
                                for (int i12 = 0; i12 < i11; i12++) {
                                    if ((255 & j10) < 128) {
                                        ph.h.c(aVar.H1(), null, null, new t.e(aVar, (o.b) objArr[(i10 << 3) + i12], null), 3);
                                    }
                                    j10 >>= 8;
                                }
                                if (i11 != 8) {
                                    break;
                                }
                                if (i10 == length) {
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                }
                c0Var.c();
                aVar.a2();
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1", f = "Clickable.kt", l = {1191}, m = "invokeSuspend")
    public static final class d extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25150a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o.b f25152c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(o.b bVar, tg.e<? super d> eVar) {
            super(2, eVar);
            this.f25152c = bVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return a.this.new d(this.f25152c, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f25150a;
            if (i10 == 0) {
                pg.q.b(obj);
                x.m mVar = a.this.f25142s;
                if (mVar != null) {
                    this.f25150a = 1;
                    if (mVar.c(this.f25152c, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2", f = "Clickable.kt", l = {1202}, m = "invokeSuspend")
    public static final class e extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25153a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o.b f25155c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(o.b bVar, tg.e<? super e> eVar) {
            super(2, eVar);
            this.f25155c = bVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return a.this.new e(this.f25155c, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f25153a;
            if (i10 == 0) {
                pg.q.b(obj);
                x.m mVar = a.this.f25142s;
                if (mVar != null) {
                    o.c cVar = new o.c(this.f25155c);
                    this.f25153a = 1;
                    if (mVar.c(cVar, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$1", f = "Clickable.kt", l = {}, m = "invokeSuspend")
    public static final class f extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {
        public f(tg.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return a.this.new f(eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            a aVar2 = a.this;
            if (aVar2.D == null) {
                x.i iVar = new x.i();
                x.m mVar = aVar2.f25142s;
                if (mVar != null) {
                    ph.h.c(aVar2.H1(), null, null, new t.b(mVar, iVar, null), 3);
                }
                aVar2.D = iVar;
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$2", f = "Clickable.kt", l = {}, m = "invokeSuspend")
    public static final class g extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {
        public g(tg.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return a.this.new g(eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            a aVar2 = a.this;
            x.i iVar = aVar2.D;
            if (iVar != null) {
                x.j jVar = new x.j(iVar);
                x.m mVar = aVar2.f25142s;
                if (mVar != null) {
                    ph.h.c(aVar2.H1(), null, null, new t.c(mVar, jVar, null), 3);
                }
                aVar2.D = null;
            }
            return pg.f0.f21461a;
        }
    }

    public static final class h implements PointerInputEventHandler {
        public h() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(c2.j0 j0Var, tg.e<? super pg.f0> eVar) {
            Object objX1 = a.this.X1(j0Var, eVar);
            return objX1 == ug.a.f29706a ? objX1 : pg.f0.f21461a;
        }
    }

    public a() {
        throw null;
    }

    public a(x.m mVar, y0 y0Var, boolean z10, String str, q2.i iVar, eh.a aVar) {
        this.f25142s = mVar;
        this.f25143t = y0Var;
        this.f25144v = str;
        this.f25145w = iVar;
        this.f25146x = z10;
        this.f25147y = aVar;
        boolean z11 = false;
        this.f25148z = new j0(mVar, 0, new c(1, this, a.class, "onFocusChange", "onFocusChange(Z)V", 0));
        p.c0 c0Var = p.o.f20698a;
        this.E = new p.c0<>();
        this.F = 0L;
        x.m mVar2 = this.f25142s;
        this.G = mVar2;
        if (mVar2 == null && this.f25143t != null) {
            z11 = true;
        }
        this.H = z11;
        this.I = K;
    }

    @Override // a2.e
    public final boolean I(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.ui.d.c
    public final boolean I1() {
        return false;
    }

    @Override // i2.i2
    public final void J(c2.r rVar, c2.t tVar, long j10) {
        long j11 = ((j10 >> 33) << 32) | (((j10 << 32) >> 33) & BodyPartID.bodyIdMax);
        float f10 = (int) (j11 >> 32);
        float f11 = (int) (j11 & BodyPartID.bodyIdMax);
        this.F = (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax);
        Z1();
        if (this.f25146x && tVar == c2.t.f4695b) {
            int i10 = rVar.f4690d;
            if (i10 == 4) {
                ph.h.c(H1(), null, null, new f(null), 3);
            } else if (i10 == 5) {
                ph.h.c(H1(), null, null, new g(null), 3);
            }
        }
        if (this.A == null) {
            h hVar = new h();
            c2.r rVar2 = c2.s0.f4692a;
            c2.y0 y0Var = new c2.y0(null, null, hVar);
            T1(y0Var);
            this.A = y0Var;
        }
        c2.u0 u0Var = this.A;
        if (u0Var != null) {
            u0Var.J(rVar, tVar, j10);
        }
    }

    @Override // i2.o2
    public final Object L() {
        return this.I;
    }

    @Override // androidx.compose.ui.d.c
    public final void L1() {
        if (!this.H) {
            Z1();
        }
        if (this.f25146x) {
            T1(this.f25148z);
        }
    }

    @Override // androidx.compose.ui.d.c
    public final void M1() {
        Y1();
        if (this.G == null) {
            this.f25142s = null;
        }
        i2.j jVar = this.B;
        if (jVar != null) {
            U1(jVar);
        }
        this.B = null;
    }

    public void W1(q2.d0 d0Var) {
    }

    @Override // i2.k2
    public final void X(q2.d0 d0Var) {
        q2.i iVar = this.f25145w;
        if (iVar != null) {
            q2.a0.e(d0Var, iVar.f21770a);
        }
        String str = this.f25144v;
        b bVar = new b();
        kh.i<Object>[] iVarArr = q2.a0.f21754a;
        d0Var.c(q2.k.f21774b, new q2.a(str, bVar));
        if (this.f25146x) {
            this.f25148z.X(d0Var);
        } else {
            d0Var.c(q2.w.f21828i, pg.f0.f21461a);
        }
        W1(d0Var);
    }

    public abstract Object X1(c2.j0 j0Var, tg.e<? super pg.f0> eVar);

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y1() {
        x.m mVar = this.f25142s;
        p.c0<o.b> c0Var = this.E;
        if (mVar != null) {
            o.b bVar = this.C;
            if (bVar != null) {
                mVar.a(new o.a(bVar));
            }
            x.i iVar = this.D;
            if (iVar != null) {
                mVar.a(new x.j(iVar));
            }
            Object[] objArr = c0Var.f20679c;
            long[] jArr = c0Var.f20677a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                mVar.a(new o.a((o.b) objArr[(i10 << 3) + i12]));
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 == length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        }
        this.C = null;
        this.D = null;
        c0Var.c();
    }

    public final void Z1() {
        y0 y0Var;
        if (this.B == null && (y0Var = this.f25143t) != null) {
            if (this.f25142s == null) {
                this.f25142s = new x.n();
            }
            this.f25148z.Y1(this.f25142s);
            x.m mVar = this.f25142s;
            kotlin.jvm.internal.r.b(mVar);
            i2.j jVarA = y0Var.a(mVar);
            T1(jVarA);
            this.B = jVarA;
        }
    }

    public void a2() {
    }

    public abstract boolean b2(KeyEvent keyEvent);

    public abstract void c2(KeyEvent keyEvent);

    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d2(x.m mVar, y0 y0Var, boolean z10, String str, q2.i iVar, eh.a<pg.f0> aVar) {
        boolean z11;
        i2.j jVar;
        boolean z12 = true;
        boolean z13 = false;
        if (kotlin.jvm.internal.r.a(this.G, mVar)) {
            z11 = false;
        } else {
            Y1();
            this.G = mVar;
            this.f25142s = mVar;
            z11 = true;
        }
        if (!kotlin.jvm.internal.r.a(this.f25143t, y0Var)) {
            this.f25143t = y0Var;
            z11 = true;
        }
        boolean z14 = this.f25146x;
        j0 j0Var = this.f25148z;
        if (z14 != z10) {
            if (z10) {
                T1(j0Var);
            } else {
                U1(j0Var);
                Y1();
            }
            i2.k.f(this).P();
            this.f25146x = z10;
        }
        if (!kotlin.jvm.internal.r.a(this.f25144v, str)) {
            this.f25144v = str;
            i2.k.f(this).P();
        }
        if (!kotlin.jvm.internal.r.a(this.f25145w, iVar)) {
            this.f25145w = iVar;
            i2.k.f(this).P();
        }
        this.f25147y = aVar;
        boolean z15 = this.H;
        x.m mVar2 = this.G;
        if (z15 == (mVar2 == null && this.f25143t != null)) {
            z12 = z11;
        } else {
            if (mVar2 == null && this.f25143t != null) {
                z13 = true;
            }
            this.H = z13;
            if (z13 || this.B != null) {
            }
        }
        if (z12 && ((jVar = this.B) != null || !this.H)) {
            if (jVar != null) {
                U1(jVar);
            }
            this.B = null;
            Z1();
        }
        j0Var.Y1(this.f25142s);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077 A[RETURN] */
    @Override // a2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j0(KeyEvent keyEvent) {
        boolean z10;
        Z1();
        long jA = a2.d.a(keyEvent);
        boolean z11 = this.f25146x;
        p.c0<o.b> c0Var = this.E;
        if (!z11 || a2.d.b(keyEvent) != 2 || !androidx.compose.foundation.b.e(keyEvent)) {
            if (this.f25146x && a2.d.b(keyEvent) == 1 && androidx.compose.foundation.b.e(keyEvent)) {
                o.b bVarG = c0Var.g(jA);
                if (bVarG != null) {
                    if (this.f25142s != null) {
                        ph.h.c(H1(), null, null, new e(bVarG, null), 3);
                    }
                    c2(keyEvent);
                }
                if (bVarG != null) {
                    return true;
                }
            }
            return false;
        }
        if (c0Var.a(jA)) {
            z10 = false;
        } else {
            o.b bVar = new o.b(this.F);
            c0Var.h(bVar, jA);
            if (this.f25142s != null) {
                ph.h.c(H1(), null, null, new d(bVar, null), 3);
            }
            z10 = true;
        }
        if (!b2(keyEvent) && !z10) {
            return false;
        }
    }

    @Override // i2.i2
    public final void r0() {
        x.i iVar;
        x.m mVar = this.f25142s;
        if (mVar != null && (iVar = this.D) != null) {
            mVar.a(new x.j(iVar));
        }
        this.D = null;
        c2.u0 u0Var = this.A;
        if (u0Var != null) {
            u0Var.r0();
        }
    }

    @Override // i2.k2
    public final boolean w1() {
        return true;
    }
}
