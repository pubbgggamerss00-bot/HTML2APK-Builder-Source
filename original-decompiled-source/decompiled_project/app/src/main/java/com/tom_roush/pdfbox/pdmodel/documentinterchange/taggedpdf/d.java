package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import cf.l;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes2.dex */
public class d extends g {
    private static final String A = "TBorderStyle";
    public static final String A0 = "Center";
    private static final String B = "TPadding";
    public static final String B0 = "End";
    private static final String C = "BaselineShift";
    public static final String C0 = "Justify";
    private static final String D = "LineHeight";
    public static final String D0 = "Distribute";
    private static final String E = "TextDecorationColor";
    public static final String E0 = "Before";
    private static final String F = "TextDecorationThickness";
    public static final String F0 = "After";
    private static final String G = "TextDecorationType";
    public static final String G0 = "Warichu";
    private static final String H = "RubyAlign";
    public static final String H0 = "Inline";
    private static final String I = "RubyPosition";
    public static final String I0 = "Auto";
    public static final String J0 = "-180";
    private static final String K = "GlyphOrientationVertical";
    public static final String K0 = "-90";
    private static final String L = "ColumnCount";
    public static final String L0 = "0";
    private static final String M = "ColumnGap";
    public static final String M0 = "90";
    private static final String N = "ColumnWidths";
    public static final String N0 = "180";
    public static final String O = "Block";
    public static final String O0 = "270";
    public static final String P = "Inline";
    public static final String P0 = "360";
    public static final String Q = "Before";
    public static final String R = "Start";
    public static final String S = "End";
    public static final String T = "LrTb";
    public static final String U = "RlTb";
    public static final String V = "TbRl";
    public static final String W = "None";
    public static final String X = "Hidden";
    public static final String Y = "Dotted";
    public static final String Z = "Dashed";

    /* renamed from: a0, reason: collision with root package name */
    public static final String f6931a0 = "Solid";

    /* renamed from: b0, reason: collision with root package name */
    public static final String f6932b0 = "Double";

    /* renamed from: c0, reason: collision with root package name */
    public static final String f6933c0 = "Groove";

    /* renamed from: d, reason: collision with root package name */
    public static final String f6934d = "Layout";

    /* renamed from: d0, reason: collision with root package name */
    public static final String f6935d0 = "Ridge";

    /* renamed from: e, reason: collision with root package name */
    private static final String f6936e = "Placement";

    /* renamed from: e0, reason: collision with root package name */
    public static final String f6937e0 = "Inset";

    /* renamed from: f, reason: collision with root package name */
    private static final String f6938f = "WritingMode";

    /* renamed from: f0, reason: collision with root package name */
    public static final String f6939f0 = "Outset";

    /* renamed from: g, reason: collision with root package name */
    private static final String f6940g = "BackgroundColor";

    /* renamed from: g0, reason: collision with root package name */
    public static final String f6941g0 = "Start";

    /* renamed from: h, reason: collision with root package name */
    private static final String f6942h = "BorderColor";

    /* renamed from: h0, reason: collision with root package name */
    public static final String f6943h0 = "Center";

    /* renamed from: i0, reason: collision with root package name */
    public static final String f6944i0 = "End";

    /* renamed from: j, reason: collision with root package name */
    private static final String f6945j = "BorderStyle";

    /* renamed from: j0, reason: collision with root package name */
    public static final String f6946j0 = "Justify";

    /* renamed from: k, reason: collision with root package name */
    private static final String f6947k = "BorderThickness";

    /* renamed from: k0, reason: collision with root package name */
    public static final String f6948k0 = "Auto";

    /* renamed from: l, reason: collision with root package name */
    private static final String f6949l = "Padding";

    /* renamed from: l0, reason: collision with root package name */
    public static final String f6950l0 = "Auto";

    /* renamed from: m, reason: collision with root package name */
    private static final String f6951m = "Color";

    /* renamed from: m0, reason: collision with root package name */
    public static final String f6952m0 = "Before";

    /* renamed from: n, reason: collision with root package name */
    private static final String f6953n = "SpaceBefore";

    /* renamed from: n0, reason: collision with root package name */
    public static final String f6954n0 = "Middle";

