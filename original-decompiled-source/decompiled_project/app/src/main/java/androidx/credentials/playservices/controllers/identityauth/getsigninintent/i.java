package androidx.credentials.playservices.controllers.identityauth.getsigninintent;

import pg.f0;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1565b;

    public /* synthetic */ i(Object obj, int i10) {
        this.f1564a = i10;
        this.f1565b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f1564a) {
            case 0:
                return CredentialProviderGetSignInIntentController.invokePlayServices$lambda$1$0((CredentialProviderGetSignInIntentController) this.f1565b);
            default:
                ((n1) this.f1565b).setValue(Boolean.TRUE);
                return f0.f21461a;
        }
    }
}
