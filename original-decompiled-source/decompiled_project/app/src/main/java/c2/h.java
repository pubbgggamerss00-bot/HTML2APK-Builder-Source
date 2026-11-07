package c2;

import androidx.compose.ui.d;
import i2.i2;
import i2.m2;
import i2.n2;
import i2.o2;
import i2.p2;

/* loaded from: classes.dex */
public abstract class h extends d.c implements o2, i2, i2.h {

    /* renamed from: q, reason: collision with root package name */
    public i2.q f4647q;

    /* renamed from: r, reason: collision with root package name */
    public x f4648r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4649s;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<h, n2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.b0 f4650a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.jvm.internal.b0 b0Var) {
            super(1);
            this.f4650a = b0Var;
        }

        @Override // eh.l
        public final n2 invoke(h hVar) {
            if (!hVar.f4649s) {
                return n2.f13963a;
            }
            this.f4650a.f16318a = false;
            return n2.f13965c;
        }
    }

    public h(x xVar, i2.q qVar) {
        this.f4647q = qVar;
        this.f4648r = xVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // i2.i2
    public final void J(r rVar, t tVar, long j10) {
        if (tVar == t.f4695b) {
            ?? r32 = rVar.f4687a;
            int size = r32.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (W1(((b0) r32.get(i10)).f4601i)) {
                    int i11 = rVar.f4690d;
                    if (i11 == 4) {
                        this.f4649s = true;
                        V1();
                        return;
                    } else {
                        if (i11 == 5) {
                            X1();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.compose.ui.d.c
    public final void M1() {
        X1();
    }

    @Override // i2.i2
    public final long N() {
        i2.q qVar = this.f4647q;
        if (qVar == null) {
            return m2.f13956a;
        }
        f3.d dVar = i2.k.f(this).B;
        int i10 = m2.f13957b;
        return m2.a.b(dVar.b1(qVar.f14001a), dVar.b1(qVar.f14002b), dVar.b1(qVar.f14003c), dVar.b1(qVar.f14004d));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T1() {
        x xVar;
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        p2.b(this, new i(1));
        h hVar = (h) g0Var.f16327a;
        if (hVar == null || (xVar = hVar.f4648r) == null) {
            xVar = this.f4648r;
        }
        U1(xVar);
    }

    public abstract void U1(x xVar);

    public final void V1() {
        kotlin.jvm.internal.b0 b0Var = new kotlin.jvm.internal.b0();
        b0Var.f16318a = true;
        p2.c(this, new a(b0Var));
        if (b0Var.f16318a) {
            T1();
        }
    }

    public abstract boolean W1(int i10);

    /* JADX WARN: Multi-variable type inference failed */
    public final void X1() {
        pg.f0 f0Var;
        if (this.f4649s) {
            this.f4649s = false;
            if (this.f1157p) {
                kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
                p2.b(this, new g(g0Var, 0));
                h hVar = (h) g0Var.f16327a;
                if (hVar != null) {
                    hVar.T1();
                    f0Var = pg.f0.f21461a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    U1(null);
                }
            }
        }
    }

    @Override // i2.i2
    public final void r0() {
        X1();
    }
}
