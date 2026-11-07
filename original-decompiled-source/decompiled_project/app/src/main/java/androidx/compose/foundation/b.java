package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.ui.d;
import eh.q;
import j2.c3;
import kotlin.jvm.internal.s;
import pg.f0;
import q2.i;
import t.u0;
import t.x;
import t.y0;
import x.m;
import x.n;
import x0.j;

/* loaded from: classes.dex */
public final class b {

    public static final class a extends s implements q<androidx.compose.ui.d, j, Integer, androidx.compose.ui.d> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u0 f811a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f812b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f813c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f814d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ eh.a f815e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u0 u0Var, boolean z10, String str, i iVar, eh.a aVar) {
            super(3);
            this.f811a = u0Var;
            this.f812b = z10;
            this.f813c = str;
            this.f814d = iVar;
            this.f815e = aVar;
        }

        @Override // eh.q
        public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, j jVar, Integer num) {
            j jVar2 = jVar;
            num.intValue();
            jVar2.L(-1525724089);
            Object objG = jVar2.g();
            if (objG == j.a.f31715a) {
                objG = new n();
                jVar2.C(objG);
            }
            m mVar = (m) objG;
            androidx.compose.ui.d dVarH = e.a(d.a.f1143b, mVar, this.f811a).h(new ClickableElement(mVar, null, this.f812b, this.f813c, this.f814d, this.f815e));
            jVar2.B();
            return dVarH;
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, m mVar, u0 u0Var, boolean z10, String str, i iVar, eh.a<f0> aVar) {
        androidx.compose.ui.d dVarA;
        if (u0Var instanceof y0) {
            dVarA = new ClickableElement(mVar, (y0) u0Var, z10, str, iVar, aVar);
        } else if (u0Var == null) {
            dVarA = new ClickableElement(mVar, null, z10, str, iVar, aVar);
        } else {
            d.a aVar2 = d.a.f1143b;
            if (mVar != null) {
                dVarA = e.a(aVar2, mVar, u0Var).h(new ClickableElement(mVar, null, z10, str, iVar, aVar));
            } else {
                dVarA = androidx.compose.ui.c.a(aVar2, c3.f14686a, new a(u0Var, z10, str, iVar, aVar));
            }
        }
        return dVar.h(dVarA);
    }

    public static /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar, m mVar, u0 u0Var, boolean z10, i iVar, eh.a aVar, int i10) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            iVar = null;
        }
        return a(dVar, mVar, u0Var, z11, null, iVar, aVar);
    }

    public static androidx.compose.ui.d c(androidx.compose.ui.d dVar, boolean z10, String str, i iVar, eh.a aVar, int i10) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            iVar = null;
        }
        return androidx.compose.ui.c.a(dVar, c3.f14686a, new x(z10, str, iVar, aVar));
    }

    public static androidx.compose.ui.d d(androidx.compose.ui.d dVar, m mVar, eh.a aVar) {
        return dVar.h(new CombinedClickableElement(mVar, aVar));
    }

    public static final boolean e(KeyEvent keyEvent) {
        long jA = a2.d.a(keyEvent);
        int i10 = a2.b.f16n;
        if (a2.b.a(jA, a2.b.f8f) ? true : a2.b.a(jA, a2.b.f11i) ? true : a2.b.a(jA, a2.b.f15m)) {
            return true;
        }
        return a2.b.a(jA, a2.b.f10h);
    }
}
