package p8;

import a9.z;
import eh.l;
import f9.yc;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.r;
import lh.f;
import mh.h;
import mh.k;
import mh.n;
import mh.t;
import p5.g0;
import qg.o;
import qg.p;
import qg.x;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Set<String> f21342a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f21343b;

    /* renamed from: c, reason: collision with root package name */
    public static final k f21344c;

    /* renamed from: d, reason: collision with root package name */
    public static final k f21345d;

    /* renamed from: e, reason: collision with root package name */
    public static final k f21346e;

    /* renamed from: f, reason: collision with root package name */
    public static final List<b> f21347f;

    /* renamed from: g, reason: collision with root package name */
    public static final k f21348g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f21349a;

        public a(LinkedHashMap linkedHashMap) {
            this.f21349a = linkedHashMap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f21349a.equals(((a) obj).f21349a);
        }

        public final int hashCode() {
            return this.f21349a.hashCode();
        }

        public final String toString() {
            return "Result(required=" + this.f21349a + ")";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f21350a;

        /* renamed from: b, reason: collision with root package name */
        public final List<String> f21351b;

        /* renamed from: c, reason: collision with root package name */
        public final l<String, Boolean> f21352c;

        public b(l lVar, String str, List list) {
            this.f21350a = str;
            this.f21351b = list;
            this.f21352c = lVar;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    static {
        ?? r02 = p8.a.f21340b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : r02.entrySet()) {
            if (!((List) entry.getValue()).isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set<String> setKeySet = linkedHashMap.keySet();
        f21342a = setKeySet;
        Set<String> set = setKeySet;
        f21343b = new k(g0.a("(?:\\.\\s*(", x.I(set, "|", null, null, null, 62), ")\\s*\\(|['\"](", x.I(set, "|", null, null, null, 62), ")['\"])"));
        f21344c = new k("getUserMedia\\s*\\(");
        f21345d = new k("\\bvideo\\s*:\\s*(?:true|\\{)|facingMode");
        f21346e = new k("\\baudio\\s*:\\s*(?:true|\\{)");
        f21347f = p.j(new b(new z(1), "getUserMedia(video)", c0.g0.c("android.permission.CAMERA")), new b(new p8.b(), "getUserMedia(audio)", c0.g0.c("android.permission.RECORD_AUDIO")), new b(a("navigator\\s*\\.\\s*geolocation", new n[0]), "navigator.geolocation", p.j("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION")), new b(a("Notification\\s*\\.\\s*requestPermission|new\\s+Notification\\s*\\(", new n[0]), "Notification", c0.g0.c("android.permission.POST_NOTIFICATIONS")), new b(a("navigator\\s*\\.\\s*vibrate\\s*\\(", new n[0]), "navigator.vibrate", c0.g0.c("android.permission.VIBRATE")), new b(a("capturePhoto\\s*\\([^)]*['\"]front['\"]", new n[0]), "capturePhoto(front)", c0.g0.c("android.permission.CAMERA")), new b(a("startSensor\\s*\\(\\s*['\"]stepCounter['\"]", new n[0]), "startSensor(stepCounter)", c0.g0.c("android.permission.ACTIVITY_RECOGNITION")), new b(a("fetch\\s*\\(\\s*[`'\"]https?://|XMLHttpRequest|new\\s+WebSocket\\s*\\(|new\\s+EventSource\\s*\\(|<(?:script|link|img|iframe|video|audio|source)\\b[^>]*\\b(?:src|href)\\s*=\\s*['\"]https?://", n.f18276b), "network", c0.g0.c("android.permission.INTERNET")));
        f21348g = new k("['\"](android\\.permission\\.[A-Z_]+)['\"]");
    }

    public static yc a(String str, n... nVarArr) {
        return new yc(new k(str, (Set<? extends n>) o.C(nVarArr)), 1);
    }

    public static boolean b(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        r.d(lowerCase, "toLowerCase(...)");
        return t.i(lowerCase, ".html", false) || t.i(lowerCase, ".htm", false) || t.i(lowerCase, ".js", false) || t.i(lowerCase, ".mjs", false);
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.Map] */
    public static a c(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            f.a aVar = new f.a(k.c(f21343b, str));
            while (aVar.hasNext()) {
                h hVar = (h) aVar.next();
                String str2 = hVar.a().get(1);
                if (str2.length() == 0) {
                    str2 = hVar.a().get(2);
                }
                String str3 = str2;
                List list2 = (List) p8.a.f21340b.get(str3);
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        d(linkedHashMap, (String) it2.next(), str3);
                    }
                }
            }
            for (b bVar : f21347f) {
                if (bVar.f21352c.invoke(str).booleanValue()) {
                    Iterator<T> it3 = bVar.f21351b.iterator();
                    while (it3.hasNext()) {
                        d(linkedHashMap, (String) it3.next(), bVar.f21350a);
                    }
                }
            }
            f.a aVar2 = new f.a(k.c(f21348g, str));
            while (aVar2.hasNext()) {
                String str4 = ((h) aVar2.next()).a().get(1);
                if (p8.a.f21341c.contains(str4)) {
                    d(linkedHashMap, str4, "requestPermission");
                }
            }
        }
        return new a(linkedHashMap);
    }

    public static final void d(LinkedHashMap<String, Set<String>> linkedHashMap, String str, String str2) {
        Set<String> linkedHashSet = linkedHashMap.get(str);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            linkedHashMap.put(str, linkedHashSet);
        }
        linkedHashSet.add(str2);
    }
}
