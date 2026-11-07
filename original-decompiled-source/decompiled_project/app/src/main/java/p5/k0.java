package p5;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p5.c1;

/* loaded from: classes.dex */
public class k0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f21233e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f21234a;

    /* renamed from: b, reason: collision with root package name */
    public final s5.o f21235b;

    /* renamed from: c, reason: collision with root package name */
    public o0 f21236c;

    /* renamed from: d, reason: collision with root package name */
    public final p.c1<p> f21237d;

    public static final class a {
        public static String a(s5.e context, int i10) throws Resources.NotFoundException {
            kotlin.jvm.internal.r.e(context, "context");
            if (i10 <= 16777215) {
                return String.valueOf(i10);
            }
            try {
                Context context2 = context.f24461a;
                kotlin.jvm.internal.r.b(context2);
                String resourceName = context2.getResources().getResourceName(i10);
                kotlin.jvm.internal.r.b(resourceName);
                return resourceName;
            } catch (Resources.NotFoundException unused) {
                return String.valueOf(i10);
            }
        }

        public static lh.g b(k0 k0Var) {
            kotlin.jvm.internal.r.e(k0Var, "<this>");
            return lh.l.h(new j0(), k0Var);
        }
    }

    public static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        public final k0 f21238a;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f21239b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f21240c;

        /* renamed from: d, reason: collision with root package name */
        public final int f21241d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f21242e;

        /* renamed from: f, reason: collision with root package name */
        public final int f21243f;

        public b(k0 k0Var, Bundle bundle, boolean z10, int i10, boolean z11, int i11) {
            this.f21238a = k0Var;
            this.f21239b = bundle;
            this.f21240c = z10;
            this.f21241d = i10;
            this.f21242e = z11;
            this.f21243f = i11;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(b other) {
            kotlin.jvm.internal.r.e(other, "other");
            boolean z10 = other.f21242e;
            boolean z11 = other.f21240c;
            Bundle bundle = other.f21239b;
            boolean z12 = this.f21240c;
            if (z12 && !z11) {
                return 1;
            }
            if (!z12 && z11) {
                return -1;
            }
            int i10 = this.f21241d - other.f21241d;
            if (i10 > 0) {
                return 1;
            }
            if (i10 < 0) {
                return -1;
            }
            Bundle source = this.f21239b;
            if (source != null && bundle == null) {
                return 1;
            }
            if (source == null && bundle != null) {
                return -1;
            }
            if (source != null) {
                kotlin.jvm.internal.r.e(source, "source");
                int size = source.size();
                kotlin.jvm.internal.r.b(bundle);
                int size2 = size - bundle.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z13 = this.f21242e;
            if (z13 && !z10) {
                return 1;
            }
            if (z13 || !z10) {
                return this.f21243f - other.f21243f;
            }
            return -1;
        }
    }

    static {
        new LinkedHashMap();
    }

    public k0(b1<? extends k0> navigator) {
        kotlin.jvm.internal.r.e(navigator, "navigator");
        LinkedHashMap linkedHashMap = c1.f21197b;
        this.f21234a = c1.a.a(navigator.getClass());
        this.f21235b = new s5.o(this);
        this.f21237d = new p.c1<>(0);
    }

    public final Bundle c(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = this.f21235b.f24510c;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundleA = u3.d.a((pg.n[]) Arrays.copyOf(new pg.n[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String name = (String) entry.getKey();
            q qVar = (q) entry.getValue();
            qVar.getClass();
            kotlin.jvm.internal.r.e(name, "name");
            if (qVar.f21258b && (obj = qVar.f21259c) != null) {
                qVar.f21257a.e(bundleA, name, obj);
            }
        }
        if (bundle != null) {
            bundleA.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String name2 = (String) entry2.getKey();
                q qVar2 = (q) entry2.getValue();
                qVar2.getClass();
                y0<Object> y0Var = qVar2.f21257a;
                kotlin.jvm.internal.r.e(name2, "name");
                if (!bundleA.containsKey(name2) || !c6.b.i(bundleA, name2)) {
                    try {
                        y0Var.a(bundleA, name2);
                    } catch (IllegalStateException unused) {
                    }
                }
                StringBuilder sbA = e.e.a("Wrong argument type for '", name2, "' in argument savedState. ");
                sbA.append(y0Var.b());
                sbA.append(" expected.");
                throw new IllegalArgumentException(sbA.toString().toString());
            }
        }
        return bundleA;
    }

    public final Map<String, q> e() {
        return qg.k0.j(this.f21235b.f24510c);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this != obj) {
            if (obj != null && (obj instanceof k0)) {
                s5.o oVar = this.f21235b;
                ArrayList arrayList = oVar.f24509b;
                k0 k0Var = (k0) obj;
                p.c1<p> c1Var = k0Var.f21237d;
                s5.o oVar2 = k0Var.f21235b;
                boolean zA = kotlin.jvm.internal.r.a(arrayList, oVar2.f24509b);
                p.c1<p> c1Var2 = this.f21237d;
                if (c1Var2.f() == c1Var.f()) {
                    Iterator it = ((lh.a) lh.l.g(new p.e1(c1Var2))).iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        if (!kotlin.jvm.internal.r.a(c1Var2.c(iIntValue), c1Var.c(iIntValue))) {
                        }
                    }
                    z10 = true;
                    if (e().size() == k0Var.e().size()) {
                        Set<Map.Entry<String, q>> setEntrySet = e().entrySet();
                        kotlin.jvm.internal.r.e(setEntrySet, "<this>");
                        Iterator<T> it2 = setEntrySet.iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            if (!k0Var.e().containsKey(entry.getKey()) || !kotlin.jvm.internal.r.a(k0Var.e().get(entry.getKey()), entry.getValue())) {
                            }
                        }
                        z11 = true;
                        if (oVar.f24511d == oVar2.f24511d || !kotlin.jvm.internal.r.a(oVar.f24512e, oVar2.f24512e) || !zA || !z10 || !z11) {
                        }
                    }
                    z11 = false;
                    if (oVar.f24511d == oVar2.f24511d) {
                    }
                }
                z10 = false;
                if (e().size() == k0Var.e().size()) {
                }
                z11 = false;
                if (oVar.f24511d == oVar2.f24511d) {
                }
            }
            return false;
        }
        return true;
    }

    public b f(i0 i0Var) {
        boolean zE;
        mh.k kVar;
        mh.i iVarD;
        s5.o oVar = this.f21235b;
        LinkedHashMap arguments = oVar.f24510c;
        String str = i0Var.f21231b;
        Uri uri = i0Var.f21230a;
        ArrayList arrayList = oVar.f24509b;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        b bVar = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h0 h0Var = (h0) obj;
            h0Var.getClass();
            pg.s sVar = h0Var.f21219d;
            if (((mh.k) sVar.getValue()) == null) {
                zE = true;
            } else if (uri == null) {
                zE = false;
            } else {
                mh.k kVar2 = (mh.k) sVar.getValue();
                kotlin.jvm.internal.r.b(kVar2);
                zE = kVar2.e(uri.toString());
            }
            if (zE) {
                Bundle bundleD = uri != null ? h0Var.d(uri, arguments) : null;
                int iB = h0Var.b(uri);
                boolean z10 = str != null && str.equals(null);
                if (bundleD == null) {
                    if (z10) {
                        kotlin.jvm.internal.r.e(arguments, "arguments");
                        Bundle bundleA = u3.d.a((pg.n[]) Arrays.copyOf(new pg.n[0], 0));
                        if (uri != null && (kVar = (mh.k) sVar.getValue()) != null && (iVarD = kVar.d(uri.toString())) != null) {
                            h0Var.e(iVarD, bundleA, arguments);
                            if (((Boolean) h0Var.f21220e.getValue()).booleanValue()) {
                                h0Var.f(uri, bundleA, arguments);
                            }
                        }
                        if (c9.g.g(arguments, new com.basitce.htmltoapk.data.local.dao.o(bundleA, 1)).isEmpty()) {
                        }
                    }
                }
                b bVar2 = new b(oVar.f24508a, bundleD, h0Var.f21227l, iB, z10, -1);
                if (bVar == null || bVar2.compareTo(bVar) > 0) {
                    bVar = bVar2;
                }
            }
        }
        return bVar;
    }

    public int hashCode() {
        s5.o oVar = this.f21235b;
        int i10 = oVar.f24511d * 31;
        String str = oVar.f24512e;
        int iHashCode = i10 + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = oVar.f24509b;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            iHashCode = (((h0) obj).f21216a.hashCode() + (iHashCode * 31)) * 961;
        }
        p.c1<p> c1Var = this.f21237d;
        kotlin.jvm.internal.r.e(c1Var, "<this>");
        int i12 = 0;
        while (true) {
            if (!(i12 < c1Var.f())) {
                break;
            }
            c1Var.g(i12).getClass();
            iHashCode *= 961;
            i12++;
        }
        for (String str2 : e().keySet()) {
            int iA = l0.k.a(iHashCode * 31, 31, str2);
            q qVar = e().get(str2);
            iHashCode = iA + (qVar != null ? qVar.hashCode() : 0);
        }
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        s5.o oVar = this.f21235b;
        oVar.getClass();
        sb.append(Integer.toHexString(oVar.f24511d));
        sb.append(")");
        String str = oVar.f24512e;
        if (str != null && !mh.x.A(str)) {
            sb.append(" route=");
            sb.append(oVar.f24512e);
        }
        String string = sb.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        return string;
    }
}
