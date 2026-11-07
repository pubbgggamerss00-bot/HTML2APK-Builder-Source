package androidx.credentials.playservices.controllers.identityauth.getsigninintent;

import d4.y0;
import java.util.ArrayList;
import java.util.List;
import pg.f0;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1552b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1553c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f1551a = i10;
        this.f1552b = obj;
        this.f1553c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f1551a) {
            case 0:
                return CredentialProviderGetSignInIntentController.handleResponse$lambda$2((CredentialProviderGetSignInIntentController) this.f1552b, (y0) this.f1553c);
            default:
                ArrayList arrayList = (ArrayList) this.f1552b;
                n1 n1Var = (n1) this.f1553c;
                if (kotlin.jvm.internal.r.a((List) n1Var.getValue(), arrayList)) {
                    n1Var.setValue(null);
                }
                return f0.f21461a;
        }
    }
}
