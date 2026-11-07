package r2;

import android.os.Trace;
import kotlin.jvm.internal.s;
import pg.f0;

/* loaded from: classes.dex */
public final class b extends s implements eh.a<f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f23145a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(0);
        this.f23145a = cVar;
    }

    @Override // eh.a
    public final f0 invoke() {
        c cVar = this.f23145a;
        cVar.f23152g = null;
        Trace.beginSection("OnPositionedDispatch");
        try {
            cVar.a();
            f0 f0Var = f0.f21461a;
            Trace.endSection();
            return f0.f21461a;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }
}
