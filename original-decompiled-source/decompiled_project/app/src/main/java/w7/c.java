package w7;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f31321c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c[] f31322d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f31323a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f31324b;

    static {
        c cVar = new c("ENABLED", 0, true, true);
        f31321c = cVar;
        c[] cVarArr = {cVar, new c("READ_ONLY", 1, true, false), new c("WRITE_ONLY", 2, false, true), new c("DISABLED", 3, false, false)};
        f31322d = cVarArr;
        u2.e(cVarArr);
    }

    public c(String str, int i10, boolean z10, boolean z11) {
        this.f31323a = z10;
        this.f31324b = z11;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f31322d.clone();
    }
}
