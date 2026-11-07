package x8;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.FolderEntity;
import i2.e0;
import i2.g;
import j1.d;
import java.util.Map;
import t0.ff;
import t0.nf;
import t0.of;

/* loaded from: classes.dex */
public final class h0 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FolderEntity f32701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map<Long, Integer> f32702b;

    public h0(FolderEntity folderEntity, Map<Long, Integer> map) {
        this.f32701a = folderEntity;
        this.f32702b = map;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, 14);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar2);
            } else {
                jVar2.z();
            }
            ph.v1.j(g.a.f13867f, qVarA, jVar2);
            ph.v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, jVar2);
            w1.d dVarA = p0.k4.a();
            x0.s3 s3Var = t0.f2.f25858a;
            t0.t4.b(dVarA, null, null, ((t0.e2) jVar2.f(s3Var)).f25751a, jVar2, 48, 4);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar, 8), jVar2);
            FolderEntity folderEntity = this.f32701a;
            String name = folderEntity.getName();
            x0.s3 s3Var2 = of.f26647a;
            ff.b(name, null, ((t0.e2) jVar2.f(s3Var)).f25771q, 0L, x2.p.f32033f, null, 0L, null, 0L, 2, false, 1, 0, ((nf) jVar2.f(s3Var2)).f26546i, jVar2, 196608, 3120, 55258);
            Integer num2 = this.f32702b.get(Long.valueOf(folderEntity.getId()));
            int iIntValue = num2 != null ? num2.intValue() : 0;
            ff.b(f3.q.a(R.plurals.folder_project_count, iIntValue, new Object[]{Integer.valueOf(iIntValue)}, jVar2), null, ((t0.e2) jVar2.f(s3Var)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var2)).f26549l, jVar2, 0, 0, 65530);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
