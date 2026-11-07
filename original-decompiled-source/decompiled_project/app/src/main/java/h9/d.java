package h9;

import com.basitce.htmltoapk.R;
import t0.ff;
import t0.t4;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.b f12575a = new f1.b(-215513269, false, a.f12577a);

    /* renamed from: b, reason: collision with root package name */
    public static final f1.b f12576b = new f1.b(321162090, false, b.f12578a);

    public static final class a implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f12577a = new a();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.guide_title, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f12578a = new b();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t4.b(n0.a.a(), f3.q.c(R.string.common_back, jVar2), null, 0L, jVar2, 0, 12);
            }
            return pg.f0.f21461a;
        }
    }
}
