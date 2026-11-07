package uf;

import android.util.Log;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class a implements jf.c {

    /* renamed from: a, reason: collision with root package name */
    public final cf.d f29705a;

    public a(cf.d dVar) {
        this.f29705a = dVar;
        cf.l lVar = cf.l.f5532w2;
        cf.b bVarV0 = dVar.v0(lVar);
        if (bVarV0 == null) {
            dVar.O0(lVar, cf.l.f5487l);
        } else {
            if (cf.l.f5487l.equals(bVarV0)) {
                return;
            }
            Log.w("PdfBox-Android", "Annotation has type " + bVarV0 + ", further mayhem may follow");
        }
    }

    public static a a(cf.d dVar) throws IOException {
        cf.l lVar = cf.l.f5509q2;
        String strJ0 = dVar.J0(lVar);
        if ("FileAttachment".equals(strJ0)) {
            return new b(dVar);
        }
        if ("Line".equals(strJ0)) {
            return new c(dVar);
        }
        if (com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.L.equals(strJ0)) {
            return new d(dVar);
        }
        if ("Popup".equals(strJ0)) {
            return new f(dVar);
        }
        if ("Stamp".equals(strJ0)) {
            return new g(dVar);
        }
        if (com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f6985m.equals(strJ0) || com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f6979f.equals(strJ0)) {
            return new h(dVar);
        }
        if ("Text".equals(strJ0)) {
            return new i(dVar);
        }
        if ("Highlight".equals(strJ0) || com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f6970w0.equals(strJ0) || "Squiggly".equals(strJ0) || "StrikeOut".equals(strJ0)) {
            return new j(dVar);
        }
        if ("Widget".equals(strJ0)) {
            l lVar2 = new l(dVar);
            dVar.R0(lVar, "Widget");
            return lVar2;
        }
        if ("FreeText".equals(strJ0) || "Polygon".equals(strJ0) || "PolyLine".equals(strJ0) || "Caret".equals(strJ0) || "Ink".equals(strJ0) || "Sound".equals(strJ0)) {
            return new e(dVar);
        }
        k kVar = new k(dVar);
        Log.d("PdfBox-Android", "Unknown or unsupported annotation subtype " + strJ0);
        return kVar;
    }

    @Override // jf.c
    public final cf.b Z() {
        return this.f29705a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            return ((a) obj).f29705a.equals(this.f29705a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29705a.hashCode();
    }
}
