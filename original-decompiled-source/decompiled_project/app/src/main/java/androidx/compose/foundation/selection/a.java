package androidx.compose.foundation.selection;

import androidx.compose.foundation.e;
import androidx.compose.ui.d;
import eh.q;
import j2.c3;
import kotlin.jvm.internal.s;
import pg.f0;
import q2.i;
import t.u0;
import t.y0;
import x.m;
import x.n;
import x0.j;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: androidx.compose.foundation.selection.a$a, reason: collision with other inner class name */
    public static final class C0015a extends s implements q<d, j, Integer, d> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u0 f1039a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f1040b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f1041c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f1042d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ eh.a f1043e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0015a(u0 u0Var, boolean z10, boolean z11, i iVar, eh.a aVar) {
            super(3);
            this.f1039a = u0Var;
            this.f1040b = z10;
            this.f1041c = z11;
            this.f1042d = iVar;
            this.f1043e = aVar;
        }

        @Override // eh.q
        public final d b(d dVar, j jVar, Integer num) {
            j jVar2 = jVar;
            num.intValue();
            jVar2.L(-1525724089);
            Object objG = jVar2.g();
            if (objG == j.a.f31715a) {
                objG = new n();
                jVar2.C(objG);
            }
            m mVar = (m) objG;
            d dVarH = e.a(d.a.f1143b, mVar, this.f1039a).h(new SelectableElement(this.f1040b, mVar, null, this.f1041c, this.f1042d, this.f1043e));
            jVar2.B();
            return dVarH;
        }
    }

    public static final d a(d dVar, boolean z10, m mVar, u0 u0Var, boolean z11, i iVar, eh.a<f0> aVar) {
        d dVarA;
        if (u0Var instanceof y0) {
            dVarA = new SelectableElement(z10, mVar, (y0) u0Var, z11, iVar, aVar);
        } else if (u0Var == null) {
            dVarA = new SelectableElement(z10, mVar, null, z11, iVar, aVar);
        } else {
            d.a aVar2 = d.a.f1143b;
            if (mVar != null) {
                dVarA = e.a(aVar2, mVar, u0Var).h(new SelectableElement(z10, mVar, null, z11, iVar, aVar));
            } else {
                dVarA = androidx.compose.ui.c.a(aVar2, c3.f14686a, new C0015a(u0Var, z10, z11, iVar, aVar));
            }
        }
        return dVar.h(dVarA);
    }
}
