package v8;

import pg.f0;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30703a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30704b;

    public /* synthetic */ j(Object obj, int i10) {
        this.f30703a = i10;
        this.f30704b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f30703a) {
            case 0:
                ((eh.l) this.f30704b).invoke("quick");
                break;
            default:
                ((n1) this.f30704b).setValue(Boolean.FALSE);
                break;
        }
        return f0.f21461a;
    }
}
