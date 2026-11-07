package g7;

import hi.b0;
import j7.i;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11479b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f11478a = i10;
        this.f11479b = obj;
    }

    @Override // eh.a
    public final Object invoke() throws IOException {
        int iB;
        pg.n nVar;
        int i10 = this.f11478a;
        Object obj = this.f11479b;
        switch (i10) {
            case 0:
                f fVar = (f) obj;
                List<? extends eh.a<? extends List<? extends i.a>>> list = fVar.f11491e;
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    qg.t.p(list.get(i11).invoke(), arrayList);
                }
                fVar.f11491e = qg.z.f22752a;
                return arrayList;
            case 1:
                ii.g gVar = (ii.g) obj;
                ClassLoader classLoader = gVar.f14548c;
                hi.n nVar2 = gVar.f14549d;
                Enumeration<URL> resources = classLoader.getResources("");
                kotlin.jvm.internal.r.d(resources, "getResources(...)");
                ArrayList list2 = Collections.list(resources);
                kotlin.jvm.internal.r.d(list2, "list(...)");
                ArrayList arrayList2 = new ArrayList();
                int size2 = list2.size();
                int i12 = 0;
                while (true) {
                    pg.n nVar3 = null;
                    if (i12 >= size2) {
                        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                        kotlin.jvm.internal.r.d(resources2, "getResources(...)");
                        ArrayList list3 = Collections.list(resources2);
                        kotlin.jvm.internal.r.d(list3, "list(...)");
                        ArrayList arrayList3 = new ArrayList();
                        int size3 = list3.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            Object obj2 = list3.get(i13);
                            i13++;
                            URL url = (URL) obj2;
                            kotlin.jvm.internal.r.b(url);
                            String string = url.toString();
                            kotlin.jvm.internal.r.d(string, "toString(...)");
                            if (mh.t.p(string, "jar:file:", false) && (iB = mh.x.B(6, string, "!")) != -1) {
                                String str = hi.b0.f13033b;
                                String strSubstring = string.substring(4, iB);
                                kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
                                String string2 = new File(URI.create(strSubstring)).toString();
                                kotlin.jvm.internal.r.d(string2, "toString(...)");
                                nVar = new pg.n(ii.m.c(b0.a.a(string2), nVar2, new ii.f()), ii.g.f14547f);
                            } else {
                                nVar = null;
                            }
                            if (nVar != null) {
                                arrayList3.add(nVar);
                            }
                        }
                        return qg.x.O(arrayList3, arrayList2);
                    }
                    Object obj3 = list2.get(i12);
                    i12++;
                    URL url2 = (URL) obj3;
                    kotlin.jvm.internal.r.b(url2);
                    if (kotlin.jvm.internal.r.a(url2.getProtocol(), "file")) {
                        String str2 = hi.b0.f13033b;
                        String string3 = new File(url2.toURI()).toString();
                        kotlin.jvm.internal.r.d(string3, "toString(...)");
                        nVar3 = new pg.n(nVar2, b0.a.a(string3));
                    }
                    if (nVar3 != null) {
                        arrayList2.add(nVar3);
                    }
                }
                break;
            default:
                int i14 = t8.w.f28523b;
                ((n1) obj).setValue(Boolean.TRUE);
                return pg.f0.f21461a;
        }
    }
}
