package y2;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Choreographer f33743a;

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        this.f33743a.postFrameCallback(new Choreographer.FrameCallback() { // from class: y2.m0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                runnable.run();
            }
        });
    }
}
