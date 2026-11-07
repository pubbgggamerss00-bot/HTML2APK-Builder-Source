package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.compose.foundation.gestures.f;
import androidx.compose.foundation.gestures.i;
import androidx.compose.ui.focus.FocusTargetNode;
import c2.b0;
import c2.r;
import c2.t;
import com.yalantis.ucrop.view.CropImageView;
import eh.l;
import eh.p;
import g2.v;
import i2.k2;
import kotlin.jvm.internal.s;
import org.bouncycastle.asn1.cmc.BodyPartID;
import pg.q;
import ph.i0;
import q2.a0;
import q2.d0;
import qg.x;
import r.m2;
import rh.l;
import t.b1;
import t.i1;
import t.m0;
import v.c1;
import v.f0;
import v.f1;
import v.g1;
import v.j1;
import v.k1;
import v.l1;
import v.s0;
import v.s1;
import v.t0;
import v.z;
import x.m;

/* loaded from: classes.dex */
public final class j extends androidx.compose.foundation.gestures.b implements a2.e, k2, i2.h {
    public i1 B;
    public z C;
    public final b2.b D;
    public final c1 E;
    public final v.h F;
    public final s1 G;
    public final f1 H;
    public final v.f I;
    public j1 K;
    public k1 L;
    public f0 M;

    public static final class a extends s implements l<v, pg.f0> {
        public a() {
            super(1);
        }

