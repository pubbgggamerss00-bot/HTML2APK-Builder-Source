package androidx.credentials.playservices;

import java.util.concurrent.Executor;
import pg.f0;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1735a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1736b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1737c;

    public /* synthetic */ p(int i10, Object obj, Object obj2) {
        this.f1735a = i10;
        this.f1736b = obj;
        this.f1737c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f1735a;
        Object obj = this.f1737c;
        Object obj2 = this.f1736b;
        switch (i10) {
            case 0:
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$1$0((Executor) obj2, (d4.t) obj);
            default:
                float f10 = x8.s.f33139a;
                ((n1) obj2).setValue(null);
                ((n1) obj).setValue(null);
                return f0.f21461a;
        }
    }
}
