package g2;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f11434a;

    /* renamed from: b, reason: collision with root package name */
    public static final s f11435b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ s[] f11436c;

    static {
        s sVar = new s("Width", 0);
        f11434a = sVar;
        s sVar2 = new s("Height", 1);
        f11435b = sVar2;
        s[] sVarArr = {sVar, sVar2};
        f11436c = sVarArr;
        u2.e(sVarArr);
    }

    public s() {
        throw null;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f11436c.clone();
    }
}
