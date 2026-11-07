package zc;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import zc.r;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f35013b = new i();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<r> f35014a = new AtomicReference<>(new r(new r.a()));

    public final synchronized void a(o oVar) throws GeneralSecurityException {
        r.a aVar = new r.a(this.f35014a.get());
        aVar.a(oVar);
        this.f35014a.set(new r(aVar));
    }
}
