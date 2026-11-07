package g9;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Pattern;
import p5.h0;
import sh.z0;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11778b;

    public /* synthetic */ r(Object obj, int i10) {
        this.f11777a = i10;
        this.f11778b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f11777a) {
            case 0:
                y yVar = (y) this.f11778b;
                z0 z0Var = yVar.f11843q;
                z0Var.getClass();
                z0Var.j(null, "");
                yVar.m(null);
                return pg.f0.f21461a;
            default:
                h0 h0Var = (h0) this.f11778b;
                String str = h0Var.f21216a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) h0Var.f21220e.getValue()).booleanValue()) {
                    Uri uri = Uri.parse(str);
                    kotlin.jvm.internal.r.d(uri, "parse(...)");
                    for (String str2 : uri.getQueryParameterNames()) {
                        StringBuilder sb = new StringBuilder();
                        List<String> queryParameters = uri.getQueryParameters(str2);
                        int i10 = 1;
                        if (queryParameters.size() > 1) {
                            throw new IllegalArgumentException(p5.g0.a("Query parameter ", str2, " must only be present once in ", str, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                        String str3 = (String) qg.x.D(queryParameters);
                        if (str3 == null) {
                            h0Var.f21222g = true;
                            str3 = str2;
                        }
                        mh.i iVarB = h0.f21211n.b(str3);
                        h0.a aVar = new h0.a();
                        int i11 = 0;
                        while (iVarB != null) {
                            mh.g gVarE = iVarB.f18268c.e(i10);
                            kotlin.jvm.internal.r.b(gVarE);
                            int i12 = i10;
                            aVar.f21229b.add(gVarE.f18264a);
                            if (iVarB.b().f15744a > i11) {
                                String strSubstring = str3.substring(i11, iVarB.b().f15744a);
                                kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
                                String strQuote = Pattern.quote(strSubstring);
                                kotlin.jvm.internal.r.d(strQuote, "quote(...)");
                                sb.append(strQuote);
                            }
                            sb.append("([\\s\\S]+?)?");
                            i11 = iVarB.b().f15745b + 1;
                            iVarB = iVarB.next();
                            i10 = i12;
                        }
                        if (i11 < str3.length()) {
                            String strSubstring2 = str3.substring(i11);
                            kotlin.jvm.internal.r.d(strSubstring2, "substring(...)");
                            String strQuote2 = Pattern.quote(strSubstring2);
                            kotlin.jvm.internal.r.d(strQuote2, "quote(...)");
                            sb.append(strQuote2);
                        }
                        sb.append("$");
                        String string = sb.toString();
                        kotlin.jvm.internal.r.d(string, "toString(...)");
                        aVar.f21228a = h0.h(string);
                        linkedHashMap.put(str2, aVar);
                    }
                }
                return linkedHashMap;
        }
    }
}