    /* renamed from: o0, reason: collision with root package name */
    public static final String f6955o0 = "After";

    /* renamed from: p, reason: collision with root package name */
    private static final String f6956p = "SpaceAfter";

    /* renamed from: p0, reason: collision with root package name */
    public static final String f6957p0 = "Justify";

    /* renamed from: q, reason: collision with root package name */
    private static final String f6958q = "StartIndent";

    /* renamed from: q0, reason: collision with root package name */
    public static final String f6959q0 = "Start";

    /* renamed from: r, reason: collision with root package name */
    private static final String f6960r = "EndIndent";

    /* renamed from: r0, reason: collision with root package name */
    public static final String f6961r0 = "Center";

    /* renamed from: s, reason: collision with root package name */
    private static final String f6962s = "TextIndent";

    /* renamed from: s0, reason: collision with root package name */
    public static final String f6963s0 = "End";

    /* renamed from: t, reason: collision with root package name */
    private static final String f6964t = "TextAlign";

    /* renamed from: t0, reason: collision with root package name */
    public static final String f6965t0 = "Normal";

    /* renamed from: u0, reason: collision with root package name */
    public static final String f6966u0 = "Auto";

    /* renamed from: v, reason: collision with root package name */
    private static final String f6967v = "BBox";

    /* renamed from: v0, reason: collision with root package name */
    public static final String f6968v0 = "None";

    /* renamed from: w, reason: collision with root package name */
    private static final String f6969w = "Width";

    /* renamed from: w0, reason: collision with root package name */
    public static final String f6970w0 = "Underline";

    /* renamed from: x, reason: collision with root package name */
    private static final String f6971x = "Height";

    /* renamed from: x0, reason: collision with root package name */
    public static final String f6972x0 = "Overline";

    /* renamed from: y, reason: collision with root package name */
    private static final String f6973y = "BlockAlign";

    /* renamed from: y0, reason: collision with root package name */
    public static final String f6974y0 = "LineThrough";

    /* renamed from: z, reason: collision with root package name */
    private static final String f6975z = "InlineAlign";

    /* renamed from: z0, reason: collision with root package name */
    public static final String f6976z0 = "Start";

    public d() {
        k(f6934d);
    }

    public void A0(int i10) {
        H(B, i10);
    }

    public void B0(jf.g gVar) {
        cf.b bVarD0 = Z().D0(f6967v);
        cf.d dVarZ = Z();
        dVarZ.getClass();
        dVarZ.P0(l.g0(f6967v), gVar);
        j(bVarD0, gVar == null ? null : gVar.f15718a);
    }

    public void C0(pf.d dVar) {
        C(f6940g, dVar);
    }

    public void D0(float f10) {
        G(C, f10);
    }

    public void E0(int i10) {
        H(C, i10);
    }

    public void F0(String str) {
        F(f6973y, str);
    }

    public void G0(c cVar) {
        D(f6942h, cVar);
    }

    public void H0(String[] strArr) {
        z(f6945j, strArr);
    }

    public void I0(float[] fArr) {
        A(f6947k, fArr);
    }

    public jf.g J() {
        cf.a aVar = (cf.a) Z().D0(f6967v);
        if (aVar != null) {
            return new jf.g(aVar);
        }
        return null;
    }

    public void J0(pf.d dVar) {
        C(f6951m, dVar);
    }

    public pf.d K() {
        return n(f6940g);
    }

    public void K0(int i10) {
        E(L, i10);
    }

