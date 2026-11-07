package m7;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ h[] f17706a;

    static {
        h[] hVarArr = {new h("UNCHANGED", 0), new h("TRANSLUCENT", 1), new h("OPAQUE", 2)};
        f17706a = hVarArr;
        u2.e(hVarArr);
    }

    public h() {
        throw null;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f17706a.clone();
    }
}
