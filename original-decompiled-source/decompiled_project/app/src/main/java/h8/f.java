package h8;

import androidx.datastore.preferences.protobuf.a1;
import b9.b4;
import b9.d4;
import c0.u0;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import h8.t;
import h8.u;
import h8.v;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.x;
import mh.i;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import pg.p;
import qg.z;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final g8.p f12383a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.serialization.json.p f12384b;

    public interface a {

        /* renamed from: h8.f$a$a, reason: collision with other inner class name */
        public static final class C0115a implements a {

            /* renamed from: a, reason: collision with root package name */
            public final t f12385a;

            /* renamed from: b, reason: collision with root package name */
            public final int f12386b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f12387c;

            public C0115a(t tVar, int i10, boolean z10) {
                this.f12385a = tVar;
                this.f12386b = i10;
                this.f12387c = z10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0115a)) {
                    return false;
                }
                C0115a c0115a = (C0115a) obj;
                return kotlin.jvm.internal.r.a(this.f12385a, c0115a.f12385a) && this.f12386b == c0115a.f12386b && this.f12387c == c0115a.f12387c;
            }

            public final int hashCode() {
                t tVar = this.f12385a;
                return Boolean.hashCode(this.f12387c) + a1.a(this.f12386b, (tVar == null ? 0 : tVar.hashCode()) * 31, 31);
            }

            public final String toString() {
                return "Done(result=" + this.f12385a + ", credits=" + this.f12386b + ", free=" + this.f12387c + ")";
            }
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            public final String f12388a;

            public b(String str) {
                this.f12388a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && kotlin.jvm.internal.r.a(this.f12388a, ((b) obj).f12388a);
            }

            public final int hashCode() {
                String str = this.f12388a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return i8.n.d("Failed(code=", this.f12388a, ")");
            }
        }

        public static final class c implements a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f12389a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1469023422;
            }

            public final String toString() {
                return "Running";
            }
        }
    }

    public f(g8.p account) {
        kotlin.jvm.internal.r.e(account, "account");
        this.f12383a = account;
        this.f12384b = kotlinx.serialization.json.q.a(new b4(1));
    }

    public static final String a(f fVar, s sVar) {
        fVar.getClass();
        kotlinx.serialization.json.w wVar = new kotlinx.serialization.json.w();
        String str = sVar.f12447a;
        List<w> list = sVar.f12452f;
        if (str != null) {
            wVar.b("sessionId", kotlinx.serialization.json.i.b(str));
        }
        wVar.b("mode", kotlinx.serialization.json.i.b(sVar.f12448b));
        wVar.b("prompt", kotlinx.serialization.json.i.b(sVar.f12449c));
        String str2 = sVar.f12450d;
        if (str2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            x element = kotlinx.serialization.json.i.b(str2);
            kotlin.jvm.internal.r.e(element, "element");
            f0 f0Var = f0.f21461a;
            wVar.b("files", new kotlinx.serialization.json.v(linkedHashMap));
        }
        String str3 = sVar.f12451e;
        if (str3 != null) {
            wVar.b("settings", fVar.f12384b.d(str3));
        }
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (w wVar2 : list) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                x element2 = kotlinx.serialization.json.i.b(wVar2.f12488a);
                kotlin.jvm.internal.r.e(element2, "element");
                x element3 = kotlinx.serialization.json.i.b(wVar2.f12489b);
                kotlin.jvm.internal.r.e(element3, "element");
                arrayList.add(new kotlinx.serialization.json.v(linkedHashMap2));
            }
            f0 f0Var2 = f0.f21461a;
            wVar.b("failedBlocks", new kotlinx.serialization.json.c(arrayList));
        }
        u0.b(wVar, "autoMode", Boolean.valueOf(sVar.f12453g));
        wVar.b("apiContractVersion", kotlinx.serialization.json.i.a(45));
        wVar.b("locale", kotlinx.serialization.json.i.b(sVar.f12454h));
        return wVar.a().toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0122  */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v7, types: [qg.z] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final v b(f fVar, String str, String str2, boolean z10) {
        Object objA;
        Long lValueOf;
        int iIntValue;
        Long lValueOf2;
        Long l10;
        t tVar;
        Boolean boolD;
        u uVar;
        ArrayList arrayList;
        t aVar;
        w wVar;
        String strC;
        fVar.getClass();
        try {
            objA = kotlinx.serialization.json.i.e(fVar.f12384b.d(str2));
        } catch (Throwable th2) {
            objA = pg.q.a(th2);
        }
        boolean z11 = objA instanceof p.a;
        boolean z12 = false;
        Object obj = objA;
        if (z11) {
            obj = null;
        }
        kotlinx.serialization.json.v vVar = (kotlinx.serialization.json.v) obj;
        if (vVar == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 3059181:
                if (!str.equals("code")) {
                    return null;
                }
                String strC2 = c(vVar, "delta");
                return new v.a(strC2 != null ? strC2 : "");
            case 3089282:
                if (!str.equals("done")) {
                    return null;
                }
                String strC3 = c(vVar, "sessionId");
                String str3 = strC3 == null ? "" : strC3;
                String strC4 = c(vVar, "turnId");
                String str4 = strC4 == null ? "" : strC4;
                Object obj2 = vVar.get("credits");
                x xVar = obj2 instanceof x ? (x) obj2 : null;
                boolean zBooleanValue = false;
                if (xVar != null) {
                    try {
                        lValueOf = Long.valueOf(kotlinx.serialization.json.i.g(xVar));
                    } catch (di.p unused) {
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        long jLongValue = lValueOf.longValue();
                        Integer numValueOf = (-2147483648L > jLongValue || jLongValue > 2147483647L) ? null : Integer.valueOf((int) jLongValue);
                        iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                    }
                }
                Object obj3 = vVar.get("balance");
                x xVar2 = obj3 instanceof x ? (x) obj3 : null;
                if (xVar2 != null) {
                    try {
                        lValueOf2 = Long.valueOf(kotlinx.serialization.json.i.g(xVar2));
                    } catch (di.p unused2) {
                        lValueOf2 = null;
                    }
                    l10 = lValueOf2;
                } else {
                    l10 = null;
                }
                Object obj4 = vVar.get("result");
                kotlinx.serialization.json.v vVar2 = obj4 instanceof kotlinx.serialization.json.v ? (kotlinx.serialization.json.v) obj4 : null;
                if (vVar2 != null) {
                    Object obj5 = vVar2.get("settings");
                    kotlinx.serialization.json.v vVar3 = obj5 instanceof kotlinx.serialization.json.v ? (kotlinx.serialization.json.v) obj5 : null;
                    if (vVar3 != null) {
                        u.f12459k.getClass();
                        uVar = u.a.a(vVar3);
                    } else {
                        uVar = new u(z12 ? 1 : 0, 1023);
                    }
                    Object obj6 = vVar2.get("dropped");
                    kotlinx.serialization.json.c cVar = obj6 instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) obj6 : null;
                    if (cVar != null) {
                        arrayList = new ArrayList();
                        for (kotlinx.serialization.json.h hVar : cVar.f16439a) {
                            x xVar3 = hVar instanceof x ? (x) hVar : null;
                            if (xVar3 != null) {
                                kotlinx.serialization.internal.u uVar2 = kotlinx.serialization.json.i.f16449a;
                                strC = xVar3 instanceof kotlinx.serialization.json.t ? null : xVar3.c();
                            }
                            if (strC != null) {
                                arrayList.add(strC);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    ?? r52 = z.f22752a;
                    if (arrayList == null) {
                        arrayList = r52;
                    }
                    u uVarA = u.a(uVar, qg.x.x(qg.x.O(arrayList, uVar.f12472j)), 511);
                    Object obj7 = vVar2.get("kind");
                    x xVar4 = obj7 instanceof x ? (x) obj7 : null;
                    if (xVar4 != null) {
                        kotlinx.serialization.internal.u uVar3 = kotlinx.serialization.json.i.f16449a;
                        String strC5 = xVar4 instanceof kotlinx.serialization.json.t ? null : xVar4.c();
                        if (strC5 == null) {
                            strC5 = z10 ? "edit" : "new";
                        }
                        if (strC5.equals("new")) {
                            Object obj8 = vVar2.get(ProjectKind.HTML);
                            x xVar5 = obj8 instanceof x ? (x) obj8 : null;
                            if (xVar5 != null) {
                                kotlinx.serialization.internal.u uVar4 = kotlinx.serialization.json.i.f16449a;
                                String strC6 = xVar5 instanceof kotlinx.serialization.json.t ? null : xVar5.c();
                                if (strC6 == null) {
                                    aVar = null;
                                } else {
                                    if (mh.x.A(strC6)) {
                                        strC6 = null;
                                    }
                                    if (strC6 != null) {
                                        aVar = new t.b(strC6, uVarA);
                                    }
                                }
                            }
                        } else {
                            Object obj9 = vVar2.get("blocks");
                            kotlinx.serialization.json.c cVar2 = obj9 instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) obj9 : null;
                            if (cVar2 != null) {
                                r52 = cVar2;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (kotlinx.serialization.json.h hVar2 : r52) {
                                kotlinx.serialization.json.v vVar4 = hVar2 instanceof kotlinx.serialization.json.v ? (kotlinx.serialization.json.v) hVar2 : null;
                                if (vVar4 == null) {
                                    wVar = null;
                                } else {
                                    Object obj10 = vVar4.get("search");
                                    x xVar6 = obj10 instanceof x ? (x) obj10 : null;
                                    if (xVar6 != null) {
                                        kotlinx.serialization.internal.u uVar5 = kotlinx.serialization.json.i.f16449a;
                                        String strC7 = xVar6 instanceof kotlinx.serialization.json.t ? null : xVar6.c();
                                        if (strC7 != null) {
                                            Object obj11 = vVar4.get("replace");
                                            x xVar7 = obj11 instanceof x ? (x) obj11 : null;
                                            String strC8 = (xVar7 == null || (xVar7 instanceof kotlinx.serialization.json.t)) ? null : xVar7.c();
                                            if (strC8 == null) {
                                                strC8 = "";
                                            }
                                            wVar = new w(strC7, strC8);
                                        }
                                    }
                                }
                                if (wVar != null) {
                                    arrayList2.add(wVar);
                                }
                            }
                            aVar = new t.a(arrayList2, uVarA);
                        }
                        tVar = aVar;
                    }
                } else {
                    tVar = null;
                }
                Object obj12 = vVar.get("free");
                x xVar8 = obj12 instanceof x ? (x) obj12 : null;
                if (xVar8 != null && (boolD = kotlinx.serialization.json.i.d(xVar8)) != null) {
                    zBooleanValue = boolD.booleanValue();
                }
                return new v.b(str3, str4, iIntValue, l10, tVar, zBooleanValue);
            case 3556653:
                if (!str.equals("text")) {
                    return null;
                }
                String strC9 = c(vVar, "delta");
                return new v.f(strC9 != null ? strC9 : "");
            case 96784904:
                if (!str.equals("error")) {
                    return null;
                }
                String strC10 = c(vVar, "code");
                if (strC10 == null) {
                    strC10 = "ai_unavailable";
                }
                return new v.c(strC10, c(vVar, "message"));
            case 106629499:
                if (!str.equals("phase")) {
                    return null;
                }
                String strC11 = c(vVar, "phase");
                return new v.d(strC11 != null ? strC11 : "");
            case 1224578480:
                if (!str.equals("thinking")) {
                    return null;
                }
                String strC12 = c(vVar, "delta");
                return new v.g(strC12 != null ? strC12 : "");
            case 1984987798:
                if (!str.equals("session")) {
                    return null;
                }
                String strC13 = c(vVar, "sessionId");
                if (strC13 == null) {
                    strC13 = "";
                }
                String strC14 = c(vVar, "turnId");
                return new v.e(strC13, strC14 != null ? strC14 : "", c(vVar, "model"));
            default:
                return null;
        }
    }

    public static String c(kotlinx.serialization.json.v vVar, String str) {
        Object obj = vVar.get(str);
        x xVar = obj instanceof x ? (x) obj : null;
        if (xVar == null) {
            return null;
        }
        kotlinx.serialization.internal.u uVar = kotlinx.serialization.json.i.f16449a;
        if (xVar instanceof kotlinx.serialization.json.t) {
            return null;
        }
        return xVar.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, boolean z10, vg.c cVar) {
        h hVar;
        u uVar;
        t bVar;
        String str3;
        Object objA;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i10 = hVar.f12405d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                hVar.f12405d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                hVar = new h(this, cVar);
            }
        }
        Object objK = hVar.f12403b;
        ug.a aVar = ug.a.f29706a;
        int i11 = hVar.f12405d;
        int i12 = 1;
        if (i11 == 0) {
            pg.q.b(objK);
            hVar.f12402a = z10;
            hVar.f12405d = 1;
            objK = this.f12383a.k(str, str2, hVar);
            if (objK == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = hVar.f12402a;
            pg.q.b(objK);
        }
        Map map = (Map) objK;
        if (map == null) {
            return a.c.f12389a;
        }
        Object obj = map.get("status");
        if (!kotlin.jvm.internal.r.a(obj, "done")) {
            if (!kotlin.jvm.internal.r.a(obj, "failed")) {
                return kotlin.jvm.internal.r.a(obj, "missing") ? new a.b(null) : a.c.f12389a;
            }
            Object obj2 = map.get("errorCode");
            return new a.b(obj2 instanceof String ? (String) obj2 : 0);
        }
        mh.k kVar = k.f12412a;
        Object obj3 = map.get("output");
        String str4 = obj3 instanceof String ? (String) obj3 : null;
        if (str4 == null) {
            str4 = "";
        }
        u.a aVar2 = u.f12459k;
        mh.i iVarB = k.f12412a.b(str4);
        String str5 = iVarB != null ? (String) ((i.a) iVarB.a()).get(1) : null;
        aVar2.getClass();
        int i13 = 1023;
        if (str5 == null || mh.x.A(str5)) {
            uVar = new u(str, i13);
        } else {
            try {
                objA = kotlinx.serialization.json.i.e(u.f12460l.d(str5));
            } catch (Throwable th2) {
                objA = pg.q.a(th2);
            }
            boolean z11 = objA instanceof p.a;
            Object obj4 = objA;
            if (z11) {
                obj4 = null;
            }
            kotlinx.serialization.json.v vVar = (kotlinx.serialization.json.v) obj4;
            uVar = vVar == null ? new u(str, i13) : u.a.a(vVar);
        }
        if (z10) {
            List listK = lh.j.k(new lh.p(mh.k.c(k.f12414c, str4), new d4(i12)));
            bVar = (listK.isEmpty() && uVar.b()) ? null : new t.a(listK, uVar);
        } else {
            mh.i iVarB2 = k.f12413b.b(str4);
            String string = (iVarB2 == null || (str3 = (String) ((i.a) iVarB2.a()).get(1)) == null) ? null : mh.x.W(str3).toString();
            String str6 = string != null ? string : "";
            if (str6.length() != 0) {
                bVar = new t.b(str6, uVar);
            }
        }
        Object obj5 = map.get("credits");
        Number number = obj5 instanceof Number ? (Number) obj5 : null;
        int iIntValue = number != null ? number.intValue() : 0;
        Object obj6 = map.get("free");
        Boolean bool = obj6 instanceof Boolean ? (Boolean) obj6 : null;
        return new a.C0115a(bVar, iIntValue, bool != null ? bool.booleanValue() : false);
    }
}
