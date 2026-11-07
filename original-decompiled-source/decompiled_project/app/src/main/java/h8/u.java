package h8;

import androidx.room.y0;
import b9.f4;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import mh.y;
import qg.x;
import qg.z;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: k, reason: collision with root package name */
    public static final a f12459k = new a();

    /* renamed from: l, reason: collision with root package name */
    public static final kotlinx.serialization.json.p f12460l = kotlinx.serialization.json.q.a(new f4(1));

    /* renamed from: m, reason: collision with root package name */
    public static final mh.k f12461m = new mh.k("^#[0-9A-Fa-f]{6}$");

    /* renamed from: n, reason: collision with root package name */
    public static final Set<String> f12462n = qg.o.C(new String[]{"appName", "orientation", "fullscreen", "statusBarColor", "pullToRefresh", "backHistoryNavigation", "permissions", "icon", "reasoning"});

    /* renamed from: a, reason: collision with root package name */
    public final String f12463a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12464b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f12465c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12466d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f12467e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f12468f;

    /* renamed from: g, reason: collision with root package name */
    public final List<String> f12469g;

    /* renamed from: h, reason: collision with root package name */
    public final j f12470h;

    /* renamed from: i, reason: collision with root package name */
    public final String f12471i;

    /* renamed from: j, reason: collision with root package name */
    public final List<String> f12472j;

    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0144  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static u a(kotlinx.serialization.json.v vVar) {
            List listX;
            j jVar;
            String str;
            String string;
            j jVar2;
            String strConcat;
            Set<String> setKeySet = vVar.f16457a.keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                if (!u.f12462n.contains((String) obj)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayListE0 = x.e0(arrayList);
            Object obj2 = vVar.get("permissions");
            kotlinx.serialization.json.c cVar = obj2 instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) obj2 : null;
            if (cVar != null) {
                ArrayList arrayList2 = new ArrayList();
                for (kotlinx.serialization.json.h hVar : cVar.f16439a) {
                    kotlinx.serialization.json.x xVar = hVar instanceof kotlinx.serialization.json.x ? (kotlinx.serialization.json.x) hVar : null;
                    if (xVar != null) {
                        kotlinx.serialization.internal.u uVar = kotlinx.serialization.json.i.f16449a;
                        String strC = xVar instanceof kotlinx.serialization.json.t ? null : xVar.c();
                        if (strC == null) {
                            strConcat = null;
                        } else {
                            List<String> list = p8.a.f21339a;
                            strConcat = mh.t.p(strC, "android.permission.", false) ? strC : "android.permission.".concat(strC);
                            if (!p8.a.f21341c.contains(strConcat)) {
                                strConcat = null;
                            }
                            if (strConcat == null) {
                                a aVar = u.f12459k;
                                arrayListE0.add(strC);
                                strConcat = null;
                            }
                        }
                    }
                    if (strConcat != null) {
                        arrayList2.add(strConcat);
                    }
                }
                listX = x.x(arrayList2);
            } else {
                listX = null;
            }
            Object obj3 = vVar.get("icon");
            kotlinx.serialization.json.v vVar2 = obj3 instanceof kotlinx.serialization.json.v ? (kotlinx.serialization.json.v) obj3 : null;
            if (vVar2 != null) {
                Object obj4 = vVar2.get("symbol");
                kotlinx.serialization.json.x xVar2 = obj4 instanceof kotlinx.serialization.json.x ? (kotlinx.serialization.json.x) obj4 : null;
                if (xVar2 != null) {
                    kotlinx.serialization.internal.u uVar2 = kotlinx.serialization.json.i.f16449a;
                    String strC2 = xVar2 instanceof kotlinx.serialization.json.t ? null : xVar2.c();
                    Object obj5 = vVar2.get("bg");
                    kotlinx.serialization.json.x xVar3 = obj5 instanceof kotlinx.serialization.json.x ? (kotlinx.serialization.json.x) obj5 : null;
                    if (xVar3 != null) {
                        kotlinx.serialization.internal.u uVar3 = kotlinx.serialization.json.i.f16449a;
                        String strC3 = xVar3 instanceof kotlinx.serialization.json.t ? null : xVar3.c();
                        Object obj6 = vVar2.get("fg");
                        kotlinx.serialization.json.x xVar4 = obj6 instanceof kotlinx.serialization.json.x ? (kotlinx.serialization.json.x) obj6 : null;
                        if (xVar4 != null) {
                            kotlinx.serialization.internal.u uVar4 = kotlinx.serialization.json.i.f16449a;
                            String strC4 = xVar4 instanceof kotlinx.serialization.json.t ? null : xVar4.c();
                            if (strC2 == null || strC3 == null || strC4 == null) {
                                jVar2 = null;
                                jVar = jVar2;
                            } else {
                                mh.k kVar = u.f12461m;
                                if (kVar.e(strC3) && kVar.e(strC4)) {
                                    jVar2 = new j(strC2, strC3, strC4);
                                }
                                jVar = jVar2;
                            }
                        }
                    }
                }
            } else {
                jVar = null;
            }
            String strC5 = c(vVar, "appName");
            if (strC5 == null || (string = mh.x.W(strC5).toString()) == null) {
                str = null;
            } else {
                String strB0 = y.b0(30, string);
                if (strB0.length() > 0) {
                    str = strB0;
                }
            }
            String strC6 = c(vVar, "orientation");
            String str2 = (strC6 == null || !qg.o.C(new String[]{"portrait", "landscape", "sensor"}).contains(strC6)) ? null : strC6;
            Boolean boolB = b(vVar, "fullscreen");
            String strC7 = c(vVar, "statusBarColor");
            String str3 = (strC7 == null || !u.f12461m.e(strC7)) ? null : strC7;
            Boolean boolB2 = b(vVar, "pullToRefresh");
            Boolean boolB3 = b(vVar, "backHistoryNavigation");
            String strC8 = c(vVar, "reasoning");
            return new u(str, str2, boolB, str3, boolB2, boolB3, listX, jVar, strC8 != null ? y.b0(300, strC8) : null, arrayListE0);
        }

        public static final Boolean b(kotlinx.serialization.json.v vVar, String str) {
            Object obj = vVar.get(str);
            kotlinx.serialization.json.x xVar = obj instanceof kotlinx.serialization.json.x ? (kotlinx.serialization.json.x) obj : null;
            if (xVar != null) {
                return kotlinx.serialization.json.i.d(xVar);
            }
            return null;
        }

        public static final String c(kotlinx.serialization.json.v vVar, String str) {
            Object obj = vVar.get(str);
            kotlinx.serialization.json.x xVar = obj instanceof kotlinx.serialization.json.x ? (kotlinx.serialization.json.x) obj : null;
            if (xVar != null) {
                if (!xVar.e()) {
                    xVar = null;
                }
                if (xVar != null) {
                    kotlinx.serialization.internal.u uVar = kotlinx.serialization.json.i.f16449a;
                    if (xVar instanceof kotlinx.serialization.json.t) {
                        return null;
                    }
                    return xVar.c();
                }
            }
            return null;
        }
    }

    public u(String str, String str2, Boolean bool, String str3, Boolean bool2, Boolean bool3, List<String> list, j jVar, String str4, List<String> list2) {
        this.f12463a = str;
        this.f12464b = str2;
        this.f12465c = bool;
        this.f12466d = str3;
        this.f12467e = bool2;
        this.f12468f = bool3;
        this.f12469g = list;
        this.f12470h = jVar;
        this.f12471i = str4;
        this.f12472j = list2;
    }

    public static u a(u uVar, List list, int i10) {
        return new u(uVar.f12463a, uVar.f12464b, uVar.f12465c, uVar.f12466d, uVar.f12467e, uVar.f12468f, (i10 & 64) != 0 ? uVar.f12469g : null, uVar.f12470h, (i10 & 256) != 0 ? uVar.f12471i : null, list);
    }

    public final boolean b() {
        return this.f12463a == null && this.f12464b == null && this.f12465c == null && this.f12466d == null && this.f12467e == null && this.f12468f == null && this.f12469g == null && this.f12470h == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.r.a(this.f12463a, uVar.f12463a) && kotlin.jvm.internal.r.a(this.f12464b, uVar.f12464b) && kotlin.jvm.internal.r.a(this.f12465c, uVar.f12465c) && kotlin.jvm.internal.r.a(this.f12466d, uVar.f12466d) && kotlin.jvm.internal.r.a(this.f12467e, uVar.f12467e) && kotlin.jvm.internal.r.a(this.f12468f, uVar.f12468f) && kotlin.jvm.internal.r.a(this.f12469g, uVar.f12469g) && kotlin.jvm.internal.r.a(this.f12470h, uVar.f12470h) && kotlin.jvm.internal.r.a(this.f12471i, uVar.f12471i) && kotlin.jvm.internal.r.a(this.f12472j, uVar.f12472j);
    }

    public final int hashCode() {
        String str = this.f12463a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f12464b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f12465c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f12466d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.f12467e;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f12468f;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<String> list = this.f12469g;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        j jVar = this.f12470h;
        int iHashCode8 = (iHashCode7 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        String str4 = this.f12471i;
        return this.f12472j.hashCode() + ((iHashCode8 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = y0.a("AiSettings(appName=", this.f12463a, ", orientation=", this.f12464b, ", fullscreen=");
        sbA.append(this.f12465c);
        sbA.append(", statusBarColor=");
        sbA.append(this.f12466d);
        sbA.append(", pullToRefresh=");
        sbA.append(this.f12467e);
        sbA.append(", backHistoryNavigation=");
        sbA.append(this.f12468f);
        sbA.append(", permissions=");
        sbA.append(this.f12469g);
        sbA.append(", icon=");
        sbA.append(this.f12470h);
        sbA.append(", reasoning=");
        sbA.append(this.f12471i);
        sbA.append(", dropped=");
        sbA.append(this.f12472j);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ u(List list, int i10) {
        this(null, null, null, null, null, null, (i10 & 64) != 0 ? null : list, null, null, z.f22752a);
    }
}
