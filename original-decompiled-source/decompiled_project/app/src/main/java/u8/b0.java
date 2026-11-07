package u8;

import b9.w3;
import com.basitce.htmltoapk.R;
import t0.ff;
import x0.j;
import x0.n1;
import x8.j6;

/* loaded from: classes.dex */
public final class b0 implements eh.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29398b;

    public /* synthetic */ b0(Object obj, int i10) {
        this.f29397a = i10;
        this.f29398b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f29397a;
        Object obj3 = this.f29398b;
        switch (i10) {
            case 0:
                x0.j jVar = (x0.j) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && jVar.s()) {
                    jVar.v();
                } else {
                    Long l10 = (Long) ((n1) obj3).getValue();
                    kotlin.jvm.internal.r.b(l10);
                    ff.b(f3.q.d(R.string.cat_farm_offline_desc, new Object[]{y.m(l10.longValue())}, jVar), null, 0L, f3.u.c(15), null, null, 0L, null, f3.u.c(22), 0, false, 0, 0, null, jVar, 3072, 6, 130038);
                }
                break;
            default:
                x0.j jVar2 = (x0.j) obj;
                j6 j6Var = (j6) obj3;
                if ((((Number) obj2).intValue() & 3) == 2 && jVar2.s()) {
                    jVar2.v();
                } else {
                    jVar2.L(1095670058);
                    boolean zL = jVar2.l(j6Var);
                    Object objG = jVar2.g();
                    if (zL || objG == j.a.f31715a) {
                        objG = new w3(j6Var, 3);
                        jVar2.C(objG);
                    }
                    jVar2.B();
                    t0.x0.d((eh.a) objG, null, false, null, null, null, x8.c.A, jVar2, 805306368, 510);
                }
                break;
        }
        return pg.f0.f21461a;
    }
}
