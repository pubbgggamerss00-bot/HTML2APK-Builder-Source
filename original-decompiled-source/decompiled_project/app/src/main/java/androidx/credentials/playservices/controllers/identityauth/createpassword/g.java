package androidx.credentials.playservices.controllers.identityauth.createpassword;

import pg.f0;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1493b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1494c;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.f1492a = i10;
        this.f1493b = obj;
        this.f1494c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f1492a) {
            case 0:
                return CredentialProviderCreatePasswordController.handleResponse$lambda$2((CredentialProviderCreatePasswordController) this.f1493b, (d4.c) this.f1494c);
            default:
                n1 n1Var = (n1) this.f1493b;
                n1 n1Var2 = (n1) this.f1494c;
                n1Var.setValue(Boolean.FALSE);
                n1Var2.setValue(null);
                return f0.f21461a;
        }
    }
}
