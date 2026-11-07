package g0;

import androidx.compose.ui.d;
import eh.l;
import eh.q;
import kotlin.jvm.internal.s;
import pg.f0;
import q2.i;
import t.u0;
import t.y0;
import x.m;
import x.n;
import x0.j;

/* loaded from: classes.dex */
public final class d extends s implements q<androidx.compose.ui.d, j, Integer, androidx.compose.ui.d> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f11262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11263b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f11264c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l<Boolean, f0> f11265d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(boolean z10, boolean z11, i iVar, l<? super Boolean, f0> lVar) {
        super(3);
        this.f11262a = z10;
        this.f11263b = z11;
        this.f11264c = iVar;
        this.f11265d = lVar;
    }

    @Override // eh.q
    public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, j jVar, Integer num) {
        m mVar;
        j jVar2 = jVar;
        num.intValue();
        jVar2.L(290332169);
        u0 u0Var = (u0) jVar2.f(androidx.compose.foundation.e.f816a);
        if (u0Var instanceof y0) {
            jVar2.L(-2130062114);
            jVar2.B();
            mVar = null;
        } else {
            jVar2.L(-2129929496);
            Object objG = jVar2.g();
            if (objG == j.a.f31715a) {
                objG = new n();
                jVar2.C(objG);
            }
            mVar = (m) objG;
            jVar2.B();
        }
        m mVar2 = mVar;
        androidx.compose.ui.d dVarA = androidx.compose.foundation.selection.b.a(d.a.f1143b, this.f11262a, mVar2, u0Var, this.f11263b, this.f11264c, this.f11265d);
        jVar2.B();
        return dVarA;
    }
}
