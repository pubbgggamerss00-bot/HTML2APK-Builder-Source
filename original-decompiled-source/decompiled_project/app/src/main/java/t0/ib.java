package t0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ib {

    /* renamed from: a, reason: collision with root package name */
    public static final ib f26108a;

    /* renamed from: b, reason: collision with root package name */
    public static final ib f26109b;

    /* renamed from: c, reason: collision with root package name */
    public static final ib f26110c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ib[] f26111d;

    static {
        ib ibVar = new ib(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.X, 0);
        f26108a = ibVar;
        ib ibVar2 = new ib("Expanded", 1);
        f26109b = ibVar2;
        ib ibVar3 = new ib("PartiallyExpanded", 2);
        f26110c = ibVar3;
        f26111d = new ib[]{ibVar, ibVar2, ibVar3};
    }

    public ib() {
        throw null;
    }

    public static ib valueOf(String str) {
        return (ib) Enum.valueOf(ib.class, str);
    }

    public static ib[] values() {
        return (ib[]) f26111d.clone();
    }
}
