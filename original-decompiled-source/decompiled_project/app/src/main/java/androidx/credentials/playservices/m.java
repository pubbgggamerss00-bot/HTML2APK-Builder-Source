package androidx.credentials.playservices;

import android.content.Context;
import j9.d0;
import j9.x1;
import java.util.concurrent.Executor;
import pg.f0;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1729b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1730c;

    public /* synthetic */ m(int i10, Object obj, Object obj2) {
        this.f1728a = i10;
        this.f1729b = obj;
        this.f1730c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f1728a) {
            case 0:
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$4$0((Executor) this.f1729b, (d4.t) this.f1730c);
            default:
                d0.j((Context) this.f1729b, ((x1.a) this.f1730c).f15642g);
                return f0.f21461a;
        }
    }
}
