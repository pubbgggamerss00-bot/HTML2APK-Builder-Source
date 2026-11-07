package h9;

import s8.e2;

/* loaded from: classes.dex */
public final /* synthetic */ class y2 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12900a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12901b;

    public /* synthetic */ y2(Object obj, int i10) {
        this.f12900a = i10;
        this.f12901b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f12900a) {
            case 0:
                p5.x.c(e2.m.f24643c.f24627a, (p5.x) this.f12901b);
                break;
            case 1:
                m9.s1 s1Var = (m9.s1) this.f12901b;
                s1Var.f17901d.setNight(!r1.S);
                s1Var.h();
                s1Var.i();
                break;
            default:
                ((eh.l) this.f12901b).invoke(null);
                break;
        }
        return pg.f0.f21461a;
    }
}
