package androidx.credentials.playservices.controllers.identityauth.createpassword;

import pg.f0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1482b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1483c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f1481a = i10;
        this.f1482b = obj;
        this.f1483c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1481a) {
            case 0:
                CredentialProviderCreatePasswordController.handleResponse$lambda$2$0((CredentialProviderCreatePasswordController) this.f1482b, (d4.c) this.f1483c);
                break;
            default:
                ((xh.j) this.f1482b).c((xh.b) this.f1483c, f0.f21461a);
                break;
        }
    }
}
