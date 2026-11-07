package gb;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.tasks.TaskCompletionSource;
import fb.q0;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class g extends c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource<q0> f11911a;

    public g(TaskCompletionSource<q0> taskCompletionSource) {
        this.f11911a = taskCompletionSource;
    }

    @Override // gb.c, gb.a
    public final void z(Status status, q0 q0Var) {
        r.e(status, "status");
        v.a(status, q0Var, this.f11911a);
    }
}
