package mf;

import android.graphics.Path;
import android.graphics.RectF;
import com.basitce.htmltoapk.data.apkgenerator.binaryxml.BinaryXmlFormat;
import java.io.IOException;
import java.util.HashSet;
import ve.a0;
import ve.g0;
import ve.p0;

/* loaded from: classes2.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public final hf.b f18231a;

    /* renamed from: b, reason: collision with root package name */
    public p0 f18232b;

    /* renamed from: c, reason: collision with root package name */
    public o f18233c;

    /* renamed from: d, reason: collision with root package name */
    public final ve.c f18234d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f18235e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18236f = true;

    public s(hf.b bVar, cf.d dVar, p0 p0Var) throws IOException {
        this.f18231a = bVar;
        this.f18232b = p0Var;
        this.f18233c = a(p0Var);
        if (p0Var.M() != null) {
            short s10 = p0Var.M().f30759j;
            if ((s10 & 15) == 2 || (s10 & 512) == 512) {
                throw new IOException("This font does not permit embedding");
            }
        }
        dVar.R0(cf.l.f5529w, p0Var.z());
        p0Var.e0(true);
        this.f18234d = p0Var.f0(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static o a(p0 p0Var) throws IOException {
        String strZ = p0Var.z();
        a0 a0VarM = p0Var.M();
        if (a0VarM == null) {
            throw new IOException(m3.a.a("os2 table is missing in font ", strZ));
        }
        g0 g0Var = (g0) p0Var.Z("post");
        if (g0Var == null) {
            throw new IOException(m3.a.a("post table is missing in font ", strZ));
        }
        o oVar = new o();
        cf.l lVarG0 = strZ != null ? cf.l.g0(strZ) : null;
        cf.l lVar = cf.l.N0;
        cf.d dVar = oVar.f18221a;
        dVar.O0(lVar, lVarG0);
        oVar.c(1, g0Var.f30809j > 0 || ((ve.r) p0Var.Z("hhea")).f30935v == 1);
        oVar.c(64, (a0VarM.f30773x & BinaryXmlFormat.RES_TABLE_TYPE_TYPE) != 0);
        int i10 = a0VarM.f30770u;
        if (i10 == 1 || i10 == 7) {
            oVar.c(2, true);
        } else if (i10 == 10) {
            oVar.c(8, true);
        } else if (i10 == 3 || i10 == 4 || i10 == 5) {
        }
        dVar.M0(cf.l.O0, a0VarM.f30757h);
        oVar.c(4, true);
        oVar.c(32, false);
        dVar.M0(cf.l.f5462e1, g0Var.f30806g);
        ve.q qVarL = p0Var.l();
        jf.g gVar = new jf.g();
        float f10 = 1000.0f / qVarL.f30906j;
        cf.f fVar = new cf.f(qVarL.f30909m * f10);
        cf.a aVar = gVar.f15718a;
        aVar.y0(0, fVar);
        aVar.y0(1, new cf.f(qVarL.f30910n * f10));
        aVar.y0(2, new cf.f(qVarL.f30911o * f10));
        aVar.y0(3, new cf.f(qVarL.f30912p * f10));
        cf.l lVar2 = cf.l.H0;
        dVar.O0(lVar2, aVar);
        dVar.M0(cf.l.f5495n, r1.f30920g * f10);
        dVar.M0(cf.l.f5484k0, r1.f30921h * f10);
        if (a0VarM.f30755f >= 1.2d) {
            dVar.M0(cf.l.E, a0VarM.G * f10);
            dVar.M0(cf.l.F2, a0VarM.F * f10);
        } else {
            Path pathN = p0Var.N(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f7022n);
            if (pathN != null) {
                pathN.computeBounds(new RectF(), true);
                dVar.M0(cf.l.E, Math.round(r6.bottom) * f10);
            } else {
                dVar.M0(cf.l.E, (a0VarM.f30774y + a0VarM.f30775z) * f10);
            }
            Path pathN2 = p0Var.N("x");
            if (pathN2 != null) {
                pathN2.computeBounds(new RectF(), true);
                dVar.M0(cf.l.F2, Math.round(r1.bottom) * f10);
            } else {
                dVar.M0(cf.l.F2, (a0VarM.f30774y / 2.0f) * f10);
            }
        }
        cf.a aVarK0 = dVar.k0(lVar2);
        jf.g gVar2 = aVarK0 != null ? new jf.g(aVarK0) : null;
        dVar.M0(cf.l.f5486k2, (((cf.n) gVar2.f15718a.i0(2)).g0() - gVar2.a()) * 0.13f);
        return oVar;
    }
}
