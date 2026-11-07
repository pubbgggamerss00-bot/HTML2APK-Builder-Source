package androidx.recyclerview.widget;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public final x f2506d;

    /* renamed from: a, reason: collision with root package name */
    public final x3.c f2503a = new x3.c(30);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<C0037a> f2504b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<C0037a> f2505c = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public final p f2507e = new p(this);

    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    public static final class C0037a {

        /* renamed from: a, reason: collision with root package name */
        public int f2508a;

        /* renamed from: b, reason: collision with root package name */
        public int f2509b;

        /* renamed from: c, reason: collision with root package name */
        public int f2510c;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof C0037a)) {
                    return false;
                }
                C0037a c0037a = (C0037a) obj;
                int i10 = this.f2508a;
                if (i10 != c0037a.f2508a) {
                    return false;
                }
                if (i10 != 8 || Math.abs(this.f2510c - this.f2509b) != 1 || this.f2510c != c0037a.f2509b || this.f2509b != c0037a.f2510c) {
                    return this.f2510c == c0037a.f2510c && this.f2509b == c0037a.f2509b;
                }
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f2508a * 31) + this.f2509b) * 31) + this.f2510c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i10 = this.f2508a;
            sb.append(i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.f2509b);
            sb.append("c:");
            return x0.a.a(sb, this.f2510c, ",p:null]");
        }
    }

    public a(x xVar) {
        this.f2506d = xVar;
    }

    public final boolean a(int i10) {
        ArrayList<C0037a> arrayList = this.f2505c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0037a c0037a = arrayList.get(i11);
            int i12 = c0037a.f2508a;
            if (i12 != 8) {
                if (i12 == 1) {
                    int i13 = c0037a.f2509b;
                    int i14 = c0037a.f2510c + i13;
                    while (i13 < i14) {
                        if (e(i13, i11 + 1) == i10) {
                            return true;
                        }
                        i13++;
                    }
                } else {
                    continue;
                }
            } else {
                if (e(c0037a.f2510c, i11 + 1) == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList<C0037a> arrayList = this.f2505c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f2506d.a(arrayList.get(i10));
        }
        i(arrayList);
        ArrayList<C0037a> arrayList2 = this.f2504b;
        int size2 = arrayList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            C0037a c0037a = arrayList2.get(i11);
            int i12 = c0037a.f2508a;
            x xVar = this.f2506d;
            if (i12 == 1) {
                xVar.a(c0037a);
                xVar.d(c0037a.f2509b, c0037a.f2510c);
            } else if (i12 == 2) {
                xVar.a(c0037a);
                int i13 = c0037a.f2509b;
                int i14 = c0037a.f2510c;
                v vVar = xVar.f2819a;
                vVar.P(i13, i14, true);
                vVar.f2681m0 = true;
                vVar.f2675j0.f2799c += i14;
            } else if (i12 == 4) {
                xVar.a(c0037a);
                xVar.c(c0037a.f2509b, c0037a.f2510c);
            } else if (i12 == 8) {
                xVar.a(c0037a);
                xVar.e(c0037a.f2509b, c0037a.f2510c);
            }
        }
        i(arrayList2);
    }

    public final void c(C0037a c0037a) {
        int i10;
        x3.c cVar;
        int i11 = c0037a.f2508a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iJ = j(c0037a.f2509b, i11);
        int i12 = c0037a.f2509b;
        int i13 = c0037a.f2508a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0037a);
            }
            i10 = 1;
        }
        int i14 = 1;
        int i15 = 1;
        while (true) {
            int i16 = c0037a.f2510c;
            cVar = this.f2503a;
            if (i14 >= i16) {
                break;
            }
            int iJ2 = j((i10 * i14) + c0037a.f2509b, c0037a.f2508a);
            int i17 = c0037a.f2508a;
            if (i17 == 2 ? iJ2 != iJ : !(i17 == 4 && iJ2 == iJ + 1)) {
                C0037a c0037aG = g(i17, iJ, i15);
                d(c0037aG, i12);
                cVar.b(c0037aG);
                if (c0037a.f2508a == 4) {
                    i12 += i15;
                }
                i15 = 1;
                iJ = iJ2;
            } else {
                i15++;
            }
            i14++;
        }
        cVar.b(c0037a);
        if (i15 > 0) {
            C0037a c0037aG2 = g(c0037a.f2508a, iJ, i15);
            d(c0037aG2, i12);
            cVar.b(c0037aG2);
        }
    }

    public final void d(C0037a c0037a, int i10) {
        x xVar = this.f2506d;
        xVar.a(c0037a);
        int i11 = c0037a.f2508a;
        if (i11 != 2) {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            xVar.c(i10, c0037a.f2510c);
        } else {
            int i12 = c0037a.f2510c;
            v vVar = xVar.f2819a;
            vVar.P(i10, i12, true);
            vVar.f2681m0 = true;
            vVar.f2675j0.f2799c += i12;
        }
    }

    public final int e(int i10, int i11) {
        ArrayList<C0037a> arrayList = this.f2505c;
        int size = arrayList.size();
        while (i11 < size) {
            C0037a c0037a = arrayList.get(i11);
            int i12 = c0037a.f2508a;
            if (i12 == 8) {
                int i13 = c0037a.f2509b;
                if (i13 == i10) {
                    i10 = c0037a.f2510c;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (c0037a.f2510c <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = c0037a.f2509b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = c0037a.f2510c;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += c0037a.f2510c;
                }
            }
            i11++;
        }
        return i10;
    }

    public final boolean f() {
        return this.f2504b.size() > 0;
    }

    public final C0037a g(int i10, int i11, int i12) {
        C0037a c0037a = (C0037a) this.f2503a.a();
        if (c0037a != null) {
            c0037a.f2508a = i10;
            c0037a.f2509b = i11;
            c0037a.f2510c = i12;
            return c0037a;
        }
        C0037a c0037a2 = new C0037a();
        c0037a2.f2508a = i10;
        c0037a2.f2509b = i11;
        c0037a2.f2510c = i12;
        return c0037a2;
    }

    public final void h(C0037a c0037a) {
        this.f2505c.add(c0037a);
        int i10 = c0037a.f2508a;
        x xVar = this.f2506d;
        if (i10 == 1) {
            xVar.d(c0037a.f2509b, c0037a.f2510c);
            return;
        }
        if (i10 == 2) {
            int i11 = c0037a.f2509b;
            int i12 = c0037a.f2510c;
            v vVar = xVar.f2819a;
            vVar.P(i11, i12, false);
            vVar.f2681m0 = true;
            return;
        }
        if (i10 == 4) {
            xVar.c(c0037a.f2509b, c0037a.f2510c);
        } else if (i10 == 8) {
            xVar.e(c0037a.f2509b, c0037a.f2510c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0037a);
        }
    }

    public final void i(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0037a c0037a = (C0037a) arrayList.get(i10);
            c0037a.getClass();
            this.f2503a.b(c0037a);
        }
        arrayList.clear();
    }

    public final int j(int i10, int i11) {
        int i12;
        int i13;
        ArrayList<C0037a> arrayList = this.f2505c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0037a c0037a = arrayList.get(size);
            int i14 = c0037a.f2508a;
            if (i14 == 8) {
                int i15 = c0037a.f2509b;
                int i16 = c0037a.f2510c;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            c0037a.f2509b = i15 + 1;
                            c0037a.f2510c = i16 + 1;
                        } else if (i11 == 2) {
                            c0037a.f2509b = i15 - 1;
                            c0037a.f2510c = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        c0037a.f2510c = i16 + 1;
                    } else if (i11 == 2) {
                        c0037a.f2510c = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        c0037a.f2509b = i15 + 1;
                    } else if (i11 == 2) {
                        c0037a.f2509b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = c0037a.f2509b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= c0037a.f2510c;
                    } else if (i14 == 2) {
                        i10 += c0037a.f2510c;
                    }
                } else if (i11 == 1) {
                    c0037a.f2509b = i17 + 1;
                } else if (i11 == 2) {
                    c0037a.f2509b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0037a c0037a2 = arrayList.get(size2);
            int i18 = c0037a2.f2508a;
            x3.c cVar = this.f2503a;
            if (i18 == 8) {
                int i19 = c0037a2.f2510c;
                if (i19 == c0037a2.f2509b || i19 < 0) {
                    arrayList.remove(size2);
                    cVar.b(c0037a2);
                }
            } else if (c0037a2.f2510c <= 0) {
                arrayList.remove(size2);
                cVar.b(c0037a2);
            }
        }
        return i10;
    }
}
