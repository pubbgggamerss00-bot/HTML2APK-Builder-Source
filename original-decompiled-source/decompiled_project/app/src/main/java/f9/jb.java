package f9;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class jb implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f9885a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg f9886b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p5.x f9887c;

    public jb(long j10, fg fgVar, p5.x xVar) {
        this.f9885a = j10;
        this.f9886b = fgVar;
        this.f9887c = xVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            f1.b bVarB = f1.c.b(-124308910, new hb(this.f9885a), jVar2);
            f1.b bVarB2 = f1.c.b(-523815340, new ib(this.f9886b, this.f9887c), jVar2);
            float f10 = t0.mf.f26477a;
            t0.g0.b(bVarB, null, bVarB2, null, CropImageView.DEFAULT_ASPECT_RATIO, null, t0.mf.a(q1.b1.f21653g, 0L, 0L, jVar2, 30), jVar2, 390, 186);
        }
        return pg.f0.f21461a;
    }
}
