package androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential;

import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1619a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1620b;

    public /* synthetic */ d(CreatePasswordCredentialController createPasswordCredentialController) {
        this.f1620b = createPasswordCredentialController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1619a) {
            case 0:
                CreatePasswordCredentialController.handleResponse$lambda$2$0((CreatePasswordCredentialController) this.f1620b);
                break;
            default:
                ((zd.b) ((Map.Entry) this.f1620b).getKey()).a();
                break;
        }
    }
}
