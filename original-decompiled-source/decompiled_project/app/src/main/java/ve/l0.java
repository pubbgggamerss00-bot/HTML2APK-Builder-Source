package ve;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f30837a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30838b;

    public l0(boolean z10, boolean z11) {
        this.f30837a = z10;
        this.f30838b = z11;
    }

    public p0 a(k0 k0Var) {
        return new p0(k0Var);
    }

    public p0 b(File file) throws IOException {
        h0 h0Var = new h0(file);
        try {
            return c(h0Var);
        } catch (IOException e10) {
            h0Var.close();
            throw e10;
        }
    }

    public p0 c(k0 k0Var) throws IOException {
        n0 fVar;
        p0 p0VarA = a(k0Var);
        p0VarA.k0(k0Var.E());
        int iI0 = k0Var.i0();
        k0Var.i0();
        k0Var.i0();
        k0Var.i0();
        boolean z10 = false;
        for (int i10 = 0; i10 < iI0; i10++) {
            String strD0 = k0Var.d0(4, xe.a.f33561a);
            if (strD0.equals("cmap")) {
                fVar = new e(p0VarA);
            } else if (strD0.equals("glyf")) {
                p pVar = new p(p0VarA);
                pVar.f30895j = 0;
                pVar.f30896k = null;
                fVar = pVar;
            } else if (strD0.equals("head")) {
                fVar = new q(p0VarA);
            } else if (strD0.equals("hhea")) {
                fVar = new r(p0VarA);
            } else if (strD0.equals("hmtx")) {
                fVar = new s(p0VarA);
            } else if (strD0.equals("loca")) {
                fVar = new t(p0VarA);
            } else if (strD0.equals("maxp")) {
                fVar = new w(p0VarA);
            } else if (strD0.equals("name")) {
                z zVar = new z(p0VarA);
                zVar.f30975h = null;
                fVar = zVar;
            } else if (strD0.equals("OS/2")) {
                a0 a0Var = new a0(p0VarA);
                a0Var.f30771v = new byte[10];
                a0Var.f30772w = "XXXX";
                a0Var.D = 0L;
                a0Var.E = 0L;
                fVar = a0Var;
            } else if (strD0.equals("post")) {
                g0 g0Var = new g0(p0VarA);
                g0Var.f30814o = null;
                fVar = g0Var;
            } else {
                fVar = strD0.equals("DSIG") ? new f(p0VarA) : strD0.equals("kern") ? new v(p0VarA) : strD0.equals("vhea") ? new q0(p0VarA) : strD0.equals("vmtx") ? new r0(p0VarA) : strD0.equals("VORG") ? new s0(p0VarA) : strD0.equals("GSUB") ? new o(p0VarA) : d(p0VarA, strD0);
            }
            fVar.f30852a = strD0;
            k0Var.g0();
            fVar.f30853b = k0Var.g0();
            long jG0 = k0Var.g0();
            fVar.f30854c = jG0;
            n0 n0Var = (jG0 != 0 || strD0.equals("glyf")) ? fVar : null;
            if (n0Var != null) {
                if (n0Var.f30853b + n0Var.f30854c > p0VarA.f30899c.p()) {
                    Log.w("PdfBox-Android", "Skip table '" + n0Var.f30852a + "' which goes past the file size; offset: " + n0Var.f30853b + ", size: " + n0Var.f30854c + ", font size: " + p0VarA.f30899c.p());
                } else {
                    p0VarA.f30898b.put(n0Var.f30852a, n0Var);
                }
            }
        }
        if (!this.f30838b) {
            for (n0 n0Var2 : p0VarA.f30898b.values()) {
                if (!n0Var2.f30855d) {
                    p0VarA.i0(n0Var2);
                }
            }
            boolean zContainsKey = p0VarA.f30898b.containsKey("CFF ");
            if ((this instanceof b0) && zContainsKey) {
                z10 = true;
            }
            if (p0VarA.l() == null) {
                throw new IOException("'head' table is mandatory");
            }
            if (((r) p0VarA.Z("hhea")) == null) {
                throw new IOException("'hhea' table is mandatory");
            }
            if (((w) p0VarA.Z("maxp")) == null) {
                throw new IOException("'maxp' table is mandatory");
            }
            if (((g0) p0VarA.Z("post")) == null && !this.f30837a) {
                throw new IOException("'post' table is mandatory");
            }
            if (!z10) {
                String str = zContainsKey ? "; this an OpenType CFF font, but we expected a TrueType font here" : "";
                if (((t) p0VarA.Z("loca")) == null) {
                    throw new IOException("'loca' table is mandatory".concat(str));
                }
                if (p0VarA.h() == null) {
                    throw new IOException("'glyf' table is mandatory".concat(str));
                }
            }
            if (((z) p0VarA.Z("name")) == null && !this.f30837a) {
                throw new IOException("'name' table is mandatory");
            }
            if (p0VarA.p() == null) {
                throw new IOException("'hmtx' table is mandatory");
            }
            if (!this.f30837a && ((e) p0VarA.Z("cmap")) == null) {
                throw new IOException("'cmap' table is mandatory");
            }
        }
        return p0VarA;
    }

    public n0 d(p0 p0Var, String str) {
        return new n0(p0Var);
    }
}
