package bh;

import i0.u2;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0055a f4234c;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4235a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4236b;

    /* renamed from: bh.a$a, reason: collision with other inner class name */
    public static final class C0055a extends a {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b[] f4237a;

        static {
            b[] bVarArr = {new b("PRESENT", 0), new b("ABSENT", 1), new b("PRESENT_OPTIONAL", 2), new b("ABSENT_OPTIONAL", 3)};
            f4237a = bVarArr;
            u2.e(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f4237a.clone();
        }
    }

    static {
        b[] bVarArr = b.f4237a;
        f4234c = new C0055a(false, false);
        new a(true, false);
        new a(false, true);
    }

    public a(boolean z10, boolean z11) {
        b[] bVarArr = b.f4237a;
        this.f4235a = z10;
        this.f4236b = z11;
        if (z10 && z11) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
