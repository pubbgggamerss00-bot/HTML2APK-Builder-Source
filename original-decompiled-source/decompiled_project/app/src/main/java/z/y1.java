package z;

import j2.c3;
import x0.j;

/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public static final h2.i<u1> f34693a = new h2.i<>(a.f34694a);

    public static final class a extends kotlin.jvm.internal.s implements eh.a<u1> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34694a = new a(0);

        @Override // eh.a
        public final u1 invoke() {
            return new z();
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.q<androidx.compose.ui.d, x0.j, Integer, androidx.compose.ui.d> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u1 f34695a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u1 u1Var) {
            super(3);
            this.f34695a = u1Var;
        }

        @Override // eh.q
        public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            num.intValue();
            jVar2.L(-1415685722);
            u1 u1Var = this.f34695a;
            boolean zK = jVar2.K(u1Var);
            Object objG = jVar2.g();
            if (zK || objG == j.a.f31715a) {
                objG = new s0(u1Var);
                jVar2.C(objG);
            }
            s0 s0Var = (s0) objG;
            jVar2.B();
            return s0Var;
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, u1 u1Var) {
        return androidx.compose.ui.c.a(dVar, c3.f14686a, new b(u1Var));
    }
}
