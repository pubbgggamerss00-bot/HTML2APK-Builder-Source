package androidx.room;

import i0.u2;

/* loaded from: classes.dex */
public interface t0 extends w {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3088a;

        /* renamed from: b, reason: collision with root package name */
        public static final a f3089b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a[] f3090c;

        static {
            a aVar = new a("DEFERRED", 0);
            f3088a = aVar;
            a aVar2 = new a("IMMEDIATE", 1);
            f3089b = aVar2;
            a[] aVarArr = {aVar, aVar2, new a("EXCLUSIVE", 2)};
            f3090c = aVarArr;
            u2.e(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f3090c.clone();
        }
    }

    Object b(vg.i iVar);

    Object c(a aVar, eh.p pVar, vg.i iVar);
}