        @Override // eh.l
        public final pg.f0 invoke(v vVar) {
            p1.e eVarU1;
            v.f fVar = j.this.I;
            fVar.f29832w = vVar;
            if (fVar.f29834y && (eVarU1 = fVar.U1()) != null && !fVar.V1(eVarU1, fVar.f29835z)) {
                fVar.f29833x = true;
                fVar.W1();
            }
            fVar.f29834y = false;
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "androidx.compose.foundation.gestures.ScrollableNode$onDragStopped$1", f = "Scrollable.kt", l = {341}, m = "invokeSuspend")
    public static final class b extends vg.i implements p<i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f907a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f909c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f909c = j10;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return j.this.new b(this.f909c, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f907a;
            if (i10 == 0) {
                q.b(obj);
                s1 s1Var = j.this.G;
                this.f907a = 1;
                if (s1Var.c(this.f909c, false, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1", f = "Scrollable.kt", l = {475}, m = "invokeSuspend")
    public static final class c extends vg.i implements p<i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f910a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f912c;

        @vg.e(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
        public static final class a extends vg.i implements p<s0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f913a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f914b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j10, tg.e<? super a> eVar) {
                super(2, eVar);
                this.f914b = j10;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                a aVar = new a(this.f914b, eVar);
                aVar.f913a = obj;
                return aVar;
            }

            @Override // eh.p
            public final Object invoke(s0 s0Var, tg.e<? super pg.f0> eVar) {
                return ((a) create(s0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                q.b(obj);
                ((s0) this.f913a).a(this.f914b);
                return pg.f0.f21461a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, tg.e<? super c> eVar) {
            super(2, eVar);
            this.f912c = j10;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return j.this.new c(this.f912c, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f910a;
            if (i10 == 0) {
                q.b(obj);
                s1 s1Var = j.this.G;
                b1 b1Var = b1.f25168b;
                a aVar2 = new a(this.f912c, null);
                this.f910a = 1;
                if (s1Var.f(b1Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class d extends s implements eh.a<Boolean> {
        public d() {
            super(0);
        }

        @Override // eh.a
        public final Boolean invoke() {
            return Boolean.valueOf(j.this.f1157p);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [v.z] */
    public j(i1 i1Var, v.d dVar, z zVar, t0 t0Var, l1 l1Var, m mVar, boolean z10, boolean z11) {
        super(i.f901a, z10, mVar, t0Var);
        this.B = i1Var;
        this.C = zVar;
        b2.b bVar = new b2.b();
        this.D = bVar;
        c1 c1Var = new c1(z10);
        T1(c1Var);
        this.E = c1Var;
        v.h hVar = new v.h(new s.z(new m2(i.f904d)));
        this.F = hVar;
        i1 i1Var2 = this.B;
        ?? r12 = this.C;
        s1 s1Var = new s1(l1Var, i1Var2, r12 == 0 ? hVar : r12, t0Var, z11, bVar, new d());
        this.G = s1Var;
        f1 f1Var = new f1(s1Var, z10);
        this.H = f1Var;
        v.f fVar = new v.f(t0Var, s1Var, z11, dVar);
        T1(fVar);
        this.I = fVar;
        T1(new b2.e(f1Var, bVar));
        T1(new FocusTargetNode(2, null, 4));
        f0.h hVar2 = new f0.h();
        hVar2.f8775q = fVar;
        T1(hVar2);
        T1(new m0(new a()));
    }

    @Override // a2.e
    public final boolean I(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.ui.d.c
    public final boolean I1() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // androidx.compose.foundation.gestures.b, i2.i2
    public final void J(r rVar, t tVar, long j10) {
        long j11;
        ?? r02 = rVar.f4687a;
        ?? r92 = rVar.f4687a;
        int size = r02.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (this.f840t.invoke((b0) r02.get(i10)).booleanValue()) {
                super.J(rVar, tVar, j10);
                break;
            }
            i10++;
        }
        if (this.f841v) {
            if (tVar == t.f4694a && rVar.f4690d == 6) {
                if (this.M == null) {
                    this.M = new f0(this.G, new v.a(ViewConfiguration.get(i2.l.a(this).getContext())), new g1(2, this, j.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4), i2.k.f(this).B);
                }
                f0 f0Var = this.M;
                if (f0Var != null) {
                    i0 i0VarH1 = H1();
                    if (f0Var.f29861g == null) {
                        f0Var.f29861g = ph.h.c(i0VarH1, null, null, new v.m0(f0Var, null), 3);
                    }
                }
            }
            f0 f0Var2 = this.M;
            if (f0Var2 != null && tVar == t.f4695b && rVar.f4690d == 6) {
                int size2 = r92.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    if (((b0) r92.get(i11)).b()) {
                        return;
                    }
                }
                ViewConfiguration viewConfiguration = f0Var2.f29856b.f29773a;
                float f10 = -viewConfiguration.getScaledVerticalScrollFactor();
                float f11 = -viewConfiguration.getScaledHorizontalScrollFactor();
                p1.c cVar = new p1.c(0L);
                int size3 = r92.size();
                int i12 = 0;
                while (true) {
                    j11 = cVar.f21129a;
                    if (i12 >= size3) {
                        break;
                    }
                    cVar = new p1.c(p1.c.g(j11, ((b0) r92.get(i12)).f4602j));
                    i12++;
                }
                long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 >> 32)) * f11) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 & BodyPartID.bodyIdMax)) * f10) & BodyPartID.bodyIdMax);
                s1 s1Var = f0Var2.f29855a;
                float fG = s1Var.g(s1Var.e(jFloatToRawIntBits));
                if ((fG > CropImageView.DEFAULT_ASPECT_RATIO ? 1 : (fG == CropImageView.DEFAULT_ASPECT_RATIO ? 0 : -1)) == 0 ? false : (fG > CropImageView.DEFAULT_ASPECT_RATIO ? 1 : (fG == CropImageView.DEFAULT_ASPECT_RATIO ? 0 : -1)) > 0 ? s1Var.f30067a.d() : s1Var.f30067a.b() ? !(f0Var2.f29859e.g(new f0.a(jFloatToRawIntBits, ((b0) x.B(r92)).f4594b, false)) instanceof l.b) : f0Var2.f29860f) {
                    int size4 = r92.size();
                    for (int i13 = 0; i13 < size4; i13++) {
                        ((b0) r92.get(i13)).a();
                    }
                }
            }
        }
    }

    @Override // androidx.compose.ui.d.c
    public final void L1() {
        if (this.f1157p) {
            f3.d dVar = i2.k.f(this).B;
            v.h hVar = this.F;
            hVar.getClass();
            hVar.f29889a = new s.z(new m2(dVar));
        }
        f0 f0Var = this.M;
        if (f0Var != null) {
            f0Var.f29858d = i2.k.f(this).B;
        }
    }

    @Override // i2.k2
    public final void X(d0 d0Var) {
        if (this.f841v && (this.K == null || this.L == null)) {
            this.K = new j1(this);
            this.L = new k1(this, null);
        }
        j1 j1Var = this.K;
        if (j1Var != null) {
            kh.i<Object>[] iVarArr = a0.f21754a;
            d0Var.c(q2.k.f21776d, new q2.a(null, j1Var));
        }
        k1 k1Var = this.L;
        if (k1Var != null) {
            kh.i<Object>[] iVarArr2 = a0.f21754a;
            d0Var.c(q2.k.f21777e, k1Var);
        }
    }

    @Override // androidx.compose.foundation.gestures.b
    public final Object a2(f.a aVar, f fVar) {
        b1 b1Var = b1.f25168b;
        s1 s1Var = this.G;
        Object objF = s1Var.f(b1Var, new k(aVar, s1Var, null), fVar);
        return objF == ug.a.f29706a ? objF : pg.f0.f21461a;
    }

    @Override // androidx.compose.foundation.gestures.b
    public final void b2(long j10) {
    }

    @Override // androidx.compose.foundation.gestures.b
    public final void c2(long j10) {
        ph.h.c(this.D.c(), null, null, new b(j10, null), 3);
    }

    @Override // androidx.compose.foundation.gestures.b
    public final boolean d2() {
        s1 s1Var = this.G;
        if (s1Var.f30067a.a()) {
            return true;
        }
        i1 i1Var = s1Var.f30068b;
        return i1Var != null ? i1Var.c() : false;
    }

    public final void f2(i1 i1Var, v.d dVar, z zVar, t0 t0Var, l1 l1Var, m mVar, boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = true;
        boolean z14 = false;
        if (this.f841v != z10) {
            this.H.f29867b = z10;
            this.E.f29794r = z10;
            z12 = true;
        } else {
            z12 = false;
        }
        z zVar2 = zVar == null ? this.F : zVar;
        s1 s1Var = this.G;
        if (!kotlin.jvm.internal.r.a(s1Var.f30067a, l1Var)) {
            s1Var.f30067a = l1Var;
            z14 = true;
        }
        s1Var.f30068b = i1Var;
        if (s1Var.f30070d != t0Var) {
            s1Var.f30070d = t0Var;
            z14 = true;
        }
        if (s1Var.f30071e != z11) {
            s1Var.f30071e = z11;
        } else {
            z13 = z14;
        }
        s1Var.f30069c = zVar2;
        s1Var.f30072f = this.D;
        v.f fVar = this.I;
        fVar.f29827q = t0Var;
        fVar.f29829s = z11;
        fVar.f29830t = dVar;
        this.B = i1Var;
        this.C = zVar;
        i.a aVar = i.f901a;
        t0 t0Var2 = s1Var.f30070d;
        t0 t0Var3 = t0.f30083a;
        if (t0Var2 != t0Var3) {
            t0Var3 = t0.f30084b;
        }
        e2(aVar, z10, mVar, t0Var3, z13);
        if (z12) {
            this.K = null;
            this.L = null;
            i2.k.f(this).P();
        }
    }

    @Override // a2.e
    public final boolean j0(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (!this.f841v) {
            return false;
        }
        if ((!a2.b.a(a2.d.a(keyEvent), a2.b.f14l) && !a2.b.a(a2.g.a(keyEvent.getKeyCode()), a2.b.f13k)) || a2.d.b(keyEvent) != 2 || keyEvent.isCtrlPressed()) {
            return false;
        }
        t0 t0Var = this.G.f30070d;
        t0 t0Var2 = t0.f30083a;
        v.f fVar = this.I;
        if (t0Var == t0Var2) {
            int i10 = (int) (fVar.f29835z & BodyPartID.bodyIdMax);
            float f10 = a2.b.a(a2.g.a(keyEvent.getKeyCode()), a2.b.f13k) ? i10 : -i10;
            jFloatToRawIntBits = Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO);
            iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        } else {
            int i11 = (int) (fVar.f29835z >> 32);
            jFloatToRawIntBits = Float.floatToRawIntBits(a2.b.a(a2.g.a(keyEvent.getKeyCode()), a2.b.f13k) ? i11 : -i11);
            iFloatToRawIntBits = Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO);
        }
        ph.h.c(H1(), null, null, new c((jFloatToRawIntBits << 32) | (iFloatToRawIntBits & BodyPartID.bodyIdMax), null), 3);
        return true;
    }

    @Override // i2.j, i2.i2
    public final void x() {
        r0();
        if (this.f1157p) {
            f3.d dVar = i2.k.f(this).B;
            v.h hVar = this.F;
            hVar.getClass();
            hVar.f29889a = new s.z(new m2(dVar));
        }
        f0 f0Var = this.M;
        if (f0Var != null) {
            f0Var.f29858d = i2.k.f(this).B;
        }
    }
}
