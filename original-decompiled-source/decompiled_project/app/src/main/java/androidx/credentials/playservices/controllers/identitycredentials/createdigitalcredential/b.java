package androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1590b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f1589a = i10;
        this.f1590b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f1589a) {
            case 0:
                return CreateDigitalCredentialController.handleResponse$lambda$2((CreateDigitalCredentialController) this.f1590b);
            default:
                return null;
        }
    }
}
