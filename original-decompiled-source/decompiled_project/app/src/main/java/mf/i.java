package mf;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import ve.l0;
import ve.p0;
import ve.x;

/* loaded from: classes2.dex */
public final class i implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final e f18191e = new e();

    /* renamed from: a, reason: collision with root package name */
    public c5.p f18192a;

    /* renamed from: b, reason: collision with root package name */
    public LinkedHashMap f18193b;

    /* renamed from: c, reason: collision with root package name */
    public final p0 f18194c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f18195d = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f18196a = new d(i.f18191e);
    }

    public static class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        public double f18197a;

        /* renamed from: b, reason: collision with root package name */
        public final g f18198b;

        public b(g gVar) {
            this.f18198b = gVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            return Double.compare(bVar.f18197a, this.f18197a);
        }
    }

    public i() throws IOException {
        a("Courier", new ArrayList(Arrays.asList("CourierNew", "CourierNewPSMT", "LiberationMono", "NimbusMonL-Regu", "DroidSansMono")));
        a("Courier-Bold", new ArrayList(Arrays.asList("CourierNewPS-BoldMT", "CourierNew-Bold", "LiberationMono-Bold", "NimbusMonL-Bold", "DroidSansMono")));
        a("Courier-Oblique", new ArrayList(Arrays.asList("CourierNewPS-ItalicMT", "CourierNew-Italic", "LiberationMono-Italic", "NimbusMonL-ReguObli", "DroidSansMono")));
        a("Courier-BoldOblique", new ArrayList(Arrays.asList("CourierNewPS-BoldItalicMT", "CourierNew-BoldItalic", "LiberationMono-BoldItalic", "NimbusMonL-BoldObli", "DroidSansMono")));
        a("Helvetica", new ArrayList(Arrays.asList("ArialMT", "Arial", "LiberationSans", "NimbusSanL-Regu", "Roboto-Regular")));
        a("Helvetica-Bold", new ArrayList(Arrays.asList("Arial-BoldMT", "Arial-Bold", "LiberationSans-Bold", "NimbusSanL-Bold", "Roboto-Bold")));
        a("Helvetica-Oblique", new ArrayList(Arrays.asList("Arial-ItalicMT", "Arial-Italic", "Helvetica-Italic", "LiberationSans-Italic", "NimbusSanL-ReguItal", "Roboto-Italic")));
        a("Helvetica-BoldOblique", new ArrayList(Arrays.asList("Arial-BoldItalicMT", "Helvetica-BoldItalic", "LiberationSans-BoldItalic", "NimbusSanL-BoldItal", "Roboto-BoldItalic")));
        a("Times-Roman", new ArrayList(Arrays.asList("TimesNewRomanPSMT", "TimesNewRoman", "TimesNewRomanPS", "LiberationSerif", "NimbusRomNo9L-Regu", "Roboto-Regular")));
        a("Times-Bold", new ArrayList(Arrays.asList("TimesNewRomanPS-BoldMT", "TimesNewRomanPS-Bold", "TimesNewRoman-Bold", "LiberationSerif-Bold", "NimbusRomNo9L-Medi", "DroidSerif-Bold", "Roboto-Bold")));
        a("Times-Italic", new ArrayList(Arrays.asList("TimesNewRomanPS-ItalicMT", "TimesNewRomanPS-Italic", "TimesNewRoman-Italic", "LiberationSerif-Italic", "NimbusRomNo9L-ReguItal", "DroidSerif-Italic", "Roboto-Italic")));
        a("Times-BoldItalic", new ArrayList(Arrays.asList("TimesNewRomanPS-BoldItalicMT", "TimesNewRomanPS-BoldItalic", "TimesNewRoman-BoldItalic", "LiberationSerif-BoldItalic", "NimbusRomNo9L-MediItal", "DroidSerif-BoldItalic", "Roboto-BoldItalic")));
        a("Symbol", new ArrayList(Arrays.asList("Symbol", "SymbolMT", "StandardSymL")));
        a("ZapfDingbats", new ArrayList(Arrays.asList("ZapfDingbatsITCbyBT-Regular", "ZapfDingbatsITC", "Dingbats", "MS-Gothic")));
        for (String str : Collections.unmodifiableSet(q.f18230a.keySet())) {
            HashMap map = this.f18195d;
            String strReplace = str.replace(" ", "");
            Locale locale = Locale.ENGLISH;
            List list = (List) map.get(strReplace.toLowerCase(locale));
            if ((list == null ? Collections.EMPTY_LIST : list).isEmpty()) {
                a(str, new ArrayList((Collection) this.f18195d.get(((String) q.f18230a.get(str)).toLowerCase(locale))));
            }
        }
        try {
            InputStream inputStreamA = bf.a.f4214a != null ? bf.a.a("com/tom_roush/pdfbox/resources/ttf/LiberationSans-Regular.ttf") : h.class.getResourceAsStream("/com/tom_roush/pdfbox/resources/ttf/LiberationSans-Regular.ttf");
            if (inputStreamA != null) {
                this.f18194c = new l0(false, false).c(new x(new BufferedInputStream(inputStreamA)));
                return;
            }
            throw new IOException("resource 'com/tom_roush/pdfbox/resources/ttf/LiberationSans-Regular.ttf' not found");
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static LinkedHashMap b(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            String strI = gVar.i();
            HashSet hashSet = new HashSet(2);
            hashSet.add(strI);
            hashSet.add(strI.replace("-", ""));
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                linkedHashMap.put(((String) it2.next()).toLowerCase(Locale.ENGLISH), gVar);
            }
        }
        return linkedHashMap;
    }

    public final void a(String str, ArrayList arrayList) {
        this.f18195d.put(str.toLowerCase(Locale.ENGLISH), arrayList);
    }

    public final qe.a c(f fVar, String str) {
        if (str == null) {
            return null;
        }
        if (this.f18192a == null) {
            synchronized (this) {
                if (this.f18192a == null) {
                    d dVar = a.f18196a;
                    synchronized (this) {
                        this.f18193b = b(dVar.f18173a);
                        this.f18192a = dVar;
                    }
                }
            }
        }
        g gVarD = d(fVar, str);
        if (gVarD != null) {
            return gVarD.e();
        }
        g gVarD2 = d(fVar, str.replace("-", ""));
        if (gVarD2 != null) {
            return gVarD2.e();
        }
        List list = (List) this.f18195d.get(str.replace(" ", "").toLowerCase(Locale.ENGLISH));
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g gVarD3 = d(fVar, (String) it.next());
            if (gVarD3 != null) {
                return gVarD3.e();
            }
        }
        g gVarD4 = d(fVar, str.replace(",", "-"));
        if (gVarD4 != null) {
            return gVarD4.e();
        }
        g gVarD5 = d(fVar, str.concat("-Regular"));
        if (gVarD5 != null) {
            return gVarD5.e();
        }
        return null;
    }

    public final g d(f fVar, String str) {
        if (str.contains("+")) {
            str = str.substring(str.indexOf(43) + 1);
        }
        g gVar = (g) this.f18193b.get(str.toLowerCase(Locale.ENGLISH));
        if (gVar == null || gVar.f() != fVar) {
            return null;
        }
        return gVar;
    }
}
