package t;

import androidx.compose.ui.d;
import x0.j;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.s implements eh.q<androidx.compose.ui.d, x0.j, Integer, androidx.compose.ui.d> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f25403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f25404b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q2.i f25405c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f25406d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean z10, String str, q2.i iVar, eh.a<pg.f0> aVar) {
        super(3);
        this.f25403a = z10;
        this.f25404b = str;
        this.f25405c = iVar;
        this.f25406d = aVar;
    }

    @Override // eh.q
    public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, x0.j jVar, Integer num) {
        x.m mVar;
        x0.j jVar2 = jVar;
        num.intValue();
        jVar2.L(-756081143);
        u0 u0Var = (u0) jVar2.f(androidx.compose.foundation.e.f816a);
        if (u0Var instanceof y0) {
            jVar2.L(617653824);
            jVar2.B();
            mVar = null;
        } else {
            jVar2.L(617786442);
            Object objG = jVar2.g();
            if (objG == j.a.f31715a) {
                objG = new x.n();
                jVar2.C(objG);
            }
            mVar = (x.m) objG;
            jVar2.B();
        }
        x.m mVar2 = mVar;
        androidx.compose.ui.d dVarA = androidx.compose.foundation.b.a(d.a.f1143b, mVar2, u0Var, this.f25403a, this.f25404b, this.f25405c, this.f25406d);
        jVar2.B();
        return dVarA;
    }
}
