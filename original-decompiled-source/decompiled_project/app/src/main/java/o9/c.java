package o9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f19063a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f19064b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f19065c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c[] f19066d;

    static {
        c cVar = new c("DEFAULT", 0);
        f19063a = cVar;
        c cVar2 = new c("VERY_LOW", 1);
        f19064b = cVar2;
        c cVar3 = new c("HIGHEST", 2);
        f19065c = cVar3;
        f19066d = new c[]{cVar, cVar2, cVar3};
    }

    public c() {
        throw null;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f19066d.clone();
    }
}
