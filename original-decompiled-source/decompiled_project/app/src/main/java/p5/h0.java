package p5;

import android.net.Uri;
import android.os.Bundle;
import f9.ec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: m, reason: collision with root package name */
    public static final mh.k f21210m = new mh.k("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: n, reason: collision with root package name */
    public static final mh.k f21211n = new mh.k("\\{(.+?)\\}");

    /* renamed from: o, reason: collision with root package name */
    public static final mh.k f21212o = new mh.k("http[s]?://");

    /* renamed from: p, reason: collision with root package name */
    public static final mh.k f21213p = new mh.k(".*");

    /* renamed from: q, reason: collision with root package name */
    public static final mh.k f21214q = new mh.k("([^/]*?|)");

    /* renamed from: r, reason: collision with root package name */
    public static final mh.k f21215r = new mh.k("^[^?#]+\\?([^#]*).*");

    /* renamed from: a, reason: collision with root package name */
    public final String f21216a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21217b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21218c;

    /* renamed from: d, reason: collision with root package name */
    public final pg.s f21219d;

    /* renamed from: e, reason: collision with root package name */
    public final pg.s f21220e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f21221f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21222g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f21223h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f21224i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f21225j;

    /* renamed from: k, reason: collision with root package name */
    public final pg.s f21226k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f21227l;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f21228a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f21229b = new ArrayList();
    }

    public h0(String str) {
        this.f21216a = str;
        ArrayList arrayList = new ArrayList();
        this.f21217b = arrayList;
        this.f21219d = e9.w0.b(new eh.a() { // from class: p5.b0
            @Override // eh.a
            public final Object invoke() {
                String str2 = this.f21192a.f21218c;
                if (str2 != null) {
                    return new mh.k(str2, mh.n.f18276b);
                }
                return null;
            }
        });
        this.f21220e = e9.w0.b(new b9.t0(this, 2));
        pg.k kVar = pg.k.f21467b;
        this.f21221f = e9.w0.a(kVar, new g9.r(this, 1));
        this.f21223h = e9.w0.a(kVar, new c0(this, 0));
        this.f21224i = e9.w0.a(kVar, new eh.a() { // from class: p5.d0
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, pg.j] */
            @Override // eh.a
            public final Object invoke() {
                List list;
                pg.n nVar = (pg.n) this.f21199a.f21223h.getValue();
                return (nVar == null || (list = (List) nVar.f21469a) == null) ? new ArrayList() : list;
            }
        });
        this.f21225j = e9.w0.a(kVar, new eh.a() { // from class: p5.e0
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, pg.j] */
            @Override // eh.a
            public final Object invoke() {
                pg.n nVar = (pg.n) this.f21206a.f21223h.getValue();
                if (nVar != null) {
                    return (String) nVar.f21470b;
                }
                return null;
            }
        });
        this.f21226k = e9.w0.b(new eh.a() { // from class: p5.f0
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, pg.j] */
            @Override // eh.a
            public final Object invoke() {
                String str2 = (String) this.f21209a.f21225j.getValue();
                if (str2 != null) {
                    return new mh.k(str2, mh.n.f18276b);
                }
                return null;
            }
        });
        e9.w0.b(new androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.b(this, 1));
        StringBuilder sb = new StringBuilder("^");
        if (!f21210m.a(str)) {
            String strPattern = f21212o.f18274a.pattern();
            kotlin.jvm.internal.r.d(strPattern, "pattern(...)");
            sb.append(strPattern);
        }
        Pattern patternCompile = Pattern.compile("(\\?|#|$)");
        kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
        Matcher matcher = patternCompile.matcher(str);
        kotlin.jvm.internal.r.d(matcher, "matcher(...)");
        boolean z10 = false;
        mh.i iVarA = mh.m.a(matcher, 0, str);
        if (iVarA != null) {
            String strSubstring = str.substring(0, iVarA.b().f15744a);
            kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
            a(strSubstring, arrayList, sb);
            if (!f21213p.a(sb) && !f21214q.a(sb)) {
                z10 = true;
            }
            this.f21227l = z10;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        String string = sb.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        this.f21218c = h(string);
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        int i10 = 0;
        for (mh.i iVarB = f21211n.b(str); iVarB != null; iVarB = iVarB.next()) {
            mh.g gVarE = iVarB.f18268c.e(1);
            kotlin.jvm.internal.r.b(gVarE);
            arrayList.add(gVarE.f18264a);
            if (iVarB.b().f15744a > i10) {
                String strSubstring = str.substring(i10, iVarB.b().f15744a);
                kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
                String strQuote = Pattern.quote(strSubstring);
                kotlin.jvm.internal.r.d(strQuote, "quote(...)");
                sb.append(strQuote);
            }
            String strPattern = f21214q.f18274a.pattern();
            kotlin.jvm.internal.r.d(strPattern, "pattern(...)");
            sb.append(strPattern);
            i10 = iVarB.b().f15745b + 1;
        }
        if (i10 < str.length()) {
            String strSubstring2 = str.substring(i10);
            kotlin.jvm.internal.r.d(strSubstring2, "substring(...)");
            String strQuote2 = Pattern.quote(strSubstring2);
            kotlin.jvm.internal.r.d(strQuote2, "quote(...)");
            sb.append(strQuote2);
        }
    }

    public static void g(Bundle bundle, String key, String str, q qVar) {
        if (qVar == null) {
            b4.a.e(key, str, bundle);
            return;
        }
        y0<Object> y0Var = qVar.f21257a;
        kotlin.jvm.internal.r.e(key, "key");
        y0Var.e(bundle, key, y0Var.g(str));
    }

    public static String h(String str) {
        return (mh.x.r(str, "\\Q", false) && mh.x.r(str, "\\E", false)) ? mh.t.n(str, ".*", "\\E.*\\Q") : mh.x.r(str, "\\.\\*", false) ? mh.t.n(str, "\\.\\*", ".*") : str;
    }

    public final int b(Uri uri) {
        if (uri == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri uri2 = Uri.parse(this.f21216a);
        kotlin.jvm.internal.r.d(uri2, "parse(...)");
        List<String> other = uri2.getPathSegments();
        kotlin.jvm.internal.r.e(pathSegments, "<this>");
        kotlin.jvm.internal.r.e(other, "other");
        Set setG0 = qg.x.g0(pathSegments);
        setG0.retainAll(other);
        return setG0.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pg.j] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, pg.j] */
    public final ArrayList c() {
        Collection collectionValues = ((Map) this.f21221f.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            qg.t.p(((a) it.next()).f21229b, arrayList);
        }
        return qg.x.O((List) this.f21224i.getValue(), qg.x.O(arrayList, this.f21217b));
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, pg.j] */
    public final Bundle d(Uri deepLink, LinkedHashMap arguments) {
        mh.i iVarD;
        mh.i iVarD2;
        String strDecode;
        kotlin.jvm.internal.r.e(deepLink, "deepLink");
        kotlin.jvm.internal.r.e(arguments, "arguments");
        mh.k kVar = (mh.k) this.f21219d.getValue();
        if (kVar != null && (iVarD = kVar.d(deepLink.toString())) != null) {
            int i10 = 0;
            Bundle bundleA = u3.d.a((pg.n[]) Arrays.copyOf(new pg.n[0], 0));
            if (e(iVarD, bundleA, arguments) && (!((Boolean) this.f21220e.getValue()).booleanValue() || f(deepLink, bundleA, arguments))) {
                String fragment = deepLink.getFragment();
                mh.k kVar2 = (mh.k) this.f21226k.getValue();
                if (kVar2 != null && (iVarD2 = kVar2.d(String.valueOf(fragment))) != null) {
                    List list = (List) this.f21224i.getValue();
                    ArrayList arrayList = new ArrayList(qg.p.h(list, 10));
                    for (Object obj : list) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            qg.p.o();
                            throw null;
                        }
                        String str = (String) obj;
                        mh.g gVarE = iVarD2.f18268c.e(i11);
                        if (gVarE != null) {
                            strDecode = Uri.decode(gVarE.f18264a);
                            kotlin.jvm.internal.r.d(strDecode, "decode(...)");
                        } else {
                            strDecode = null;
                        }
                        if (strDecode == null) {
                            strDecode = "";
                        }
                        try {
                            g(bundleA, str, strDecode, (q) arguments.get(str));
                            arrayList.add(pg.f0.f21461a);
                            i10 = i11;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (c9.g.g(arguments, new ec(bundleA, 1)).isEmpty()) {
                    return bundleA;
                }
            }
        }
        return null;
    }

    public final boolean e(mh.i iVar, Bundle bundle, Map map) {
        ArrayList arrayList = this.f21217b;
        ArrayList arrayList2 = new ArrayList(qg.p.h(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            int i12 = i10 + 1;
            String strDecode = null;
            if (i10 < 0) {
                qg.p.o();
                throw null;
            }
            String str = (String) obj;
            mh.g gVarE = iVar.f18268c.e(i12);
            if (gVarE != null) {
                strDecode = Uri.decode(gVarE.f18264a);
                kotlin.jvm.internal.r.d(strDecode, "decode(...)");
            }
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                g(bundle, str, strDecode, (q) map.get(str));
                arrayList2.add(pg.f0.f21461a);
                i10 = i12;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof h0)) {
            return false;
        }
        return this.f21216a.equals(((h0) obj).f21216a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, pg.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(Uri uri, Bundle bundle, Map<String, q> map) {
        mh.i iVar;
        Object objValueOf;
        boolean z10;
        String query;
        h0 h0Var = this;
        for (Map.Entry entry : ((Map) h0Var.f21221f.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            a aVar = (a) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (h0Var.f21222g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = c0.g0.c(query);
            }
            boolean z11 = false;
            Bundle bundleA = u3.d.a((pg.n[]) Arrays.copyOf(new pg.n[0], 0));
            ArrayList arrayList = aVar.f21229b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                String str2 = (String) obj;
                q qVar = map.get(str2);
                y0<Object> y0Var = qVar != null ? qVar.f21257a : null;
                if ((y0Var instanceof f) && !qVar.f21258b) {
                    f fVar = (f) y0Var;
                    fVar.e(bundleA, str2, fVar.g());
                }
            }
            for (String input : queryParameters) {
                String str3 = aVar.f21228a;
                if (str3 != null) {
                    Pattern patternCompile = Pattern.compile(str3);
                    kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
                    kotlin.jvm.internal.r.e(input, "input");
                    Matcher matcher = patternCompile.matcher(input);
                    kotlin.jvm.internal.r.d(matcher, "matcher(...)");
                    iVar = !matcher.matches() ? null : new mh.i(matcher, input);
                }
                if (iVar == null) {
                    return z11;
                }
                ArrayList arrayList2 = aVar.f21229b;
                ArrayList arrayList3 = new ArrayList(qg.p.h(arrayList2, 10));
                int size2 = arrayList2.size();
                boolean z12 = z11;
                int i11 = z12 ? 1 : 0;
                ?? r14 = z12;
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    int i12 = r14 + 1;
                    if (r14 < 0) {
                        qg.p.o();
                        throw null;
                    }
                    String key = (String) obj2;
                    mh.g gVarE = iVar.f18268c.e(i12);
                    String str4 = gVarE != null ? gVarE.f18264a : null;
                    if (str4 == null) {
                        str4 = "";
                    }
                    q qVar2 = map.get(key);
                    try {
                        kotlin.jvm.internal.r.e(key, "key");
                        if (bundleA.containsKey(key)) {
                            if (bundleA.containsKey(key)) {
                                if (qVar2 != null) {
                                    y0<Object> y0Var2 = qVar2.f21257a;
                                    Object objA = y0Var2.a(bundleA, key);
                                    if (!bundleA.containsKey(key)) {
                                        throw new IllegalArgumentException("There is no previous value in this savedState.");
                                    }
                                    y0Var2.e(bundleA, key, y0Var2.c(objA, str4));
                                }
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            objValueOf = Boolean.valueOf(z10);
                        } else {
                            g(bundleA, key, str4, qVar2);
                            objValueOf = pg.f0.f21461a;
                        }
                    } catch (IllegalArgumentException unused) {
                        objValueOf = pg.f0.f21461a;
                    }
                    arrayList3.add(objValueOf);
                    z11 = false;
                    r14 = i12;
                }
            }
            bundle.putAll(bundleA);
            h0Var = this;
        }
        return true;
    }

    public final int hashCode() {
        return this.f21216a.hashCode() * 961;
    }
}
