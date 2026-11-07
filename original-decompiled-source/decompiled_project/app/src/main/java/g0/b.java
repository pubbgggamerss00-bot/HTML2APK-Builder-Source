package g0;

import androidx.compose.ui.d;
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
public final class b extends s implements q<androidx.compose.ui.d, j, Integer, androidx.compose.ui.d> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f11259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f11260b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.a<f0> f11261c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z10, i iVar, eh.a aVar) {
        super(3);
        this.f11259a = z10;
        this.f11260b = iVar;
        this.f11261c = aVar;
    }

    @Override // eh.q
    public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, j jVar, Integer num) {
        m mVar;
        j jVar2 = jVar;
        num.intValue();
        jVar2.L(-2124609672);
        u0 u0Var = (u0) jVar2.f(androidx.compose.foundation.e.f816a);
        if (u0Var instanceof y0) {
            jVar2.L(-1412174474);
            jVar2.B();
            mVar = null;
        } else {
            jVar2.L(-1412041856);
            Object objG = jVar2.g();
            if (objG == j.a.f31715a) {
                objG = new n();
                jVar2.C(objG);
            }
            mVar = (m) objG;
            jVar2.B();
        }
        m mVar2 = mVar;
        androidx.compose.ui.d dVarA = androidx.compose.foundation.selection.a.a(d.a.f1143b, this.f11259a, mVar2, u0Var, true, this.f11260b, this.f11261c);
        jVar2.B();
        return dVarA;
    }
}
