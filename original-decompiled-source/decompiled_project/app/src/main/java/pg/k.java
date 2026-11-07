package pg;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f21466a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f21467b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ k[] f21468c;

    static {
        k kVar = new k("SYNCHRONIZED", 0);
        k kVar2 = new k("PUBLICATION", 1);
        f21466a = kVar2;
        k kVar3 = new k("NONE", 2);
        f21467b = kVar3;
        k[] kVarArr = {kVar, kVar2, kVar3};
        f21468c = kVarArr;
        u2.e(kVarArr);
    }

    public k() {
        throw null;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f21468c.clone();
    }
}
