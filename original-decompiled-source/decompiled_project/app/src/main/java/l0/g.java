package l0;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import b.b0;
import c2.r;
import c2.s0;
import c2.y;
import g2.v;
import i0.v4;
import kotlin.jvm.internal.s;
import m0.a1;
import m0.j2;
import m0.u;
import m0.x;
import t2.h0;
import x0.u2;

/* loaded from: classes.dex */
public final class g implements u2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f16609a;

    /* renamed from: b, reason: collision with root package name */
    public final j2 f16610b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16611c;

    /* renamed from: d, reason: collision with root package name */
    public j f16612d = j.f16626c;

    /* renamed from: e, reason: collision with root package name */
    public x f16613e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.compose.ui.d f16614f;

    public static final class a extends s implements eh.a<v> {
        public a() {
            super(0);
        }

        @Override // eh.a
        public final v invoke() {
            return g.this.f16612d.f16627a;
        }
    }

    public static final class b extends s implements eh.a<h0> {
        public b() {
            super(0);
        }

        @Override // eh.a
        public final h0 invoke() {
            return g.this.f16612d.f16628b;
        }
    }

    public g(long j10, j2 j2Var, long j11) {
        this.f16609a = j10;
        this.f16610b = j2Var;
        this.f16611c = j11;
        b0 b0Var = new b0(this, 1);
        h hVar = new h(b0Var, j2Var, j10);
        i iVar = new i(b0Var, j2Var, j10);
        a1 a1Var = new a1(iVar, hVar);
        r rVar = s0.f4692a;
        this.f16614f = y.f(new SuspendPointerInputElement(iVar, hVar, a1Var, 4), v4.f13650a);
    }

    @Override // x0.u2
    public final void b() {
        x xVar = this.f16613e;
        if (xVar != null) {
            this.f16610b.h(xVar);
            this.f16613e = null;
        }
    }

    @Override // x0.u2
    public final void c() {
        x xVar = this.f16613e;
        if (xVar != null) {
            this.f16610b.h(xVar);
            this.f16613e = null;
        }
    }

    @Override // x0.u2
    public final void d() {
        this.f16613e = this.f16610b.i(new u(this.f16609a, new a(), new b()));
    }
}
