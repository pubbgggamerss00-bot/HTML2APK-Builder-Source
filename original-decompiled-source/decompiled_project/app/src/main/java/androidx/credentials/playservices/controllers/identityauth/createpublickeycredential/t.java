package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import f9.fg;
import pg.f0;
import sh.z0;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1542b;

    public /* synthetic */ t(Object obj, int i10) {
        this.f1541a = i10;
        this.f1542b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f1541a) {
            case 0:
                return CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$1((CredentialProviderCreatePublicKeyCredentialController) this.f1542b, (e4.g) obj);
            default:
                fg fgVar = (fg) this.f1542b;
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                z0 z0Var = fgVar.f9602z;
                z0Var.getClass();
                z0Var.j(null, it);
                return f0.f21461a;
        }
    }
}
