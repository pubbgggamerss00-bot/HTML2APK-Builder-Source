package androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential;

import p5.x;
import pg.f0;
import s8.b2;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1614b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f1613a = i10;
        this.f1614b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f1613a) {
            case 0:
                break;
            case 1:
                b2.e((x) this.f1614b);
                break;
            default:
                ((n1) this.f1614b).setValue(Boolean.FALSE);
                break;
        }
        return f0.f21461a;
    }
}
