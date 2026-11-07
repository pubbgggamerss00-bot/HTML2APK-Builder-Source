package t0;

import androidx.compose.material3.MinimumInteractiveModifier;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;

/* loaded from: classes.dex */
public final class rd extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f26905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1.f2 f26906b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f26907c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f26908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t.v f26909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f26910f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x.m f26911g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f26912h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f26913j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f26914k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f1.b f26915l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(androidx.compose.ui.d dVar, q1.f2 f2Var, long j10, float f10, t.v vVar, boolean z10, x.m mVar, boolean z11, eh.a aVar, float f11, f1.b bVar) {
        super(2);
        this.f26905a = dVar;
        this.f26906b = f2Var;
        this.f26907c = j10;
        this.f26908d = f10;
        this.f26909e = vVar;
        this.f26910f = z10;
        this.f26911g = mVar;
        this.f26912h = z11;
        this.f26913j = aVar;
        this.f26914k = f11;
        this.f26915l = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            x0.s3 s3Var = w4.f27281a;
            androidx.compose.ui.d dVarA = androidx.compose.foundation.selection.a.a(md.c(this.f26905a.h(MinimumInteractiveModifier.f1120b), this.f26906b, md.d(this.f26907c, this.f26908d, jVar2), this.f26909e, ((f3.d) jVar2.f(j2.j2.f14779h)).N0(this.f26914k)), this.f26910f, this.f26911g, ha.a(false, CropImageView.DEFAULT_ASPECT_RATIO, 0L, jVar2, 0, 7), this.f26912h, null, this.f26913j);
            g2.l0 l0VarD = z.g.d(d.a.f14602a, true);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarA, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar);
            } else {
                jVar2.z();
            }
            ph.v1.j(g.a.f13867f, l0VarD, jVar2);
            ph.v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, jVar2);
            this.f26915l.invoke(jVar2, 0);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
