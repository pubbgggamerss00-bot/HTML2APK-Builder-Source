package g8;

import android.app.Activity;
import android.net.Uri;
import android.util.Log;
import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.yalantis.ucrop.view.CropImageView;
import d4.v0;
import d4.x0;
import d4.y0;
import g8.s;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import lb.d;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import pg.p;
import ph.i0;
import ph.j0;
import ph.l2;
import ph.n2;
import qg.a0;
import qg.k0;
import qg.z;
import sh.a1;
import sh.l0;
import sh.z0;
import tg.h;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Hilt_HtmlToApkApplication f11597a;

    /* renamed from: b, reason: collision with root package name */
    public final id.e f11598b;

    /* renamed from: c, reason: collision with root package name */
    public final FirebaseAuth f11599c;

    /* renamed from: d, reason: collision with root package name */
    public final ae.m f11600d;

    /* renamed from: e, reason: collision with root package name */
    public final z0 f11601e;

    /* renamed from: f, reason: collision with root package name */
    public final l0 f11602f;

    /* renamed from: g, reason: collision with root package name */
    public final z0 f11603g;

    /* renamed from: h, reason: collision with root package name */
    public final l0 f11604h;

    /* renamed from: i, reason: collision with root package name */
    public final z0 f11605i;

    /* renamed from: j, reason: collision with root package name */
    public final l0 f11606j;

    /* renamed from: k, reason: collision with root package name */
    public final uh.c f11607k;

    /* renamed from: l, reason: collision with root package name */
    public l2 f11608l;

    /* renamed from: m, reason: collision with root package name */
    public volatile String f11609m;

    @vg.e(c = "com.basitce.htmltoapk.account.AccountRepository$refresh$1", f = "AccountRepository.kt", l = {85, 90, 91}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11610a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f11611b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ae.m f11613d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ae.m mVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f11613d = mVar;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            a aVar = p.this.new a(this.f11613d, eVar);
            aVar.f11611b = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
        
            if (r0 != r2) goto L44;
         */
        /* JADX WARN: Removed duplicated region for block: B:100:0x017a  */
        /* JADX WARN: Removed duplicated region for block: B:166:0x025b  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x011e  */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Throwable thA;
            Map map;
            Map map2;
            Map mapI;
            pg.n nVar;
            i0 i0Var;
            Object objA2;
            ae.n nVar2;
            Object objA3;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f11610a;
            ae.m mVar = this.f11613d;
            p pVar = p.this;
            try {
            } catch (Throwable th2) {
                objA = pg.q.a(th2);
            }
            if (i10 == 0) {
                pg.q.b(obj);
                i0 i0Var2 = (i0) this.f11611b;
                try {
                    this.f11611b = i0Var2;
                    this.f11610a = 1;
                    objA2 = p.a(pVar, mVar, this);
                    if (objA2 != aVar) {
                        i0Var = i0Var2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i0Var = i0Var2;
                    objA = pg.q.a(th);
                    Throwable thA2 = pg.p.a(objA);
                    if (thA2 instanceof ae.n) {
                    }
                    if (kotlin.jvm.internal.r.a(nVar2 != null ? nVar2.getMessage() : null, "not_signed_in")) {
                    }
                    if (!(objA instanceof p.a)) {
                    }
                    thA = pg.p.a(objA);
                    if (thA != null) {
                    }
                    return f0.f21461a;
                }
                return aVar;
            }
            if (i10 == 1) {
                i0Var = (i0) this.f11611b;
                try {
                    pg.q.b(obj);
                    objA2 = obj;
                } catch (Throwable th4) {
                    th = th4;
                    objA = pg.q.a(th);
                    Throwable thA22 = pg.p.a(objA);
                    if (thA22 instanceof ae.n) {
                    }
                    if (kotlin.jvm.internal.r.a(nVar2 != null ? nVar2.getMessage() : null, "not_signed_in")) {
                    }
                    if (!(objA instanceof p.a)) {
                    }
                    thA = pg.p.a(objA);
                    if (thA != null) {
                    }
                    return f0.f21461a;
                }
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                    objA3 = obj;
                    objA = (Map) objA3;
                    if (!(objA instanceof p.a) && (map = (Map) objA) != null) {
                        z0 z0Var = pVar.f11603g;
                        Object obj2 = map.get("credits");
                        Number number = !(obj2 instanceof Number) ? (Number) obj2 : null;
                        long jLongValue = number == null ? number.longValue() : 0L;
                        Object obj3 = map.get("proLifetime");
                        Boolean bool = !(obj3 instanceof Boolean) ? (Boolean) obj3 : null;
                        boolean zBooleanValue = bool == null ? bool.booleanValue() : false;
                        Object obj4 = map.get("proMonthlyUntil");
                        Number number2 = !(obj4 instanceof Number) ? (Number) obj4 : null;
                        Long lValueOf = number2 == null ? Long.valueOf(number2.longValue()) : null;
                        Object obj5 = map.get("freeNewApp");
                        Boolean bool2 = !(obj5 instanceof Boolean) ? (Boolean) obj5 : null;
                        d dVar = new d(jLongValue, zBooleanValue, lValueOf, bool2 == null ? bool2.booleanValue() : false);
                        z0Var.getClass();
                        z0Var.j(null, dVar);
                        Object obj6 = map.get("config");
                        map2 = !(obj6 instanceof Map) ? (Map) obj6 : null;
                        if (map2 != null) {
                            Map mapD = k0.d(new pg.n("credits_500", Integer.valueOf(CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION)), new pg.n("credits_1500", 1500), new pg.n("credits_4000", 4000));
                            Object obj7 = map2.get("packs");
                            List list = obj7 instanceof List ? (List) obj7 : null;
                            if (list != null) {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj8 : list) {
                                    Map map3 = obj8 instanceof Map ? (Map) obj8 : null;
                                    if (map3 == null) {
                                        nVar = null;
                                    } else {
                                        Object obj9 = map3.get("productId");
                                        String str = obj9 instanceof String ? (String) obj9 : null;
                                        if (str != null) {
                                            Object obj10 = map3.get("credits");
                                            Number number3 = obj10 instanceof Number ? (Number) obj10 : null;
                                            if (number3 != null) {
                                                nVar = new pg.n(str, Integer.valueOf(number3.intValue()));
                                            }
                                        }
                                    }
                                    if (nVar != null) {
                                        arrayList.add(nVar);
                                    }
                                }
                                mapI = k0.i(arrayList);
                            } else {
                                mapI = null;
                            }
                            z0 z0Var2 = pVar.f11605i;
                            Object obj11 = map2.get("newAppEstimate");
                            Number number4 = obj11 instanceof Number ? (Number) obj11 : null;
                            int iIntValue = number4 != null ? number4.intValue() : 10;
                            Object obj12 = map2.get("editEstimate");
                            Number number5 = obj12 instanceof Number ? (Number) obj12 : null;
                            int iIntValue2 = number5 != null ? number5.intValue() : 5;
                            Map map4 = mapI == null ? mapD : mapI;
                            Object obj13 = map2.get("proMonthlyCredits");
                            Number number6 = obj13 instanceof Number ? (Number) obj13 : null;
                            int iIntValue3 = number6 != null ? number6.intValue() : 60;
                            Object obj14 = map2.get("proLifetimeCredits");
                            Number number7 = obj14 instanceof Number ? (Number) obj14 : null;
                            int iIntValue4 = number7 != null ? number7.intValue() : 240;
                            Object obj15 = map2.get("bonusCutoff");
                            Number number8 = obj15 instanceof Number ? (Number) obj15 : null;
                            Long lValueOf2 = number8 != null ? Long.valueOf(number8.longValue()) : null;
                            Object obj16 = map2.get("killSwitch");
                            Boolean bool3 = obj16 instanceof Boolean ? (Boolean) obj16 : null;
                            x xVar = new x(iIntValue, iIntValue2, map4, iIntValue3, iIntValue4, lValueOf2, bool3 != null ? bool3.booleanValue() : false);
                            z0Var2.getClass();
                            z0Var2.j(null, xVar);
                        }
                    }
                    thA = pg.p.a(objA);
                    if (thA != null) {
                        Log.w("AccountRepository", "getAccount failed", thA);
                    }
                    return f0.f21461a;
                }
                pg.q.b(obj);
                this.f11611b = null;
                this.f11610a = 3;
                objA3 = p.a(pVar, mVar, this);
            }
            objA = (Map) objA2;
            Throwable thA222 = pg.p.a(objA);
            nVar2 = thA222 instanceof ae.n ? (ae.n) thA222 : null;
            if (kotlin.jvm.internal.r.a(nVar2 != null ? nVar2.getMessage() : null, "not_signed_in")) {
                this.f11611b = i0Var;
                this.f11610a = 2;
                if (pVar.f(this) != aVar) {
                    this.f11611b = null;
                    this.f11610a = 3;
                    objA3 = p.a(pVar, mVar, this);
                }
                return aVar;
            }
            if (!(objA instanceof p.a)) {
                z0 z0Var3 = pVar.f11603g;
                Object obj22 = map.get("credits");
                if (!(obj22 instanceof Number)) {
                }
                long jLongValue2 = number == null ? number.longValue() : 0L;
                Object obj32 = map.get("proLifetime");
                if (!(obj32 instanceof Boolean)) {
                }
                if (bool == null) {
                }
                Object obj42 = map.get("proMonthlyUntil");
                if (!(obj42 instanceof Number)) {
                }
                if (number2 == null) {
                }
                Object obj52 = map.get("freeNewApp");
                if (!(obj52 instanceof Boolean)) {
                }
                d dVar2 = new d(jLongValue2, zBooleanValue, lValueOf, bool2 == null ? bool2.booleanValue() : false);
                z0Var3.getClass();
                z0Var3.j(null, dVar2);
                Object obj62 = map.get("config");
                if (!(obj62 instanceof Map)) {
                }
                if (map2 != null) {
                }
            }
            thA = pg.p.a(objA);
            if (thA != null) {
            }
            return f0.f21461a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[PHI: r1
      0x0038: PHI (r1v16 id.e) = (r1v2 id.e), (r1v5 id.e) binds: [B:7:0x0020, B:16:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(Hilt_HtmlToApkApplication hilt_HtmlToApkApplication) {
        ArrayList arrayList;
        Object objA;
        ae.m mVarA;
        Object objA2;
        this.f11597a = hilt_HtmlToApkApplication;
        y yVar = y.f11654a;
        yVar.getClass();
        synchronized (id.e.f14478j) {
            arrayList = new ArrayList(id.e.f14479k.values());
        }
        id.e eVar = (id.e) qg.x.D(arrayList);
        if (eVar == null) {
            try {
                objA = id.e.h(hilt_HtmlToApkApplication);
            } catch (Throwable th2) {
                objA = pg.q.a(th2);
            }
            eVar = (id.e) (objA instanceof p.a ? null : objA);
            if (eVar == null) {
                eVar = null;
            } else if (!y.f11655b) {
                synchronized (yVar) {
                    try {
                        if (!y.f11655b) {
                            try {
                                ((kd.d) eVar.b(kd.d.class)).d();
                                objA2 = f0.f21461a;
                            } catch (Throwable th3) {
                                objA2 = pg.q.a(th3);
                            }
                            Throwable thA = pg.p.a(objA2);
                            if (thA != null) {
                                Log.w("FirebaseBootstrap", "App Check", thA);
                            }
                            y.f11655b = true;
                        }
                        f0 f0Var = f0.f21461a;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
        }
        this.f11598b = eVar;
        FirebaseAuth firebaseAuth = eVar != null ? FirebaseAuth.getInstance(eVar) : null;
        this.f11599c = firebaseAuth;
        if (eVar != null) {
            TaskCompletionSource<Void> taskCompletionSource = ae.m.f473i;
            ae.q qVar = (ae.q) eVar.b(ae.q.class);
            com.google.android.gms.common.internal.p.g(qVar, "Functions component does not exist.");
            synchronized (qVar) {
                mVarA = (ae.m) qVar.f509b.get("europe-west1");
                if (mVarA == null) {
                    mVarA = qVar.f508a.a();
                    qVar.f509b.put("europe-west1", mVarA);
                }
            }
        } else {
            mVarA = null;
        }
        this.f11600d = mVarA;
        z0 z0VarA = a1.a(d());
        this.f11601e = z0VarA;
        this.f11602f = gg.a.a(z0VarA);
        z0 z0VarA2 = a1.a(null);
        this.f11603g = z0VarA2;
        this.f11604h = gg.a.a(z0VarA2);
        z0 z0VarA3 = a1.a(new x(0));
        this.f11605i = z0VarA3;
        this.f11606j = gg.a.a(z0VarA3);
        n2 n2VarA = ah.l.a();
        wh.c cVar = ph.z0.f21632a;
        this.f11607k = j0.a(h.a.C0291a.c(n2VarA, uh.o.f29764a.H0()));
        if (firebaseAuth != null) {
            e eVar2 = new e(this);
            firebaseAuth.f6830d.add(eVar2);
            firebaseAuth.f6846t.execute(new com.google.firebase.auth.d(firebaseAuth, eVar2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(p pVar, ae.m mVar, vg.c cVar) {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i10 = kVar.f11584c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f11584c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(pVar, cVar);
            }
        }
        Object objA = kVar.f11582a;
        ug.a aVar = ug.a.f29706a;
        int i11 = kVar.f11584c;
        if (i11 == 0) {
            pg.q.b(objA);
            Task taskA = mVar.a("getAccount").a(a0.f22708a);
            kVar.f11584c = 1;
            objA = c.a(taskA, kVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(objA);
        }
        Object obj = ((ae.x) objA).f522a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(vg.c cVar) throws g8.a {
        g gVar;
        Serializable serializableA;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i10 = gVar.f11568c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f11568c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(this, cVar);
            }
        }
        Object objA = gVar.f11566a;
        ug.a aVar = ug.a.f29706a;
        int i11 = gVar.f11568c;
        try {
            if (i11 == 0) {
                pg.q.b(objA);
                id.e eVar = this.f11598b;
                if (eVar == null) {
                    throw new g8.a(6, "not_configured", (String) null);
                }
                Task taskC = ((kd.d) eVar.b(kd.d.class)).c();
                kotlin.jvm.internal.r.d(taskC, "getAppCheckToken(...)");
                gVar.f11568c = 1;
                objA = c.a(taskC, gVar);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(objA);
            }
            serializableA = ((kd.b) objA).b();
        } catch (Throwable th2) {
            serializableA = pg.q.a(th2);
        }
        Throwable thA = pg.p.a(serializableA);
        if (thA == null) {
            return serializableA;
        }
        throw new g8.a("integrity_failed", thA.getMessage(), thA);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, vg.c cVar) {
        h hVar;
        Object objA;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i10 = hVar.f11571c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                hVar.f11571c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                hVar = new h(this, cVar);
            }
        }
        Object objA2 = hVar.f11569a;
        ug.a aVar = ug.a.f29706a;
        int i11 = hVar.f11571c;
        try {
            if (i11 == 0) {
                pg.q.b(objA2);
                ae.m mVar = this.f11600d;
                if (mVar == null) {
                    return Boolean.FALSE;
                }
                Task taskA = mVar.a("cancelGeneration").a(k0.d(new pg.n("sessionId", str), new pg.n("turnId", str2)));
                hVar.f11571c = 1;
                objA2 = c.a(taskA, hVar);
                if (objA2 == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(objA2);
            }
            objA = (ae.x) objA2;
        } catch (Throwable th2) {
            objA = pg.q.a(th2);
        }
        Throwable thA = pg.p.a(objA);
        if (thA != null) {
            Log.w("AccountRepository", "cancelGeneration failed", thA);
        }
        return Boolean.valueOf(!(objA instanceof p.a));
    }

    public final s d() {
        FirebaseAuth firebaseAuth = this.f11599c;
        if (firebaseAuth == null) {
            return s.c.f11629a;
        }
        qd.p pVar = firebaseAuth.f6832f;
        if (pVar == null) {
            return s.b.f11628a;
        }
        String strJ = pVar.j();
        kotlin.jvm.internal.r.d(strJ, "getUid(...)");
        String strD = pVar.d();
        String strE = pVar.e();
        Uri uriG = pVar.g();
        return new s.a(strJ, strD, strE, uriG != null ? uriG.toString() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(vg.c cVar) {
        i iVar;
        p pVar;
        p pVar2;
        p pVar3;
        Object objA;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i10 = iVar.f11576e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f11576e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(this, cVar);
            }
        }
        Object obj = iVar.f11574c;
        ug.a aVar = ug.a.f29706a;
        int i11 = iVar.f11576e;
        if (i11 == 0) {
            pg.q.b(obj);
            try {
                ae.m mVar = this.f11600d;
                if (mVar == null) {
                    throw new g8.a(6, "not_configured", (String) null);
                }
                Task taskA = mVar.a("deleteAccount").a(a0.f22708a);
                iVar.f11572a = this;
                iVar.f11573b = this;
                iVar.f11576e = 1;
                if (c.a(taskA, iVar) != aVar) {
                    pVar2 = this;
                    pVar3 = pVar2;
                }
                return aVar;
            } catch (Throwable th2) {
                th = th2;
                pVar = this;
                objA = pg.q.a(th);
                pVar.getClass();
                Throwable thA = pg.p.a(objA);
                if (thA != null) {
                }
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pVar = iVar.f11572a;
                try {
                    pg.q.b(obj);
                    objA = f0.f21461a;
                } catch (Throwable th3) {
                    th = th3;
                    objA = pg.q.a(th);
                    pVar.getClass();
                    Throwable thA2 = pg.p.a(objA);
                    if (thA2 != null) {
                    }
                }
                pVar.getClass();
                Throwable thA22 = pg.p.a(objA);
                return thA22 != null ? pg.q.a(c.b(thA22)) : objA;
            }
            pVar2 = iVar.f11573b;
            pVar3 = iVar.f11572a;
            try {
                pg.q.b(obj);
            } catch (Throwable th4) {
                th = th4;
                pVar = pVar2;
                objA = pg.q.a(th);
                pVar.getClass();
                Throwable thA222 = pg.p.a(objA);
                if (thA222 != null) {
                }
            }
        }
        iVar.f11572a = pVar2;
        iVar.f11573b = null;
        iVar.f11576e = 2;
        if (pVar3.n(iVar) != aVar) {
            pVar = pVar2;
            objA = f0.f21461a;
            pVar.getClass();
            Throwable thA2222 = pg.p.a(objA);
            if (thA2222 != null) {
            }
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(vg.c cVar) {
        j jVar;
        p pVar;
        String str;
        Object objA;
        Throwable thA;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i10 = jVar.f11581e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                jVar.f11581e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                jVar = new j(this, cVar);
            }
        }
        Object objA2 = jVar.f11579c;
        ug.a aVar = ug.a.f29706a;
        int i11 = jVar.f11581e;
        if (i11 == 0) {
            pg.q.b(objA2);
            ae.m mVar = this.f11600d;
            if (mVar == null) {
                return f0.f21461a;
            }
            String str2 = this.f11609m;
            try {
                Task taskA = mVar.a("ensureUser").a(str2 != null ? qg.j0.b(new pg.n("consentVersion", str2)) : a0.f22708a);
                jVar.f11577a = this;
                jVar.f11578b = str2;
                jVar.f11581e = 1;
                objA2 = c.a(taskA, jVar);
                if (objA2 == aVar) {
                    return aVar;
                }
                pVar = this;
                str = str2;
            } catch (Throwable th2) {
                th = th2;
                pVar = this;
                str = str2;
                objA = pg.q.a(th);
                if (!(objA instanceof p.a)) {
                }
                thA = pg.p.a(objA);
                if (thA != null) {
                }
                return f0.f21461a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = jVar.f11578b;
            pVar = jVar.f11577a;
            try {
                pg.q.b(objA2);
            } catch (Throwable th3) {
                th = th3;
                objA = pg.q.a(th);
                if (!(objA instanceof p.a)) {
                }
                thA = pg.p.a(objA);
                if (thA != null) {
                }
                return f0.f21461a;
            }
        }
        objA = (ae.x) objA2;
        if (!(objA instanceof p.a)) {
            if (kotlin.jvm.internal.r.a(pVar.f11609m, str)) {
                pVar.f11609m = null;
            }
        }
        thA = pg.p.a(objA);
        if (thA != null) {
            Log.w("AccountRepository", "ensureUser failed", thA);
        }
        return f0.f21461a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(vg.c cVar) throws g8.a {
        l lVar;
        qd.p pVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i10 = lVar.f11587c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                lVar.f11587c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                lVar = new l(this, cVar);
            }
        }
        Object objA = lVar.f11585a;
        ug.a aVar = ug.a.f29706a;
        int i11 = lVar.f11587c;
        if (i11 == 0) {
            pg.q.b(objA);
            FirebaseAuth firebaseAuth = this.f11599c;
            if (firebaseAuth == null || (pVar = firebaseAuth.f6832f) == null) {
                throw new g8.a(6, "not_signed_in", (String) null);
            }
            Task<qd.q> taskD = FirebaseAuth.getInstance(pVar.l()).d(pVar, false);
            kotlin.jvm.internal.r.d(taskD, "getIdToken(...)");
            lVar.f11587c = 1;
            objA = c.a(taskD, lVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(objA);
        }
        String str = ((qd.q) objA).f22691a;
        if (str != null) {
            return str;
        }
        throw new g8.a(6, "not_signed_in", (String) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable h(vg.c cVar) {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i10 = mVar.f11590c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                mVar.f11590c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                mVar = new m(this, cVar);
            }
        }
        Object objA = mVar.f11588a;
        ug.a aVar = ug.a.f29706a;
        int i11 = mVar.f11590c;
        z zVar = z.f22752a;
        if (i11 == 0) {
            pg.q.b(objA);
            ae.m mVar2 = this.f11600d;
            if (mVar2 == null) {
                return zVar;
            }
            Task taskA = mVar2.a("listHistory").a(a0.f22708a);
            mVar.f11590c = 1;
            objA = c.a(taskA, mVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(objA);
        }
        Object obj = ((ae.x) objA).f522a;
        Map map = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map != null ? map.get("sessions") : null;
        z zVar2 = obj2 instanceof List ? (List) obj2 : null;
        if (zVar2 != null) {
            zVar = zVar2;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : zVar) {
            if (obj3 instanceof Map) {
                arrayList.add(obj3);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable i(String str, vg.c cVar) {
        n nVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i10 = nVar.f11593c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                nVar.f11593c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                nVar = new n(this, cVar);
            }
        }
        Object objA = nVar.f11591a;
        ug.a aVar = ug.a.f29706a;
        int i11 = nVar.f11593c;
        z zVar = z.f22752a;
        if (i11 == 0) {
            pg.q.b(objA);
            ae.m mVar = this.f11600d;
            if (mVar == null) {
                return zVar;
            }
            Task taskA = mVar.a("listTurns").a(qg.j0.b(new pg.n("sessionId", str)));
            nVar.f11593c = 1;
            objA = c.a(taskA, nVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(objA);
        }
        Object obj = ((ae.x) objA).f522a;
        Map map = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map != null ? map.get("turns") : null;
        z zVar2 = obj2 instanceof List ? (List) obj2 : null;
        if (zVar2 != null) {
            zVar = zVar2;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : zVar) {
            if (obj3 instanceof Map) {
                arrayList.add(obj3);
            }
        }
        return arrayList;
    }

    public final String j() throws NoSuchAlgorithmException {
        qd.p pVar;
        String strJ;
        FirebaseAuth firebaseAuth = this.f11599c;
        if (firebaseAuth == null || (pVar = firebaseAuth.f6832f) == null || (strJ = pVar.j()) == null) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = strJ.getBytes(mh.a.f18238b);
        kotlin.jvm.internal.r.d(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        kotlin.jvm.internal.r.d(bArrDigest, "digest(...)");
        return qg.o.y(bArrDigest, "", new f(), 30);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, String str2, vg.c cVar) {
        o oVar;
        Object objA;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i10 = oVar.f11596c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                oVar.f11596c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                oVar = new o(this, cVar);
            }
        }
        Object objA2 = oVar.f11594a;
        ug.a aVar = ug.a.f29706a;
        int i11 = oVar.f11596c;
        try {
            if (i11 == 0) {
                pg.q.b(objA2);
                ae.m mVar = this.f11600d;
                if (mVar == null) {
                    return null;
                }
                Task taskA = mVar.a("getTurn").a(k0.d(new pg.n("sessionId", str), new pg.n("turnId", str2)));
                oVar.f11596c = 1;
                objA2 = c.a(taskA, oVar);
                if (objA2 == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(objA2);
            }
            Object obj = ((ae.x) objA2).f522a;
            objA = obj instanceof Map ? (Map) obj : null;
        } catch (Throwable th2) {
            objA = pg.q.a(th2);
        }
        if (objA instanceof p.a) {
            return null;
        }
        return objA;
    }

    public final void l() {
        ae.m mVar = this.f11600d;
        if (mVar == null) {
            return;
        }
        FirebaseAuth firebaseAuth = this.f11599c;
        if ((firebaseAuth != null ? firebaseAuth.f6832f : null) == null) {
            return;
        }
        l2 l2Var = this.f11608l;
        if (l2Var != null) {
            l2Var.cancel((CancellationException) null);
        }
        this.f11608l = ph.h.c(this.f11607k, null, null, new a(mVar, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0136, code lost:
    
        if (r0.f(r4) != r5) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Activity context, String str, vg.c cVar) {
        q qVar;
        Object objA;
        Object obj;
        String string;
        FirebaseAuth firebaseAuth;
        p pVar;
        p pVar2;
        String str2;
        d4.m mVar;
        p pVar3;
        p pVar4;
        String str3;
        Object obj2;
        Object obj3 = "Unexpected credential ";
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i10 = qVar.f11620g;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                qVar.f11620g = i10 - PKIFailureInfo.systemUnavail;
            } else {
                qVar = new q(this, cVar);
            }
        }
        Object obj4 = qVar.f11618e;
        ug.a aVar = ug.a.f29706a;
        int i11 = qVar.f11620g;
        try {
            if (i11 == 0) {
                pg.q.b(obj4);
                try {
                    FirebaseAuth firebaseAuth2 = this.f11599c;
                    if (firebaseAuth2 == null) {
                        throw new g8.a(6, "not_configured", (String) null);
                    }
                    Integer num = new Integer(this.f11597a.getResources().getIdentifier("default_web_client_id", "string", this.f11597a.getPackageName()));
                    if (num.intValue() == 0) {
                        num = null;
                    }
                    if (num == null || (string = this.f11597a.getString(num.intValue())) == null) {
                        throw new g8.a(6, "not_configured", (String) null);
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new lb.b(string));
                    x0 x0Var = new x0(qg.x.c0(arrayList));
                    try {
                        kotlin.jvm.internal.r.e(context, "context");
                        d4.u uVar = new d4.u(context);
                        qVar.f11614a = str;
                        qVar.f11615b = this;
                        qVar.f11616c = firebaseAuth2;
                        qVar.f11617d = this;
                        qVar.f11620g = 1;
                        Object objA2 = uVar.a(context, x0Var, qVar);
                        if (objA2 != aVar) {
                            obj4 = objA2;
                            firebaseAuth = firebaseAuth2;
                            pVar = this;
                            pVar2 = pVar;
                            str2 = str;
                            mVar = ((y0) obj4).f7367a;
                            if (mVar instanceof v0) {
                            }
                            throw new g8.a(4, "sign_in_failed", "Unexpected credential " + mVar.f7352a);
                        }
                        return aVar;
                    } catch (e4.m e10) {
                        e = e10;
                        throw new g8.a("cancelled", e.getMessage(), e);
                    } catch (e4.t e11) {
                        e = e11;
                        throw new g8.a("no_google_account", e.getMessage(), e);
                    } catch (e4.o e12) {
                        e = e12;
                        throw new g8.a("sign_in_failed", e.getMessage(), e);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obj3 = this;
                    objA = pg.q.a(th);
                    obj = obj3;
                    obj.getClass();
                    Throwable thA = pg.p.a(objA);
                    if (thA != null) {
                    }
                }
            } else if (i11 == 1) {
                pVar = qVar.f11617d;
                firebaseAuth = (FirebaseAuth) qVar.f11616c;
                pVar2 = qVar.f11615b;
                str2 = (String) qVar.f11614a;
                try {
                    try {
                        pg.q.b(obj4);
                        mVar = ((y0) obj4).f7367a;
                        if ((mVar instanceof v0) || !kotlin.jvm.internal.r.a(mVar.f7352a, "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL")) {
                            throw new g8.a(4, "sign_in_failed", "Unexpected credential " + mVar.f7352a);
                        }
                        Task<Object> taskB = firebaseAuth.b(new qd.s(d.a.a(mVar.f7353b).f16931c, null));
                        kotlin.jvm.internal.r.d(taskB, "signInWithCredential(...)");
                        qVar.f11614a = str2;
                        qVar.f11615b = pVar2;
                        qVar.f11616c = pVar;
                        qVar.f11617d = null;
                        qVar.f11620g = 2;
                        if (c.a(taskB, qVar) != aVar) {
                            pVar3 = pVar;
                            pVar4 = pVar2;
                            str3 = str2;
                            pVar4.f11609m = str3;
                            qVar.f11614a = pVar4;
                            qVar.f11615b = pVar3;
                            qVar.f11616c = null;
                            qVar.f11620g = 3;
                            obj2 = pVar3;
                        }
                        return aVar;
                    } catch (Throwable th3) {
                        th = th3;
                        obj3 = pVar;
                        objA = pg.q.a(th);
                        obj = obj3;
                        obj.getClass();
                        Throwable thA2 = pg.p.a(objA);
                        if (thA2 != null) {
                        }
                    }
                } catch (e4.m e13) {
                    e = e13;
                    throw new g8.a("cancelled", e.getMessage(), e);
                } catch (e4.t e14) {
                    e = e14;
                    throw new g8.a("no_google_account", e.getMessage(), e);
                } catch (e4.o e15) {
                    e = e15;
                    throw new g8.a("sign_in_failed", e.getMessage(), e);
                }
            } else if (i11 == 2) {
                p pVar5 = (p) qVar.f11616c;
                pVar4 = qVar.f11615b;
                str3 = (String) qVar.f11614a;
                pg.q.b(obj4);
                pVar3 = pVar5;
                pVar4.f11609m = str3;
                qVar.f11614a = pVar4;
                qVar.f11615b = pVar3;
                qVar.f11616c = null;
                qVar.f11620g = 3;
                obj2 = pVar3;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj5 = qVar.f11615b;
                pVar4 = (p) qVar.f11614a;
                pg.q.b(obj4);
                obj2 = obj5;
                pVar4.l();
                objA = f0.f21461a;
                obj = obj2;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        obj.getClass();
        Throwable thA22 = pg.p.a(objA);
        return thA22 != null ? pg.q.a(c.b(thA22)) : objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(vg.c cVar) {
        r rVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i10 = rVar.f11623c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                rVar.f11623c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                rVar = new r(this, cVar);
            }
        }
        Object obj = rVar.f11621a;
        ug.a aVar = ug.a.f29706a;
        int i11 = rVar.f11623c;
        try {
            if (i11 == 0) {
                pg.q.b(obj);
                FirebaseAuth firebaseAuth = this.f11599c;
                if (firebaseAuth != null) {
                    firebaseAuth.c();
                }
                d4.u uVar = new d4.u(this.f11597a);
                d4.a aVar2 = new d4.a();
                rVar.f11623c = 1;
                if (uVar.b(aVar2, rVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            f0 f0Var = f0.f21461a;
        } catch (Throwable th2) {
            pg.q.a(th2);
        }
        return f0.f21461a;
    }
}
