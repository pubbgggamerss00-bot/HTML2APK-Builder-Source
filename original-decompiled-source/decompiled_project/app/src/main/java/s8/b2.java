package s8;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.l;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.yalantis.ucrop.view.CropImageView;
import j2.j2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p0.j5;
import p0.y7;
import p5.s0;
import q1.i2;
import s6.d;
import s8.e2;
import t0.f2;
import w0.a;
import w0.b;
import w1.d;
import w1.g;
import x0.h2;
import x0.j;
import x0.s3;
import x0.w2;

/* loaded from: classes.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public static final List<pg.t<e2, w1.d, w1.d>> f24610a;

    static {
        e2.j jVar = e2.j.f24640c;
        w1.d dVarA = j5.a();
        w1.d dVarB = q0.b.f21642a;
        if (dVarB == null) {
            d.a aVar = new d.a("Outlined.Home", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i10 = w1.m.f31210a;
            i2 i2Var = new i2(q1.b1.f21648b);
            w1.e eVar = new w1.e();
            eVar.h(12.0f, 5.69f);
            eVar.g(5.0f, 4.5f);
            eVar.k(18.0f);
            eVar.e(-2.0f);
            eVar.l(-6.0f);
            eVar.d(9.0f);
            eVar.l(6.0f);
            eVar.d(7.0f);
            eVar.l(-7.81f);
            eVar.g(5.0f, -4.5f);
            eVar.h(12.0f, 3.0f);
            eVar.f(2.0f, 12.0f);
            eVar.e(3.0f);
            eVar.l(8.0f);
            eVar.e(6.0f);
            eVar.l(-6.0f);
            eVar.e(2.0f);
            eVar.l(6.0f);
            eVar.e(6.0f);
            eVar.l(-8.0f);
            eVar.e(3.0f);
            eVar.f(12.0f, 3.0f);
            eVar.a();
            d.a.a(aVar, eVar.f31100a, 0, i2Var);
            dVarB = aVar.b();
            q0.b.f21642a = dVarB;
        }
        pg.t tVar = new pg.t(jVar, dVarA, dVarB);
        e2.z zVar = e2.z.f24656c;
        w1.d dVarA2 = p0.x0.a();
        w1.d dVarB2 = q0.a.f21641a;
        if (dVarB2 == null) {
            d.a aVar2 = new d.a("Outlined.Build", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i11 = w1.m.f31210a;
            i2 i2Var2 = new i2(q1.b1.f21648b);
            w1.e eVarA = n0.b.a(22.61f, 18.99f, -9.08f, -9.08f);
            eVarA.c(0.93f, -2.34f, 0.45f, -5.1f, -1.44f, -7.0f);
            eVarA.b(9.79f, 0.61f, 6.21f, 0.4f, 3.66f, 2.26f);
            eVarA.f(7.5f, 6.11f);
            eVarA.f(6.08f, 7.52f);
            eVarA.f(2.25f, 3.69f);
            eVarA.b(0.39f, 6.23f, 0.6f, 9.82f, 2.9f, 12.11f);
            eVarA.c(1.86f, 1.86f, 4.57f, 2.35f, 6.89f, 1.48f);
            eVarA.g(9.11f, 9.11f);
            eVarA.c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
            eVarA.g(2.3f, -2.3f);
            eVarA.c(0.4f, -0.38f, 0.4f, -1.01f, CropImageView.DEFAULT_ASPECT_RATIO, -1.41f);
            l9.y.a(eVarA, 19.61f, 20.59f, -9.46f, -9.46f);
            eVarA.c(-0.61f, 0.45f, -1.29f, 0.72f, -2.0f, 0.82f);
            eVarA.c(-1.36f, 0.2f, -2.79f, -0.21f, -3.83f, -1.25f);
            eVarA.b(3.37f, 9.76f, 2.93f, 8.5f, 3.0f, 7.26f);
            eVarA.g(3.09f, 3.09f);
            eVarA.g(4.24f, -4.24f);
            eVarA.g(-3.09f, -3.09f);
            eVarA.c(1.24f, -0.07f, 2.49f, 0.37f, 3.44f, 1.31f);
            eVarA.c(1.08f, 1.08f, 1.49f, 2.57f, 1.24f, 3.96f);
            eVarA.c(-0.12f, 0.71f, -0.42f, 1.37f, -0.88f, 1.96f);
            p0.h.b(eVarA, 9.45f, 9.45f, -0.88f, 0.89f);
            d.a.a(aVar2, eVarA.f31100a, 0, i2Var2);
            dVarB2 = aVar2.b();
            q0.a.f21641a = dVarB2;
        }
        pg.t tVar2 = new pg.t(zVar, dVarA2, dVarB2);
        e2.u uVar = e2.u.f24651c;
        w1.d dVarA3 = y7.a();
        w1.d dVarB3 = q0.c.f21643a;
        if (dVarB3 == null) {
            d.a aVar3 = new d.a("Outlined.Person", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i12 = w1.m.f31210a;
            i2 i2Var3 = new i2(q1.b1.f21648b);
            w1.e eVar2 = new w1.e();
            eVar2.h(12.0f, 6.0f);
            eVar2.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, 0.9f, 2.0f, 2.0f);
            eVar2.j(-0.9f, 2.0f, -2.0f, 2.0f);
            eVar2.j(-2.0f, -0.9f, -2.0f, -2.0f);
            eVar2.j(0.9f, -2.0f, 2.0f, -2.0f);
            g.n nVar = new g.n(CropImageView.DEFAULT_ASPECT_RATIO, 10.0f);
            ArrayList<w1.g> arrayList = eVar2.f31100a;
            arrayList.add(nVar);
            eVar2.c(2.7f, CropImageView.DEFAULT_ASPECT_RATIO, 5.8f, 1.29f, 6.0f, 2.0f);
            eVar2.f(6.0f, 18.0f);
            eVar2.c(0.23f, -0.72f, 3.31f, -2.0f, 6.0f, -2.0f);
            arrayList.add(new g.n(CropImageView.DEFAULT_ASPECT_RATIO, -12.0f));
            eVar2.b(9.79f, 4.0f, 8.0f, 5.79f, 8.0f, 8.0f);
            eVar2.j(1.79f, 4.0f, 4.0f, 4.0f);
            eVar2.j(4.0f, -1.79f, 4.0f, -4.0f);
            eVar2.j(-1.79f, -4.0f, -4.0f, -4.0f);
            eVar2.a();
            eVar2.h(12.0f, 14.0f);
            eVar2.c(-2.67f, CropImageView.DEFAULT_ASPECT_RATIO, -8.0f, 1.34f, -8.0f, 4.0f);
            eVar2.l(2.0f);
            eVar2.e(16.0f);
            eVar2.l(-2.0f);
            eVar2.c(CropImageView.DEFAULT_ASPECT_RATIO, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
            eVar2.a();
            d.a.a(aVar3, arrayList, 0, i2Var3);
            dVarB3 = aVar3.b();
            q0.c.f21643a = dVarB3;
        }
        f24610a = qg.p.j(tVar, tVar2, new pg.t(uVar, dVarA3, dVarB3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, final boolean z10, final String str2, final String str3, final eh.a aVar, Uri uri, final eh.a aVar2, final boolean z11, final eh.a aVar3, final eh.l lVar, x0.j jVar, final int i10) {
        j.a.C0321a c0321a;
        Boolean boolValueOf;
        p5.s sVar;
        boolean zK;
        Object objG;
        Boolean bool;
        p5.s0 s0Var;
        x0.k kVar;
        p5.s sVar2;
        s3 s3Var;
        tg.e eVar;
        Uri uri2;
        boolean zL;
        Object objG2;
        boolean zL2;
        Object objG3;
        boolean zK2;
        Object objG4;
        Activity activityB;
        boolean z12;
        Object objG5;
        Object objG6;
        Object objG7;
        int i11;
        p5.k0 k0Var;
        x0.k kVarP = jVar.p(-1853137406);
        int i12 = i10 | (kVarP.K(str) ? 4 : 2) | (kVarP.c(z10) ? 32 : 16) | (kVarP.K(str2) ? 256 : 128) | (kVarP.K(str3) ? 2048 : 1024) | (kVarP.l(aVar) ? 16384 : 8192) | (kVarP.l(uri) ? 131072 : 65536) | (kVarP.l(aVar2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (kVarP.c(z11) ? 8388608 : 4194304) | (kVarP.l(aVar3) ? 67108864 : 33554432) | (kVarP.l(lVar) ? PKIFailureInfo.duplicateCertReq : 268435456);
        if ((i12 & 306783379) == 306783378 && kVarP.s()) {
            kVarP.v();
            uri2 = uri;
            kVar = kVarP;
        } else {
            kVarP.r0();
            if ((i10 & 1) != 0 && !kVarP.a0()) {
                kVarP.v();
            }
            kVarP.U();
            s3 s3Var2 = AndroidCompositionLocals_androidKt.f1281b;
            final Context context = (Context) kVarP.f(s3Var2);
            Object[] objArrCopyOf = Arrays.copyOf(new p5.b1[0], 0);
            q5.t tVar = new q5.t();
            eh.l lVar2 = new eh.l() { // from class: q5.u
                @Override // eh.l
                public final Object invoke(Object obj) {
                    Bundle bundle = (Bundle) obj;
                    s0 s0VarA = v.a(context);
                    if (bundle != null) {
                        bundle.setClassLoader(s0VarA.f21303a.getClassLoader());
                    }
                    s5.l lVar3 = s0VarA.f21304b;
                    LinkedHashMap linkedHashMap = lVar3.f24491m;
                    if (bundle != null) {
                        lVar3.f24482d = bundle.containsKey("android-support-nav:controller:navigatorState") ? c6.b.f(bundle, "android-support-nav:controller:navigatorState") : null;
                        lVar3.f24483e = bundle.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) c6.b.e(bundle, "android-support-nav:controller:backStack", kotlin.jvm.internal.h0.a(Bundle.class)).toArray(new Bundle[0]) : null;
                        linkedHashMap.clear();
                        if (bundle.containsKey("android-support-nav:controller:backStackDestIds") && bundle.containsKey("android-support-nav:controller:backStackIds")) {
                            int[] iArrC = c6.b.c(bundle, "android-support-nav:controller:backStackDestIds");
                            ArrayList arrayListH = c6.b.h(bundle, "android-support-nav:controller:backStackIds");
                            int length = iArrC.length;
                            int i13 = 0;
                            int i14 = 0;
                            while (i13 < length) {
                                int i15 = i14 + 1;
                                lVar3.f24490l.put(Integer.valueOf(iArrC[i13]), !kotlin.jvm.internal.r.a(arrayListH.get(i14), "") ? (String) arrayListH.get(i14) : null);
                                i13++;
                                i14 = i15;
                            }
                        }
                        if (bundle.containsKey("android-support-nav:controller:backStackStates")) {
                            ArrayList arrayListH2 = c6.b.h(bundle, "android-support-nav:controller:backStackStates");
                            int size = arrayListH2.size();
                            int i16 = 0;
                            while (i16 < size) {
                                Object obj2 = arrayListH2.get(i16);
                                i16++;
                                String str4 = (String) obj2;
                                String key = "android-support-nav:controller:backStackStates:" + str4;
                                kotlin.jvm.internal.r.e(key, "key");
                                if (bundle.containsKey(key)) {
                                    String key2 = "android-support-nav:controller:backStackStates:" + str4;
                                    kotlin.jvm.internal.r.e(key2, "key");
                                    ArrayList arrayListE = c6.b.e(bundle, key2, kotlin.jvm.internal.h0.a(Bundle.class));
                                    qg.l lVar4 = new qg.l(arrayListE.size());
                                    int size2 = arrayListE.size();
                                    int i17 = 0;
                                    while (i17 < size2) {
                                        Object obj3 = arrayListE.get(i17);
                                        i17++;
                                        lVar4.addLast(new p5.t((Bundle) obj3));
                                    }
                                    linkedHashMap.put(str4, lVar4);
                                }
                            }
                        }
                    }
                    if (bundle != null) {
                        boolean z13 = bundle.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                        Boolean boolValueOf2 = (z13 || !bundle.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z13) : null;
                        s0VarA.f21307e = boolValueOf2 != null ? boolValueOf2.booleanValue() : false;
                    }
                    return s0VarA;
                }
            };
            g1.n nVar = g1.m.f11307a;
            g1.n nVar2 = new g1.n(tVar, lVar2);
            boolean zL3 = kVarP.l(context);
            Object objG8 = kVarP.g();
            j.a.C0321a c0321a2 = j.a.f31715a;
            if (zL3 || objG8 == c0321a2) {
                objG8 = new b9.k(context, 2);
                kVarP.C(objG8);
            }
            p5.s0 s0Var2 = (p5.s0) b0.a0.d(objArrCopyOf, nVar2, (eh.a) objG8, kVarP, 0, 4);
            x0.n1 n1VarA = bg.b.a(new sh.k0(s0Var2.f21304b.f24504z), null, null, kVarP, 48, 2);
            p5.s sVar3 = (p5.s) n1VarA.getValue();
            String str4 = (sVar3 == null || (k0Var = sVar3.f21269b) == null) ? null : k0Var.f21235b.f24512e;
            kVarP.L(-543282813);
            boolean zK3 = ((1879048192 & i12) == 536870912) | kVarP.K(str4);
            Object objG9 = kVarP.g();
            if (zK3) {
                c0321a = c0321a2;
            } else {
                c0321a = c0321a2;
                if (objG9 == c0321a) {
                }
                kVarP.T(false);
                x0.o0.d((eh.p) objG9, str4, kVarP);
                boolean zA = q8.x1.a(kVarP);
                boolValueOf = Boolean.valueOf(z11);
                sVar = (p5.s) n1VarA.getValue();
                kVarP.L(-543277446);
                zK = ((i12 & 29360128) != 8388608) | kVarP.K(n1VarA) | kVarP.l(uri) | kVarP.l(s0Var2) | ((234881024 & i12) != 67108864);
                objG = kVarP.g();
                if (!zK || objG == c0321a) {
                    bool = boolValueOf;
                    s0Var = s0Var2;
                    kVar = kVarP;
                    sVar2 = sVar;
                    s3Var = s3Var2;
                    eVar = null;
                    r1 r1Var = new r1(z11, uri, s0Var, aVar3, n1VarA, null);
                    uri2 = uri;
                    n1VarA = n1VarA;
                    kVar.C(r1Var);
                    objG = r1Var;
                } else {
                    kVar = kVarP;
                    bool = boolValueOf;
                    s0Var = s0Var2;
                    sVar2 = sVar;
                    s3Var = s3Var2;
                    eVar = null;
                    uri2 = uri;
                }
                kVar.T(false);
                x0.o0.e(bool, sVar2, (eh.p) objG, kVar);
                Boolean boolValueOf2 = Boolean.valueOf(((p5.s) n1VarA.getValue()) == null);
                kVar.L(-543258904);
                zL = kVar.l(s0Var) | ((i12 & 896) != 256);
                objG2 = kVar.g();
                if (!zL || objG2 == c0321a) {
                    objG2 = new t1(s0Var, str2, eVar);
                    kVar.C(objG2);
                }
                kVar.T(false);
                x0.o0.e(str2, boolValueOf2, (eh.p) objG2, kVar);
                Boolean boolValueOf3 = Boolean.valueOf(((p5.s) n1VarA.getValue()) == null);
                kVar.L(-543247989);
                zL2 = kVar.l(s0Var) | ((i12 & V4Signature.MAX_SIGNING_INFOS_SIZE) != 2048) | ((57344 & i12) != 16384);
                objG3 = kVar.g();
                if (!zL2 || objG3 == c0321a) {
                    objG3 = new u1(s0Var, str3, aVar, eVar);
                    kVar.C(objG3);
                }
                kVar.T(false);
                x0.o0.e(str3, boolValueOf3, (eh.p) objG3, kVar);
                p5.s sVar4 = (p5.s) n1VarA.getValue();
                kVar.L(-543237148);
                zK2 = ((i12 & 3670016) != 1048576) | kVar.K(n1VarA) | kVar.l(uri2) | kVar.l(s0Var);
                objG4 = kVar.g();
                if (!zK2 || objG4 == c0321a) {
                    objG4 = new w1(uri2, n1VarA, s0Var, aVar2, null);
                    kVar.C(objG4);
                }
                kVar.T(false);
                x0.o0.e(uri2, sVar4, (eh.p) objG4, kVar);
                Context context2 = (Context) kVar.f(s3Var);
                activityB = (Activity) kVar.f(c.h.f4305a);
                if (activityB == null) {
                    activityB = k9.j.b(context2);
                }
                kVar.L(-543220252);
                if (activityB == null) {
                    kVar.f(AndroidCompositionLocals_androidKt.f1280a);
                    f3.d dVar = (f3.d) kVar.f(j2.f14779h);
                    s6.d.f24523a.getClass();
                    d.a.C0272a c0272a = d.a.f24525b;
                    s6.e it = s6.e.f24527b;
                    c0272a.getClass();
                    kotlin.jvm.internal.r.e(it, "it");
                    r6.a aVar4 = it.a(activityB).f24522a;
                    aVar4.getClass();
                    long jP = dVar.p(q1.x1.d(new Rect(aVar4.f23212a, aVar4.f23213b, aVar4.f23214c, aVar4.f23215d)).d());
                    Set<w0.b> set = w0.b.f31036b;
                    Set<w0.a> set2 = w0.a.f31032b;
                    float fB = f3.k.b(jP);
                    float f10 = 0;
                    if (Float.compare(fB, f10) < 0) {
                        throw new IllegalArgumentException("Width must not be negative");
                    }
                    if (set.isEmpty()) {
                        throw new IllegalArgumentException("Must support at least one size class");
                    }
                    List<w0.b> list = w0.b.f31037c;
                    int size = list.size();
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        if (i13 >= size) {
                            i11 = i14;
                            break;
                        }
                        int i15 = size;
                        i11 = list.get(i13).f31039a;
                        int i16 = i13;
                        if (set.contains(new w0.b(i11))) {
                            if (Float.compare(fB, b.a.a(i11)) >= 0) {
                                break;
                            } else {
                                i14 = i11;
                            }
                        }
                        i13 = i16 + 1;
                        size = i15;
                    }
                    Set<w0.a> set3 = w0.a.f31032b;
                    float fA = f3.k.a(jP);
                    if (Float.compare(fA, f10) < 0) {
                        throw new IllegalArgumentException("Width must not be negative");
                    }
                    if (set2.isEmpty()) {
                        throw new IllegalArgumentException("Must support at least one size class");
                    }
                    List<w0.a> list2 = w0.a.f31033c;
                    int size2 = list2.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        int i18 = list2.get(i17).f31035a;
                        if (set2.contains(new w0.a(i18)) && Float.compare(fA, a.C0313a.a(i18)) >= 0) {
                            break;
                        }
                    }
                    Set<w0.b> set4 = w0.b.f31036b;
                    z12 = i11 == 2;
                } else {
                    z12 = false;
                }
                kVar.T(false);
                float fN0 = ((f3.d) kVar.f(j2.f14779h)).N0(48);
                long j10 = ((t0.e2) kVar.f(f2.f25858a)).f25768n;
                kVar.L(-543209504);
                objG5 = kVar.g();
                if (objG5 == c0321a) {
                    objG5 = new v8.q();
                    kVar.C(objG5);
                }
                v8.q qVar = (v8.q) objG5;
                kVar.T(false);
                objG6 = kVar.g();
                if (objG6 == c0321a) {
                    w2 w2Var = new w2(kVar.x());
                    kVar.C(w2Var);
                    objG6 = w2Var;
                }
                ph.i0 i0Var = (ph.i0) objG6;
                kVar.L(-543204830);
                objG7 = kVar.g();
                if (objG7 == c0321a) {
                    objG7 = new q8.w0(i0Var);
                    kVar.C(objG7);
                }
                q8.w0 w0Var = (q8.w0) objG7;
                kVar.T(false);
                x0.y.b(new x0.f2[]{v8.k.f30705a.a(qVar), q8.p0.f22355a.a(w0Var)}, f1.c.b(-659541310, new o1(w0Var, qVar, s0Var, z12, j10, fN0, z10, str, zA), kVar), kVar, 56);
            }
            objG9 = new p1(lVar, str4, null);
            kVarP.C(objG9);
            kVarP.T(false);
            x0.o0.d((eh.p) objG9, str4, kVarP);
            boolean zA2 = q8.x1.a(kVarP);
            boolValueOf = Boolean.valueOf(z11);
            sVar = (p5.s) n1VarA.getValue();
            kVarP.L(-543277446);
            zK = ((i12 & 29360128) != 8388608) | kVarP.K(n1VarA) | kVarP.l(uri) | kVarP.l(s0Var2) | ((234881024 & i12) != 67108864);
            objG = kVarP.g();
            if (zK) {
                bool = boolValueOf;
                s0Var = s0Var2;
                kVar = kVarP;
                sVar2 = sVar;
                s3Var = s3Var2;
                eVar = null;
                r1 r1Var2 = new r1(z11, uri, s0Var, aVar3, n1VarA, null);
                uri2 = uri;
                n1VarA = n1VarA;
                kVar.C(r1Var2);
                objG = r1Var2;
                kVar.T(false);
                x0.o0.e(bool, sVar2, (eh.p) objG, kVar);
                Boolean boolValueOf22 = Boolean.valueOf(((p5.s) n1VarA.getValue()) == null);
                kVar.L(-543258904);
                zL = kVar.l(s0Var) | ((i12 & 896) != 256);
                objG2 = kVar.g();
                if (!zL) {
                    objG2 = new t1(s0Var, str2, eVar);
                    kVar.C(objG2);
                    kVar.T(false);
                    x0.o0.e(str2, boolValueOf22, (eh.p) objG2, kVar);
                    Boolean boolValueOf32 = Boolean.valueOf(((p5.s) n1VarA.getValue()) == null);
                    kVar.L(-543247989);
                    zL2 = kVar.l(s0Var) | ((i12 & V4Signature.MAX_SIGNING_INFOS_SIZE) != 2048) | ((57344 & i12) != 16384);
                    objG3 = kVar.g();
                    if (!zL2) {
                        objG3 = new u1(s0Var, str3, aVar, eVar);
                        kVar.C(objG3);
                        kVar.T(false);
                        x0.o0.e(str3, boolValueOf32, (eh.p) objG3, kVar);
                        p5.s sVar42 = (p5.s) n1VarA.getValue();
                        kVar.L(-543237148);
                        zK2 = ((i12 & 3670016) != 1048576) | kVar.K(n1VarA) | kVar.l(uri2) | kVar.l(s0Var);
                        objG4 = kVar.g();
                        if (!zK2) {
                            objG4 = new w1(uri2, n1VarA, s0Var, aVar2, null);
                            kVar.C(objG4);
                            kVar.T(false);
                            x0.o0.e(uri2, sVar42, (eh.p) objG4, kVar);
                            Context context22 = (Context) kVar.f(s3Var);
                            activityB = (Activity) kVar.f(c.h.f4305a);
                            if (activityB == null) {
                            }
                            kVar.L(-543220252);
                            if (activityB == null) {
                            }
                            kVar.T(false);
                            float fN02 = ((f3.d) kVar.f(j2.f14779h)).N0(48);
                            long j102 = ((t0.e2) kVar.f(f2.f25858a)).f25768n;
                            kVar.L(-543209504);
                            objG5 = kVar.g();
                            if (objG5 == c0321a) {
                            }
                            v8.q qVar2 = (v8.q) objG5;
                            kVar.T(false);
                            objG6 = kVar.g();
                            if (objG6 == c0321a) {
                            }
                            ph.i0 i0Var2 = (ph.i0) objG6;
                            kVar.L(-543204830);
                            objG7 = kVar.g();
                            if (objG7 == c0321a) {
                            }
                            q8.w0 w0Var2 = (q8.w0) objG7;
                            kVar.T(false);
                            x0.y.b(new x0.f2[]{v8.k.f30705a.a(qVar2), q8.p0.f22355a.a(w0Var2)}, f1.c.b(-659541310, new o1(w0Var2, qVar2, s0Var, z12, j102, fN02, z10, str, zA2), kVar), kVar, 56);
                        }
                    }
                }
            }
        }
        h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            final Uri uri3 = uri2;
            h2VarV.f31703d = new eh.p(str, z10, str2, str3, aVar, uri3, aVar2, z11, aVar3, lVar, i10) { // from class: s8.a

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f24592a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f24593b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f24594c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f24595d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ eh.a f24596e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Uri f24597f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ eh.a f24598g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f24599h;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ eh.a f24600j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ eh.l f24601k;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    b2.a(this.f24592a, this.f24593b, this.f24594c, this.f24595d, this.f24596e, this.f24597f, this.f24598g, this.f24599h, this.f24600j, this.f24601k, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0095 A[Catch: IllegalStateException -> 0x0085, IllegalArgumentException -> 0x0087, p -> 0x00cc, TryCatch #1 {p -> 0x00cc, blocks: (B:12:0x0033, B:48:0x00b6, B:21:0x004b, B:23:0x0063, B:25:0x006c, B:27:0x0076, B:29:0x007a, B:31:0x0082, B:36:0x0089, B:40:0x0098, B:39:0x0095, B:41:0x009e, B:42:0x00a3, B:43:0x00a4), top: B:56:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(p5.x xVar, androidx.lifecycle.t tVar, String str, eh.l lVar, vg.c cVar) {
        y1 y1Var;
        boolean zBooleanValue;
        androidx.lifecycle.l lifecycle;
        l.b bVar;
        qh.g gVarH0;
        boolean zF0;
        String str2;
        Object objValueOf;
        String str3 = str;
        if (cVar instanceof y1) {
            y1Var = (y1) cVar;
            int i10 = y1Var.f24762c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                y1Var.f24762c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                y1Var = new y1(cVar);
            }
        }
        Object objA = y1Var.f24761b;
        ug.a aVar = ug.a.f29706a;
        int i11 = y1Var.f24762c;
        boolean z10 = true;
        if (i11 == 0) {
            pg.q.b(objA);
            try {
                lifecycle = tVar.getLifecycle();
                bVar = l.b.f2323e;
                wh.c cVar2 = ph.z0.f21632a;
                gVarH0 = uh.o.f29764a.H0();
                zF0 = gVarH0.F0(y1Var.getContext());
            } catch (IllegalArgumentException e10) {
                e = e10;
                Log.w("AppNavigation", "Dropped navigation to " + str3, e);
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            } catch (IllegalStateException e11) {
                e = e11;
                Log.w("AppNavigation", "Dropped navigation to " + str3, e);
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            if (!zF0) {
                if (lifecycle.b() == l.b.f2319a) {
                    throw new androidx.lifecycle.p(null);
                }
                if (lifecycle.b().compareTo(bVar) >= 0) {
                    if (tVar instanceof p5.s) {
                        p5.s sVarG = xVar.f21304b.g();
                        if (!kotlin.jvm.internal.r.a(sVarG != null ? sVarG.f21273f : null, ((p5.s) tVar).f21273f)) {
                            z10 = false;
                        }
                        objValueOf = Boolean.valueOf(z10);
                        str2 = str3;
                        zBooleanValue = ((Boolean) objValueOf).booleanValue();
                    } else {
                        xVar.b(lVar, str3);
                        objValueOf = Boolean.valueOf(z10);
                        str2 = str3;
                        zBooleanValue = ((Boolean) objValueOf).booleanValue();
                    }
                    return Boolean.valueOf(zBooleanValue);
                }
            }
            x1 x1Var = new x1(tVar, xVar, str3, lVar);
            y1Var.f24760a = str3;
            y1Var.f24762c = 1;
            objA = androidx.lifecycle.i1.a(lifecycle, zF0, gVarH0, x1Var, y1Var);
            if (objA == aVar) {
                return aVar;
            }
            str2 = str3;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = y1Var.f24760a;
            try {
                pg.q.b(objA);
            } catch (IllegalArgumentException e12) {
                e = e12;
                str3 = str2;
                Log.w("AppNavigation", "Dropped navigation to " + str3, e);
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            } catch (IllegalStateException e13) {
                e = e13;
                str3 = str2;
                Log.w("AppNavigation", "Dropped navigation to " + str3, e);
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
        }
        objValueOf = objA;
        zBooleanValue = ((Boolean) objValueOf).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    public static final void c(p5.p0 p0Var, String str, List list, f1.b bVar) {
        q5.s.a(p0Var, str, list, null, new f1.b(1693688840, true, new a2(bVar)), 252);
    }

    public static final void e(p5.x xVar) {
        androidx.lifecycle.v vVar;
        l.b bVar;
        kotlin.jvm.internal.r.e(xVar, "<this>");
        p5.s sVarG = xVar.f21304b.g();
        if (sVarG == null || (vVar = sVarG.f21275h.f24452j) == null || (bVar = vVar.f2361d) == null || bVar.compareTo(l.b.f2323e) < 0 || xVar.a() == null) {
            return;
        }
        try {
            xVar.d();
        } catch (Exception unused) {
        }
    }
}
