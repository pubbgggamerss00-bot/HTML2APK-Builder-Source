package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

/* loaded from: classes2.dex */
public class f extends g {

    /* renamed from: d, reason: collision with root package name */
    public static final String f6988d = "PrintField";

    /* renamed from: e, reason: collision with root package name */
    private static final String f6989e = "Role";

    /* renamed from: f, reason: collision with root package name */
    private static final String f6990f = "checked";

    /* renamed from: g, reason: collision with root package name */
    private static final String f6991g = "Desc";

    /* renamed from: h, reason: collision with root package name */
    public static final String f6992h = "rb";

    /* renamed from: j, reason: collision with root package name */
    public static final String f6993j = "cb";

    /* renamed from: k, reason: collision with root package name */
    public static final String f6994k = "pb";

    /* renamed from: l, reason: collision with root package name */
    public static final String f6995l = "tv";

    /* renamed from: m, reason: collision with root package name */
    public static final String f6996m = "on";

    /* renamed from: n, reason: collision with root package name */
    public static final String f6997n = "off";

    /* renamed from: p, reason: collision with root package name */
    public static final String f6998p = "neutral";

    public f() {
        k(f6988d);
    }

    public String J() {
        return x(f6991g);
    }

    public String K() {
        return r(f6990f, f6997n);
    }

    public String L() {
        return q(f6989e);
    }

    public void M(String str) {
        I(f6991g, str);
    }

    public void N(String str) {
        F(f6990f, str);
    }

    public void O(String str) {
        F(f6989e, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (y(f6989e)) {
            sb.append(", Role=");
            sb.append(L());
        }
        if (y(f6990f)) {
            sb.append(", Checked=");
            sb.append(K());
        }
        if (y(f6991g)) {
            sb.append(", Desc=");
            sb.append(J());
        }
        return sb.toString();
    }

    public f(cf.d dVar) {
        super(dVar);
    }
}
