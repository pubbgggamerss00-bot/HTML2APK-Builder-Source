package androidx.compose.foundation.selection;

import androidx.compose.foundation.e;
import androidx.compose.ui.d;
import eh.l;
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
public final class b {

    public static final class a extends s implements q<d, j, Integer, d> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u0 f1044a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f1045b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f1046c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f1047d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l f1048e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u0 u0Var, boolean z10, boolean z11, i iVar, l lVar) {
            super(3);
            this.f1044a = u0Var;
            this.f1045b = z10;
            this.f1046c = z11;
            this.f1047d = iVar;
            this.f1048e = lVar;
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
            d dVarH = e.a(d.a.f1143b, mVar, this.f1044a).h(new ToggleableElement(this.f1045b, mVar, null, this.f1046c, this.f1047d, this.f1048e));
            jVar2.B();
            return dVarH;
        }
    }

    public static final d a(d dVar, boolean z10, m mVar, u0 u0Var, boolean z11, i iVar, l<? super Boolean, f0> lVar) {
        d dVarA;
        if (u0Var instanceof y0) {
            dVarA = new ToggleableElement(z10, mVar, (y0) u0Var, z11, iVar, lVar);
        } else if (u0Var == null) {
            dVarA = new ToggleableElement(z10, mVar, null, z11, iVar, lVar);
        } else {
            d.a aVar = d.a.f1143b;
            if (mVar != null) {
                dVarA = e.a(aVar, mVar, u0Var).h(new ToggleableElement(z10, mVar, null, z11, iVar, lVar));
            } else {
                dVarA = androidx.compose.ui.c.a(aVar, c3.f14686a, new a(u0Var, z10, z11, iVar, lVar));
            }
        }
        return dVar.h(dVarA);
    }

    public static final d b(eh.a aVar, i iVar, s2.a aVar2, u0 u0Var, boolean z10) {
        if (u0Var instanceof y0) {
            return new TriStateToggleableElement(aVar2, null, (y0) u0Var, z10, iVar, aVar);
        }
        if (u0Var == null) {
            return new TriStateToggleableElement(aVar2, null, null, z10, iVar, aVar);
        }
        c cVar = new c(aVar, iVar, aVar2, u0Var, z10);
        return androidx.compose.ui.c.a(d.a.f1143b, c3.f14686a, cVar);
    }
}
