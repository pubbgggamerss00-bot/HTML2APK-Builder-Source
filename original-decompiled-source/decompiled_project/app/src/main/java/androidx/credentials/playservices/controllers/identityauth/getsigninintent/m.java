package androidx.credentials.playservices.controllers.identityauth.getsigninintent;

import pg.f0;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1573b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1574c;

    public /* synthetic */ m(int i10, Object obj, Object obj2) {
        this.f1572a = i10;
        this.f1573b = obj;
        this.f1574c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f1572a) {
            case 0:
                return CredentialProviderGetSignInIntentController.invokePlayServices$lambda$3$0((CredentialProviderGetSignInIntentController) this.f1573b, (e4.o) this.f1574c);
            default:
                Integer num = (Integer) this.f1573b;
                eh.l lVar = (eh.l) this.f1574c;
                if (num == null) {
                    return null;
                }
                lVar.invoke(Integer.valueOf(num.intValue() - 1));
                return f0.f21461a;
        }
    }
}
