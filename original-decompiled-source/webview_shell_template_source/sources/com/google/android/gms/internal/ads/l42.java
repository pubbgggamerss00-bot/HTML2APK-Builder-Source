package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l42 {

    /* renamed from: a, reason: collision with root package name */
    public int f6573a;

    /* renamed from: b, reason: collision with root package name */
    public int f6574b;

    /* renamed from: c, reason: collision with root package name */
    public int f6575c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6576d;

    public l42(int i6, byte[] bArr) {
        this.f6576d = bArr;
        this.f6575c = i6;
    }

    public static final void r(int i6) throws u52 {
        if ((i6 & 3) != 0) {
            throw new u52("Failed to parse the message.");
        }
    }

    public static final void s(int i6) throws u52 {
        if ((i6 & 7) != 0) {
            throw new u52("Failed to parse the message.");
        }
    }

    public void A(ex0 ex0Var) {
        byte[] bArr = ex0Var.f4416a;
        int i6 = ex0Var.f4418c;
        this.f6576d = bArr;
        this.f6573a = 0;
        this.f6574b = 0;
        this.f6575c = i6;
        B(ex0Var.f4417b * 8);
    }

    public void B(int i6) {
        int i7 = i6 / 8;
        this.f6573a = i7;
        this.f6574b = i6 - (i7 * 8);
        H();
    }

    public void C() {
        int i6 = this.f6574b + 1;
        this.f6574b = i6;
        if (i6 == 8) {
            this.f6574b = 0;
            this.f6573a++;
        }
        H();
    }

    public void D(int i6) {
        int i7 = i6 / 8;
        int i8 = this.f6573a + i7;
        this.f6573a = i8;
        int i9 = (i6 - (i7 * 8)) + this.f6574b;
        this.f6574b = i9;
        if (i9 > 7) {
            this.f6573a = i8 + 1;
            this.f6574b = i9 - 8;
        }
        H();
    }

    public void E(int i6) {
        y5.r(this.f6574b == 0);
        this.f6573a += i6;
        H();
    }

    public g42 F() {
        q(2);
        return ((k42) this.f6576d).v();
    }

    public boolean G() {
        int i6 = ((byte[]) this.f6576d)[this.f6573a] & (128 >> this.f6574b);
        C();
        return i6 != 0;
    }

    public void H() {
        int i6;
        int i7 = this.f6573a;
        boolean z6 = false;
        if (i7 >= 0 && (i7 < (i6 = this.f6575c) || (i7 == i6 && this.f6574b == 0))) {
            z6 = true;
        }
        y5.r(z6);
    }

    public void I(r52 r52Var) throws u52 {
        int iO;
        int iO2;
        k42 k42Var = (k42) this.f6576d;
        if (r52Var instanceof z32) {
            z32 z32Var = (z32) r52Var;
            int i6 = this.f6573a & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new t52();
                }
                int iH = k42Var.h() + k42Var.p();
                do {
                    z32Var.d(k42Var.b());
                } while (k42Var.h() < iH);
                p(iH);
                return;
            }
            do {
                z32Var.d(k42Var.b());
                if (k42Var.a()) {
                    return;
                } else {
                    iO2 = k42Var.o();
                }
            } while (iO2 == this.f6573a);
        } else {
            int i7 = this.f6573a & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new t52();
                }
                int iH2 = k42Var.h() + k42Var.p();
                do {
                    r52Var.add(Boolean.valueOf(k42Var.b()));
                } while (k42Var.h() < iH2);
                p(iH2);
                return;
            }
            do {
                r52Var.add(Boolean.valueOf(k42Var.b()));
                if (k42Var.a()) {
                    return;
                } else {
                    iO = k42Var.o();
                }
            } while (iO == this.f6573a);
            iO2 = iO;
        }
        this.f6575c = iO2;
    }

    public void J(r52 r52Var) throws t52 {
        int iO;
        k42 k42Var = (k42) this.f6576d;
        if ((this.f6573a & 7) != 2) {
            throw new t52();
        }
        do {
            r52Var.add(F());
            if (k42Var.a()) {
                return;
            } else {
                iO = k42Var.o();
            }
        } while (iO == this.f6573a);
        this.f6575c = iO;
    }

    public void K(r52 r52Var) throws u52 {
        int iO;
        int iO2;
        k42 k42Var = (k42) this.f6576d;
        if (r52Var instanceof r42) {
            r42 r42Var = (r42) r52Var;
            int i6 = this.f6573a & 7;
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new t52();
                }
                int iP = k42Var.p();
                s(iP);
                int iH = k42Var.h() + iP;
                do {
                    r42Var.d(k42Var.f());
                } while (k42Var.h() < iH);
                return;
            }
            do {
                r42Var.d(k42Var.f());
                if (k42Var.a()) {
                    return;
                } else {
                    iO2 = k42Var.o();
                }
            } while (iO2 == this.f6573a);
        } else {
            int i7 = this.f6573a & 7;
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new t52();
                }
                int iP2 = k42Var.p();
                s(iP2);
                int iH2 = k42Var.h() + iP2;
                do {
                    r52Var.add(Double.valueOf(k42Var.f()));
                } while (k42Var.h() < iH2);
                return;
            }
            do {
                r52Var.add(Double.valueOf(k42Var.f()));
                if (k42Var.a()) {
                    return;
                } else {
                    iO = k42Var.o();
                }
            } while (iO == this.f6573a);
            iO2 = iO;
        }
        this.f6575c = iO2;
    }

    public void L(r52 r52Var) throws u52 {
        int iO;
        int iO2;
        k42 k42Var = (k42) this.f6576d;
        if (r52Var instanceof k52) {
            k52 k52Var = (k52) r52Var;
            int i6 = this.f6573a & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new t52();
                }
                int iH = k42Var.h() + k42Var.p();
                do {
                    k52Var.f(k42Var.j());
                } while (k42Var.h() < iH);
                p(iH);
                return;
            }
            do {
                k52Var.f(k42Var.j());
                if (k42Var.a()) {
                    return;
                } else {
                    iO2 = k42Var.o();
                }
            } while (iO2 == this.f6573a);
        } else {
            int i7 = this.f6573a & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new t52();
                }
                int iH2 = k42Var.h() + k42Var.p();
                do {
                    r52Var.add(Integer.valueOf(k42Var.j()));
                } while (k42Var.h() < iH2);
                p(iH2);
                return;
            }
            do {
                r52Var.add(Integer.valueOf(k42Var.j()));
                if (k42Var.a()) {
                    return;
                } else {
                    iO = k42Var.o();
                }
            } while (iO == this.f6573a);
            iO2 = iO;
        }
        this.f6575c = iO2;
    }

    public void M(r52 r52Var) throws u52 {
        int iO;
        int iO2;
        k42 k42Var = (k42) this.f6576d;
        if (r52Var instanceof k52) {
            k52 k52Var = (k52) r52Var;
            int i6 = this.f6573a & 7;
            if (i6 == 2) {
                int iP = k42Var.p();
                r(iP);
                int iH = k42Var.h() + iP;
                do {
                    k52Var.f(k42Var.k());
                } while (k42Var.h() < iH);
                return;
            }
            if (i6 != 5) {
                throw new t52();
            }
            do {
                k52Var.f(k42Var.k());
                if (k42Var.a()) {
                    return;
                } else {
                    iO2 = k42Var.o();
                }
            } while (iO2 == this.f6573a);
        } else {
            int i7 = this.f6573a & 7;
            if (i7 == 2) {
                int iP2 = k42Var.p();
                r(iP2);
                int iH2 = k42Var.h() + iP2;
                do {
                    r52Var.add(Integer.valueOf(k42Var.k()));
                } while (k42Var.h() < iH2);
                return;
            }
            if (i7 != 5) {
                throw new t52();
            }
            do {
                r52Var.add(Integer.valueOf(k42Var.k()));
                if (k42Var.a()) {
                    return;
                } else {
                    iO = k42Var.o();
                }
            } while (iO == this.f6573a);
            iO2 = iO;
        }
        this.f6575c = iO2;
    }

    public void a(r52 r52Var) throws u52 {
        int iO;
        int iO2;
        k42 k42Var = (k42) this.f6576d;
        if (r52Var instanceof c62) {
            c62 c62Var = (c62) r52Var;
            int i6 = this.f6573a & 7;
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new t52();
                }
                int iP = k42Var.p();
                s(iP);
                int iH = k42Var.h() + iP;
                do {
                    c62Var.f(k42Var.q());
                } while (k42Var.h() < iH);
                return;
            }
            do {
                c62Var.f(k42Var.q());
                if (k42Var.a()) {
                    return;
                } else {
                    iO2 = k42Var.o();
                }
            } while (iO2 == this.f6573a);
        } else {
            int i7 = this.f6573a & 7;
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new t52();
                }
                int iP2 = k42Var.p();
                s(iP2);
                int iH2 = k42Var.h() + iP2;
                do {
                    r52Var.add(Long.valueOf(k42Var.q()));
                } while (k42Var.h() < iH2);
                return;
            }
            do {
                r52Var.add(Long.valueOf(k42Var.q()));
                if (k42Var.a()) {
                    return;
                } else {
                    iO = k42Var.o();
                }
            } while (iO == this.f6573a);
            iO2 = iO;
        }
        this.f6575c = iO2;
    }

    public void b(r52 r52Var) throws u52 {
        int iO;
        int iO2;
        k42 k42Var = (k42) this.f6576d;
        if (r52Var instanceof b52) {
            b52 b52Var = (b52) r52Var;
            int i6 = this.f6573a & 7;
            if (i6 == 2) {
                int iP = k42Var.p();
                r(iP);
                int iH = k42Var.h() + iP;
                do {
                    b52Var.d(k42Var.g());
                } while (k42Var.h() < iH);
                return;
            }
            if (i6 != 5) {
                throw new t52();
            }
            do {
                b52Var.d(k42Var.g());
                if (k42Var.a()) {
                    return;
                } else {
                    iO2 = k42Var.o();
                }
            } while (iO2 == this.f6573a);
        } else {
            int i7 = this.f6573a & 7;
            if (i7 == 2) {
                int iP2 = k42Var.p();
                r(iP2);
                int iH2 = k42Var.h() + iP2;
                do {
                    r52Var.add(Float.valueOf(k42Var.g()));
                } while (k42Var.h() < iH2);
                return;
            }
            if (i7 != 5) {
                throw new t52();
            }
            do {
                r52Var.add(Float.valueOf(k42Var.g()));
                if (k42Var.a()) {
                    return;
                } else {
                    iO = k42Var.o();
                }
            } while (iO == this.f6573a);
            iO2 = iO;
        }
        this.f6575c = iO2;
    }

    @Deprecated
    public void c(r52 r52Var, b72 b72Var, u42 u42Var) throws t52 {
        int iO;
        k42 k42Var = (k42) this.f6576d;
        int i6 = this.f6573a;
        if ((i6 & 7) != 3) {
            throw new t52();
        }
        do {
            j52 j52VarZze = b72Var.zze();
            n(j52VarZze, b72Var, u42Var);
            b72Var.a(j52VarZze);
            r52Var.add(j52VarZze);
            if (k42Var.a() || this.f6575c != 0) {
                return;
            } else {
                iO = k42Var.o();
            }
        } while (iO == i6);
        this.f6575c = iO;
    }

    public void d(r52 r52Var) throws u52 {
        int iO;
        int iO2;
        k42 k42Var = (k42) this.f6576d;
        if (r52Var instanceof k52) {
            k52 k52Var = (k52) r52Var;
            int i6 = this.f6573a & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new t52();
                }
                int iH = k42Var.h() + k42Var.p();
                do {
                    k52Var.f(k42Var.l());
                } while (k42Var.h() < iH);
                p(iH);
                return;
            }
            do {
                k52Var.f(k42Var.l());
                if (k42Var.a()) {
                    return;
                } else {
                    iO2 = k42Var.o();
                }
            } while (iO2 == this.f6573a);
        } else {
            int i7 = this.f6573a & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new t52();
                }
                int iH2 = k42Var.h() + k42Var.p();
                do {
                    r52Var.add(Integer.valueOf(k42Var.l()));
                } while (k42Var.h() < iH2);
                p(iH2);
                return;
            }
            do {
                r52Var.add(Integer.valueOf(k42Var.l()));
                if (k42Var.a()) {
                    return;
                } else {
                    iO = k42Var.o();
                }
            } while (iO == this.f6573a);
            iO2 = iO;
        }
        this.f6575c = iO2;
    }

    public void e(r52 r52Var) throws u52 {
        int iO;
        int iO2;
        k42 k42Var = (k42) this.f6576d;
        if (r52Var instanceof c62) {
            c62 c62Var = (c62) r52Var;
            int i6 = this.f6573a & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new t52();
                }
                int iH = k42Var.h() + k42Var.p();
                do {
                    c62Var.f(k42Var.r());
                } while (k42Var.h() < iH);
                p(iH);
                return;
            }
            do {
                c62Var.f(k42Var.r());
                if (k42Var.a()) {
                    return;
                } else {
                    iO2 = k42Var.o();
                }
            } while (iO2 == this.f6573a);
        } else {
            int i7 = this.f6573a & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new t52();
                }
                int iH2 = k42Var.h() + k42Var.p();
                do {
                    r52Var.add(Long.valueOf(k42Var.r()));
                } while (k42Var.h() < iH2);
                p(iH2);
                return;
            }
            do {
                r52Var.add(Long.valueOf(k42Var.r()));
                if (k42Var.a()) {
                    return;
                } else {
                    iO = k42Var.o();
                }
            } while (iO == this.f6573a);
            iO2 = iO;
        }
        this.f6575c = iO2;
    }

    public void f(r52 r52Var, b72 b72Var, u42 u42Var) throws u52 {
        int iO;
        k42 k42Var = (k42) this.f6576d;
        int i6 = this.f6573a;
        if ((i6 & 7) != 2) {
            throw new t52();
        }
        do {
            j52 j52VarZze = b72Var.zze();
            o(j52VarZze, b72Var, u42Var);
            b72Var.a(j52VarZze);
            r52Var.add(j52VarZze);
            if (k42Var.a() || this.f6575c != 0) {
                return;
            } else {
                iO = k42Var.o();
            }
        } while (iO == i6);
        this.f6575c = iO;
    }

    public void g(r52 r52Var) throws u52 {
        int iO;
        int iO2;
        k42 k42Var = (k42) this.f6576d;
        if (r52Var instanceof k52) {
            k52 k52Var = (k52) r52Var;
            int i6 = this.f6573a & 7;
            if (i6 == 2) {
                int iP = k42Var.p();
                r(iP);
                int iH = k42Var.h() + iP;
                do {
                    k52Var.f(k42Var.m());
                } while (k42Var.h() < iH);
                return;
            }
            if (i6 != 5) {
                throw new t52();
            }
            do {
                k52Var.f(k42Var.m());
                if (k42Var.a()) {
                    return;
                } else {
                    iO2 = k42Var.o();
                }
            } while (iO2 == this.f6573a);
        } else {
            int i7 = this.f6573a & 7;
            if (i7 == 2) {
                int iP2 = k42Var.p();
                r(iP2);
                int iH2 = k42Var.h() + iP2;
                do {
                    r52Var.add(Integer.valueOf(k42Var.m()));
                } while (k42Var.h() < iH2);
                return;
            }
            if (i7 != 5) {
                throw new t52();
            }
            do {
                r52Var.add(Integer.valueOf(k42Var.m()));
                if (k42Var.a()) {
                    return;
                } else {
                    iO = k42Var.o();
                }
            } while (iO == this.f6573a);
            iO2 = iO;
        }
        this.f6575c = iO2;
    }

    public void h(r52 r52Var) throws u52 {
        int iO;
        int iO2;
        k42 k42Var = (k42) this.f6576d;
        if (r52Var instanceof c62) {
            c62 c62Var = (c62) r52Var;
            int i6 = this.f6573a & 7;
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new t52();
                }
                int iP = k42Var.p();
                s(iP);
                int iH = k42Var.h() + iP;
                do {
                    c62Var.f(k42Var.s());
                } while (k42Var.h() < iH);
                return;
            }
            do {
                c62Var.f(k42Var.s());
                if (k42Var.a()) {
                    return;
                } else {
                    iO2 = k42Var.o();
                }
            } while (iO2 == this.f6573a);
        } else {
            int i7 = this.f6573a & 7;
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new t52();
                }
                int iP2 = k42Var.p();
                s(iP2);
                int iH2 = k42Var.h() + iP2;
                do {
                    r52Var.add(Long.valueOf(k42Var.s()));
                } while (k42Var.h() < iH2);
                return;
            }
            do {
                r52Var.add(Long.valueOf(k42Var.s()));
                if (k42Var.a()) {
                    return;
                } else {
                    iO = k42Var.o();
                }
            } while (iO == this.f6573a);
            iO2 = iO;
        }
        this.f6575c = iO2;
    }

    public void i(r52 r52Var) throws u52 {
        int iO;
        int iO2;
        k42 k42Var = (k42) this.f6576d;
        if (r52Var instanceof k52) {
            k52 k52Var = (k52) r52Var;
            int i6 = this.f6573a & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new t52();
                }
                int iH = k42Var.h() + k42Var.p();
                do {
                    k52Var.f(k42Var.n());
                } while (k42Var.h() < iH);
                p(iH);
                return;
            }
            do {
                k52Var.f(k42Var.n());
                if (k42Var.a()) {
                    return;
                } else {
                    iO2 = k42Var.o();
                }
            } while (iO2 == this.f6573a);
        } else {
            int i7 = this.f6573a & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new t52();
                }
                int iH2 = k42Var.h() + k42Var.p();
                do {
                    r52Var.add(Integer.valueOf(k42Var.n()));
                } while (k42Var.h() < iH2);
                p(iH2);
                return;
            }
            do {
                r52Var.add(Integer.valueOf(k42Var.n()));
                if (k42Var.a()) {
                    return;
                } else {
                    iO = k42Var.o();
                }
            } while (iO == this.f6573a);
            iO2 = iO;
        }
        this.f6575c = iO2;
    }

    public void j(r52 r52Var) throws u52 {
        int iO;
        int iO2;
        k42 k42Var = (k42) this.f6576d;
        if (r52Var instanceof c62) {
            c62 c62Var = (c62) r52Var;
            int i6 = this.f6573a & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new t52();
                }
                int iH = k42Var.h() + k42Var.p();
                do {
                    c62Var.f(k42Var.t());
                } while (k42Var.h() < iH);
                p(iH);
                return;
            }
            do {
                c62Var.f(k42Var.t());
                if (k42Var.a()) {
                    return;
                } else {
                    iO2 = k42Var.o();
                }
            } while (iO2 == this.f6573a);
        } else {
            int i7 = this.f6573a & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new t52();
                }
                int iH2 = k42Var.h() + k42Var.p();
                do {
                    r52Var.add(Long.valueOf(k42Var.t()));
                } while (k42Var.h() < iH2);
                p(iH2);
                return;
            }
            do {
                r52Var.add(Long.valueOf(k42Var.t()));
                if (k42Var.a()) {
                    return;
                } else {
                    iO = k42Var.o();
                }
            } while (iO == this.f6573a);
            iO2 = iO;
        }
        this.f6575c = iO2;
    }

    public void k(r52 r52Var, boolean z6) throws t52 {
        String strW;
        int iO;
        int iO2;
        k42 k42Var = (k42) this.f6576d;
        if ((this.f6573a & 7) != 2) {
            throw new t52();
        }
        if ((r52Var instanceof a62) && !z6) {
            a62 a62Var = (a62) r52Var;
            do {
                F();
                a62Var.zzb();
                if (k42Var.a()) {
                    return;
                } else {
                    iO2 = k42Var.o();
                }
            } while (iO2 == this.f6573a);
        } else {
            do {
                if (z6) {
                    q(2);
                    strW = k42Var.x();
                } else {
                    q(2);
                    strW = k42Var.w();
                }
                r52Var.add(strW);
                if (k42Var.a()) {
                    return;
                } else {
                    iO = k42Var.o();
                }
            } while (iO == this.f6573a);
            iO2 = iO;
        }
        this.f6575c = iO2;
    }

    public void l(r52 r52Var) throws u52 {
        int iO;
        int iO2;
        k42 k42Var = (k42) this.f6576d;
        if (r52Var instanceof k52) {
            k52 k52Var = (k52) r52Var;
            int i6 = this.f6573a & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new t52();
                }
                int iH = k42Var.h() + k42Var.p();
                do {
                    k52Var.f(k42Var.p());
                } while (k42Var.h() < iH);
                p(iH);
                return;
            }
            do {
                k52Var.f(k42Var.p());
                if (k42Var.a()) {
                    return;
                } else {
                    iO2 = k42Var.o();
                }
            } while (iO2 == this.f6573a);
        } else {
            int i7 = this.f6573a & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new t52();
                }
                int iH2 = k42Var.h() + k42Var.p();
                do {
                    r52Var.add(Integer.valueOf(k42Var.p()));
                } while (k42Var.h() < iH2);
                p(iH2);
                return;
            }
            do {
                r52Var.add(Integer.valueOf(k42Var.p()));
                if (k42Var.a()) {
                    return;
                } else {
                    iO = k42Var.o();
                }
            } while (iO == this.f6573a);
            iO2 = iO;
        }
        this.f6575c = iO2;
    }

    public void m(r52 r52Var) throws u52 {
        int iO;
        int iO2;
        k42 k42Var = (k42) this.f6576d;
        if (r52Var instanceof c62) {
            c62 c62Var = (c62) r52Var;
            int i6 = this.f6573a & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new t52();
                }
                int iH = k42Var.h() + k42Var.p();
                do {
                    c62Var.f(k42Var.u());
                } while (k42Var.h() < iH);
                p(iH);
                return;
            }
            do {
                c62Var.f(k42Var.u());
                if (k42Var.a()) {
                    return;
                } else {
                    iO2 = k42Var.o();
                }
            } while (iO2 == this.f6573a);
        } else {
            int i7 = this.f6573a & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new t52();
                }
                int iH2 = k42Var.h() + k42Var.p();
                do {
                    r52Var.add(Long.valueOf(k42Var.u()));
                } while (k42Var.h() < iH2);
                p(iH2);
                return;
            }
            do {
                r52Var.add(Long.valueOf(k42Var.u()));
                if (k42Var.a()) {
                    return;
                } else {
                    iO = k42Var.o();
                }
            } while (iO == this.f6573a);
            iO2 = iO;
        }
        this.f6575c = iO2;
    }

    public void n(Object obj, b72 b72Var, u42 u42Var) {
        int i6 = this.f6574b;
        this.f6574b = ((this.f6573a >>> 3) << 3) | 4;
        try {
            b72Var.c(obj, this, u42Var);
            if (this.f6573a == this.f6574b) {
            } else {
                throw new u52("Failed to parse the message.");
            }
        } finally {
            this.f6574b = i6;
        }
    }

    public void o(Object obj, b72 b72Var, u42 u42Var) throws u52 {
        k42 k42Var = (k42) this.f6576d;
        int iP = k42Var.p();
        if (k42Var.f6237a >= 100) {
            throw new u52("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i6 = k42Var.i(iP);
        k42Var.f6237a++;
        b72Var.c(obj, this, u42Var);
        k42Var.y();
        k42Var.f6237a--;
        k42Var.z(i6);
    }

    public void p(int i6) throws u52 {
        if (((k42) this.f6576d).h() != i6) {
            throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public void q(int i6) {
        if ((this.f6573a & 7) != i6) {
            throw new t52();
        }
    }

    public int t() {
        return ((this.f6575c - this.f6573a) * 8) - this.f6574b;
    }

    public int u() {
        y5.r(this.f6574b == 0);
        return this.f6573a;
    }

    public int v() {
        int iO = this.f6575c;
        if (iO != 0) {
            this.f6573a = iO;
            this.f6575c = 0;
        } else {
            iO = ((k42) this.f6576d).o();
            this.f6573a = iO;
        }
        if (iO == 0 || iO == this.f6574b) {
            return Integer.MAX_VALUE;
        }
        return iO >>> 3;
    }

    public int w(int i6) {
        int i7;
        if (i6 == 0) {
            return 0;
        }
        this.f6574b += i6;
        int i8 = 0;
        while (true) {
            i7 = this.f6574b;
            if (i7 <= 8) {
                break;
            }
            int i9 = i7 - 8;
            this.f6574b = i9;
            byte[] bArr = (byte[]) this.f6576d;
            int i10 = this.f6573a;
            this.f6573a = i10 + 1;
            i8 |= (bArr[i10] & 255) << i9;
        }
        byte[] bArr2 = (byte[]) this.f6576d;
        int i11 = this.f6573a;
        int i12 = i8 | ((bArr2[i11] & 255) >> (8 - i7));
        int i13 = 32 - i6;
        if (i7 == 8) {
            this.f6574b = 0;
            this.f6573a = i11 + 1;
        }
        int i14 = ((-1) >>> i13) & i12;
        H();
        return i14;
    }

    public long x(int i6) {
        if (i6 <= 32) {
            int iW = w(i6);
            int i7 = j31.f5914a;
            return 4294967295L & iW;
        }
        int iW2 = w(i6 - 32);
        int iW3 = w(32);
        int i8 = j31.f5914a;
        return (4294967295L & iW3) | ((iW2 & 4294967295L) << 32);
    }

    public void y() {
        if (this.f6574b == 0) {
            return;
        }
        this.f6574b = 0;
        this.f6573a++;
        H();
    }

    public void z(int i6, byte[] bArr) {
        int i7;
        int i8 = 0;
        while (true) {
            i7 = i6 >> 3;
            if (i8 >= i7) {
                break;
            }
            byte[] bArr2 = (byte[]) this.f6576d;
            int i9 = this.f6573a;
            int i10 = i9 + 1;
            this.f6573a = i10;
            byte b7 = bArr2[i9];
            int i11 = this.f6574b;
            byte b8 = (byte) (b7 << i11);
            bArr[i8] = b8;
            bArr[i8] = (byte) (((bArr2[i10] & 255) >> (8 - i11)) | b8);
            i8++;
        }
        int i12 = i6 & 7;
        if (i12 == 0) {
            return;
        }
        byte b9 = (byte) (bArr[i7] & (255 >> i12));
        bArr[i7] = b9;
        int i13 = this.f6574b;
        if (i13 + i12 > 8) {
            byte[] bArr3 = (byte[]) this.f6576d;
            int i14 = this.f6573a;
            this.f6573a = i14 + 1;
            b9 = (byte) (b9 | ((bArr3[i14] & 255) << i13));
            bArr[i7] = b9;
            i13 -= 8;
        }
        int i15 = i13 + i12;
        this.f6574b = i15;
        byte[] bArr4 = (byte[]) this.f6576d;
        int i16 = this.f6573a;
        bArr[i7] = (byte) (((byte) (((255 & bArr4[i16]) >> (8 - i15)) << (8 - i12))) | b9);
        if (i15 == 8) {
            this.f6574b = 0;
            this.f6573a = i16 + 1;
        }
        H();
    }

    public l42() {
        this.f6576d = j31.f5919f;
    }

    public l42(k42 k42Var) {
        this.f6575c = 0;
        Charset charset = s52.f8801a;
        if (k42Var == null) {
            throw new NullPointerException("input");
        }
        this.f6576d = k42Var;
        k42Var.f6238b = this;
    }
}
