package ae;

import ae.q;
import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class s implements q.a {

    /* renamed from: a, reason: collision with root package name */
    public final o f511a;

    public s(o oVar) {
        this.f511a = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ae.q.a
    public final m a() {
        o oVar = this.f511a;
        return new m((Context) oVar.f502a.f4213a, (String) oVar.f503b.get(), oVar.f504c.get(), (Executor) oVar.f505d.f4213a, (Executor) oVar.f506e.f4213a);
    }
}
