package d9;

import j9.x1;
import pg.f0;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7652b;

    public /* synthetic */ s(Object obj, int i10) {
        this.f7651a = i10;
        this.f7652b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f7651a;
        Object obj = this.f7652b;
        switch (i10) {
            case 0:
                h0.e eVar = m.f7624a;
                ((n1) obj).setValue(Boolean.TRUE);
                break;
            default:
                ((x1) obj).h();
                break;
        }
        return f0.f21461a;
    }
}
