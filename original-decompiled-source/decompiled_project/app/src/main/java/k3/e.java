package k3;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final e f15973a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ e[] f15974b;

    static {
        e eVar = new e("INSTANCE", 0);
        f15973a = eVar;
        f15974b = new e[]{eVar};
    }

    public e() {
        throw null;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f15974b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
