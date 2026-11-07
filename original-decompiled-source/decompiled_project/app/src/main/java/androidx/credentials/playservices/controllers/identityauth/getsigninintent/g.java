package androidx.credentials.playservices.controllers.identityauth.getsigninintent;

import android.content.Context;
import com.basitce.htmltoapk.R;
import pg.f0;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1560b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1561c;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.f1559a = i10;
        this.f1560b = obj;
        this.f1561c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f1559a;
        Object obj = this.f1561c;
        Object obj2 = this.f1560b;
        switch (i10) {
            case 0:
                return CredentialProviderGetSignInIntentController.handleResponse$lambda$5((CredentialProviderGetSignInIntentController) obj2, (e4.r) obj);
            default:
                hf.a.a((c.k) obj2, (Context) obj, "application/pdf", R.string.launch_no_app);
                return f0.f21461a;
        }
    }
}
