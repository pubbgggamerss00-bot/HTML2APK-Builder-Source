package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

/* loaded from: classes2.dex */
public class h extends g {

    /* renamed from: d, reason: collision with root package name */
    public static final String f7000d = "Table";

    /* renamed from: e, reason: collision with root package name */
    protected static final String f7001e = "RowSpan";

    /* renamed from: f, reason: collision with root package name */
    protected static final String f7002f = "ColSpan";

    /* renamed from: g, reason: collision with root package name */
    protected static final String f7003g = "Headers";

    /* renamed from: h, reason: collision with root package name */
    protected static final String f7004h = "Scope";

    /* renamed from: j, reason: collision with root package name */
    protected static final String f7005j = "Summary";

    /* renamed from: k, reason: collision with root package name */
    public static final String f7006k = "Both";

    /* renamed from: l, reason: collision with root package name */
    public static final String f7007l = "Column";

    /* renamed from: m, reason: collision with root package name */
    public static final String f7008m = "Row";

    public h() {
        k("Table");
    }

    public int J() {
        return p(f7002f, 1);
    }

    public String[] K() {
        return m(f7003g);
    }

    public int L() {
        return p(f7001e, 1);
    }

    public String M() {
        return q(f7004h);
    }

    public String N() {
        return x(f7005j);
    }

    public void O(int i10) {
        E(f7002f, i10);
    }

    public void P(String[] strArr) {
        B(f7003g, strArr);
    }

    public void Q(int i10) {
        E(f7001e, i10);
    }

    public void R(String str) {
        F(f7004h, str);
    }

    public void S(String str) {
        I(f7005j, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (y(f7001e)) {
            sb.append(", RowSpan=");
            sb.append(L());
        }
        if (y(f7002f)) {
            sb.append(", ColSpan=");
            sb.append(J());
        }
        if (y(f7003g)) {
            sb.append(", Headers=");
            sb.append(com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a.c(K()));
        }
        if (y(f7004h)) {
            sb.append(", Scope=");
            sb.append(M());
        }
        if (y(f7005j)) {
            sb.append(", Summary=");
            sb.append(N());
        }
        return sb.toString();
    }

    public h(cf.d dVar) {
        super(dVar);
    }
}
