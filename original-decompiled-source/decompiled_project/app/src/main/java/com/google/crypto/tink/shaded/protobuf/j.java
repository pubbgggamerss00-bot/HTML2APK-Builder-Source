package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class j implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final i f6697a;

    /* renamed from: b, reason: collision with root package name */
    public int f6698b;

    /* renamed from: c, reason: collision with root package name */
    public int f6699c;

    /* renamed from: d, reason: collision with root package name */
    public int f6700d = 0;

    public j(i iVar) {
        y.a(iVar, "input");
        this.f6697a = iVar;
        iVar.f6681d = this;
    }

    public static void x(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw z.f();
        }
    }

    public static void y(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw z.f();
        }
    }

    public final int a() throws IOException {
        int i10 = this.f6700d;
        if (i10 != 0) {
            this.f6698b = i10;
            this.f6700d = 0;
        } else {
            this.f6698b = this.f6697a.x();
        }
        int i11 = this.f6698b;
        if (i11 == 0 || i11 == this.f6699c) {
            return Integer.MAX_VALUE;
        }
        return i11 >>> 3;
    }

    public final <T> void b(T t3, g1<T> g1Var, o oVar) throws IOException {
        int i10 = this.f6699c;
        this.f6699c = ((this.f6698b >>> 3) << 3) | 4;
        try {
            g1Var.f(t3, this, oVar);
            if (this.f6698b == this.f6699c) {
            } else {
                throw z.f();
            }
        } finally {
            this.f6699c = i10;
        }
    }

    public final <T> void c(T t3, g1<T> g1Var, o oVar) throws IOException {
        i iVar = this.f6697a;
        int iY = iVar.y();
        if (iVar.f6678a >= iVar.f6679b) {
            throw new z("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iH = iVar.h(iY);
        iVar.f6678a++;
        g1Var.f(t3, this, oVar);
        iVar.a(0);
        iVar.f6678a--;
        iVar.g(iH);
    }

    public final void d(List<Boolean> list) throws IOException {
        int iX;
        int iX2;
        boolean z10 = list instanceof f;
        i iVar = this.f6697a;
        if (!z10) {
            int i10 = this.f6698b & 7;
            if (i10 == 0) {
                do {
                    list.add(Boolean.valueOf(iVar.i()));
                    if (iVar.e()) {
                        return;
                    } else {
                        iX = iVar.x();
                    }
                } while (iX == this.f6698b);
                this.f6700d = iX;
                return;
            }
            if (i10 != 2) {
                throw z.c();
            }
            int iD = iVar.d() + iVar.y();
            do {
                list.add(Boolean.valueOf(iVar.i()));
            } while (iVar.d() < iD);
            u(iD);
            return;
        }
        f fVar = (f) list;
        int i11 = this.f6698b & 7;
        if (i11 == 0) {
            do {
                fVar.addBoolean(iVar.i());
                if (iVar.e()) {
                    return;
                } else {
                    iX2 = iVar.x();
                }
            } while (iX2 == this.f6698b);
            this.f6700d = iX2;
            return;
        }
        if (i11 != 2) {
            throw z.c();
        }
        int iD2 = iVar.d() + iVar.y();
        do {
            fVar.addBoolean(iVar.i());
        } while (iVar.d() < iD2);
        u(iD2);
    }

    public final h e() throws IOException {
        v(2);
        return this.f6697a.j();
    }

    public final void f(List<h> list) throws IOException {
        int iX;
        if ((this.f6698b & 7) != 2) {
            throw z.c();
        }
        do {
            list.add(e());
            i iVar = this.f6697a;
            if (iVar.e()) {
                return;
            } else {
                iX = iVar.x();
            }
        } while (iX == this.f6698b);
        this.f6700d = iX;
    }

    public final void g(List<Double> list) throws IOException {
        int iX;
        int iX2;
        boolean z10 = list instanceof m;
        i iVar = this.f6697a;
        if (!z10) {
            int i10 = this.f6698b & 7;
            if (i10 == 1) {
                do {
                    list.add(Double.valueOf(iVar.k()));
                    if (iVar.e()) {
                        return;
                    } else {
                        iX = iVar.x();
                    }
                } while (iX == this.f6698b);
                this.f6700d = iX;
                return;
            }
            if (i10 != 2) {
                throw z.c();
            }
            int iY = iVar.y();
            y(iY);
            int iD = iVar.d() + iY;
            do {
                list.add(Double.valueOf(iVar.k()));
            } while (iVar.d() < iD);
            return;
        }
        m mVar = (m) list;
        int i11 = this.f6698b & 7;
        if (i11 == 1) {
            do {
                mVar.addDouble(iVar.k());
                if (iVar.e()) {
                    return;
                } else {
                    iX2 = iVar.x();
                }
            } while (iX2 == this.f6698b);
            this.f6700d = iX2;
            return;
        }
        if (i11 != 2) {
            throw z.c();
        }
        int iY2 = iVar.y();
        y(iY2);
        int iD2 = iVar.d() + iY2;
        do {
            mVar.addDouble(iVar.k());
        } while (iVar.d() < iD2);
    }

    public final void h(List<Integer> list) throws IOException {
        int iX;
        int iX2;
        boolean z10 = list instanceof x;
        i iVar = this.f6697a;
        if (!z10) {
            int i10 = this.f6698b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(iVar.l()));
                    if (iVar.e()) {
                        return;
                    } else {
                        iX = iVar.x();
                    }
                } while (iX == this.f6698b);
                this.f6700d = iX;
                return;
            }
            if (i10 != 2) {
                throw z.c();
            }
            int iD = iVar.d() + iVar.y();
            do {
                list.add(Integer.valueOf(iVar.l()));
            } while (iVar.d() < iD);
            u(iD);
            return;
        }
        x xVar = (x) list;
        int i11 = this.f6698b & 7;
        if (i11 == 0) {
            do {
                xVar.addInt(iVar.l());
                if (iVar.e()) {
                    return;
                } else {
                    iX2 = iVar.x();
                }
            } while (iX2 == this.f6698b);
            this.f6700d = iX2;
            return;
        }
        if (i11 != 2) {
            throw z.c();
        }
        int iD2 = iVar.d() + iVar.y();
        do {
            xVar.addInt(iVar.l());
        } while (iVar.d() < iD2);
        u(iD2);
    }

    public final void i(List<Integer> list) throws IOException {
        int iX;
        int iX2;
        boolean z10 = list instanceof x;
        i iVar = this.f6697a;
        if (!z10) {
            int i10 = this.f6698b & 7;
            if (i10 == 2) {
                int iY = iVar.y();
                x(iY);
                int iD = iVar.d() + iY;
                do {
                    list.add(Integer.valueOf(iVar.m()));
                } while (iVar.d() < iD);
                return;
            }
            if (i10 != 5) {
                throw z.c();
            }
            do {
                list.add(Integer.valueOf(iVar.m()));
                if (iVar.e()) {
                    return;
                } else {
                    iX = iVar.x();
                }
            } while (iX == this.f6698b);
            this.f6700d = iX;
            return;
        }
        x xVar = (x) list;
        int i11 = this.f6698b & 7;
        if (i11 == 2) {
            int iY2 = iVar.y();
            x(iY2);
            int iD2 = iVar.d() + iY2;
            do {
                xVar.addInt(iVar.m());
            } while (iVar.d() < iD2);
            return;
        }
        if (i11 != 5) {
            throw z.c();
        }
        do {
            xVar.addInt(iVar.m());
            if (iVar.e()) {
                return;
            } else {
                iX2 = iVar.x();
            }
        } while (iX2 == this.f6698b);
        this.f6700d = iX2;
    }

    public final void j(List<Long> list) throws IOException {
        int iX;
        int iX2;
        boolean z10 = list instanceof g0;
        i iVar = this.f6697a;
        if (!z10) {
            int i10 = this.f6698b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(iVar.n()));
                    if (iVar.e()) {
                        return;
                    } else {
                        iX = iVar.x();
                    }
                } while (iX == this.f6698b);
                this.f6700d = iX;
                return;
            }
            if (i10 != 2) {
                throw z.c();
            }
            int iY = iVar.y();
            y(iY);
            int iD = iVar.d() + iY;
            do {
                list.add(Long.valueOf(iVar.n()));
            } while (iVar.d() < iD);
            return;
        }
        g0 g0Var = (g0) list;
        int i11 = this.f6698b & 7;
        if (i11 == 1) {
            do {
                g0Var.addLong(iVar.n());
                if (iVar.e()) {
                    return;
                } else {
                    iX2 = iVar.x();
                }
            } while (iX2 == this.f6698b);
            this.f6700d = iX2;
            return;
        }
        if (i11 != 2) {
            throw z.c();
        }
        int iY2 = iVar.y();
        y(iY2);
        int iD2 = iVar.d() + iY2;
        do {
            g0Var.addLong(iVar.n());
        } while (iVar.d() < iD2);
    }

    public final void k(List<Float> list) throws IOException {
        int iX;
        int iX2;
        boolean z10 = list instanceof u;
        i iVar = this.f6697a;
        if (!z10) {
            int i10 = this.f6698b & 7;
            if (i10 == 2) {
                int iY = iVar.y();
                x(iY);
                int iD = iVar.d() + iY;
                do {
                    list.add(Float.valueOf(iVar.o()));
                } while (iVar.d() < iD);
                return;
            }
            if (i10 != 5) {
                throw z.c();
            }
            do {
                list.add(Float.valueOf(iVar.o()));
                if (iVar.e()) {
                    return;
                } else {
                    iX = iVar.x();
                }
            } while (iX == this.f6698b);
            this.f6700d = iX;
            return;
        }
        u uVar = (u) list;
        int i11 = this.f6698b & 7;
        if (i11 == 2) {
            int iY2 = iVar.y();
            x(iY2);
            int iD2 = iVar.d() + iY2;
            do {
                uVar.addFloat(iVar.o());
            } while (iVar.d() < iD2);
            return;
        }
        if (i11 != 5) {
            throw z.c();
        }
        do {
            uVar.addFloat(iVar.o());
            if (iVar.e()) {
                return;
            } else {
                iX2 = iVar.x();
            }
        } while (iX2 == this.f6698b);
        this.f6700d = iX2;
    }

    public final void l(List<Integer> list) throws IOException {
        int iX;
        int iX2;
        boolean z10 = list instanceof x;
        i iVar = this.f6697a;
        if (!z10) {
            int i10 = this.f6698b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(iVar.p()));
                    if (iVar.e()) {
                        return;
                    } else {
                        iX = iVar.x();
                    }
                } while (iX == this.f6698b);
                this.f6700d = iX;
                return;
            }
            if (i10 != 2) {
                throw z.c();
            }
            int iD = iVar.d() + iVar.y();
            do {
                list.add(Integer.valueOf(iVar.p()));
            } while (iVar.d() < iD);
            u(iD);
            return;
        }
        x xVar = (x) list;
        int i11 = this.f6698b & 7;
        if (i11 == 0) {
            do {
                xVar.addInt(iVar.p());
                if (iVar.e()) {
                    return;
                } else {
                    iX2 = iVar.x();
                }
            } while (iX2 == this.f6698b);
            this.f6700d = iX2;
            return;
        }
        if (i11 != 2) {
            throw z.c();
        }
        int iD2 = iVar.d() + iVar.y();
        do {
            xVar.addInt(iVar.p());
        } while (iVar.d() < iD2);
        u(iD2);
    }

    public final void m(List<Long> list) throws IOException {
        int iX;
        int iX2;
        boolean z10 = list instanceof g0;
        i iVar = this.f6697a;
        if (!z10) {
            int i10 = this.f6698b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(iVar.q()));
                    if (iVar.e()) {
                        return;
                    } else {
                        iX = iVar.x();
                    }
                } while (iX == this.f6698b);
                this.f6700d = iX;
                return;
            }
            if (i10 != 2) {
                throw z.c();
            }
            int iD = iVar.d() + iVar.y();
            do {
                list.add(Long.valueOf(iVar.q()));
            } while (iVar.d() < iD);
            u(iD);
            return;
        }
        g0 g0Var = (g0) list;
        int i11 = this.f6698b & 7;
        if (i11 == 0) {
            do {
                g0Var.addLong(iVar.q());
                if (iVar.e()) {
                    return;
                } else {
                    iX2 = iVar.x();
                }
            } while (iX2 == this.f6698b);
            this.f6700d = iX2;
            return;
        }
        if (i11 != 2) {
            throw z.c();
        }
        int iD2 = iVar.d() + iVar.y();
        do {
            g0Var.addLong(iVar.q());
        } while (iVar.d() < iD2);
        u(iD2);
    }

    public final void n(List<Integer> list) throws IOException {
        int iX;
        int iX2;
        boolean z10 = list instanceof x;
        i iVar = this.f6697a;
        if (!z10) {
            int i10 = this.f6698b & 7;
            if (i10 == 2) {
                int iY = iVar.y();
                x(iY);
                int iD = iVar.d() + iY;
                do {
                    list.add(Integer.valueOf(iVar.r()));
                } while (iVar.d() < iD);
                return;
            }
            if (i10 != 5) {
                throw z.c();
            }
            do {
                list.add(Integer.valueOf(iVar.r()));
                if (iVar.e()) {
                    return;
                } else {
                    iX = iVar.x();
                }
            } while (iX == this.f6698b);
            this.f6700d = iX;
            return;
        }
        x xVar = (x) list;
        int i11 = this.f6698b & 7;
        if (i11 == 2) {
            int iY2 = iVar.y();
            x(iY2);
            int iD2 = iVar.d() + iY2;
            do {
                xVar.addInt(iVar.r());
            } while (iVar.d() < iD2);
            return;
        }
        if (i11 != 5) {
            throw z.c();
        }
        do {
            xVar.addInt(iVar.r());
            if (iVar.e()) {
                return;
            } else {
                iX2 = iVar.x();
            }
        } while (iX2 == this.f6698b);
        this.f6700d = iX2;
    }

    public final void o(List<Long> list) throws IOException {
        int iX;
        int iX2;
        boolean z10 = list instanceof g0;
        i iVar = this.f6697a;
        if (!z10) {
            int i10 = this.f6698b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(iVar.s()));
                    if (iVar.e()) {
                        return;
                    } else {
                        iX = iVar.x();
                    }
                } while (iX == this.f6698b);
                this.f6700d = iX;
                return;
            }
            if (i10 != 2) {
                throw z.c();
            }
            int iY = iVar.y();
            y(iY);
            int iD = iVar.d() + iY;
            do {
                list.add(Long.valueOf(iVar.s()));
            } while (iVar.d() < iD);
            return;
        }
        g0 g0Var = (g0) list;
        int i11 = this.f6698b & 7;
        if (i11 == 1) {
            do {
                g0Var.addLong(iVar.s());
                if (iVar.e()) {
                    return;
                } else {
                    iX2 = iVar.x();
                }
            } while (iX2 == this.f6698b);
            this.f6700d = iX2;
            return;
        }
        if (i11 != 2) {
            throw z.c();
        }
        int iY2 = iVar.y();
        y(iY2);
        int iD2 = iVar.d() + iY2;
        do {
            g0Var.addLong(iVar.s());
        } while (iVar.d() < iD2);
    }

    public final void p(List<Integer> list) throws IOException {
        int iX;
        int iX2;
        boolean z10 = list instanceof x;
        i iVar = this.f6697a;
        if (!z10) {
            int i10 = this.f6698b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(iVar.t()));
                    if (iVar.e()) {
                        return;
                    } else {
                        iX = iVar.x();
                    }
                } while (iX == this.f6698b);
                this.f6700d = iX;
                return;
            }
            if (i10 != 2) {
                throw z.c();
            }
            int iD = iVar.d() + iVar.y();
            do {
                list.add(Integer.valueOf(iVar.t()));
            } while (iVar.d() < iD);
            u(iD);
            return;
        }
        x xVar = (x) list;
        int i11 = this.f6698b & 7;
        if (i11 == 0) {
            do {
                xVar.addInt(iVar.t());
                if (iVar.e()) {
                    return;
                } else {
                    iX2 = iVar.x();
                }
            } while (iX2 == this.f6698b);
            this.f6700d = iX2;
            return;
        }
        if (i11 != 2) {
            throw z.c();
        }
        int iD2 = iVar.d() + iVar.y();
        do {
            xVar.addInt(iVar.t());
        } while (iVar.d() < iD2);
        u(iD2);
    }

    public final void q(List<Long> list) throws IOException {
        int iX;
        int iX2;
        boolean z10 = list instanceof g0;
        i iVar = this.f6697a;
        if (!z10) {
            int i10 = this.f6698b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(iVar.u()));
                    if (iVar.e()) {
                        return;
                    } else {
                        iX = iVar.x();
                    }
                } while (iX == this.f6698b);
                this.f6700d = iX;
                return;
            }
            if (i10 != 2) {
                throw z.c();
            }
            int iD = iVar.d() + iVar.y();
            do {
                list.add(Long.valueOf(iVar.u()));
            } while (iVar.d() < iD);
            u(iD);
            return;
        }
        g0 g0Var = (g0) list;
        int i11 = this.f6698b & 7;
        if (i11 == 0) {
            do {
                g0Var.addLong(iVar.u());
                if (iVar.e()) {
                    return;
                } else {
                    iX2 = iVar.x();
                }
            } while (iX2 == this.f6698b);
            this.f6700d = iX2;
            return;
        }
        if (i11 != 2) {
            throw z.c();
        }
        int iD2 = iVar.d() + iVar.y();
        do {
            g0Var.addLong(iVar.u());
        } while (iVar.d() < iD2);
        u(iD2);
    }

    public final void r(List<String> list, boolean z10) throws IOException {
        String strV;
        int iX;
        int iX2;
        if ((this.f6698b & 7) != 2) {
            throw z.c();
        }
        boolean z11 = list instanceof e0;
        i iVar = this.f6697a;
        if (z11 && !z10) {
            e0 e0Var = (e0) list;
            do {
                e0Var.d0(e());
                if (iVar.e()) {
                    return;
                } else {
                    iX2 = iVar.x();
                }
            } while (iX2 == this.f6698b);
            this.f6700d = iX2;
            return;
        }
        do {
            if (z10) {
                v(2);
                strV = iVar.w();
            } else {
                v(2);
                strV = iVar.v();
            }
            list.add(strV);
            if (iVar.e()) {
                return;
            } else {
                iX = iVar.x();
            }
        } while (iX == this.f6698b);
        this.f6700d = iX;
    }

    public final void s(List<Integer> list) throws IOException {
        int iX;
        int iX2;
        boolean z10 = list instanceof x;
        i iVar = this.f6697a;
        if (!z10) {
            int i10 = this.f6698b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(iVar.y()));
                    if (iVar.e()) {
                        return;
                    } else {
                        iX = iVar.x();
                    }
                } while (iX == this.f6698b);
                this.f6700d = iX;
                return;
            }
            if (i10 != 2) {
                throw z.c();
            }
            int iD = iVar.d() + iVar.y();
            do {
                list.add(Integer.valueOf(iVar.y()));
            } while (iVar.d() < iD);
            u(iD);
            return;
        }
        x xVar = (x) list;
        int i11 = this.f6698b & 7;
        if (i11 == 0) {
            do {
                xVar.addInt(iVar.y());
                if (iVar.e()) {
                    return;
                } else {
                    iX2 = iVar.x();
                }
            } while (iX2 == this.f6698b);
            this.f6700d = iX2;
            return;
        }
        if (i11 != 2) {
            throw z.c();
        }
        int iD2 = iVar.d() + iVar.y();
        do {
            xVar.addInt(iVar.y());
        } while (iVar.d() < iD2);
        u(iD2);
    }

    public final void t(List<Long> list) throws IOException {
        int iX;
        int iX2;
        boolean z10 = list instanceof g0;
        i iVar = this.f6697a;
        if (!z10) {
            int i10 = this.f6698b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(iVar.z()));
                    if (iVar.e()) {
                        return;
                    } else {
                        iX = iVar.x();
                    }
                } while (iX == this.f6698b);
                this.f6700d = iX;
                return;
            }
            if (i10 != 2) {
                throw z.c();
            }
            int iD = iVar.d() + iVar.y();
            do {
                list.add(Long.valueOf(iVar.z()));
            } while (iVar.d() < iD);
            u(iD);
            return;
        }
        g0 g0Var = (g0) list;
        int i11 = this.f6698b & 7;
        if (i11 == 0) {
            do {
                g0Var.addLong(iVar.z());
                if (iVar.e()) {
                    return;
                } else {
                    iX2 = iVar.x();
                }
            } while (iX2 == this.f6698b);
            this.f6700d = iX2;
            return;
        }
        if (i11 != 2) {
            throw z.c();
        }
        int iD2 = iVar.d() + iVar.y();
        do {
            g0Var.addLong(iVar.z());
        } while (iVar.d() < iD2);
        u(iD2);
    }

    public final void u(int i10) throws IOException {
        if (this.f6697a.d() != i10) {
            throw z.g();
        }
    }

    public final void v(int i10) throws IOException {
        if ((this.f6698b & 7) != i10) {
            throw z.c();
        }
    }

    public final boolean w() throws IOException {
        int i10;
        i iVar = this.f6697a;
        if (iVar.e() || (i10 = this.f6698b) == this.f6699c) {
            return false;
        }
        return iVar.A(i10);
    }
}
