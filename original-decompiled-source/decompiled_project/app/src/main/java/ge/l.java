package ge;

import com.google.android.gms.tasks.TaskCompletionSource;
import ie.c;

/* loaded from: classes2.dex */
public final class l implements o {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource<String> f12036a;

    public l(TaskCompletionSource<String> taskCompletionSource) {
        this.f12036a = taskCompletionSource;
    }

    @Override // ge.o
    public final boolean a(ie.a aVar) {
        if (aVar.f() != c.a.f14520c && aVar.f() != c.a.f14521d && aVar.f() != c.a.f14522e) {
            return false;
        }
        this.f12036a.trySetResult(aVar.f14499b);
        return true;
    }

    @Override // ge.o
    public final boolean b(Exception exc) {
        return false;
    }
}
