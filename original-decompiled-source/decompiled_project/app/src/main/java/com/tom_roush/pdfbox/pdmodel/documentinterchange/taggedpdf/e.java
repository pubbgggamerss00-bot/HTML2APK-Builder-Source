package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

/* loaded from: classes2.dex */
public class e extends g {

    /* renamed from: d, reason: collision with root package name */
    public static final String f6977d = "List";

    /* renamed from: e, reason: collision with root package name */
    protected static final String f6978e = "ListNumbering";

    /* renamed from: f, reason: collision with root package name */
    public static final String f6979f = "Circle";

    /* renamed from: g, reason: collision with root package name */
    public static final String f6980g = "Decimal";

    /* renamed from: h, reason: collision with root package name */
    public static final String f6981h = "Disc";

    /* renamed from: j, reason: collision with root package name */
    public static final String f6982j = "LowerAlpha";

    /* renamed from: k, reason: collision with root package name */
    public static final String f6983k = "LowerRoman";

    /* renamed from: l, reason: collision with root package name */
    public static final String f6984l = "None";

    /* renamed from: m, reason: collision with root package name */
    public static final String f6985m = "Square";

    /* renamed from: n, reason: collision with root package name */
    public static final String f6986n = "UpperAlpha";

    /* renamed from: p, reason: collision with root package name */
    public static final String f6987p = "UpperRoman";

    public e() {
        k(f6977d);
    }

    public String J() {
        return r(f6978e, "None");
    }

    public void K(String str) {
        F(f6978e, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (y(f6978e)) {
            sb.append(", ListNumbering=");
            sb.append(J());
        }
        return sb.toString();
    }

    public e(cf.d dVar) {
        super(dVar);
    }
}
