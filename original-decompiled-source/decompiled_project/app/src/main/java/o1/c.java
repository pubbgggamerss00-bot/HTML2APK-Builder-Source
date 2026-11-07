package o1;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f18850a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f18851b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f18852c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c[] f18853d;

    static {
        c cVar = new c("None", 0);
        f18850a = cVar;
        c cVar2 = new c("Cancelled", 1);
        f18851b = cVar2;
        c cVar3 = new c("Redirected", 2);
        f18852c = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3, new c("RedirectCancelled", 3)};
        f18853d = cVarArr;
        u2.e(cVarArr);
    }

    public c() {
        throw null;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f18853d.clone();
    }
}
