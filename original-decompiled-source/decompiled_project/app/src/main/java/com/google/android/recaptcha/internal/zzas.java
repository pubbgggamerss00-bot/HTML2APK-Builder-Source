package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ph.p0;

/* loaded from: classes2.dex */
public final class zzas {
    public static final Task zza(p0 p0Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        p0Var.invokeOnCompletion(new zzar(taskCompletionSource, p0Var));
        return taskCompletionSource.getTask();
    }
}
