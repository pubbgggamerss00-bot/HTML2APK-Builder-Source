package j7;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f15220a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f15221b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f15222c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f15223d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f[] f15224e;

    static {
        f fVar = new f("MEMORY_CACHE", 0);
        f15220a = fVar;
        f fVar2 = new f("MEMORY", 1);
        f15221b = fVar2;
        f fVar3 = new f("DISK", 2);
        f15222c = fVar3;
        f fVar4 = new f("NETWORK", 3);
        f15223d = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
        f15224e = fVarArr;
        u2.e(fVarArr);
    }

    public f() {
        throw null;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f15224e.clone();
    }
}
