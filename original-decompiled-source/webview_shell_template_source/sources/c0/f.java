package c0;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    public final p f2083d;

    /* renamed from: f, reason: collision with root package name */
    public int f2085f;

    /* renamed from: g, reason: collision with root package name */
    public int f2086g;

    /* renamed from: a, reason: collision with root package name */
    public p f2080a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2081b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2082c = false;

    /* renamed from: e, reason: collision with root package name */
    public a f2084e = a.s;
    public int h = 1;

    /* renamed from: i, reason: collision with root package name */
    public g f2087i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2088j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2089k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f2090l = new ArrayList();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {
        public static final /* synthetic */ a[] A;
        public static final a s;

        /* renamed from: t, reason: collision with root package name */
        public static final a f2091t;

        /* renamed from: u, reason: collision with root package name */
        public static final a f2092u;

        /* renamed from: v, reason: collision with root package name */
        public static final a f2093v;

        /* renamed from: w, reason: collision with root package name */
        public static final a f2094w;

        /* renamed from: x, reason: collision with root package name */
        public static final a f2095x;

        /* renamed from: y, reason: collision with root package name */
        public static final a f2096y;

        /* renamed from: z, reason: collision with root package name */
        public static final a f2097z;

        static {
            a aVar = new a("UNKNOWN", 0);
            s = aVar;
            a aVar2 = new a("HORIZONTAL_DIMENSION", 1);
            f2091t = aVar2;
            a aVar3 = new a("VERTICAL_DIMENSION", 2);
            f2092u = aVar3;
            a aVar4 = new a("LEFT", 3);
            f2093v = aVar4;
            a aVar5 = new a("RIGHT", 4);
            f2094w = aVar5;
            a aVar6 = new a("TOP", 5);
            f2095x = aVar6;
            a aVar7 = new a("BOTTOM", 6);
            f2096y = aVar7;
            a aVar8 = new a("BASELINE", 7);
            f2097z = aVar8;
            A = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) A.clone();
        }
    }

    public f(p pVar) {
        this.f2083d = pVar;
    }

    @Override // c0.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f2090l;
        int size = arrayList.size();
        int i6 = 0;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (!((f) obj).f2088j) {
                return;
            }
        }
        this.f2082c = true;
        p pVar = this.f2080a;
        if (pVar != null) {
            pVar.a(this);
        }
        if (this.f2081b) {
            this.f2083d.a(this);
            return;
        }
        int size2 = arrayList.size();
        f fVar = null;
        int i8 = 0;
        while (i8 < size2) {
            Object obj2 = arrayList.get(i8);
            i8++;
            f fVar2 = (f) obj2;
            if (!(fVar2 instanceof g)) {
                i6++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i6 == 1 && fVar.f2088j) {
            g gVar = this.f2087i;
            if (gVar != null) {
                if (!gVar.f2088j) {
                    return;
                } else {
                    this.f2085f = this.h * gVar.f2086g;
                }
            }
            d(fVar.f2086g + this.f2085f);
        }
        p pVar2 = this.f2080a;
        if (pVar2 != null) {
            pVar2.a(this);
        }
    }

    public final void b(p pVar) {
        this.f2089k.add(pVar);
        if (this.f2088j) {
            pVar.a(pVar);
        }
    }

    public final void c() {
        this.f2090l.clear();
        this.f2089k.clear();
        this.f2088j = false;
        this.f2086g = 0;
        this.f2082c = false;
        this.f2081b = false;
    }

    public void d(int i6) {
        if (this.f2088j) {
            return;
        }
        this.f2088j = true;
        this.f2086g = i6;
        ArrayList arrayList = this.f2089k;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2083d.f2112b.f1911j0);
        sb.append(":");
        sb.append(this.f2084e);
        sb.append("(");
        sb.append(this.f2088j ? Integer.valueOf(this.f2086g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f2090l.size());
        sb.append(":d=");
        sb.append(this.f2089k.size());
        sb.append(">");
        return sb.toString();
    }
}
