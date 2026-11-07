package ii;

import hi.b0;
import hi.j;
import j2.y;
import java.io.EOFException;
import java.util.ArrayList;
import kotlin.jvm.internal.r;
import pg.f0;
import qg.p;
import qg.x;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final hi.j f14537a;

    /* renamed from: b, reason: collision with root package name */
    public static final hi.j f14538b;

    /* renamed from: c, reason: collision with root package name */
    public static final hi.j f14539c;

    /* renamed from: d, reason: collision with root package name */
    public static final hi.j f14540d;

    /* renamed from: e, reason: collision with root package name */
    public static final hi.j f14541e;

    static {
        hi.j jVar = hi.j.f13075d;
        f14537a = j.a.b("/");
        f14538b = j.a.b("\\");
        f14539c = j.a.b("/\\");
        f14540d = j.a.b(".");
        f14541e = j.a.b("..");
    }

    public static final int a(b0 b0Var) {
        hi.j jVar = b0Var.f13034a;
        if (jVar.d() != 0) {
            if (jVar.i(0) != 47) {
                if (jVar.i(0) == 92) {
                    if (jVar.d() > 2 && jVar.i(1) == 92) {
                        hi.j other = f14538b;
                        r.e(other, "other");
                        int iF = jVar.f(2, other.h());
                        return iF == -1 ? jVar.d() : iF;
                    }
                } else if (jVar.d() > 2 && jVar.i(1) == 58 && jVar.i(2) == 92) {
                    char cI = (char) jVar.i(0);
                    if ('a' <= cI && cI < '{') {
                        return 3;
                    }
                    if ('A' <= cI && cI < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final b0 b(b0 b0Var, b0 child, boolean z10) {
        r.e(child, "child");
        if (a(child) != -1 || child.g() != null) {
            return child;
        }
        hi.j jVarC = c(b0Var);
        if (jVarC == null && (jVarC = c(child)) == null) {
            jVarC = f(b0.f13033b);
        }
        hi.g gVar = new hi.g();
        gVar.k0(b0Var.f13034a);
        if (gVar.f13061b > 0) {
            gVar.k0(jVarC);
        }
        gVar.k0(child.f13034a);
        return d(gVar, z10);
    }

    public static final hi.j c(b0 b0Var) {
        hi.j jVar = b0Var.f13034a;
        hi.j jVar2 = f14537a;
        if (hi.j.g(jVar, jVar2) != -1) {
            return jVar2;
        }
        hi.j jVar3 = b0Var.f13034a;
        hi.j jVar4 = f14538b;
        if (hi.j.g(jVar3, jVar4) != -1) {
            return jVar4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011e A[EDGE_INSN: B:103:0x011e->B:85:0x011e BREAK  A[LOOP:1: B:54:0x00ae->B:117:0x00ae], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final b0 d(hi.g gVar, boolean z10) throws EOFException {
        hi.j jVar;
        long j10;
        char cZ;
        boolean zP;
        hi.j jVar2;
        int size;
        int i10;
        hi.j jVarM;
        hi.g gVar2 = new hi.g();
        hi.j jVarE = null;
        int i11 = 0;
        while (true) {
            if (!gVar.A0(0L, f14537a)) {
                jVar = f14538b;
                if (!gVar.A0(0L, jVar)) {
                    break;
                }
            }
            byte b10 = gVar.readByte();
            if (jVarE == null) {
                jVarE = e(b10);
            }
            i11++;
        }
        boolean z11 = i11 >= 2 && r.a(jVarE, jVar);
        hi.j jVar3 = f14539c;
        if (z11) {
            r.b(jVarE);
            gVar2.k0(jVarE);
            gVar2.k0(jVarE);
        } else {
            if (i11 <= 0) {
                long jM = gVar.M(jVar3);
                if (jVarE == null) {
                    jVarE = jM == -1 ? f(b0.f13033b) : e(gVar.z(jM));
                }
                if (r.a(jVarE, jVar) && gVar.f13061b >= 2) {
                    j10 = -1;
                    if (gVar.z(1L) == 58 && (('a' <= (cZ = (char) gVar.z(0L)) && cZ < '{') || ('A' <= cZ && cZ < '['))) {
                        if (jM == 2) {
                            gVar2.j(3L, gVar);
                        } else {
                            gVar2.j(2L, gVar);
                        }
                    }
                } else {
                    j10 = -1;
                }
                f0 f0Var = f0.f21461a;
                boolean z12 = gVar2.f13061b <= 0;
                ArrayList arrayList = new ArrayList();
                while (true) {
                    zP = gVar.p();
                    jVar2 = f14540d;
                    if (!zP) {
                        break;
                    }
                    long jM2 = gVar.M(jVar3);
                    if (jM2 == j10) {
                        jVarM = gVar.m(gVar.f13061b);
                    } else {
                        jVarM = gVar.m(jM2);
                        gVar.readByte();
                    }
                    hi.j jVar4 = f14541e;
                    if (r.a(jVarM, jVar4)) {
                        if (!z12 || !arrayList.isEmpty()) {
                            if (!z10 || (!z12 && (arrayList.isEmpty() || r.a(x.J(arrayList), jVar4)))) {
                                arrayList.add(jVarM);
                            } else if (!z11 || arrayList.size() != 1) {
                                if (!arrayList.isEmpty()) {
                                    arrayList.remove(p.i(arrayList));
                                }
                            }
                        }
                    } else if (!r.a(jVarM, jVar2) && !r.a(jVarM, hi.j.f13075d)) {
                        arrayList.add(jVarM);
                    }
                }
                size = arrayList.size();
                for (i10 = 0; i10 < size; i10++) {
                    if (i10 > 0) {
                        gVar2.k0(jVarE);
                    }
                    gVar2.k0((hi.j) arrayList.get(i10));
                }
                if (gVar2.f13061b == 0) {
                    gVar2.k0(jVar2);
                }
                return new b0(gVar2.m(gVar2.f13061b));
            }
            r.b(jVarE);
            gVar2.k0(jVarE);
        }
        j10 = -1;
        if (gVar2.f13061b <= 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            zP = gVar.p();
            jVar2 = f14540d;
            if (!zP) {
            }
        }
        size = arrayList2.size();
        while (i10 < size) {
        }
        if (gVar2.f13061b == 0) {
        }
        return new b0(gVar2.m(gVar2.f13061b));
    }

    public static final hi.j e(byte b10) {
        if (b10 == 47) {
            return f14537a;
        }
        if (b10 == 92) {
            return f14538b;
        }
        throw new IllegalArgumentException(y.a(b10, "not a directory separator: "));
    }

    public static final hi.j f(String str) {
        if (r.a(str, "/")) {
            return f14537a;
        }
        if (r.a(str, "\\")) {
            return f14538b;
        }
        throw new IllegalArgumentException(m3.a.a("not a directory separator: ", str));
    }
}
