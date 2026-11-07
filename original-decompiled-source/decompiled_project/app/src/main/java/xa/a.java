package xa;

import android.os.Looper;
import com.google.android.gms.internal.common.zzh;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final zzh f33532a;

    public a(Looper looper) {
        this.f33532a = new zzh(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f33532a.post(runnable);
    }
}
