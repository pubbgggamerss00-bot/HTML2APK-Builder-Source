package t0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class kb {

    /* renamed from: a, reason: collision with root package name */
    public static final kb f26288a;

    /* renamed from: b, reason: collision with root package name */
    public static final kb f26289b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kb[] f26290c;

    static {
        kb kbVar = new kb("THUMB", 0);
        f26288a = kbVar;
        kb kbVar2 = new kb("TRACK", 1);
        f26289b = kbVar2;
        f26290c = new kb[]{kbVar, kbVar2};
    }

    public kb() {
        throw null;
    }

    public static kb valueOf(String str) {
        return (kb) Enum.valueOf(kb.class, str);
    }

    public static kb[] values() {
        return (kb[]) f26290c.clone();
    }
}
