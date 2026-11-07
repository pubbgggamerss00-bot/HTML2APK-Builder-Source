package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import ph.p0;
import ph.u;
import ph.v;
import ph.w;

/* loaded from: classes2.dex */
public final class zzbx {
    public static final p0 zza(Task task) {
        final v vVarA = w.a();
        task.addOnCompleteListener(zzbv.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                u uVar = vVarA;
                Exception exception = task2.getException();
                if (exception != null) {
                    uVar.d0(exception);
                } else if (task2.isCanceled()) {
                    uVar.cancel((CancellationException) null);
                } else {
                    uVar.g0(task2.getResult());
                }
            }
        });
        return new zzbw(vVarA);
    }
}
