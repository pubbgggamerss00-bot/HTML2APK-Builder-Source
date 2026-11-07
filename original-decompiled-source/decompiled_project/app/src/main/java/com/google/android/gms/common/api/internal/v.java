package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class v {
    public static <ResultT> void a(Status status, ResultT resultt, TaskCompletionSource<ResultT> taskCompletionSource) {
        if (status.d()) {
            taskCompletionSource.setResult(resultt);
        } else {
            taskCompletionSource.setException(b3.a.b(status));
        }
    }
}
