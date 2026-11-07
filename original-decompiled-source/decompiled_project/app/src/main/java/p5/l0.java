package p5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p5.b;
import p5.k0;

/* loaded from: classes.dex */
public class l0<D extends k0> {

    /* renamed from: a, reason: collision with root package name */
    public final b1<? extends D> f21244a;

    /* renamed from: c, reason: collision with root package name */
    public final String f21246c;

    /* renamed from: b, reason: collision with root package name */
    public final int f21245b = -1;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f21247d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f21248e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f21249f = new LinkedHashMap();

    public l0(b1<? extends D> b1Var, String str) {
        this.f21244a = b1Var;
        this.f21246c = str;
    }

    public D a() {
        D d10 = (D) b();
        d10.getClass();
        s5.o oVar = d10.f21235b;
        for (Map.Entry entry : this.f21247d.entrySet()) {
            String argumentName = (String) entry.getKey();
            q argument = (q) entry.getValue();
            kotlin.jvm.internal.r.e(argumentName, "argumentName");
            kotlin.jvm.internal.r.e(argument, "argument");
            oVar.getClass();
            oVar.f24510c.put(argumentName, argument);
        }
        ArrayList arrayList = this.f21248e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            final h0 navDeepLink = (h0) obj;
            kotlin.jvm.internal.r.e(navDeepLink, "navDeepLink");
            oVar.getClass();
            ArrayList arrayListG = c9.g.g(oVar.f24510c, new eh.l() { // from class: s5.m
                @Override // eh.l
                public final Object invoke(Object obj2) {
                    String key = (String) obj2;
                    kotlin.jvm.internal.r.e(key, "key");
                    return Boolean.valueOf(!navDeepLink.c().contains(key));
                }
            });
            if (!arrayListG.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + navDeepLink.f21216a + " can't be used to open destination " + oVar.f24508a + ".\nFollowing required arguments are missing: " + arrayListG).toString());
            }
            oVar.f24509b.add(navDeepLink);
        }
        for (Map.Entry entry2 : this.f21249f.entrySet()) {
            int iIntValue = ((Number) entry2.getKey()).intValue();
            p action = (p) entry2.getValue();
            kotlin.jvm.internal.r.e(action, "action");
            if (d10 instanceof b.a) {
                throw new UnsupportedOperationException("Cannot add action " + iIntValue + " to " + d10 + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
            }
            if (iIntValue == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            d10.f21237d.e(iIntValue, action);
        }
        String str = this.f21246c;
        if (str != null) {
            oVar.getClass();
            if (mh.x.A(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String uriPattern = "android-app://androidx.navigation/".concat(str);
            kotlin.jvm.internal.r.e(uriPattern, "uriPattern");
            ArrayList arrayListG2 = c9.g.g(oVar.f24510c, new s5.n(new h0(uriPattern), 0));
            if (!arrayListG2.isEmpty()) {
                StringBuilder sbA = e.e.a("Cannot set route \"", str, "\" for destination ");
                sbA.append(oVar.f24508a);
                sbA.append(". Following required arguments are missing: ");
                sbA.append(arrayListG2);
                throw new IllegalArgumentException(sbA.toString().toString());
            }
            oVar.f24513f = e9.w0.b(new f9.s(uriPattern, 2));
            oVar.f24511d = uriPattern.hashCode();
            oVar.f24512e = str;
        }
        int i11 = this.f21245b;
        if (i11 != -1) {
            oVar.f24511d = i11;
        }
        return d10;
    }

    public D b() {
        return (D) this.f21244a.a();
    }
}
