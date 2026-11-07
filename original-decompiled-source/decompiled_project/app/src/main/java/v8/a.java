package v8;

import com.basitce.htmltoapk.R;
import pg.f0;
import t0.e2;
import t0.f2;
import t0.t4;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.b f30668a = new f1.b(-709001378, false, C0310a.f30669a);

    /* renamed from: v8.a$a, reason: collision with other inner class name */
    public static final class C0310a implements eh.p<x0.j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0310a f30669a = new C0310a();

        @Override // eh.p
        public final f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t4.b(n0.a.a(), f3.q.c(R.string.common_back, jVar2), null, ((e2) jVar2.f(f2.f25858a)).f25769o, jVar2, 0, 4);
            }
            return f0.f21461a;
        }
    }
}
