package ff;

import android.util.Log;
import cf.l;
import cf.o;
import cf.p;
import ff.k;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class f extends b {
    public f(ef.c cVar, ef.g gVar) throws NumberFormatException, IOException {
        super(cVar);
        this.f11194i = cVar.f8711k;
        String property = System.getProperty("com.tom_roush.pdfbox.pdfparser.nonSequentialPDFParser.eofLookupRange");
        if (property != null) {
            try {
                int i10 = Integer.parseInt(property);
                if (i10 > 15) {
                    this.f11204s = i10;
                }
            } catch (NumberFormatException unused) {
                Log.w("PdfBox-Android", "System property com.tom_roush.pdfbox.pdfparser.nonSequentialPDFParser.eofLookupRange does not contain an integer value, but: '" + property + "'");
            }
        }
        this.f11184c = new cf.e(gVar);
    }

    public final hf.b U() throws IOException {
        cf.e eVar = this.f11184c;
        if (eVar == null) {
            throw new IOException("You must parse the document first before calling getDocument()");
        }
        if (eVar == null) {
            throw new IOException("You must parse the document first before calling getAccessPermission()");
        }
        hf.b bVar = new hf.b(eVar, this.f11191f);
        if (this.f11184c == null) {
            throw new IOException("You must parse the document first before calling getEncryption()");
        }
        bVar.f12999c = this.f11202q;
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V() throws Throwable {
        boolean z10;
        cf.d dVarL;
        o oVar;
        boolean z11;
        cf.d dVarQ;
        cf.d dVarQ2;
        long jB;
        boolean z12 = this.f11195j;
        try {
            jB = B();
        } catch (IOException e10) {
            if (!z12) {
                throw e10;
            }
            z10 = true;
        }
        if (jB > -1) {
            dVarL = L(jB);
            z10 = false;
            if (dVarL != null && dVarL.H0(l.Y1) == null) {
                z10 = z12;
            }
            if (z10) {
                N();
                HashMap map = this.f11198m;
                if (map != null && !map.isEmpty()) {
                    w();
                }
            } else {
                x();
                if (this.f11198m != null) {
                    k kVar = this.f11205t;
                    Iterator it = kVar.f11230a.values().iterator();
                    while (it.hasNext()) {
                        ((k.b) it.next()).f11238c.clear();
                    }
                    kVar.f11231b = null;
                    kVar.f11232c = null;
                    kVar.a(0L, k.a.f11233a);
                    for (Map.Entry entry : this.f11198m.entrySet()) {
                        kVar.c((p) entry.getKey(), ((Long) entry.getValue()).longValue());
                    }
                    kVar.b(0L);
                    k.b bVar = kVar.f11232c;
                    dVarL = bVar == null ? null : bVar.f11236a;
                    cf.e eVar = this.f11184c;
                    if (eVar == null) {
                        throw new IOException("You must parse the document first before calling getDocument()");
                    }
                    eVar.f5428f = dVarL;
                    ef.c cVar = this.f11191f;
                    long j10 = cVar.f8712l;
                    cVar.seek(6L);
                    while (true) {
                        if (cVar.g()) {
                            cVar.seek(j10);
                            if (!S(dVarL)) {
                                w();
                                S(dVarL);
                                z11 = true;
                            }
                        } else {
                            if (D(b.C)) {
                                cVar.seek(cVar.f8712l + 7);
                                try {
                                    t();
                                    cf.d dVarH = h();
                                    l lVar = l.Y1;
                                    cf.b bVarH0 = dVarH.H0(lVar);
                                    o oVar2 = bVarH0 instanceof o ? (o) bVarH0 : null;
                                    boolean z13 = (oVar2 == null || (dVarQ2 = Q(oVar2)) == null || !l.F.equals(dVarQ2.q0(l.f5532w2))) ? false : true;
                                    l lVar2 = l.f5458d1;
                                    cf.b bVarH02 = dVarH.H0(lVar2);
                                    o oVar3 = bVarH02 instanceof o ? (o) bVarH02 : null;
                                    boolean z14 = (oVar3 == null || (dVarQ = Q(oVar3)) == null || !b.C(dVarQ)) ? false : true;
                                    if (z13 && z14) {
                                        dVarL.O0(lVar, oVar2);
                                        dVarL.O0(lVar2, oVar3);
                                        l lVar3 = l.f5530w0;
                                        if (dVarH.f5423b.containsKey(lVar3)) {
                                            cf.b bVarH03 = dVarH.H0(lVar3);
                                            o oVar4 = bVarH03 instanceof o ? (o) bVarH03 : null;
                                            if (oVar4 != null && Q(oVar4) != null) {
                                                dVarL.O0(lVar3, oVar4);
                                            }
                                        }
                                        l lVar4 = l.V0;
                                        if (!dVarH.f5423b.containsKey(lVar4)) {
                                            break;
                                        }
                                        cf.b bVarH04 = dVarH.H0(lVar4);
                                        if (!(bVarH04 instanceof cf.a)) {
                                            break;
                                        }
                                        dVarL.O0(lVar4, bVarH04);
                                        break;
                                    }
                                } catch (IOException unused) {
                                    continue;
                                }
                            }
                            cVar.read();
                        }
                    }
                    z11 = false;
                    N();
                    if (!z11) {
                        w();
                    }
                } else {
                    dVarL = null;
                }
                this.f11197l = true;
            }
            for (cf.b bVar2 : dVarL.f5423b.values()) {
                if (bVar2 instanceof o) {
                    o oVar5 = (o) bVar2;
                    J(oVar5.f5551d, oVar5.f5550c, false);
                }
            }
            cf.b bVarH05 = dVarL.H0(l.Y1);
            oVar = bVarH05 instanceof o ? (o) bVarH05 : null;
            if (oVar != null) {
                throw new IOException("Missing root object specification in trailer.");
            }
            cf.b bVar3 = oVar.f5549b;
            if (!(bVar3 instanceof cf.d)) {
                throw new IOException("Expected root dictionary, but got this: " + bVar3);
            }
            cf.d dVar = (cf.d) bVar3;
            if (z12) {
                l lVar5 = l.f5532w2;
                if (!dVar.f5423b.containsKey(lVar5)) {
                    dVar.O0(lVar5, l.F);
                }
            }
            G(dVar);
            cf.b bVarV0 = dVarL.v0(l.f5458d1);
            if (bVarV0 instanceof cf.d) {
                G((cf.d) bVarV0);
            }
            if (this.f11197l) {
                cf.b bVarV02 = dVar.v0(l.I1);
                if (bVarV02 instanceof cf.d) {
                    b.y((cf.d) bVarV02, new HashSet());
                }
            }
            if (!(dVar.v0(l.I1) instanceof cf.d)) {
                throw new IOException("Page tree root must be a dictionary");
            }
            this.f11184c.getClass();
            this.f11196k = true;
            return;
        }
        z10 = z12;
        dVarL = null;
        if (dVarL != null) {
            z10 = z12;
        }
        if (z10) {
        }
        while (r5.hasNext()) {
        }
        cf.b bVarH052 = dVarL.H0(l.Y1);
        if (bVarH052 instanceof o) {
        }
        if (oVar != null) {
        }
    }

    public final void W() throws IOException {
        try {
            if (!I("%PDF-", "1.4") && !I("%FDF-", "1.0")) {
                throw new IOException("Error: Header doesn't contain versioninfo");
            }
            if (this.f11196k) {
                return;
            }
            V();
        } catch (Throwable th2) {
            cf.e eVar = this.f11184c;
            if (eVar != null) {
                ef.a.b(eVar);
                this.f11184c = null;
            }
            throw th2;
        }
    }
}
