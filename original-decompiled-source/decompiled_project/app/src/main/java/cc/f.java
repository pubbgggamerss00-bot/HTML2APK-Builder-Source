package cc;

import android.content.Context;
import android.content.IntentFilter;
import androidx.work.impl.WorkDatabase;

/* loaded from: classes2.dex */
public final class f implements dc.c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5363a;

    public /* synthetic */ f(Object obj) {
        this.f5363a = obj;
    }

    @Override // dc.c
    public Object zza() {
        return new e(new dc.n("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), (Context) ((k) this.f5363a).f5372a.f5370a);
    }

    public f(WorkDatabase workDatabase) {
        kotlin.jvm.internal.r.e(workDatabase, "workDatabase");
        this.f5363a = workDatabase;
    }
}
