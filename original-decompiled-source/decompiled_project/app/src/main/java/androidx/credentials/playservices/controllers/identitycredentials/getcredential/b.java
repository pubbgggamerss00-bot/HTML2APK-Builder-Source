package androidx.credentials.playservices.controllers.identitycredentials.getcredential;

import d4.t;
import eh.l;
import java.util.concurrent.Executor;
import pg.f0;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1681a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1682b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1683c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.f1681a = i10;
        this.f1682b = obj;
        this.f1683c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.a
    public final Object invoke() {
        switch (this.f1681a) {
            case 0:
                return GetCredentialController.invokePlayServices$lambda$0$0((Executor) this.f1682b, (t) this.f1683c);
            default:
                ((l) this.f1682b).invoke((String) ((n1) this.f1683c).getValue());
                return f0.f21461a;
        }
    }
}