    public float L() {
        return u(C, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public void L0(float f10) {
        G(M, f10);
    }

    public String M() {
        return r(f6973y, "Before");
    }

    public void M0(int i10) {
        H(M, i10);
    }

    public Object N() {
        return o(f6942h);
    }

    public void N0(float[] fArr) {
        A(M, fArr);
    }

    public Object O() {
        return s(f6945j, "None");
    }

    public void O0(float[] fArr) {
        A(N, fArr);
    }

    public Object P() {
        return v(f6947k, -1.0f);
    }

    public void P0(float f10) {
        G(f6960r, f10);
    }

    public pf.d Q() {
        return n(f6951m);
    }

    public void Q0(int i10) {
        H(f6960r, i10);
    }

    public int R() {
        return p(L, 1);
    }

    public void R0(String str) {
        F(K, str);
    }

    public Object S() {
        return v(M, -1.0f);
    }

    public void S0(float f10) {
        G(f6971x, f10);
    }

    public Object T() {
        return v(N, -1.0f);
    }

    public void T0(int i10) {
        H(f6971x, i10);
    }

    public float U() {
        return u(f6960r, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public void U0() {
        F(f6971x, "Auto");
    }

    public String V() {
        return r(K, "Auto");
    }

    public void V0(String str) {
        F(f6975z, str);
    }

    public Object W() {
        return w(f6971x, "Auto");
    }

    public void W0(float f10) {
        G(D, f10);
    }

    public String X() {
        return r(f6975z, "Start");
    }

    public void X0(int i10) {
        H(D, i10);
    }

    public Object Y() {
        return w(D, f6965t0);
    }

    public void Y0() {
        F(D, "Auto");
    }

    public void Z0() {
        F(D, f6965t0);
    }

    public Object a0() {
        return v(f6949l, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public void a1(float[] fArr) {
        A(f6949l, fArr);
    }

    public String b0() {
        return r(f6936e, "Inline");
    }

    public void b1(String str) {
        F(f6936e, str);
    }

    public String c0() {
        return r(H, D0);
    }

    public void c1(String str) {
        F(H, str);
    }

    public String d0() {
        return r(I, "Before");
    }

    public void d1(String str) {
        F(I, str);
    }

    public float e0() {
        return u(f6956p, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public void e1(float f10) {
        G(f6956p, f10);
    }

    public float f0() {
        return u(f6953n, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public void f1(int i10) {
        H(f6956p, i10);
    }

    public float g0() {
        return u(f6958q, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public void g1(float f10) {
        G(f6953n, f10);
    }

    public Object h0() {
        return s(A, "None");
    }

    public void h1(int i10) {
        H(f6953n, i10);
    }

    public Object i0() {
        return v(B, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public void i1(float f10) {
        G(f6958q, f10);
    }

    public String j0() {
        return r(f6964t, "Start");
    }

    public void j1(int i10) {
        H(f6958q, i10);
    }

    public pf.d k0() {
        return n(E);
    }

    public void k1(String[] strArr) {
        z(A, strArr);
    }

    public float l0() {
        return t(F);
    }

    public void l1(float[] fArr) {
        A(B, fArr);
    }

    public String m0() {
        return r(G, "None");
    }

    public void m1(String str) {
        F(f6964t, str);
    }

    public float n0() {
        return u(f6962s, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public void n1(pf.d dVar) {
        C(E, dVar);
    }

    public Object o0() {
        return w(f6969w, "Auto");
    }

    public void o1(float f10) {
        G(F, f10);
    }

    public String p0() {
        return r(f6938f, T);
    }

    public void p1(int i10) {
        H(F, i10);
    }

    public void q0(pf.d dVar) {
        C(f6942h, dVar);
    }

    public void q1(String str) {
        F(G, str);
    }

    public void r0(String str) {
        F(f6945j, str);
    }

    public void r1(float f10) {
        G(f6962s, f10);
    }

    public void s0(float f10) {
        G(f6947k, f10);
    }

    public void s1(int i10) {
        H(f6962s, i10);
    }

    public void t0(int i10) {
        H(f6947k, i10);
    }

    public void t1(float f10) {
        G(f6969w, f10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (y(f6936e)) {
            sb.append(", Placement=");
            sb.append(b0());
        }
        if (y(f6938f)) {
            sb.append(", WritingMode=");
            sb.append(p0());
        }
        if (y(f6940g)) {
            sb.append(", BackgroundColor=");
            sb.append(K());
        }
        if (y(f6942h)) {
            sb.append(", BorderColor=");
            sb.append(N());
        }
        if (y(f6945j)) {
            Object objO = O();
            sb.append(", BorderStyle=");
            if (objO instanceof String[]) {
                sb.append(com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a.c((String[]) objO));
            } else {
                sb.append(objO);
            }
        }
        if (y(f6947k)) {
            Object objP = P();
            sb.append(", BorderThickness=");
            if (objP instanceof float[]) {
                sb.append(com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a.b((float[]) objP));
            } else {
                sb.append(objP);
            }
        }
        if (y(f6949l)) {
            Object objA0 = a0();
            sb.append(", Padding=");
            if (objA0 instanceof float[]) {
                sb.append(com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a.b((float[]) objA0));
            } else {
                sb.append(objA0);
            }
        }
        if (y(f6951m)) {
            sb.append(", Color=");
            sb.append(Q());
        }
        if (y(f6953n)) {
            sb.append(", SpaceBefore=");
            sb.append(f0());
        }
        if (y(f6956p)) {
            sb.append(", SpaceAfter=");
            sb.append(e0());
        }
        if (y(f6958q)) {
            sb.append(", StartIndent=");
            sb.append(g0());
        }
        if (y(f6960r)) {
            sb.append(", EndIndent=");
            sb.append(U());
        }
        if (y(f6962s)) {
            sb.append(", TextIndent=");
            sb.append(n0());
        }
        if (y(f6964t)) {
            sb.append(", TextAlign=");
            sb.append(j0());
        }
        if (y(f6967v)) {
            sb.append(", BBox=");
            sb.append(J());
        }
        if (y(f6969w)) {
            sb.append(", Width=");
            sb.append(o0());
        }
        if (y(f6971x)) {
            sb.append(", Height=");
            sb.append(W());
        }
        if (y(f6973y)) {
            sb.append(", BlockAlign=");
            sb.append(M());
        }
        if (y(f6975z)) {
            sb.append(", InlineAlign=");
            sb.append(X());
        }
        if (y(A)) {
            Object objH0 = h0();
            sb.append(", TBorderStyle=");
            if (objH0 instanceof String[]) {
                sb.append(com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a.c((String[]) objH0));
            } else {
                sb.append(objH0);
            }
        }
        if (y(B)) {
            Object objI0 = i0();
            sb.append(", TPadding=");
            if (objI0 instanceof float[]) {
                sb.append(com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a.b((float[]) objI0));
            } else {
                sb.append(objI0);
            }
        }
        if (y(C)) {
            sb.append(", BaselineShift=");
            sb.append(L());
        }
        if (y(D)) {
            sb.append(", LineHeight=");
            sb.append(Y());
        }
        if (y(E)) {
            sb.append(", TextDecorationColor=");
            sb.append(k0());
        }
        if (y(F)) {
            sb.append(", TextDecorationThickness=");
            sb.append(l0());
        }
        if (y(G)) {
            sb.append(", TextDecorationType=");
            sb.append(m0());
        }
        if (y(H)) {
            sb.append(", RubyAlign=");
            sb.append(c0());
        }
        if (y(I)) {
            sb.append(", RubyPosition=");
            sb.append(d0());
        }
        if (y(K)) {
            sb.append(", GlyphOrientationVertical=");
            sb.append(V());
        }
        if (y(L)) {
            sb.append(", ColumnCount=");
            sb.append(R());
        }
        if (y(M)) {
            Object objS = S();
            sb.append(", ColumnGap=");
            if (objS instanceof float[]) {
                sb.append(com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a.b((float[]) objS));
            } else {
                sb.append(objS);
            }
        }
        if (y(N)) {
            Object objT = T();
            sb.append(", ColumnWidths=");
            if (objT instanceof float[]) {
                sb.append(com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a.b((float[]) objT));
            } else {
                sb.append(objT);
            }
        }
        return sb.toString();
    }

    public void u0(float f10) {
        G(N, f10);
    }

    public void u1(int i10) {
        H(f6969w, i10);
    }

    public void v0(int i10) {
        H(N, i10);
    }

    public void v1() {
        F(f6969w, "Auto");
    }

    public void w0(float f10) {
        G(f6949l, f10);
    }

    public void w1(String str) {
        F(f6938f, str);
    }

    public void x0(int i10) {
        H(f6949l, i10);
    }

    public void y0(String str) {
        F(A, str);
    }

    public void z0(float f10) {
        G(B, f10);
    }

    public d(cf.d dVar) {
        super(dVar);
    }
}
