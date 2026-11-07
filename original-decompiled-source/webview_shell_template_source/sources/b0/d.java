package b0;

import c0.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import z.e;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public int f1879b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1880c;

    /* renamed from: d, reason: collision with root package name */
    public final e f1881d;

    /* renamed from: e, reason: collision with root package name */
    public final a f1882e;

    /* renamed from: f, reason: collision with root package name */
    public d f1883f;

    /* renamed from: i, reason: collision with root package name */
    public z.e f1885i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet<d> f1878a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f1884g = 0;
    public int h = Integer.MIN_VALUE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {
        public static final /* synthetic */ a[] A;
        public static final a s;

        /* renamed from: t, reason: collision with root package name */
        public static final a f1886t;

        /* renamed from: u, reason: collision with root package name */
        public static final a f1887u;

        /* renamed from: v, reason: collision with root package name */
        public static final a f1888v;

        /* renamed from: w, reason: collision with root package name */
        public static final a f1889w;

        /* renamed from: x, reason: collision with root package name */
        public static final a f1890x;

        /* renamed from: y, reason: collision with root package name */
        public static final a f1891y;

        /* renamed from: z, reason: collision with root package name */
        public static final a f1892z;

        /* JADX INFO: Fake field, exist only in values array */
        a EF0;

        static {
            a aVar = new a("NONE", 0);
            a aVar2 = new a("LEFT", 1);
            s = aVar2;
            a aVar3 = new a("TOP", 2);
            f1886t = aVar3;
            a aVar4 = new a("RIGHT", 3);
            f1887u = aVar4;
            a aVar5 = new a("BOTTOM", 4);
            f1888v = aVar5;
            a aVar6 = new a("BASELINE", 5);
            f1889w = aVar6;
            a aVar7 = new a("CENTER", 6);
            f1890x = aVar7;
            a aVar8 = new a("CENTER_X", 7);
            f1891y = aVar8;
            a aVar9 = new a("CENTER_Y", 8);
            f1892z = aVar9;
            A = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
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

    public d(e eVar, a aVar) {
        this.f1881d = eVar;
        this.f1882e = aVar;
    }

    public final void a(d dVar, int i6) {
        b(dVar, i6, Integer.MIN_VALUE, false);
    }

    public final boolean b(d dVar, int i6, int i7, boolean z6) {
        if (dVar == null) {
            j();
            return true;
        }
        if (!z6 && !i(dVar)) {
            return false;
        }
        this.f1883f = dVar;
        if (dVar.f1878a == null) {
            dVar.f1878a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f1883f.f1878a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f1884g = i6;
        this.h = i7;
        return true;
    }

    public final void c(int i6, o oVar, ArrayList arrayList) {
        HashSet<d> hashSet = this.f1878a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                c0.i.a(it.next().f1881d, i6, arrayList, oVar);
            }
        }
    }

    public final int d() {
        if (this.f1880c) {
            return this.f1879b;
        }
        return 0;
    }

    public final int e() {
        d dVar;
        if (this.f1881d.f1909i0 == 8) {
            return 0;
        }
        int i6 = this.h;
        return (i6 == Integer.MIN_VALUE || (dVar = this.f1883f) == null || dVar.f1881d.f1909i0 != 8) ? this.f1884g : i6;
    }

    public final d f() {
        a aVar = this.f1882e;
        int iOrdinal = aVar.ordinal();
        e eVar = this.f1881d;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return eVar.L;
            case 2:
                return eVar.M;
            case 3:
                return eVar.J;
            case 4:
                return eVar.K;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public final boolean g() {
        HashSet<d> hashSet = this.f1878a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f1883f != null;
    }

    public final boolean i(d dVar) {
        if (dVar == null) {
            return false;
        }
        e eVar = dVar.f1881d;
        a aVar = dVar.f1882e;
        a aVar2 = a.f1889w;
        a aVar3 = this.f1882e;
        if (aVar == aVar3) {
            return aVar3 != aVar2 || (eVar.E && this.f1881d.E);
        }
        int iOrdinal = aVar3.ordinal();
        a aVar4 = a.f1887u;
        a aVar5 = a.s;
        a aVar6 = a.f1892z;
        a aVar7 = a.f1891y;
        switch (iOrdinal) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z6 = aVar == aVar5 || aVar == aVar4;
                return eVar instanceof h ? z6 || aVar == aVar7 : z6;
            case 2:
            case 4:
                boolean z7 = aVar == a.f1886t || aVar == a.f1888v;
                return eVar instanceof h ? z7 || aVar == aVar6 : z7;
            case 5:
                return (aVar == aVar5 || aVar == aVar4) ? false : true;
            case 6:
                return (aVar == aVar2 || aVar == aVar7 || aVar == aVar6) ? false : true;
            default:
                throw new AssertionError(aVar3.name());
        }
    }

    public final void j() {
        HashSet<d> hashSet;
        d dVar = this.f1883f;
        if (dVar != null && (hashSet = dVar.f1878a) != null) {
            hashSet.remove(this);
            if (this.f1883f.f1878a.size() == 0) {
                this.f1883f.f1878a = null;
            }
        }
        this.f1878a = null;
        this.f1883f = null;
        this.f1884g = 0;
        this.h = Integer.MIN_VALUE;
        this.f1880c = false;
        this.f1879b = 0;
    }

    public final void k() {
        z.e eVar = this.f1885i;
        if (eVar == null) {
            this.f1885i = new z.e(e.a.s);
        } else {
            eVar.c();
        }
    }

    public final void l(int i6) {
        this.f1879b = i6;
        this.f1880c = true;
    }

    public final String toString() {
        return this.f1881d.f1911j0 + ":" + this.f1882e.toString();
    }
}
