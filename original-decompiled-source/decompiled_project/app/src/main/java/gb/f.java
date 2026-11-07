package gb;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class f extends c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource<fb.e> f11910a;

    public f(TaskCompletionSource<fb.e> taskCompletionSource) {
        this.f11910a = taskCompletionSource;
    }

    @Override // gb.c, gb.a
    public final void y(Status status, fb.e eVar) {
        r.e(status, "status");
        v.a(status, eVar, this.f11910a);
    }
}
