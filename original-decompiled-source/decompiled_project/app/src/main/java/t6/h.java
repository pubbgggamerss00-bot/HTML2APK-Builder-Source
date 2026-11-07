package t6;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final h f28020a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h[] f28021b;

    static {
        h hVar = new h("INSTANCE", 0);
        f28020a = hVar;
        f28021b = new h[]{hVar};
    }

    public h() {
        throw null;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f28021b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        kotlin.jvm.internal.r.e(command, "command");
        command.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
