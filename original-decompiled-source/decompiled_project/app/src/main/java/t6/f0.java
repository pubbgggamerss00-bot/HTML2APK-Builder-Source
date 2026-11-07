package t6;

import androidx.work.Worker;

/* loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.s implements eh.a<j> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Worker f28017a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Worker worker) {
        super(0);
        this.f28017a = worker;
    }

    @Override // eh.a
    public final j invoke() {
        this.f28017a.getClass();
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }
}
