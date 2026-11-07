package androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential;

import b9.j0;
import b9.o1;
import d4.t;
import java.util.concurrent.Executor;
import pg.f0;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1670a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1671b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1672c;

    public /* synthetic */ n(int i10, Object obj, Object obj2) {
        this.f1670a = i10;
        this.f1671b = obj;
        this.f1672c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f1670a) {
            case 0:
                return CreatePublicKeyCredentialController.invokePlayServices$lambda$0$3((Executor) this.f1671b, (t) this.f1672c);
            default:
                j0 j0Var = (j0) this.f1671b;
                o1.p.a(j0Var.f3904k, (n1) this.f1672c);
                return f0.f21461a;
        }
    }
}
