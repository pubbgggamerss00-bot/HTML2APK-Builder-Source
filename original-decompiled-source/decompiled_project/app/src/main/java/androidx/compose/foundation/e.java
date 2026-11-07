package androidx.compose.foundation;

import eh.q;
import j2.c3;
import kotlin.jvm.internal.s;
import t.f0;
import t.u0;
import t.v0;
import t.w0;
import t.y0;
import x.l;
import x0.j;
import x0.s3;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final s3 f816a = new s3(a.f817a);

    public static final class a extends s implements eh.a<u0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f817a = new a(0);

        @Override // eh.a
        public final /* bridge */ /* synthetic */ u0 invoke() {
            return f0.f25216a;
        }
    }

    public static final class b extends s implements q<androidx.compose.ui.d, j, Integer, androidx.compose.ui.d> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u0 f818a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f819b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u0 u0Var, l lVar) {
            super(3);
            this.f818a = u0Var;
            this.f819b = lVar;
        }

        @Override // eh.q
        public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, j jVar, Integer num) {
            j jVar2 = jVar;
            num.intValue();
            jVar2.L(-353972293);
            v0 v0VarB = this.f818a.b(this.f819b, jVar2);
            boolean zK = jVar2.K(v0VarB);
            Object objG = jVar2.g();
            if (zK || objG == j.a.f31715a) {
                objG = new w0(v0VarB);
                jVar2.C(objG);
            }
            w0 w0Var = (w0) objG;
            jVar2.B();
            return w0Var;
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, l lVar, u0 u0Var) {
        return u0Var == null ? dVar : u0Var instanceof y0 ? dVar.h(new IndicationModifierElement(lVar, (y0) u0Var)) : androidx.compose.ui.c.a(dVar, c3.f14686a, new b(u0Var, lVar));
    }
}
