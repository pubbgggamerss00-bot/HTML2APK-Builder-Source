package t0;

import com.basitce.htmltoapk.R;

/* loaded from: classes.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.b f26490a = new f1.b(-505750804, false, a.f26491a);

    public static final class a extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26491a = new a(2);

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t4.b(p0.t1.a(), di.a.b(R.string.m3c_snackbar_dismiss, jVar2), null, 0L, jVar2, 0, 12);
            }
            return pg.f0.f21461a;
        }
    }
}
