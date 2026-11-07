package v5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h {
    public static final /* synthetic */ h[] s = {new h("PUBLIC", 0), new h("PROTECTED", 1), new h("INTERNAL", 2), new h("PRIVATE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    h EF5;

    public h() {
        throw null;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) s.clone();
    }
}
