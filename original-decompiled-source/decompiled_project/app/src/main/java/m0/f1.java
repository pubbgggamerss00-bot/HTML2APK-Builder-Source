package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final f1 f17320a;

    /* renamed from: b, reason: collision with root package name */
    public static final f1 f17321b;

    /* renamed from: c, reason: collision with root package name */
    public static final f1 f17322c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f1[] f17323d;

    static {
        f1 f1Var = new f1("Left", 0);
        f17320a = f1Var;
        f1 f1Var2 = new f1(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f6954n0, 1);
        f17321b = f1Var2;
        f1 f1Var3 = new f1("Right", 2);
        f17322c = f1Var3;
        f1[] f1VarArr = {f1Var, f1Var2, f1Var3};
        f17323d = f1VarArr;
        i0.u2.e(f1VarArr);
    }

    public f1() {
        throw null;
    }

    public static f1 valueOf(String str) {
        return (f1) Enum.valueOf(f1.class, str);
    }

    public static f1[] values() {
        return (f1[]) f17323d.clone();
    }
}
