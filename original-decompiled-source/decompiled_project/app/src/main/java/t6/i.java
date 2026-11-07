package t6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f28024a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f28025b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f28026c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i[] f28027d;

    /* JADX INFO: Fake field, exist only in values array */
    i EF0;

    static {
        i iVar = new i("REPLACE", 0);
        i iVar2 = new i("KEEP", 1);
        f28024a = iVar2;
        i iVar3 = new i("APPEND", 2);
        f28025b = iVar3;
        i iVar4 = new i("APPEND_OR_REPLACE", 3);
        f28026c = iVar4;
        f28027d = new i[]{iVar, iVar2, iVar3, iVar4};
    }

    public i() {
        throw null;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f28027d.clone();
    }
}
