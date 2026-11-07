package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import eh.l;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.s;
import pg.f0;
import ph.p0;

/* loaded from: classes2.dex */
final class zzar extends s implements l {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ p0 zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzar(TaskCompletionSource taskCompletionSource, p0 p0Var) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = p0Var;
    }

    @Override // eh.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        if (th2 instanceof CancellationException) {
            this.zza.setException((Exception) th2);
        } else {
            Throwable completionExceptionOrNull = this.zzb.getCompletionExceptionOrNull();
            if (completionExceptionOrNull == null) {
                this.zza.setResult(this.zzb.getCompleted());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                Exception runtimeExecutionException = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
                if (runtimeExecutionException == null) {
                    runtimeExecutionException = new RuntimeExecutionException(completionExceptionOrNull);
                }
                taskCompletionSource.setException(runtimeExecutionException);
            }
        }
        return f0.f21461a;
    }
}
