package androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential;

import eh.p;
import f9.ph;
import pg.f0;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1594b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1595c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f1593a = i10;
        this.f1594b = obj;
        this.f1595c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f1593a) {
            case 0:
                return CreateDigitalCredentialController.handleResponse$lambda$4((CreateDigitalCredentialController) this.f1594b, (d4.c) this.f1595c);
            default:
                p pVar = (p) this.f1594b;
                ph phVar = (ph) this.f1595c;
                pVar.invoke(phVar.f10257b, Integer.valueOf(phVar.f10258c));
                return f0.f21461a;
        }
    }
}
