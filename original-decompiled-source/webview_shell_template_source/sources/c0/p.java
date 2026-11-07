package c0;

import b0.e;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f2111a;

    /* renamed from: b, reason: collision with root package name */
    public b0.e f2112b;

    /* renamed from: c, reason: collision with root package name */
    public m f2113c;

    /* renamed from: d, reason: collision with root package name */
    public e.a f2114d;

    /* renamed from: e, reason: collision with root package name */
    public final g f2115e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f2116f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2117g = false;
    public final f h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public final f f2118i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public a f2119j = a.s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {
        public static final a s;

        /* renamed from: t, reason: collision with root package name */
        public static final a f2120t;

        /* renamed from: u, reason: collision with root package name */
        public static final /* synthetic */ a[] f2121u;

        static {
            a aVar = new a("NONE", 0);
            s = aVar;
            a aVar2 = new a("START", 1);
            a aVar3 = new a("END", 2);
            a aVar4 = new a("CENTER", 3);
            f2120t = aVar4;
            f2121u = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f2121u.clone();
        }
    }

    public p(b0.e eVar) {
        this.f2112b = eVar;
    }

    public static void b(f fVar, f fVar2, int i6) {
        fVar.f2090l.add(fVar2);
        fVar.f2085f = i6;
        fVar2.f2089k.add(fVar);
    }

    public static f h(b0.d dVar) {
        b0.d dVar2 = dVar.f1883f;
        if (dVar2 == null) {
            return null;
        }
        b0.e eVar = dVar2.f1881d;
        int iOrdinal = dVar2.f1882e.ordinal();
        if (iOrdinal == 1) {
            return eVar.f1899d.h;
        }
        if (iOrdinal == 2) {
            return eVar.f1901e.h;
        }
        if (iOrdinal == 3) {
            return eVar.f1899d.f2118i;
        }
        if (iOrdinal == 4) {
            return eVar.f1901e.f2118i;
        }
        if (iOrdinal != 5) {
            return null;
        }
        return eVar.f1901e.f2103k;
    }

    public static f i(b0.d dVar, int i6) {
        b0.d dVar2 = dVar.f1883f;
        if (dVar2 == null) {
            return null;
        }
        b0.e eVar = dVar2.f1881d;
        p pVar = i6 == 0 ? eVar.f1899d : eVar.f1901e;
        int iOrdinal = dVar2.f1882e.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return pVar.h;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return pVar.f2118i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i6, g gVar) {
        fVar.f2090l.add(fVar2);
        fVar.f2090l.add(this.f2115e);
        fVar.h = i6;
        fVar.f2087i = gVar;
        fVar2.f2089k.add(fVar);
        gVar.f2089k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i6, int i7) {
        if (i7 == 0) {
            b0.e eVar = this.f2112b;
            int i8 = eVar.f1928v;
            int iMax = Math.max(eVar.f1927u, i6);
            if (i8 > 0) {
                iMax = Math.min(i8, i6);
            }
            if (iMax != i6) {
                return iMax;
            }
        } else {
            b0.e eVar2 = this.f2112b;
            int i9 = eVar2.f1931y;
            int iMax2 = Math.max(eVar2.f1930x, i6);
            if (i9 > 0) {
                iMax2 = Math.min(i9, i6);
            }
            if (iMax2 != i6) {
                return iMax2;
            }
        }
        return i6;
    }

    public long j() {
        if (this.f2115e.f2088j) {
            return r0.f2086g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(b0.d dVar, b0.d dVar2, int i6) {
        f fVarH = h(dVar);
        f fVarH2 = h(dVar2);
        if (fVarH.f2088j && fVarH2.f2088j) {
            int iE = dVar.e() + fVarH.f2086g;
            int iE2 = fVarH2.f2086g - dVar2.e();
            int i7 = iE2 - iE;
            g gVar = this.f2115e;
            if (!gVar.f2088j) {
                e.a aVar = this.f2114d;
                e.a aVar2 = e.a.f1934u;
                if (aVar == aVar2) {
                    int i8 = this.f2111a;
                    if (i8 == 0) {
                        gVar.d(g(i7, i6));
                    } else if (i8 == 1) {
                        gVar.d(Math.min(g(gVar.f2098m, i6), i7));
                    } else if (i8 == 2) {
                        b0.e eVar = this.f2112b;
                        b0.e eVar2 = eVar.V;
                        if (eVar2 != null) {
                            if ((i6 == 0 ? eVar2.f1899d : eVar2.f1901e).f2115e.f2088j) {
                                gVar.d(g((int) ((r6.f2086g * (i6 == 0 ? eVar.f1929w : eVar.f1932z)) + 0.5f), i6));
                            }
                        }
                    } else if (i8 == 3) {
                        b0.e eVar3 = this.f2112b;
                        p pVar = eVar3.f1899d;
                        if (pVar.f2114d == aVar2 && pVar.f2111a == 3) {
                            n nVar = eVar3.f1901e;
                            if (nVar.f2114d != aVar2 || nVar.f2111a != 3) {
                            }
                        } else {
                            if (i6 == 0) {
                                pVar = eVar3.f1901e;
                            }
                            if (pVar.f2115e.f2088j) {
                                float f6 = eVar3.Y;
                                gVar.d(i6 == 1 ? (int) ((r6.f2086g / f6) + 0.5f) : (int) ((f6 * r6.f2086g) + 0.5f));
                            }
                        }
                    }
                }
            }
            if (gVar.f2088j) {
                int i9 = gVar.f2086g;
                f fVar = this.f2118i;
                f fVar2 = this.h;
                if (i9 == i7) {
                    fVar2.d(iE);
                    fVar.d(iE2);
                    return;
                }
                float f7 = i6 == 0 ? this.f2112b.f1904f0 : this.f2112b.f1906g0;
                if (fVarH == fVarH2) {
                    iE = fVarH.f2086g;
                    iE2 = fVarH2.f2086g;
                    f7 = 0.5f;
                }
                fVar2.d((int) ((((iE2 - iE) - i9) * f7) + iE + 0.5f));
                fVar.d(fVar2.f2086g + gVar.f2086g);
            }
        }
    }

    @Override // c0.d
    public void a(d dVar) {
    }
}
