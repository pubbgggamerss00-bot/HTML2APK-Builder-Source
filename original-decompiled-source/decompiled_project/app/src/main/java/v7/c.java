package v7;

import eh.l;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import pg.f0;
import pg.q;
import ph.m;

/* loaded from: classes.dex */
public final class c implements Callback, l<Throwable, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final Call f30657a;

    /* renamed from: b, reason: collision with root package name */
    public final m f30658b;

    public c(Call call, m mVar) {
        this.f30657a = call;
        this.f30658b = mVar;
    }

    @Override // okhttp3.Callback
    public final void a(Call call, Response response) {
        this.f30658b.resumeWith(response);
    }

    @Override // okhttp3.Callback
    public final void c(Call call, IOException iOException) {
        if (call.isCanceled()) {
            return;
        }
        this.f30658b.resumeWith(q.a(iOException));
    }

    @Override // eh.l
    public final f0 invoke(Throwable th2) {
        try {
            this.f30657a.cancel();
        } catch (Throwable unused) {
        }
        return f0.f21461a;
    }
}
