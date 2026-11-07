package s8;

import android.content.res.Resources;
import android.net.Uri;
import s8.e2;
import x0.j;

/* loaded from: classes.dex */
public final class j0 implements eh.r<r.n, p5.s, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.s0 f24673a;

    public j0(p5.s0 s0Var) {
        this.f24673a = s0Var;
    }

    @Override // eh.r
    public final pg.f0 f(r.n nVar, p5.s sVar, x0.j jVar, Integer num) throws Resources.NotFoundException {
        x0.j jVar2 = jVar;
        ji.a.a(num, nVar, "$this$page", sVar, "it");
        jVar2.L(140892741);
        final p5.s0 s0Var = this.f24673a;
        boolean zL = jVar2.l(s0Var);
        Object objG = jVar2.g();
        if (zL || objG == j.a.f31715a) {
            objG = new eh.p() { // from class: s8.i0
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    String prompt = (String) obj;
                    String mode = (String) obj2;
                    kotlin.jvm.internal.r.e(prompt, "prompt");
                    kotlin.jvm.internal.r.e(mode, "mode");
                    e2.c.f24633c.getClass();
                    String strA = p5.g0.a("ai_session?prompt=", Uri.encode(prompt), "&mode=", mode, "&projectId=0");
                    s0Var.b(new l9.m0(2), strA);
                    return pg.f0.f21461a;
                }
            };
            jVar2.C(objG);
        }
        jVar2.B();
        t8.w.a(s0Var, null, (eh.p) objG, jVar2, 0);
        return pg.f0.f21461a;
    }
}
