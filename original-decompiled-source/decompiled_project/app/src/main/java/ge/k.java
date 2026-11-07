package ge;

import com.google.android.gms.tasks.TaskCompletionSource;
import ie.c;

/* loaded from: classes2.dex */
public final class k implements o {

    /* renamed from: a, reason: collision with root package name */
    public final p f12034a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource<m> f12035b;

    public k(p pVar, TaskCompletionSource<m> taskCompletionSource) {
        this.f12034a = pVar;
        this.f12035b = taskCompletionSource;
    }

    @Override // ge.o
    public final boolean a(ie.a aVar) {
        if (aVar.f() != c.a.f14521d || this.f12034a.a(aVar)) {
            return false;
        }
        String str = aVar.f14501d;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f12035b.setResult(new a(str, aVar.f14503f, aVar.f14504g));
        return true;
    }

    @Override // ge.o
    public final boolean b(Exception exc) {
        this.f12035b.trySetException(exc);
        return true;
    }
}
