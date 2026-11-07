package qc;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class f implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final f f22633a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f[] f22634b;

    static {
        f fVar = new f("INSTANCE", 0);
        f22633a = fVar;
        f22634b = new f[]{fVar};
    }

    public f() {
        throw null;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f22634b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
