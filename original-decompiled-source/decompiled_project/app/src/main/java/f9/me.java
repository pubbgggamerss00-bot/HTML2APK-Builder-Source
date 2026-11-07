package f9;

import h8.v;

/* loaded from: classes.dex */
public final /* synthetic */ class me implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10063a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10064b;

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f10063a) {
            case 0:
                ((eh.l) this.f10064b).invoke(Integer.valueOf((int) ((Float) obj).floatValue()));
                return pg.f0.f21461a;
            default:
                t8.y3 y3VarH = (t8.y3) obj;
                v.d dVar = (v.d) ((h8.v) this.f10064b);
                if (!dVar.f12482a.equals("planning")) {
                    y3VarH = t8.m3.h(y3VarH);
                }
                return t8.y3.a(y3VarH, null, null, null, dVar.f12482a, null, null, false, null, null, null, null, 0, null, null, null, 4194175);
        }
    }

    public /* synthetic */ me(h8.v vVar, t8.m3 m3Var) {
        this.f10064b = vVar;
    }
}
