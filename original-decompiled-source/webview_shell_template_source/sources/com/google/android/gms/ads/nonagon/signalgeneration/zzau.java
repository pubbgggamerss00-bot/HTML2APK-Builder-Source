package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import b6.v;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.internal.ads.ap;
import com.google.android.gms.internal.ads.as1;
import com.google.android.gms.internal.ads.bo1;
import com.google.android.gms.internal.ads.bs1;
import com.google.android.gms.internal.ads.cf1;
import com.google.android.gms.internal.ads.d0;
import com.google.android.gms.internal.ads.dc1;
import com.google.android.gms.internal.ads.de1;
import com.google.android.gms.internal.ads.ds1;
import com.google.android.gms.internal.ads.f20;
import com.google.android.gms.internal.ads.fc1;
import com.google.android.gms.internal.ads.ff;
import com.google.android.gms.internal.ads.fu0;
import com.google.android.gms.internal.ads.gr1;
import com.google.android.gms.internal.ads.gs0;
import com.google.android.gms.internal.ads.h70;
import com.google.android.gms.internal.ads.hc0;
import com.google.android.gms.internal.ads.he1;
import com.google.android.gms.internal.ads.hs1;
import com.google.android.gms.internal.ads.i60;
import com.google.android.gms.internal.ads.i70;
import com.google.android.gms.internal.ads.ie1;
import com.google.android.gms.internal.ads.ik0;
import com.google.android.gms.internal.ads.jk0;
import com.google.android.gms.internal.ads.k60;
import com.google.android.gms.internal.ads.mf;
import com.google.android.gms.internal.ads.mp;
import com.google.android.gms.internal.ads.nf;
import com.google.android.gms.internal.ads.nn;
import com.google.android.gms.internal.ads.or1;
import com.google.android.gms.internal.ads.p20;
import com.google.android.gms.internal.ads.p60;
import com.google.android.gms.internal.ads.pc1;
import com.google.android.gms.internal.ads.pl1;
import com.google.android.gms.internal.ads.pr1;
import com.google.android.gms.internal.ads.qr1;
import com.google.android.gms.internal.ads.rj1;
import com.google.android.gms.internal.ads.sc1;
import com.google.android.gms.internal.ads.sn;
import com.google.android.gms.internal.ads.wp;
import com.google.android.gms.internal.ads.xr1;
import com.google.android.gms.internal.ads.yb1;
import com.google.android.gms.internal.ads.yo;
import com.google.android.gms.internal.ads.zn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import p.h;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzau extends k60 {
    protected static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final List zzB;
    private final List zzC;
    private final List zzD;
    private final List zzE;
    private final ap zzI;
    private final zzo zzJ;
    private final zzf zzK;
    private final hc0 zzf;
    private Context zzg;
    private final mf zzh;
    private final fc1 zzi;
    private final sc1 zzj;
    private final hs1 zzk;
    private final ScheduledExecutorService zzl;
    private p20 zzm;
    private final fu0 zzp;
    private final cf1 zzq;
    private final VersionInfoParcel zzy;
    private String zzz;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final AtomicInteger zzx = new AtomicInteger(0);
    private final AtomicBoolean zzF = new AtomicBoolean(false);
    private final AtomicBoolean zzG = new AtomicBoolean(false);
    private final AtomicInteger zzH = new AtomicInteger(0);
    private final boolean zzr = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.a7)).booleanValue();
    private final boolean zzs = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.Z6)).booleanValue();
    private final boolean zzt = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.c7)).booleanValue();
    private final boolean zzu = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.e7)).booleanValue();
    private final String zzv = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.d7);
    private final String zzw = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.f7);
    private final String zzA = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.g7);

    public zzau(hc0 hc0Var, Context context, mf mfVar, sc1 sc1Var, hs1 hs1Var, ScheduledExecutorService scheduledExecutorService, fu0 fu0Var, cf1 cf1Var, VersionInfoParcel versionInfoParcel, ap apVar, fc1 fc1Var, zzo zzoVar, zzf zzfVar) {
        List listZzaa;
        this.zzf = hc0Var;
        this.zzg = context;
        this.zzh = mfVar;
        this.zzi = fc1Var;
        this.zzj = sc1Var;
        this.zzk = hs1Var;
        this.zzl = scheduledExecutorService;
        this.zzp = fu0Var;
        this.zzq = cf1Var;
        this.zzy = versionInfoParcel;
        this.zzI = apVar;
        this.zzJ = zzoVar;
        this.zzK = zzfVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.h7)).booleanValue()) {
            this.zzB = zzaa((String) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.i7));
            this.zzC = zzaa((String) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.j7));
            this.zzD = zzaa((String) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.k7));
            listZzaa = zzaa((String) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.l7));
        } else {
            this.zzB = zza;
            this.zzC = zzb;
            this.zzD = zzc;
            listZzaa = zzd;
        }
        this.zzE = listZzaa;
    }

    public static /* bridge */ /* synthetic */ void zzH(zzau zzauVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzauVar.zzO((Uri) it.next())) {
                zzauVar.zzx.getAndIncrement();
                return;
            }
        }
    }

    public static final /* synthetic */ Uri zzQ(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzZ(uri, "nas", str) : uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzac zzR(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.ads.internal.client.zzm zzmVar, int i6, String str3, Bundle bundle, p60 p60Var) {
        dc1 dc1Var = new dc1();
        boolean zEquals = "REWARDED".equals(str2);
        yb1 yb1Var = dc1Var.f3842o;
        if (zEquals) {
            yb1Var.f10916a = 2;
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            yb1Var.f10916a = 3;
        }
        pc1 pc1VarM = this.zzf.m();
        ik0 ik0Var = new ik0();
        ik0Var.f5796a = context;
        if (str == null) {
            str = "adUnitId";
        }
        dc1Var.f3831c = str;
        if (zzmVar == null) {
            zzmVar = new com.google.android.gms.ads.internal.client.zzn().zza();
        }
        dc1Var.f3829a = zzmVar;
        if (zzsVar == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (!str2.equals("NATIVE")) {
                        zzsVar = new com.google.android.gms.ads.internal.client.zzs();
                        break;
                    } else {
                        zzsVar = com.google.android.gms.ads.internal.client.zzs.zzc();
                        break;
                    }
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        zzsVar = com.google.android.gms.ads.internal.client.zzs.zzb();
                        break;
                    }
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        zzsVar = com.google.android.gms.ads.internal.client.zzs.zzd();
                        break;
                    }
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                    }
                    break;
                case 1951953708:
                    if (str2.equals("BANNER")) {
                        zzsVar = new com.google.android.gms.ads.internal.client.zzs(context, AdSize.BANNER);
                        break;
                    }
                    break;
            }
        }
        dc1Var.f3830b = zzsVar;
        dc1Var.s = true;
        dc1Var.f3846t = bundle;
        ik0Var.f5797b = dc1Var.a();
        ik0Var.f5802g = i6;
        pc1VarM.f8028b = new jk0(ik0Var);
        zzax zzaxVar = new zzax();
        zzaxVar.zzb(str2);
        zzaxVar.zzc(str3);
        zzaxVar.zzd(p60Var);
        pc1VarM.f8029c = new zzaz(zzaxVar, null);
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        return pc1VarM.zzc();
    }

    private final c5.a zzS(final String str) {
        final gs0[] gs0VarArr = new gs0[1];
        gr1 gr1VarP = bs1.p(this.zzj.a(), new pr1() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaf
            @Override // com.google.android.gms.internal.ads.pr1
            public final c5.a zza(Object obj) {
                return this.zza.zzv(gs0VarArr, str, (gs0) obj);
            }
        }, this.zzk);
        gr1VarP.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzag
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzJ(gs0VarArr);
            }
        }, this.zzk);
        return bs1.j(bs1.o((xr1) bs1.q(xr1.p(gr1VarP), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.y7)).intValue(), TimeUnit.MILLISECONDS, this.zzl), new pl1() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzam
            @Override // com.google.android.gms.internal.ads.pl1
            public final Object apply(Object obj) {
                int i6 = zzau.zze;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.zzk), Exception.class, new pl1() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
            @Override // com.google.android.gms.internal.ads.pl1
            public final Object apply(Object obj) {
                int i6 = zzau.zze;
                com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, (Exception) obj);
                return null;
            }
        }, this.zzk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzT() {
        zzau zzauVar;
        c5.a aVarZzb;
        if (((Boolean) wp.f10245c.c()).booleanValue()) {
            this.zzJ.zzb();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.Va)).booleanValue()) {
            aVarZzb = bs1.n(new or1() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzad
                @Override // com.google.android.gms.internal.ads.or1
                public final c5.a zza() {
                    return this.zza.zzu();
                }
            }, i70.f5586a);
            zzauVar = this;
        } else {
            zzauVar = this;
            aVarZzb = zzauVar.zzR(this.zzg, null, AdFormat.BANNER.name(), null, null, 0, null, new Bundle(), null).zzb();
        }
        v vVar = new v(2, this);
        aVarZzb.addListener(new as1(0, aVarZzb, vVar), zzauVar.zzf.a());
    }

    private final void zzU() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.u9)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.x9)).booleanValue()) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.B9)).booleanValue() && this.zzF.getAndSet(true)) {
                return;
            }
            zzT();
        }
    }

    private final void zzV(List list, final k3.a aVar, f20 f20Var, boolean z6) {
        c5.a aVarU;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.x7)).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The updating URL feature is not enabled.");
            try {
                f20Var.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e6) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
                return;
            }
        }
        Iterator it = list.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            if (zzO((Uri) it.next())) {
                i6++;
            }
        }
        if (i6 > 1) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (zzO(uri)) {
                aVarU = this.zzk.u(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzah
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.zzn(uri, aVar);
                    }
                });
                if (zzY()) {
                    aVarU = bs1.p(aVarU, new pr1() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzai
                        @Override // com.google.android.gms.internal.ads.pr1
                        public final c5.a zza(Object obj) {
                            zzau zzauVar = this.zza;
                            return bs1.o(zzauVar.zzS("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new pl1(zzauVar, (Uri) obj) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
                                public final /* synthetic */ Uri zza;

                                {
                                    this.zza = uri;
                                }

                                @Override // com.google.android.gms.internal.ads.pl1
                                public final Object apply(Object obj2) {
                                    return zzau.zzQ(this.zza, (String) obj2);
                                }
                            }, zzauVar.zzk);
                        }
                    }, this.zzk);
                } else {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Asset view map is empty.");
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                aVarU = bs1.m(uri);
            }
            arrayList.add(aVarU);
        }
        qr1 qr1Var = new qr1(bo1.l(arrayList), true);
        c cVar = new c(this, f20Var, z6);
        qr1Var.addListener(new as1(0, qr1Var, cVar), this.zzf.a());
    }

    private final void zzW(final List list, final k3.a aVar, f20 f20Var, boolean z6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.x7)).booleanValue()) {
            try {
                f20Var.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e6) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
                return;
            }
        }
        c5.a aVarU = this.zzk.u(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzC(list, aVar);
            }
        });
        if (zzY()) {
            aVarU = bs1.p(aVarU, new pr1() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzap
                @Override // com.google.android.gms.internal.ads.pr1
                public final c5.a zza(Object obj) {
                    return this.zza.zzw((ArrayList) obj);
                }
            }, this.zzk);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Asset view map is empty.");
        }
        b bVar = new b(this, f20Var, z6);
        aVarU.addListener(new as1(0, aVarU, bVar), this.zzf.a());
    }

    private static boolean zzX(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean zzY() {
        Map map;
        p20 p20Var = this.zzm;
        return (p20Var == null || (map = p20Var.f7916t) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzZ(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i6 = iIndexOf + 1;
        return Uri.parse(string.substring(0, i6) + str + "=" + str2 + "&" + string.substring(i6));
    }

    private static final List zzaa(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!rj1.j(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ he1 zzr(c5.a aVar, p60 p60Var) {
        if (ie1.a() && ((Boolean) mp.f7201e.c()).booleanValue()) {
            try {
                he1 he1VarZza = ((zzac) bs1.r(aVar)).zza();
                String str = p60Var.f7956t;
                com.google.android.gms.ads.internal.client.zzm zzmVar = p60Var.f7958v;
                he1VarZza.d(new ArrayList(Collections.singletonList(str)));
                he1VarZza.b(zzmVar == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzmVar.zzp);
                he1VarZza.f(zzmVar.zzm);
                return he1VarZza;
            } catch (ExecutionException e6) {
                com.google.android.gms.ads.internal.zzv.zzp().h("SignalGeneratorImpl.getConfiguredCriticalUserJourney", e6);
            }
        }
        return null;
    }

    public final /* synthetic */ ArrayList zzB(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzP(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzZ(uri, "nas", str));
            }
        }
        return arrayList;
    }

    public final ArrayList zzC(List list, k3.a aVar) throws Exception {
        ff ffVar = this.zzh.f7110b;
        String strZzh = ffVar != null ? ffVar.zzh(this.zzg, (View) k3.b.i1(aVar), null) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (TextUtils.isEmpty(strZzh)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzP(uri)) {
                arrayList.add(zzZ(uri, "ms", strZzh));
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    public final void zzJ(gs0[] gs0VarArr) {
        gs0 gs0Var = gs0VarArr[0];
        if (gs0Var != null) {
            sc1 sc1Var = this.zzj;
            ds1 ds1VarM = bs1.m(gs0Var);
            synchronized (sc1Var) {
                sc1Var.f8894a.addFirst(ds1VarM);
            }
        }
    }

    public final boolean zzO(Uri uri) {
        return zzX(uri, this.zzB, this.zzC);
    }

    public final boolean zzP(Uri uri) {
        return zzX(uri, this.zzD, this.zzE);
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final k3.a zze(k3.a aVar, k3.a aVar2, String str, k3.a aVar3) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.H9)).booleanValue()) {
            return new k3.b(null);
        }
        Context context = (Context) k3.b.i1(aVar);
        p.d dVar = (p.d) k3.b.i1(aVar2);
        p.b bVar = (p.b) k3.b.i1(aVar3);
        ap apVar = this.zzI;
        fu0 fu0Var = apVar.f2809d;
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        apVar.f2816l = context;
        apVar.h = str;
        yo yoVar = new yo(apVar, bVar, fu0Var);
        apVar.f2811f = yoVar;
        h hVarB = dVar.b(yoVar);
        apVar.f2812g = hVarB;
        if (hVarB == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("CustomTabsClient failed to create new session.");
        }
        zzaa.zzd(fu0Var, null, "pact_action", new Pair("pe", "pact_init"));
        if (((Boolean) wp.f10245c.c()).booleanValue()) {
            this.zzJ.zzb();
        }
        if (((Boolean) wp.f10243a.c()).booleanValue()) {
            this.zzK.zzb();
        }
        return new k3.b(this.zzI.f2812g);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00cf  */
    @Override // com.google.android.gms.internal.ads.l60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(k3.a aVar, final p60 p60Var, i60 i60Var) {
        p60 p60Var2;
        c5.a aVarM;
        c5.a aVarZzb;
        c5.a aVarP;
        c5.a aVar2;
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.f11424k2)).booleanValue()) {
            bundle.putLong("api-call", p60Var.f7958v.zzz);
            bundle.putLong("dynamite-enter", com.google.android.gms.ads.internal.zzv.zzC().a());
        }
        Context context = (Context) k3.b.i1(aVar);
        this.zzg = context;
        de1 de1VarE = d0.e(context, 22);
        de1VarE.zzi();
        int i6 = 0;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.q7)).booleanValue() && p60Var.f7958v.zzc.getBoolean("optimize_for_app_start", false) && Objects.equals(zzaa.zzc(p60Var.f7958v), "requester_type_8")) {
            i6 = 2;
            if (p60Var.f7959w != 2) {
                i6 = 1;
            }
        }
        final int i7 = i6;
        if ("UNKNOWN".equals(p60Var.f7956t)) {
            List arrayList = new ArrayList();
            sn snVar = zn.p7;
            if (!((String) com.google.android.gms.ads.internal.client.zzbe.zzc().a(snVar)).isEmpty()) {
                arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().a(snVar)).split(","));
            }
            if (arrayList.contains(zzaa.zzc(p60Var.f7958v))) {
                aVarM = bs1.l(new IllegalArgumentException("Unknown format is no longer supported."));
                aVarZzb = bs1.l(new IllegalArgumentException("Unknown format is no longer supported."));
                p60Var2 = p60Var;
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.Va)).booleanValue()) {
                    h70 h70Var = i70.f5586a;
                    c5.a aVarU = h70Var.u(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzak
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.zza.zzq(p60Var, i7, bundle);
                        }
                    });
                    aVarP = bs1.p(aVarU, new pr1() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzal
                        @Override // com.google.android.gms.internal.ads.pr1
                        public final c5.a zza(Object obj) {
                            return ((zzac) obj).zzb();
                        }
                    }, h70Var);
                    p60Var2 = p60Var;
                    aVar2 = aVarU;
                } else {
                    zzac zzacVarZzR = zzR(this.zzg, p60Var.s, p60Var.f7956t, p60Var.f7957u, p60Var.f7958v, i7, p60Var.f7960x, bundle, p60Var);
                    p60Var2 = p60Var;
                    aVarM = bs1.m(zzacVarZzR);
                    aVarZzb = zzacVarZzR.zzb();
                }
            }
            aVar2 = aVarM;
            aVarP = aVarZzb;
        }
        a aVar3 = new a(this, aVar2, p60Var2, i60Var, de1VarE);
        aVarP.addListener(new as1(0, aVarP, aVar3), this.zzf.a());
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final void zzg(p20 p20Var) {
        this.zzm = p20Var;
        this.zzj.b(1);
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final void zzh(List list, k3.a aVar, f20 f20Var) {
        zzV(list, aVar, f20Var, true);
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final void zzi(List list, k3.a aVar, f20 f20Var) {
        zzW(list, aVar, f20Var, true);
    }

    @Override // com.google.android.gms.internal.ads.l60
    @SuppressLint({"AddJavascriptInterface"})
    public final void zzj(k3.a aVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.t9)).booleanValue()) {
            nn nnVar = zn.o7;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(nnVar)).booleanValue()) {
                zzU();
            }
            WebView webView = (WebView) k3.b.i1(aVar);
            if (webView == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("The webView cannot be null.");
                return;
            }
            final zzj zzjVar = new zzj(webView, this.zzK, i70.f5591f);
            webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzp, this.zzq, this.zzi, this.zzJ, this.zzK, zzjVar), "gmaSdk");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.D9)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().f2955k.incrementAndGet();
            }
            if (((Boolean) wp.f10243a.c()).booleanValue()) {
                this.zzK.zzb();
                if (((Boolean) wp.f10244b.c()).booleanValue()) {
                    i70.f5589d.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzjVar.zzb();
                        }
                    }, 0L, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.E9)).intValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(nnVar)).booleanValue()) {
                zzU();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final void zzk(k3.a aVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.x7)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) k3.b.i1(aVar);
            p20 p20Var = this.zzm;
            this.zzn = zzbv.zza(motionEvent, p20Var == null ? null : p20Var.s);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.zzn;
            motionEventObtain.setLocation(point.x, point.y);
            this.zzh.f7110b.zzk(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final void zzl(List list, k3.a aVar, f20 f20Var) {
        zzV(list, aVar, f20Var, false);
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final void zzm(List list, k3.a aVar, f20 f20Var) {
        zzW(list, aVar, f20Var, false);
    }

    public final /* synthetic */ Uri zzn(Uri uri, k3.a aVar) throws Exception {
        fc1 fc1Var;
        try {
            uri = (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.Rb)).booleanValue() || (fc1Var = this.zzi) == null) ? this.zzh.a(uri, this.zzg, (View) k3.b.i1(aVar), null) : fc1Var.a(uri, this.zzg, (View) k3.b.i1(aVar), null);
        } catch (nf e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    public final /* synthetic */ zzac zzq(p60 p60Var, int i6, Bundle bundle) {
        return zzR(this.zzg, p60Var.s, p60Var.f7956t, p60Var.f7957u, p60Var.f7958v, i6, p60Var.f7960x, bundle, p60Var);
    }

    public final /* synthetic */ c5.a zzu() {
        return zzR(this.zzg, null, AdFormat.BANNER.name(), null, null, 0, null, new Bundle(), null).zzb();
    }

    public final /* synthetic */ c5.a zzv(gs0[] gs0VarArr, String str, gs0 gs0Var) throws JSONException {
        gs0VarArr[0] = gs0Var;
        Context context = this.zzg;
        p20 p20Var = this.zzm;
        Map map = p20Var.f7916t;
        JSONObject jSONObjectZzd = zzbv.zzd(context, map, map, p20Var.s, null);
        JSONObject jSONObjectZzg = zzbv.zzg(this.zzg, this.zzm.s);
        JSONObject jSONObjectZzf = zzbv.zzf(this.zzm.s);
        JSONObject jSONObjectZze = zzbv.zze(this.zzg, this.zzm.s);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectZzd);
        jSONObject.put("ad_view_signal", jSONObjectZzg);
        jSONObject.put("scroll_view_signal", jSONObjectZzf);
        jSONObject.put("lock_screen_signal", jSONObjectZze);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbv.zzc(null, this.zzg, this.zzo, this.zzn));
        }
        return gs0Var.a(str, jSONObject);
    }

    public final /* synthetic */ c5.a zzw(final ArrayList arrayList) {
        return bs1.o(zzS("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new pl1() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzae
            @Override // com.google.android.gms.internal.ads.pl1
            public final Object apply(Object obj) {
                return this.zza.zzB(arrayList, (String) obj);
            }
        }, this.zzk);
    }
}
