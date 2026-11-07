package t0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class sa {

    /* renamed from: a, reason: collision with root package name */
    public static final sa f26968a;

    /* renamed from: b, reason: collision with root package name */
    public static final sa f26969b;

    /* renamed from: c, reason: collision with root package name */
    public static final sa f26970c;

    /* renamed from: d, reason: collision with root package name */
    public static final sa f26971d;

    /* renamed from: e, reason: collision with root package name */
    public static final sa f26972e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ sa[] f26973f;

    static {
        sa saVar = new sa("TopBar", 0);
        f26968a = saVar;
        sa saVar2 = new sa("MainContent", 1);
        f26969b = saVar2;
        sa saVar3 = new sa("Snackbar", 2);
        f26970c = saVar3;
        sa saVar4 = new sa("Fab", 3);
        f26971d = saVar4;
        sa saVar5 = new sa("BottomBar", 4);
        f26972e = saVar5;
        f26973f = new sa[]{saVar, saVar2, saVar3, saVar4, saVar5};
    }

    public sa() {
        throw null;
    }

    public static sa valueOf(String str) {
        return (sa) Enum.valueOf(sa.class, str);
    }

    public static sa[] values() {
        return (sa[]) f26973f.clone();
    }
}
