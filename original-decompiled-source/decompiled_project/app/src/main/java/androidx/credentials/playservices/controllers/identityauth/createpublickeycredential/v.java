package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import android.net.Uri;
import pg.f0;
import x0.r3;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1545b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1546c;

    public /* synthetic */ v(int i10, Object obj, Object obj2) {
        this.f1544a = i10;
        this.f1545b = obj;
        this.f1546c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f1544a) {
            case 0:
                return CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$3((CredentialProviderCreatePublicKeyCredentialController) this.f1545b, (e4.g) this.f1546c);
            default:
                r3 r3Var = (r3) this.f1545b;
                eh.l lVar = (eh.l) this.f1546c;
                Uri uri = (Uri) r3Var.getValue();
                if (uri != null) {
                    lVar.invoke(uri);
                }
                return f0.f21461a;
        }
    }
}
