package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import f9.d1;
import java.util.List;
import pg.f0;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1529a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1530b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1531c;

    public /* synthetic */ n(int i10, Object obj, Object obj2) {
        this.f1529a = i10;
        this.f1530b = obj;
        this.f1531c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f1529a;
        Object obj = this.f1531c;
        Object obj2 = this.f1530b;
        switch (i10) {
            case 0:
                return CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$4$0((CredentialProviderCreatePublicKeyCredentialController) obj2, (e4.g) obj);
            default:
                List<String> list = d1.f9265a;
                Boolean bool = Boolean.TRUE;
                ((n1) obj2).setValue(bool);
                ((n1) obj).setValue(bool);
                return f0.f21461a;
        }
    }
}
