package d4;

import android.app.Activity;
import android.os.CancellationSignal;

/* loaded from: classes.dex */
public interface s {
    default Object a(Activity context, x0 x0Var, g8.q qVar) throws Throwable {
        ph.m mVar = new ph.m(1, ah.p.c(qVar));
        mVar.p();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.s(new q(cancellationSignal));
        r rVar = new r(mVar);
        n nVar = new n();
        kotlin.jvm.internal.r.e(context, "context");
        w wVarA = x.a(new x(context), x0Var);
        if (wVarA == null) {
            rVar.a(new e4.q("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            wVarA.onGetCredential(context, x0Var, cancellationSignal, nVar, rVar);
        }
        Object objO = mVar.o();
        ug.a aVar = ug.a.f29706a;
        return objO;
    }

    default Object b(a aVar, g8.r rVar) throws Throwable {
        ph.m mVar = new ph.m(1, ah.p.c(rVar));
        mVar.p();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.s(new o(cancellationSignal));
        p pVar = new p(mVar);
        n nVar = new n();
        w wVarA = x.a(new x(((u) this).f7361a), aVar.f7350a);
        if (wVarA == null) {
            pVar.a(new e4.b());
        } else {
            wVarA.onClearCredential(aVar, cancellationSignal, nVar, pVar);
        }
        Object objO = mVar.o();
        return objO == ug.a.f29706a ? objO : pg.f0.f21461a;
    }
}
