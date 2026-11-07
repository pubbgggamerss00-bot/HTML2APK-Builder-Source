package td;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class v implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final v f28756a;

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f28757b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ v[] f28758c;

    static {
        v vVar = new v("INSTANCE", 0);
        f28756a = vVar;
        f28758c = new v[]{vVar};
        f28757b = new Handler(Looper.getMainLooper());
    }

    public v() {
        throw null;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f28758c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f28757b.post(runnable);
    }
}
