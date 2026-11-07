package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

/* loaded from: classes2.dex */
public class b extends d {
    public static final String Q0 = "XML-1.00";
    public static final String R0 = "HTML-3.2";
    public static final String S0 = "HTML-4.01";
    public static final String T0 = "OEB-1.00";
    public static final String U0 = "RTF-1.05";
    public static final String V0 = "CSS-1.00";
    public static final String W0 = "CSS-2.00";

    public b(String str) {
        k(str);
    }

    public int A1() {
        return p("RowSpan", 1);
    }

    public String B1() {
        return q("Scope");
    }

    public String C1() {
        return x("Summary");
    }

    public void D1(int i10) {
        E("ColSpan", i10);
    }

    public void E1(String[] strArr) {
        B("Headers", strArr);
    }

    public void F1(String str) {
        F("ListNumbering", str);
    }

    public void G1(int i10) {
        E("RowSpan", i10);
    }

    public void H1(String str) {
        F("Scope", str);
    }

    public void I1(String str) {
        I("Summary", str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d, com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (y("ListNumbering")) {
            sb.append(", ListNumbering=");
            sb.append(z1());
        }
        if (y("RowSpan")) {
            sb.append(", RowSpan=");
            sb.append(A1());
        }
        if (y("ColSpan")) {
            sb.append(", ColSpan=");
            sb.append(x1());
        }
        if (y("Headers")) {
            sb.append(", Headers=");
            sb.append(com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a.c(y1()));
        }
        if (y("Scope")) {
            sb.append(", Scope=");
            sb.append(B1());
        }
        if (y("Summary")) {
            sb.append(", Summary=");
            sb.append(C1());
        }
        return sb.toString();
    }

    public int x1() {
        return p("ColSpan", 1);
    }

    public String[] y1() {
        return m("Headers");
    }

    public String z1() {
        return r("ListNumbering", "None");
    }

    public b(cf.d dVar) {
        super(dVar);
    }
}
