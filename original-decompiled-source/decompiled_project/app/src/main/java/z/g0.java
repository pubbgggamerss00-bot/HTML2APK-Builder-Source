package z;

import i0.u2;

@pg.d
/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f34512a = a.f34514b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34513a;

        /* renamed from: b, reason: collision with root package name */
        public static final a f34514b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f34515c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f34516d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a[] f34517e;

        static {
            a aVar = new a("Visible", 0);
            f34513a = aVar;
            a aVar2 = new a("Clip", 1);
            f34514b = aVar2;
            a aVar3 = new a("ExpandIndicator", 2);
            f34515c = aVar3;
            a aVar4 = new a("ExpandOrCollapseIndicator", 3);
            f34516d = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            f34517e = aVarArr;
            u2.e(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f34517e.clone();
        }
    }

    public g0(int i10) {
    }
}
