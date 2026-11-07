package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

/* loaded from: classes2.dex */
public abstract class a extends jf.d {

    /* renamed from: b, reason: collision with root package name */
    private g f6912b;

    public a() {
    }

    public static String b(float[] fArr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i10 = 0; i10 < fArr.length; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            sb.append(fArr[i10]);
        }
        sb.append(']');
        return sb.toString();
    }

    public static String c(Object[] objArr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i10 = 0; i10 < objArr.length; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            sb.append(objArr[i10]);
        }
        sb.append(']');
        return sb.toString();
    }

    public static a d(cf.d dVar) {
        String strJ0 = dVar.J0(cf.l.f5539y1);
        return j.f6922c.equals(strJ0) ? new j(dVar) : com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f6977d.equals(strJ0) ? new com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e(dVar) : com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.f6988d.equals(strJ0) ? new com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f(dVar) : "Table".equals(strJ0) ? new com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.h(dVar) : com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f6934d.equals(strJ0) ? new com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d(dVar) : (com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.b.Q0.equals(strJ0) || com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.b.R0.equals(strJ0) || com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.b.S0.equals(strJ0) || com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.b.T0.equals(strJ0) || com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.b.U0.equals(strJ0) || com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.b.V0.equals(strJ0) || com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.b.W0.equals(strJ0)) ? new com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.b(dVar) : new b(dVar);
    }

    private g f() {
        return this.f6912b;
    }

    private boolean h(cf.b bVar, cf.b bVar2) {
        return bVar == null ? bVar2 != null : !bVar.equals(bVar2);
    }

    public String e() {
        return Z().J0(cf.l.f5539y1);
    }

    public boolean g() {
        return Z().f5423b.size() == 1 && e() != null;
    }

    public void i() {
        if (f() != null) {
            f().v(this);
        }
    }

    public void j(cf.b bVar, cf.b bVar2) {
        if (h(bVar, bVar2)) {
            i();
        }
    }

    public void k(String str) {
        Z().R0(cf.l.f5539y1, str);
    }

    public void l(g gVar) {
        this.f6912b = gVar;
    }

    public String toString() {
        return "O=" + e();
    }

    public a(cf.d dVar) {
        super(dVar);
    }
}
