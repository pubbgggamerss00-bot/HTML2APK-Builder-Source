package j8;

import ae.m;
import ae.x;
import ah.l;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.tasks.Task;
import eh.q;
import g8.p;
import g8.s;
import i8.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import pg.f0;
import pg.n;
import ph.i0;
import ph.j0;
import ph.n2;
import ph.t0;
import ph.z0;
import qg.z;
import sh.f;
import sh.g;
import sh.k0;
import sh.o0;
import sh.q0;
import tg.h;
import vg.e;
import vg.i;
import yh.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final j f15262a;

    /* renamed from: b, reason: collision with root package name */
    public final p f15263b;

    /* renamed from: c, reason: collision with root package name */
    public final c f15264c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f15265d;

    /* renamed from: e, reason: collision with root package name */
    public final o0 f15266e;

    /* renamed from: f, reason: collision with root package name */
    public final k0 f15267f;

    @e(c = "com.basitce.htmltoapk.credits.CreditsRepository$1", f = "CreditsRepository.kt", l = {EACTags.SEX}, m = "invokeSuspend")
    /* renamed from: j8.a$a, reason: collision with other inner class name */
    public static final class C0146a extends i implements eh.p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15268a;

        @e(c = "com.basitce.htmltoapk.credits.CreditsRepository$1$1", f = "CreditsRepository.kt", l = {}, m = "invokeSuspend")
        /* renamed from: j8.a$a$a, reason: collision with other inner class name */
        public static final class C0147a extends i implements q<List<? extends Purchase>, s, tg.e<? super n<? extends List<? extends Purchase>, ? extends s>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ List f15270a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ s f15271b;

            @Override // eh.q
            public final Object b(List<? extends Purchase> list, s sVar, tg.e<? super n<? extends List<? extends Purchase>, ? extends s>> eVar) {
                C0147a c0147a = new C0147a(3, eVar);
                c0147a.f15270a = list;
                c0147a.f15271b = sVar;
                return c0147a.invokeSuspend(f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                pg.q.b(obj);
                return new n(this.f15270a, this.f15271b);
            }
        }

        /* renamed from: j8.a$a$b */
        public static final class b<T> implements g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f15272a;

            public b(a aVar) {
                this.f15272a = aVar;
            }

            @Override // sh.g
            public final Object c(Object obj, tg.e eVar) throws Throwable {
                n nVar = (n) obj;
                List list = (List) nVar.f21469a;
                if (!(((s) nVar.f21470b) instanceof s.a) || list.isEmpty()) {
                    return f0.f21461a;
                }
                Object objA = a.a(this.f15272a, list, eVar);
                return objA == ug.a.f29706a ? objA : f0.f21461a;
            }
        }

        public C0146a(tg.e<? super C0146a> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return a.this.new C0146a(eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((C0146a) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f15268a;
            if (i10 == 0) {
                pg.q.b(obj);
                a aVar2 = a.this;
                f fVarD = gg.a.d(new sh.f0(aVar2.f15262a.f14236p, aVar2.f15263b.f11602f, new C0147a(3, null)));
                b bVar = new b(aVar2);
                this.f15268a = 1;
                if (fVarD.b(bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return f0.f21461a;
        }
    }

    public interface b {

        /* renamed from: j8.a$b$a, reason: collision with other inner class name */
        public static final class C0148a implements b {

            /* renamed from: a, reason: collision with root package name */
            public final String f15273a;

            public C0148a(String code) {
                r.e(code, "code");
                this.f15273a = code;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0148a) && r.a(this.f15273a, ((C0148a) obj).f15273a);
            }

            public final int hashCode() {
                return this.f15273a.hashCode();
            }

            public final String toString() {
                return i8.n.d("Failed(code=", this.f15273a, ")");
            }
        }

        /* renamed from: j8.a$b$b, reason: collision with other inner class name */
        public static final class C0149b implements b {

            /* renamed from: a, reason: collision with root package name */
            public final int f15274a;

            public C0149b(int i10) {
                this.f15274a = i10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0149b) && this.f15274a == ((C0149b) obj).f15274a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f15274a);
            }

            public final String toString() {
                return ad.b.b(this.f15274a, "Granted(credits=", ")");
            }
        }
    }

    public a(j billing, p account) {
        r.e(billing, "billing");
        r.e(account, "account");
        this.f15262a = billing;
        this.f15263b = account;
        n2 n2VarA = l.a();
        wh.c cVar = z0.f21632a;
        uh.c cVarA = j0.a(h.a.C0291a.c(n2VarA, wh.b.f31563c));
        this.f15264c = new c();
        this.f15265d = new LinkedHashSet();
        o0 o0VarB = q0.b(8, 5, null);
        this.f15266e = o0VarB;
        this.f15267f = new k0(o0VarB);
        ph.h.c(cVarA, null, null, new C0146a(null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0188 A[Catch: all -> 0x006f, Exception -> 0x0073, TryCatch #4 {Exception -> 0x0073, all -> 0x006f, blocks: (B:68:0x0180, B:70:0x0188, B:72:0x018c, B:21:0x006a), top: B:107:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c4 A[Catch: all -> 0x004a, TryCatch #1 {all -> 0x004a, blocks: (B:14:0x0040, B:64:0x0157, B:76:0x0199, B:78:0x01c4, B:80:0x01c9, B:85:0x01eb, B:99:0x0230, B:88:0x01f2, B:89:0x01f6, B:91:0x01fc, B:94:0x020d, B:96:0x0214, B:98:0x0224, B:33:0x00a1, B:35:0x00a7, B:38:0x00ad, B:39:0x00b6, B:41:0x00bc, B:50:0x00ea, B:52:0x00f6, B:44:0x00ce, B:46:0x00d5, B:54:0x00fb, B:56:0x0101, B:59:0x0107, B:61:0x011b, B:62:0x0149), top: B:106:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x01e5 -> B:104:0x0157). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, List list, tg.e eVar) throws Throwable {
        j8.b bVar;
        List list2;
        yh.a aVar2;
        a aVar3;
        m mVar;
        List<? extends Purchase> list3;
        Map mapB;
        int i10;
        yh.a aVar4;
        Exception e10;
        g8.a aVarB;
        List<? extends Purchase> list4;
        Object objA;
        a aVar5 = aVar;
        if (eVar instanceof j8.b) {
            bVar = (j8.b) eVar;
            int i11 = bVar.f15283j;
            if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f15283j = i11 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new j8.b(aVar5, eVar);
            }
        }
        Object obj = bVar.f15281g;
        Object obj2 = ug.a.f29706a;
        int i12 = bVar.f15283j;
        try {
            if (i12 == 0) {
                pg.q.b(obj);
                c cVar = aVar5.f15264c;
                bVar.f15275a = aVar5;
                list2 = list;
                bVar.f15276b = list2;
                bVar.f15277c = cVar;
                bVar.f15283j = 1;
                if (cVar.h(bVar) != obj2) {
                    aVar2 = cVar;
                }
                return obj2;
            }
            if (i12 != 1) {
                if (i12 == 2) {
                    i10 = bVar.f15280f;
                    mapB = bVar.f15279e;
                    mVar = bVar.f15278d;
                    list4 = (List) bVar.f15277c;
                    aVar4 = (yh.a) bVar.f15276b;
                    aVar3 = bVar.f15275a;
                    try {
                        pg.q.b(obj);
                    } catch (Exception e11) {
                        e10 = e11;
                        list3 = list4;
                        aVar2 = aVar4;
                        a aVar6 = aVar3;
                        aVarB = g8.c.b(e10);
                        Log.w("CreditsRepository", "linkPurchases failed (" + aVarB.f11559a + ")", e10);
                        if (!r.a(aVarB.f11559a, "ai_unavailable")) {
                        }
                        return obj2;
                    } catch (Throwable th2) {
                        th = th2;
                        yh.a aVar7 = aVar4;
                        aVar7.l(null);
                        throw th;
                    }
                    Object obj3 = ((x) obj).f522a;
                    aVar3.b(list4, !(obj3 instanceof Map) ? (Map) obj3 : null);
                    obj2 = f0.f21461a;
                    aVar4.l(null);
                    return obj2;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i13 = bVar.f15280f;
                Map map = bVar.f15279e;
                m mVar2 = bVar.f15278d;
                List<? extends Purchase> list5 = (List) bVar.f15277c;
                aVar2 = (yh.a) bVar.f15276b;
                a aVar8 = bVar.f15275a;
                pg.q.b(obj);
                list3 = list5;
                mVar = mVar2;
                mapB = map;
                aVar3 = aVar8;
                i10 = i13;
                try {
                } catch (Exception e12) {
                    e10 = e12;
                    a aVar62 = aVar3;
                    aVarB = g8.c.b(e10);
                    Log.w("CreditsRepository", "linkPurchases failed (" + aVarB.f11559a + ")", e10);
                    if (!r.a(aVarB.f11559a, "ai_unavailable")) {
                        int i14 = i10 + 1;
                        if (i10 < 3) {
                            bVar.f15275a = aVar62;
                            bVar.f15276b = aVar2;
                            bVar.f15277c = list3;
                            bVar.f15278d = mVar;
                            bVar.f15279e = mapB;
                            bVar.f15280f = i14;
                            bVar.f15283j = 3;
                            if (t0.b(2000 << i14, bVar) != obj2) {
                                i10 = i14;
                                aVar3 = aVar62;
                                Task taskA = mVar.a("linkPurchases").a(mapB);
                                bVar.f15275a = aVar3;
                                bVar.f15276b = aVar2;
                                bVar.f15277c = list3;
                                bVar.f15278d = mVar;
                                bVar.f15279e = mapB;
                                bVar.f15280f = i10;
                                bVar.f15283j = 2;
                                objA = g8.c.a(taskA, bVar);
                                if (objA != obj2) {
                                }
                            }
                        } else {
                            if (list3 == null || !list3.isEmpty()) {
                                Iterator<T> it = list3.iterator();
                                loop0: while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    ArrayList arrayListA = ((Purchase) it.next()).a();
                                    if (!arrayListA.isEmpty()) {
                                        int size = arrayListA.size();
                                        int i15 = 0;
                                        while (i15 < size) {
                                            Object obj4 = arrayListA.get(i15);
                                            i15++;
                                            if (j.f14218s.contains((String) obj4)) {
                                                aVar62.f15266e.r(new b.C0148a(aVarB.f11559a));
                                                break loop0;
                                            }
                                        }
                                    }
                                }
                            }
                            obj2 = f0.f21461a;
                            aVar2.l(null);
                        }
                    }
                    return obj2;
                }
                Task taskA2 = mVar.a("linkPurchases").a(mapB);
                bVar.f15275a = aVar3;
                bVar.f15276b = aVar2;
                bVar.f15277c = list3;
                bVar.f15278d = mVar;
                bVar.f15279e = mapB;
                bVar.f15280f = i10;
                bVar.f15283j = 2;
                objA = g8.c.a(taskA2, bVar);
                if (objA != obj2) {
                    aVar4 = aVar2;
                    list4 = list3;
                    obj = objA;
                    Object obj32 = ((x) obj).f522a;
                    aVar3.b(list4, !(obj32 instanceof Map) ? (Map) obj32 : null);
                    obj2 = f0.f21461a;
                    aVar4.l(null);
                }
                return obj2;
            }
            yh.a aVar9 = (yh.a) bVar.f15277c;
            list2 = (List) bVar.f15276b;
            a aVar10 = bVar.f15275a;
            pg.q.b(obj);
            aVar2 = aVar9;
            aVar5 = aVar10;
            m mVar3 = aVar5.f15263b.f11600d;
            if (mVar3 == null) {
                f0 f0Var = f0.f21461a;
                aVar2.l(null);
                return f0Var;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj5 : list2) {
                Purchase purchase = (Purchase) obj5;
                ArrayList arrayListA2 = purchase.a();
                if (!arrayListA2.isEmpty()) {
                    int size2 = arrayListA2.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        Object obj6 = arrayListA2.get(i16);
                        i16++;
                        if (j.f14218s.contains((String) obj6)) {
                            break;
                        }
                    }
                }
                if (!aVar5.f15265d.contains(purchase.c())) {
                    arrayList.add(obj5);
                }
            }
            if (arrayList.isEmpty()) {
                f0 f0Var2 = f0.f21461a;
                aVar2.l(null);
                return f0Var2;
            }
            ArrayList arrayList2 = new ArrayList(qg.p.h(arrayList, 10));
            int size3 = arrayList.size();
            int i17 = 0;
            while (i17 < size3) {
                Object obj7 = arrayList.get(i17);
                i17++;
                Purchase purchase2 = (Purchase) obj7;
                arrayList2.add(qg.k0.d(new n("productId", qg.x.B(purchase2.a())), new n("purchaseToken", purchase2.c())));
            }
            aVar3 = aVar5;
            mVar = mVar3;
            list3 = arrayList;
            mapB = qg.j0.b(new n("purchases", arrayList2));
            i10 = 0;
            Task taskA22 = mVar.a("linkPurchases").a(mapB);
            bVar.f15275a = aVar3;
            bVar.f15276b = aVar2;
            bVar.f15277c = list3;
            bVar.f15278d = mVar;
            bVar.f15279e = mapB;
            bVar.f15280f = i10;
            bVar.f15283j = 2;
            objA = g8.c.a(taskA22, bVar);
            if (objA != obj2) {
            }
            return obj2;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final void b(List<? extends Purchase> list, Map<?, ?> map) {
        Object next;
        Object obj = map != null ? map.get("results") : null;
        List list2 = obj instanceof List ? (List) obj : null;
        if (list2 == null) {
            list2 = z.f22752a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof Map) {
                arrayList.add(obj2);
            }
        }
        int size = arrayList.size();
        int iIntValue = 0;
        int i10 = 0;
        while (true) {
            o0 o0Var = this.f15266e;
            if (i10 >= size) {
                if (iIntValue > 0) {
                    o0Var.r(new b.C0149b(iIntValue));
                }
                this.f15263b.l();
                return;
            }
            Object obj3 = arrayList.get(i10);
            i10++;
            Map map2 = (Map) obj3;
            Object obj4 = map2.get("purchaseToken");
            final String str = obj4 instanceof String ? (String) obj4 : null;
            if (str != null) {
                Object obj5 = map2.get("status");
                String str2 = obj5 instanceof String ? (String) obj5 : null;
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (r.a(((Purchase) next).c(), str)) {
                        }
                    } else {
                        next = null;
                    }
                }
                Purchase purchase = (Purchase) next;
                if (purchase != null) {
                    if (r.a(map2.get("consume"), Boolean.TRUE)) {
                        List<String> list3 = j.f14217r;
                        final com.basitce.htmltoapk.data.apkgenerator.signer.e eVar = new com.basitce.htmltoapk.data.apkgenerator.signer.e(1);
                        final j jVar = this.f15262a;
                        jVar.getClass();
                        d8.h hVar = new d8.h();
                        hVar.f7493a = str;
                        jVar.f14237q.b(hVar, new d8.i() { // from class: i8.f
                            @Override // d8.i
                            public final void a(com.android.billingclient.api.a result, String str3) {
                                r.e(result, "result");
                                r.e(str3, "<unused var>");
                                int i11 = result.f5606a;
                                boolean z10 = i11 == 0 || i11 == 8;
                                if (z10) {
                                    sh.z0 z0Var = jVar.f14235o;
                                    Iterable iterable = (Iterable) z0Var.getValue();
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj6 : iterable) {
                                        if (!r.a(((Purchase) obj6).c(), str)) {
                                            arrayList2.add(obj6);
                                        }
                                    }
                                    z0Var.j(null, arrayList2);
                                }
                                eVar.invoke(Boolean.valueOf(z10));
                            }
                        });
                    }
                    ArrayList arrayListA = purchase.a();
                    if (!arrayListA.isEmpty()) {
                        int size2 = arrayListA.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj6 = arrayListA.get(i11);
                            i11++;
                            if (j.f14218s.contains((String) obj6)) {
                                if (str2 != null) {
                                    switch (str2.hashCode()) {
                                        case -1102666215:
                                            if (str2.equals("linked")) {
                                                break;
                                            } else {
                                                break;
                                            }
                                        case -682587753:
                                            if (str2.equals("pending")) {
                                                o0Var.r(new b.C0148a("purchase_pending"));
                                                break;
                                            } else {
                                                break;
                                            }
                                        case -393258080:
                                            if (str2.equals("account_mismatch")) {
                                                o0Var.r(new b.C0148a("purchase_account_mismatch"));
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 280295099:
                                            if (str2.equals("granted")) {
                                                Object obj7 = map2.get("credits");
                                                Number number = obj7 instanceof Number ? (Number) obj7 : null;
                                                iIntValue += number != null ? number.intValue() : 0;
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 504919508:
                                            if (str2.equals("already_granted")) {
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 1398431712:
                                            if (str2.equals("already_linked")) {
                                                o0Var.r(new b.C0148a("purchase_already_linked"));
                                                break;
                                            } else {
                                                break;
                                            }
                                    }
                                }
                                o0Var.r(new b.C0148a("purchase_invalid"));
                            }
                        }
                    }
                    this.f15265d.add(str);
                }
            }
        }
    }
}
