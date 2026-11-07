package y6;

import android.net.ConnectivityManager;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.s;
import pg.f0;

/* loaded from: classes.dex */
public final class c extends s implements eh.a<f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f33961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConnectivityManager f33962b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f33963c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b0 b0Var, ConnectivityManager connectivityManager, d dVar) {
        super(0);
        this.f33961a = b0Var;
        this.f33962b = connectivityManager;
        this.f33963c = dVar;
    }

    @Override // eh.a
    public final f0 invoke() {
        if (this.f33961a.f16318a) {
            t6.s.d().a(n.f34000a, "NetworkRequestConstraintController unregister callback");
            this.f33962b.unregisterNetworkCallback(this.f33963c);
        }
        return f0.f21461a;
    }
}
