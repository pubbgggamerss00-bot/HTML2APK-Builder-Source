package t0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jd {

    /* renamed from: a, reason: collision with root package name */
    public static final jd f26173a;

    /* renamed from: b, reason: collision with root package name */
    public static final jd f26174b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ jd[] f26175c;

    static {
        jd jdVar = new jd("Dismissed", 0);
        f26173a = jdVar;
        jd jdVar2 = new jd("ActionPerformed", 1);
        f26174b = jdVar2;
        f26175c = new jd[]{jdVar, jdVar2};
    }

    public jd() {
        throw null;
    }

    public static jd valueOf(String str) {
        return (jd) Enum.valueOf(jd.class, str);
    }

    public static jd[] values() {
        return (jd[]) f26175c.clone();
    }
}
