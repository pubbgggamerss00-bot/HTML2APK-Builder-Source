package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class i {
    public static final String A = "TH";
    public static final String B = "TD";
    public static final String C = "THead";
    public static final String D = "TBody";
    public static final String E = "TFoot";
    public static final String F = "Span";
    public static final String G = "Quote";
    public static final String H = "Note";
    public static final String I = "Reference";
    public static final String J = "BibEntry";
    public static final String K = "Code";
    public static final String L = "Link";
    public static final String M = "Annot";
    public static final String N = "Ruby";
    public static final String O = "RB";
    public static final String P = "RT";
    public static final String Q = "RP";
    public static final String R = "Warichu";
    public static final String S = "WT";
    public static final String T = "WP";
    public static final String U = "Figure";
    public static final String V = "Formula";
    public static final String W = "Form";
    public static List<String> X = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public static final String f7009a = "Document";

    /* renamed from: b, reason: collision with root package name */
    public static final String f7010b = "Part";

    /* renamed from: c, reason: collision with root package name */
    public static final String f7011c = "Art";

    /* renamed from: d, reason: collision with root package name */
    public static final String f7012d = "Sect";

    /* renamed from: e, reason: collision with root package name */
    public static final String f7013e = "Div";

    /* renamed from: f, reason: collision with root package name */
    public static final String f7014f = "BlockQuote";

    /* renamed from: g, reason: collision with root package name */
    public static final String f7015g = "Caption";

    /* renamed from: h, reason: collision with root package name */
    public static final String f7016h = "TOC";

    /* renamed from: i, reason: collision with root package name */
    public static final String f7017i = "TOCI";

    /* renamed from: j, reason: collision with root package name */
    public static final String f7018j = "Index";

    /* renamed from: k, reason: collision with root package name */
    public static final String f7019k = "NonStruct";

    /* renamed from: l, reason: collision with root package name */
    public static final String f7020l = "Private";

    /* renamed from: m, reason: collision with root package name */
    public static final String f7021m = "P";

    /* renamed from: n, reason: collision with root package name */
    public static final String f7022n = "H";

    /* renamed from: o, reason: collision with root package name */
    public static final String f7023o = "H1";

    /* renamed from: p, reason: collision with root package name */
    public static final String f7024p = "H2";

    /* renamed from: q, reason: collision with root package name */
    public static final String f7025q = "H3";

    /* renamed from: r, reason: collision with root package name */
    public static final String f7026r = "H4";

    /* renamed from: s, reason: collision with root package name */
    public static final String f7027s = "H5";

    /* renamed from: t, reason: collision with root package name */
    public static final String f7028t = "H6";

    /* renamed from: u, reason: collision with root package name */
    public static final String f7029u = "L";

    /* renamed from: v, reason: collision with root package name */
    public static final String f7030v = "LI";

    /* renamed from: w, reason: collision with root package name */
    public static final String f7031w = "Lbl";

    /* renamed from: x, reason: collision with root package name */
    public static final String f7032x = "LBody";

    /* renamed from: y, reason: collision with root package name */
    public static final String f7033y = "Table";

    /* renamed from: z, reason: collision with root package name */
    public static final String f7034z = "TR";

    static {
        for (Field field : i.class.getFields()) {
            if (Modifier.isFinal(field.getModifiers())) {
                try {
                    X.add(field.get(null).toString());
                } catch (IllegalAccessException e10) {
                    Log.e("PdfBox-Android", e10.getMessage(), e10);
                } catch (IllegalArgumentException e11) {
                    Log.e("PdfBox-Android", e11.getMessage(), e11);
                }
            }
        }
        Collections.sort(X);
    }

    private i() {
    }
}
