package mf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f18187a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f18188b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f18189c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f[] f18190d;

    static {
        f fVar = new f("TTF", 0);
        f18187a = fVar;
        f fVar2 = new f("OTF", 1);
        f18188b = fVar2;
        f fVar3 = new f("PFB", 2);
        f18189c = fVar3;
        f18190d = new f[]{fVar, fVar2, fVar3};
    }

    public f() {
        throw null;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f18190d.clone();
    }
}
