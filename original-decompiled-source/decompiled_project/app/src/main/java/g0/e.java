package g0;

import eh.l;
import kotlin.jvm.internal.s;
import pg.f0;
import q2.a0;
import q2.c0;
import q2.d0;
import q2.i;
import q2.w;
import t.b0;
import t.y0;
import x.m;

/* loaded from: classes.dex */
public final class e extends b0 {
    public boolean L;
    public l<? super Boolean, f0> M;
    public final b N;

    public static final class a extends s implements eh.a<f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<Boolean, f0> f11266a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f11267b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super Boolean, f0> lVar, boolean z10) {
            super(0);
            this.f11266a = lVar;
            this.f11267b = z10;
        }

        @Override // eh.a
        public final f0 invoke() {
            this.f11266a.invoke(Boolean.valueOf(!this.f11267b));
            return f0.f21461a;
        }
    }

    public static final class b extends s implements eh.a<f0> {
        public b() {
            super(0);
        }

        @Override // eh.a
        public final f0 invoke() {
            e.this.M.invoke(Boolean.valueOf(!r0.L));
            return f0.f21461a;
        }
    }

    public e() {
        throw null;
    }

    public e(boolean z10, m mVar, y0 y0Var, boolean z11, i iVar, l lVar) {
        super(mVar, y0Var, z11, null, iVar, new a(lVar, z10));
        this.L = z10;
        this.M = lVar;
        this.N = new b();
    }

    @Override // t.a
    public final void W1(d0 d0Var) {
        s2.a aVar = this.L ? s2.a.f24191a : s2.a.f24192b;
        kh.i<Object>[] iVarArr = a0.f21754a;
        c0<s2.a> c0Var = w.H;
        kh.i<Object> iVar = a0.f21754a[23];
        c0Var.getClass();
        d0Var.c(c0Var, aVar);
    }
}
