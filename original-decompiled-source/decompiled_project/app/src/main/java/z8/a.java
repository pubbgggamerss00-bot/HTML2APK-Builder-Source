package z8;

import com.basitce.htmltoapk.R;
import t0.ff;
import z.n1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.b f34783a = new f1.b(-817254080, false, C0356a.f34784a);

    /* renamed from: z8.a$a, reason: collision with other inner class name */
    public static final class C0356a implements eh.q<n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0356a f34784a = new C0356a();

        @Override // eh.q
        public final pg.f0 b(n1 n1Var, x0.j jVar, Integer num) {
            n1 TextButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(TextButton, "$this$TextButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.onboarding_skip, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }
}
