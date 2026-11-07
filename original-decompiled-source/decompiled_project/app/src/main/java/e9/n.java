package e9;

import java.io.File;
import p5.e1;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8469a;

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f8469a) {
            case 0:
                p5.w0 navigate = (p5.w0) obj;
                kotlin.jvm.internal.r.e(navigate, "$this$navigate");
                o oVar = new o();
                navigate.f21299d = 0;
                navigate.f21301f = false;
                e1 e1Var = new e1();
                oVar.invoke(e1Var);
                navigate.f21301f = e1Var.f21207a;
                navigate.f21302g = e1Var.f21208b;
                return pg.f0.f21461a;
            default:
                File it = (File) obj;
                kotlin.jvm.internal.r.e(it, "it");
                return ah.l.k(it, mh.a.f18238b);
        }
    }
}
