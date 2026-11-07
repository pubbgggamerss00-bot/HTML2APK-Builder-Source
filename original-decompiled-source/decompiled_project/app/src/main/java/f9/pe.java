package f9;

import h8.v;

/* loaded from: classes.dex */
public final /* synthetic */ class pe implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10249a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10250b;

    public /* synthetic */ pe(Object obj, int i10) {
        this.f10249a = i10;
        this.f10250b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f10249a) {
            case 0:
                ((eh.l) this.f10250b).invoke(Integer.valueOf((int) ((Float) obj).floatValue()));
                return pg.f0.f21461a;
            default:
                return t8.y3.a((t8.y3) obj, null, null, null, null, null, null, false, null, null, null, null, 0, ((v.c) ((h8.v) this.f10250b)).f12480a, null, null, 4062591);
        }
    }
}
