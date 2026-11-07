package hi;

import c9.u1;
import hi.b0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: classes2.dex */
public final class n0 extends n {

    /* renamed from: f, reason: collision with root package name */
    public static final b0 f13100f;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f13101c;

    /* renamed from: d, reason: collision with root package name */
    public final n f13102d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f13103e;

    static {
        String str = b0.f13033b;
        f13100f = b0.a.a("/");
    }

    public n0(b0 b0Var, n fileSystem, LinkedHashMap linkedHashMap) {
        kotlin.jvm.internal.r.e(fileSystem, "fileSystem");
        this.f13101c = b0Var;
        this.f13102d = fileSystem;
        this.f13103e = linkedHashMap;
    }

    @Override // hi.n
    public final List<b0> N(b0 dir) throws IOException {
        kotlin.jvm.internal.r.e(dir, "dir");
        b0 b0Var = f13100f;
        b0Var.getClass();
        ii.h hVar = (ii.h) this.f13103e.get(ii.c.b(b0Var, dir, true));
        if (hVar != null) {
            return qg.x.c0(hVar.f14567q);
        }
        throw new IOException("not a directory: " + dir);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    @Override // hi.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m d0(b0 path) throws Throwable {
        Long lValueOf;
        long j10;
        Long l10;
        Long lValueOf2;
        Long l11;
        Long l12;
        Long lValueOf3;
        Throwable th2;
        Throwable th3;
        ii.h hVarF;
        kotlin.jvm.internal.r.e(path, "path");
        b0 b0Var = f13100f;
        b0Var.getClass();
        ii.h hVar = (ii.h) this.f13103e.get(ii.c.b(b0Var, path, true));
        if (hVar == null) {
            return null;
        }
        long j11 = hVar.f14558h;
        if (j11 != -1) {
            l lVarE0 = this.f13102d.e0(this.f13101c);
            try {
                f0 f0VarB = x.b(lVarE0.z(j11));
                try {
                    hVarF = ii.m.f(f0VarB, hVar);
                    kotlin.jvm.internal.r.b(hVarF);
                    try {
                        f0VarB.close();
                        th3 = null;
                    } catch (Throwable th4) {
                        th3 = th4;
                    }
                } catch (Throwable th5) {
                    try {
                        f0VarB.close();
                    } catch (Throwable th6) {
                        u1.b(th5, th6);
                    }
                    th3 = th5;
                    hVarF = null;
                }
            } catch (Throwable th7) {
                th2 = th7;
                if (lVarE0 != null) {
                    try {
                        lVarE0.close();
                    } catch (Throwable th8) {
                        u1.b(th2, th8);
                    }
                }
                hVar = null;
            }
            if (th3 != null) {
                throw th3;
            }
            try {
                lVarE0.close();
                th = null;
            } catch (Throwable th9) {
                th = th9;
            }
            th2 = th;
            hVar = hVarF;
            if (th2 != null) {
                throw th2;
            }
        }
        boolean z10 = hVar.f14552b;
        boolean z11 = !z10;
        Long lValueOf4 = z10 ? null : Long.valueOf(hVar.f14556f);
        Long l13 = hVar.f14563m;
        if (l13 != null) {
            lValueOf = Long.valueOf((l13.longValue() / 10000) - 11644473600000L);
        } else {
            lValueOf = hVar.f14566p != null ? Long.valueOf(r2.intValue() * 1000) : null;
        }
        Long l14 = hVar.f14561k;
        if (l14 != null) {
            j10 = 11644473600000L;
            lValueOf2 = Long.valueOf((l14.longValue() / 10000) - 11644473600000L);
        } else {
            j10 = 11644473600000L;
            if (hVar.f14564n == null) {
                int i10 = hVar.f14560j;
                if (i10 != -1) {
                    int i11 = hVar.f14559i;
                    if (i10 != -1) {
                        int i12 = (i10 >> 11) & 31;
                        int i13 = (i10 >> 5) & 63;
                        int i14 = (i10 & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i11 >> 9) & CertificateBody.profileType) + 1980, ((i11 >> 5) & 15) - 1, i11 & 31, i12, i13, i14);
                        lValueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                }
                l10 = null;
                l11 = hVar.f14562l;
                if (l11 == null) {
                    lValueOf3 = Long.valueOf((l11.longValue() / 10000) - j10);
                } else {
                    if (hVar.f14565o == null) {
                        l12 = null;
                        return new m(z11, z10, null, lValueOf4, lValueOf, l10, l12);
                    }
                    lValueOf3 = Long.valueOf(r0.intValue() * 1000);
                }
                l12 = lValueOf3;
                return new m(z11, z10, null, lValueOf4, lValueOf, l10, l12);
            }
            lValueOf2 = Long.valueOf(r3.intValue() * 1000);
        }
        l10 = lValueOf2;
        l11 = hVar.f14562l;
        if (l11 == null) {
        }
        l12 = lValueOf3;
        return new m(z11, z10, null, lValueOf4, lValueOf, l10, l12);
    }

    @Override // hi.n
    public final l e0(b0 file) {
        kotlin.jvm.internal.r.e(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // hi.n
    public final j0 f0(b0 file, boolean z10) throws IOException {
        kotlin.jvm.internal.r.e(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // hi.n
    public final l0 g0(b0 file) throws Throwable {
        Throwable th2;
        f0 f0VarB;
        kotlin.jvm.internal.r.e(file, "file");
        b0 b0Var = f13100f;
        b0Var.getClass();
        ii.h hVar = (ii.h) this.f13103e.get(ii.c.b(b0Var, file, true));
        if (hVar == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        long j10 = hVar.f14556f;
        l lVarE0 = this.f13102d.e0(this.f13101c);
        try {
            f0VarB = x.b(lVarE0.z(hVar.f14558h));
            try {
                lVarE0.close();
                th2 = null;
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (Throwable th4) {
            if (lVarE0 != null) {
                try {
                    lVarE0.close();
                } catch (Throwable th5) {
                    u1.b(th4, th5);
                }
            }
            th2 = th4;
            f0VarB = null;
        }
        if (th2 != null) {
            throw th2;
        }
        kotlin.jvm.internal.r.e(f0VarB, "<this>");
        ii.m.f(f0VarB, null);
        if (hVar.f14557g == 0) {
            return new ii.e(f0VarB, j10, true);
        }
        return new ii.e(new s(x.b(new ii.e(f0VarB, hVar.f14555e, true)), new Inflater(true)), j10, false);
    }

    @Override // hi.n
    public final j0 h(b0 file) throws IOException {
        kotlin.jvm.internal.r.e(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // hi.n
    public final void l(b0 source, b0 target) throws IOException {
        kotlin.jvm.internal.r.e(source, "source");
        kotlin.jvm.internal.r.e(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // hi.n
    public final void p(b0 dir) throws IOException {
        kotlin.jvm.internal.r.e(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // hi.n
    public final void z(b0 path) throws IOException {
        kotlin.jvm.internal.r.e(path, "path");
        throw new IOException("zip file systems are read-only");
    }
}
