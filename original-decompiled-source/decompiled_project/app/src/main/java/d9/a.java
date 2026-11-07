package d9;

import com.basitce.htmltoapk.R;
import p0.n2;
import pg.f0;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.t4;
import z.n1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.b f7579a = new f1.b(1032942238, false, C0081a.f7584a);

    /* renamed from: b, reason: collision with root package name */
    public static final f1.b f7580b = new f1.b(1031958938, false, b.f7585a);

    /* renamed from: c, reason: collision with root package name */
    public static final f1.b f7581c = new f1.b(1979125881, false, c.f7586a);

    /* renamed from: d, reason: collision with root package name */
    public static final f1.b f7582d = new f1.b(-1368674472, false, d.f7587a);

    /* renamed from: e, reason: collision with root package name */
    public static final f1.b f7583e = new f1.b(-1146904527, false, e.f7588a);

    /* renamed from: d9.a$a, reason: collision with other inner class name */
    public static final class C0081a implements eh.q<n1, x0.j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0081a f7584a = new C0081a();

        @Override // eh.q
        public final f0 b(n1 n1Var, x0.j jVar, Integer num) {
            n1 TextButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(TextButton, "$this$TextButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.common_cancel, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return f0.f21461a;
        }
    }

    public static final class b implements eh.p<x0.j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7585a = new b();

        @Override // eh.p
        public final f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t4.b(n2.a(), null, null, ((e2) jVar2.f(f2.f25858a)).f25777w, jVar2, 48, 4);
            }
            return f0.f21461a;
        }
    }

    public static final class c implements eh.p<x0.j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f7586a = new c();

        @Override // eh.p
        public final f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.profile_delete_account_title, jVar2), null, 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 196608, 0, 131038);
            }
            return f0.f21461a;
        }
    }

    public static final class d implements eh.p<x0.j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f7587a = new d();

        @Override // eh.p
        public final f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.profile_delete_account_message, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return f0.f21461a;
        }
    }

    public static final class e implements eh.q<n1, x0.j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f7588a = new e();

        @Override // eh.q
        public final f0 b(n1 n1Var, x0.j jVar, Integer num) {
            n1 Button = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Button, "$this$Button");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.profile_buy_credits, jVar2), null, 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 196608, 0, 131038);
            }
            return f0.f21461a;
        }
    }
}
