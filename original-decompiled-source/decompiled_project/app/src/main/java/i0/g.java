package i0;

import androidx.compose.ui.d;
import x0.j;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.s implements eh.q<androidx.compose.ui.d, x0.j, Integer, androidx.compose.ui.d> {

    /* renamed from: a, reason: collision with root package name */
    public static final g f13289a = new g(3);

    @Override // eh.q
    public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, x0.j jVar, Integer num) {
        androidx.compose.ui.d dVar2 = dVar;
        x0.j jVar2 = jVar;
        num.intValue();
        jVar2.L(-2126899193);
        long j10 = ((m0.q3) jVar2.f(m0.r3.f17501a)).f17464a;
        boolean zJ = jVar2.j(j10);
        Object objG = jVar2.g();
        if (zJ || objG == j.a.f31715a) {
            objG = new f(j10);
            jVar2.C(objG);
        }
        androidx.compose.ui.d dVarH = dVar2.h(androidx.compose.ui.draw.a.b(d.a.f1143b, (eh.l) objG));
        jVar2.B();
        return dVarH;
    }
}
