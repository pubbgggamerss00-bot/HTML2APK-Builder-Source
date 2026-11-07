package mf;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f18230a = new HashMap(38);

    static {
        new HashMap(14);
        a("Courier-Bold");
        a("Courier-BoldOblique");
        a("Courier");
        a("Courier-Oblique");
        a("Helvetica");
        a("Helvetica-Bold");
        a("Helvetica-BoldOblique");
        a("Helvetica-Oblique");
        a("Symbol");
        a("Times-Bold");
        a("Times-BoldItalic");
        a("Times-Italic");
        a("Times-Roman");
        a("ZapfDingbats");
        b("CourierCourierNew", "Courier");
        b("CourierNew", "Courier");
        b("CourierNew,Italic", "Courier-Oblique");
        b("CourierNew,Bold", "Courier-Bold");
        b("CourierNew,BoldItalic", "Courier-BoldOblique");
        b("Arial", "Helvetica");
        b("Arial,Italic", "Helvetica-Oblique");
        b("Arial,Bold", "Helvetica-Bold");
        b("Arial,BoldItalic", "Helvetica-BoldOblique");
        b("TimesNewRoman", "Times-Roman");
        b("TimesNewRoman,Italic", "Times-Italic");
        b("TimesNewRoman,Bold", "Times-Bold");
        b("TimesNewRoman,BoldItalic", "Times-BoldItalic");
        b("Symbol,Italic", "Symbol");
        b("Symbol,Bold", "Symbol");
        b("Symbol,BoldItalic", "Symbol");
        b("Times", "Times-Roman");
        b("Times,Italic", "Times-Italic");
        b("Times,Bold", "Times-Bold");
        b("Times,BoldItalic", "Times-BoldItalic");
        b("ArialMT", "Helvetica");
        b("Arial-ItalicMT", "Helvetica-Oblique");
        b("Arial-BoldMT", "Helvetica-Bold");
        b("Arial-BoldItalicMT", "Helvetica-BoldOblique");
    }

    public static void a(String str) {
        f18230a.put(str, str);
    }

    public static void b(String str, String str2) {
        f18230a.put(str, str2);
    }
}
