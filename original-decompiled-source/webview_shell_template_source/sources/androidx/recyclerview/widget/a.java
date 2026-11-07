package androidx.recyclerview.widget;

import androidx.camera.camera2.internal.p0;
import com.google.android.gms.internal.ads.ti;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public final w f1578d;

    /* renamed from: a, reason: collision with root package name */
    public final ti f1575a = new ti(30, 3);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<C0018a> f1576b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<C0018a> f1577c = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    public int f1580f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final p f1579e = new p(this);

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    public static final class C0018a {

        /* renamed from: a, reason: collision with root package name */
        public int f1581a;

        /* renamed from: b, reason: collision with root package name */
        public int f1582b;

        /* renamed from: c, reason: collision with root package name */
        public int f1583c;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof C0018a)) {
                    return false;
                }
                C0018a c0018a = (C0018a) obj;
                int i6 = this.f1581a;
                if (i6 != c0018a.f1581a) {
                    return false;
                }
                if (i6 != 8 || Math.abs(this.f1583c - this.f1582b) != 1 || this.f1583c != c0018a.f1582b || this.f1582b != c0018a.f1583c) {
                    return this.f1583c == c0018a.f1583c && this.f1582b == c0018a.f1582b;
                }
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f1581a * 31) + this.f1582b) * 31) + this.f1583c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i6 = this.f1581a;
            sb.append(i6 != 1 ? i6 != 2 ? i6 != 4 ? i6 != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.f1582b);
            sb.append("c:");
            return p0.a(sb, this.f1583c, ",p:null]");
        }
    }

    public a(w wVar) {
        this.f1578d = wVar;
    }

    public final boolean a(int i6) {
        ArrayList<C0018a> arrayList = this.f1577c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C0018a c0018a = arrayList.get(i7);
            int i8 = c0018a.f1581a;
            if (i8 != 8) {
                if (i8 == 1) {
                    int i9 = c0018a.f1582b;
                    int i10 = c0018a.f1583c + i9;
                    while (i9 < i10) {
                        if (f(i9, i7 + 1) == i6) {
                            return true;
                        }
                        i9++;
                    }
                } else {
                    continue;
                }
            } else {
                if (f(c0018a.f1583c, i7 + 1) == i6) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList<C0018a> arrayList = this.f1577c;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f1578d.a(arrayList.get(i6));
        }
        k(arrayList);
        this.f1580f = 0;
    }

    public final void c() {
        b();
        ArrayList<C0018a> arrayList = this.f1576b;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            C0018a c0018a = arrayList.get(i6);
            int i7 = c0018a.f1581a;
            w wVar = this.f1578d;
            if (i7 == 1) {
                wVar.a(c0018a);
                wVar.d(c0018a.f1582b, c0018a.f1583c);
            } else if (i7 == 2) {
                wVar.a(c0018a);
                int i8 = c0018a.f1582b;
                int i9 = c0018a.f1583c;
                RecyclerView recyclerView = wVar.f1720a;
                recyclerView.S(i8, i9, true);
                recyclerView.C0 = true;
                recyclerView.f1433z0.f1528c += i9;
            } else if (i7 == 4) {
                wVar.a(c0018a);
                wVar.c(c0018a.f1582b, c0018a.f1583c);
            } else if (i7 == 8) {
                wVar.a(c0018a);
                wVar.e(c0018a.f1582b, c0018a.f1583c);
            }
        }
        k(arrayList);
        this.f1580f = 0;
    }

    public final void d(C0018a c0018a) {
        int i6;
        ti tiVar;
        int i7 = c0018a.f1581a;
        if (i7 == 1 || i7 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iL = l(c0018a.f1582b, i7);
        int i8 = c0018a.f1582b;
        int i9 = c0018a.f1581a;
        if (i9 == 2) {
            i6 = 0;
        } else {
            if (i9 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0018a);
            }
            i6 = 1;
        }
        int i10 = 1;
        int i11 = 1;
        while (true) {
            int i12 = c0018a.f1583c;
            tiVar = this.f1575a;
            if (i10 >= i12) {
                break;
            }
            int iL2 = l((i6 * i10) + c0018a.f1582b, c0018a.f1581a);
            int i13 = c0018a.f1581a;
            if (i13 == 2 ? iL2 != iL : !(i13 == 4 && iL2 == iL + 1)) {
                C0018a c0018aH = h(i13, iL, i11);
                e(c0018aH, i8);
                tiVar.d(c0018aH);
                if (c0018a.f1581a == 4) {
                    i8 += i11;
                }
                i11 = 1;
                iL = iL2;
            } else {
                i11++;
            }
            i10++;
        }
        tiVar.d(c0018a);
        if (i11 > 0) {
            C0018a c0018aH2 = h(c0018a.f1581a, iL, i11);
            e(c0018aH2, i8);
            tiVar.d(c0018aH2);
        }
    }

    public final void e(C0018a c0018a, int i6) {
        w wVar = this.f1578d;
        wVar.a(c0018a);
        int i7 = c0018a.f1581a;
        if (i7 != 2) {
            if (i7 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            wVar.c(i6, c0018a.f1583c);
        } else {
            int i8 = c0018a.f1583c;
            RecyclerView recyclerView = wVar.f1720a;
            recyclerView.S(i6, i8, true);
            recyclerView.C0 = true;
            recyclerView.f1433z0.f1528c += i8;
        }
    }

    public final int f(int i6, int i7) {
        ArrayList<C0018a> arrayList = this.f1577c;
        int size = arrayList.size();
        while (i7 < size) {
            C0018a c0018a = arrayList.get(i7);
            int i8 = c0018a.f1581a;
            if (i8 == 8) {
                int i9 = c0018a.f1582b;
                if (i9 == i6) {
                    i6 = c0018a.f1583c;
                } else {
                    if (i9 < i6) {
                        i6--;
                    }
                    if (c0018a.f1583c <= i6) {
                        i6++;
                    }
                }
            } else {
                int i10 = c0018a.f1582b;
                if (i10 > i6) {
                    continue;
                } else if (i8 == 2) {
                    int i11 = c0018a.f1583c;
                    if (i6 < i10 + i11) {
                        return -1;
                    }
                    i6 -= i11;
                } else if (i8 == 1) {
                    i6 += c0018a.f1583c;
                }
            }
            i7++;
        }
        return i6;
    }

    public final boolean g() {
        return this.f1576b.size() > 0;
    }

    public final C0018a h(int i6, int i7, int i8) {
        C0018a c0018a = (C0018a) this.f1575a.c();
        if (c0018a != null) {
            c0018a.f1581a = i6;
            c0018a.f1582b = i7;
            c0018a.f1583c = i8;
            return c0018a;
        }
        C0018a c0018a2 = new C0018a();
        c0018a2.f1581a = i6;
        c0018a2.f1582b = i7;
        c0018a2.f1583c = i8;
        return c0018a2;
    }

    public final void i(C0018a c0018a) {
        this.f1577c.add(c0018a);
        int i6 = c0018a.f1581a;
        w wVar = this.f1578d;
        if (i6 == 1) {
            wVar.d(c0018a.f1582b, c0018a.f1583c);
            return;
        }
        if (i6 == 2) {
            int i7 = c0018a.f1582b;
            int i8 = c0018a.f1583c;
            RecyclerView recyclerView = wVar.f1720a;
            recyclerView.S(i7, i8, false);
            recyclerView.C0 = true;
            return;
        }
        if (i6 == 4) {
            wVar.c(c0018a.f1582b, c0018a.f1583c);
        } else if (i6 == 8) {
            wVar.e(c0018a.f1582b, c0018a.f1583c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0018a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        ArrayList<C0018a> arrayList;
        int i6;
        boolean z6;
        boolean z7;
        C0018a c0018aH;
        int i7;
        int i8;
        C0018a c0018aH2;
        boolean z8;
        boolean z9;
        C0018a c0018aH3;
        p pVar = this.f1579e;
        pVar.getClass();
        while (true) {
            arrayList = this.f1576b;
            int size = arrayList.size() - 1;
            boolean z10 = false;
            while (true) {
                i6 = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (arrayList.get(size).f1581a != 8) {
                    z10 = true;
                } else if (z10) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i9 = size + 1;
            a aVar = pVar.f1712a;
            ti tiVar = aVar.f1575a;
            C0018a c0018a = arrayList.get(size);
            C0018a c0018a2 = arrayList.get(i9);
            int i10 = c0018a2.f1581a;
            if (i10 == 1) {
                int i11 = c0018a.f1583c;
                int i12 = c0018a2.f1582b;
                int i13 = i11 < i12 ? -1 : 0;
                int i14 = c0018a.f1582b;
                if (i14 < i12) {
                    i13++;
                }
                if (i12 <= i14) {
                    c0018a.f1582b = i14 + c0018a2.f1583c;
                }
                int i15 = c0018a2.f1582b;
                if (i15 <= i11) {
                    c0018a.f1583c = i11 + c0018a2.f1583c;
                }
                c0018a2.f1582b = i15 + i13;
                arrayList.set(size, c0018a2);
                arrayList.set(i9, c0018a);
            } else if (i10 == 2) {
                int i16 = c0018a.f1582b;
                int i17 = c0018a.f1583c;
                if (i16 < i17) {
                    z9 = c0018a2.f1582b == i16 && c0018a2.f1583c == i17 - i16;
                    z8 = false;
                } else if (c0018a2.f1582b == i17 + 1 && c0018a2.f1583c == i16 - i17) {
                    z9 = true;
                    z8 = true;
                } else {
                    z8 = true;
                    z9 = false;
                }
                int i18 = c0018a2.f1582b;
                if (i17 < i18) {
                    c0018a2.f1582b = i18 - 1;
                } else {
                    int i19 = c0018a2.f1583c;
                    if (i17 < i18 + i19) {
                        c0018a2.f1583c = i19 - 1;
                        c0018a.f1581a = 2;
                        c0018a.f1583c = 1;
                        if (c0018a2.f1583c == 0) {
                            arrayList.remove(i9);
                            tiVar.d(c0018a2);
                        }
                    }
                }
                int i20 = c0018a.f1582b;
                int i21 = c0018a2.f1582b;
                if (i20 <= i21) {
                    c0018a2.f1582b = i21 + 1;
                } else {
                    int i22 = i21 + c0018a2.f1583c;
                    if (i20 < i22) {
                        c0018aH3 = aVar.h(2, i20 + 1, i22 - i20);
                        c0018a2.f1583c = c0018a.f1582b - c0018a2.f1582b;
                    }
                    if (z9) {
                        if (z8) {
                            if (c0018aH3 != null) {
                                int i23 = c0018a.f1582b;
                                if (i23 > c0018aH3.f1582b) {
                                    c0018a.f1582b = i23 - c0018aH3.f1583c;
                                }
                                int i24 = c0018a.f1583c;
                                if (i24 > c0018aH3.f1582b) {
                                    c0018a.f1583c = i24 - c0018aH3.f1583c;
                                }
                            }
                            int i25 = c0018a.f1582b;
                            if (i25 > c0018a2.f1582b) {
                                c0018a.f1582b = i25 - c0018a2.f1583c;
                            }
                            int i26 = c0018a.f1583c;
                            if (i26 > c0018a2.f1582b) {
                                c0018a.f1583c = i26 - c0018a2.f1583c;
                            }
                        } else {
                            if (c0018aH3 != null) {
                                int i27 = c0018a.f1582b;
                                if (i27 >= c0018aH3.f1582b) {
                                    c0018a.f1582b = i27 - c0018aH3.f1583c;
                                }
                                int i28 = c0018a.f1583c;
                                if (i28 >= c0018aH3.f1582b) {
                                    c0018a.f1583c = i28 - c0018aH3.f1583c;
                                }
                            }
                            int i29 = c0018a.f1582b;
                            if (i29 >= c0018a2.f1582b) {
                                c0018a.f1582b = i29 - c0018a2.f1583c;
                            }
                            int i30 = c0018a.f1583c;
                            if (i30 >= c0018a2.f1582b) {
                                c0018a.f1583c = i30 - c0018a2.f1583c;
                            }
                        }
                        arrayList.set(size, c0018a2);
                        if (c0018a.f1582b != c0018a.f1583c) {
                            arrayList.set(i9, c0018a);
                        } else {
                            arrayList.remove(i9);
                        }
                        if (c0018aH3 != null) {
                            arrayList.add(size, c0018aH3);
                        }
                    } else {
                        arrayList.set(size, c0018a2);
                        arrayList.remove(i9);
                        tiVar.d(c0018a);
                    }
                }
                c0018aH3 = null;
                if (z9) {
                }
            } else if (i10 == 4) {
                int i31 = c0018a.f1583c;
                int i32 = c0018a2.f1582b;
                if (i31 < i32) {
                    c0018a2.f1582b = i32 - 1;
                } else {
                    int i33 = c0018a2.f1583c;
                    if (i31 < i32 + i33) {
                        c0018a2.f1583c = i33 - 1;
                        c0018aH = aVar.h(4, c0018a.f1582b, 1);
                    }
                    i7 = c0018a.f1582b;
                    i8 = c0018a2.f1582b;
                    if (i7 > i8) {
                        c0018a2.f1582b = i8 + 1;
                    } else {
                        int i34 = i8 + c0018a2.f1583c;
                        if (i7 < i34) {
                            int i35 = i34 - i7;
                            c0018aH2 = aVar.h(4, i7 + 1, i35);
                            c0018a2.f1583c -= i35;
                        }
                        arrayList.set(i9, c0018a);
                        if (c0018a2.f1583c > 0) {
                            arrayList.set(size, c0018a2);
                        } else {
                            arrayList.remove(size);
                            tiVar.d(c0018a2);
                        }
                        if (c0018aH != null) {
                            arrayList.add(size, c0018aH);
                        }
                        if (c0018aH2 != null) {
                            arrayList.add(size, c0018aH2);
                        }
                    }
                    c0018aH2 = null;
                    arrayList.set(i9, c0018a);
                    if (c0018a2.f1583c > 0) {
                    }
                    if (c0018aH != null) {
                    }
                    if (c0018aH2 != null) {
                    }
                }
                c0018aH = null;
                i7 = c0018a.f1582b;
                i8 = c0018a2.f1582b;
                if (i7 > i8) {
                }
                c0018aH2 = null;
                arrayList.set(i9, c0018a);
                if (c0018a2.f1583c > 0) {
                }
                if (c0018aH != null) {
                }
                if (c0018aH2 != null) {
                }
            }
        }
        int size2 = arrayList.size();
        int i36 = 0;
        while (i36 < size2) {
            C0018a c0018aH4 = arrayList.get(i36);
            int i37 = c0018aH4.f1581a;
            if (i37 != 1) {
                ti tiVar2 = this.f1575a;
                w wVar = this.f1578d;
                if (i37 == 2) {
                    int i38 = c0018aH4.f1582b;
                    int i39 = c0018aH4.f1583c + i38;
                    int i40 = i38;
                    boolean z11 = -1;
                    int i41 = 0;
                    while (i40 < i39) {
                        if (wVar.b(i40) != null || a(i40)) {
                            if (z11) {
                                z6 = false;
                            } else {
                                d(h(2, i38, i41));
                                z6 = true;
                            }
                            z7 = true;
                        } else {
                            if (z11) {
                                i(h(2, i38, i41));
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            z7 = false;
                        }
                        if (z6) {
                            i40 -= i41;
                            i39 -= i41;
                            i41 = 1;
                        } else {
                            i41++;
                        }
                        i40++;
                        z11 = z7;
                    }
                    if (i41 != c0018aH4.f1583c) {
                        tiVar2.d(c0018aH4);
                        c0018aH4 = h(2, i38, i41);
                    }
                    if (z11) {
                        i(c0018aH4);
                    } else {
                        d(c0018aH4);
                    }
                } else if (i37 == 4) {
                    int i42 = c0018aH4.f1582b;
                    int i43 = c0018aH4.f1583c + i42;
                    boolean z12 = -1;
                    int i44 = i42;
                    int i45 = 0;
                    while (i42 < i43) {
                        if (wVar.b(i42) != null || a(i42)) {
                            if (!z12) {
                                d(h(4, i44, i45));
                                i44 = i42;
                                i45 = 0;
                            }
                            z12 = true;
                        } else {
                            if (z12) {
                                i(h(4, i44, i45));
                                i44 = i42;
                                i45 = 0;
                            }
                            z12 = false;
                        }
                        i45++;
                        i42++;
                    }
                    if (i45 != c0018aH4.f1583c) {
                        tiVar2.d(c0018aH4);
                        c0018aH4 = h(4, i44, i45);
                    }
                    if (z12) {
                        i(c0018aH4);
                    } else {
                        d(c0018aH4);
                    }
                } else if (i37 == i6) {
                    i(c0018aH4);
                }
            } else {
                i(c0018aH4);
            }
            i36++;
            i6 = 8;
        }
        arrayList.clear();
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            C0018a c0018a = (C0018a) arrayList.get(i6);
            c0018a.getClass();
            this.f1575a.d(c0018a);
        }
        arrayList.clear();
    }

    public final int l(int i6, int i7) {
        int i8;
        int i9;
        ArrayList<C0018a> arrayList = this.f1577c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0018a c0018a = arrayList.get(size);
            int i10 = c0018a.f1581a;
            if (i10 == 8) {
                int i11 = c0018a.f1582b;
                int i12 = c0018a.f1583c;
                if (i11 < i12) {
                    i9 = i11;
                    i8 = i12;
                } else {
                    i8 = i11;
                    i9 = i12;
                }
                if (i6 < i9 || i6 > i8) {
                    if (i6 < i11) {
                        if (i7 == 1) {
                            c0018a.f1582b = i11 + 1;
                            c0018a.f1583c = i12 + 1;
                        } else if (i7 == 2) {
                            c0018a.f1582b = i11 - 1;
                            c0018a.f1583c = i12 - 1;
                        }
                    }
                } else if (i9 == i11) {
                    if (i7 == 1) {
                        c0018a.f1583c = i12 + 1;
                    } else if (i7 == 2) {
                        c0018a.f1583c = i12 - 1;
                    }
                    i6++;
                } else {
                    if (i7 == 1) {
                        c0018a.f1582b = i11 + 1;
                    } else if (i7 == 2) {
                        c0018a.f1582b = i11 - 1;
                    }
                    i6--;
                }
            } else {
                int i13 = c0018a.f1582b;
                if (i13 <= i6) {
                    if (i10 == 1) {
                        i6 -= c0018a.f1583c;
                    } else if (i10 == 2) {
                        i6 += c0018a.f1583c;
                    }
                } else if (i7 == 1) {
                    c0018a.f1582b = i13 + 1;
                } else if (i7 == 2) {
                    c0018a.f1582b = i13 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0018a c0018a2 = arrayList.get(size2);
            int i14 = c0018a2.f1581a;
            ti tiVar = this.f1575a;
            if (i14 == 8) {
                int i15 = c0018a2.f1583c;
                if (i15 == c0018a2.f1582b || i15 < 0) {
                    arrayList.remove(size2);
                    tiVar.d(c0018a2);
                }
            } else if (c0018a2.f1583c <= 0) {
                arrayList.remove(size2);
                tiVar.d(c0018a2);
            }
        }
        return i6;
    }
}
