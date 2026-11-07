package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qy0 implements zr1 {
    public final /* synthetic */ boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ry0 f8480t;

    public qy0(ry0 ry0Var, boolean z6) {
        this.s = z6;
        this.f8480t = ry0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2a(Object obj) {
        List<String> listUnmodifiableList;
        List listAsList;
        int i6;
        om omVar;
        ck0 ck0Var = (ck0) obj;
        ry0 ry0Var = this.f8480t;
        if (((zzg) ry0Var.f6798t).zzN()) {
            return;
        }
        Bundle bundle = ck0Var.f3610a;
        Object obj2 = bundle.get("ad_types");
        if (obj2 instanceof List) {
            listAsList = (List) obj2;
        } else {
            if (!(obj2 instanceof String[])) {
                listUnmodifiableList = Collections.EMPTY_LIST;
                ArrayList arrayList = new ArrayList();
                for (String str : listUnmodifiableList) {
                    switch (str.hashCode()) {
                        case -1396342996:
                            if (str.equals("banner")) {
                                omVar = om.BANNER;
                                break;
                            } else {
                                omVar = om.AD_FORMAT_TYPE_UNSPECIFIED;
                                break;
                            }
                        case -1052618729:
                            if (str.equals("native")) {
                                omVar = om.NATIVE_APP_INSTALL;
                                break;
                            }
                            break;
                        case -239580146:
                            if (str.equals("rewarded")) {
                                omVar = om.REWARD_BASED_VIDEO_AD;
                                break;
                            }
                            break;
                        case 604727084:
                            if (str.equals("interstitial")) {
                                omVar = om.INTERSTITIAL;
                                break;
                            }
                            break;
                    }
                    arrayList.add(omVar);
                }
                al alVar = (al) ry0.A.get(lc1.a("network", lc1.a("device", bundle)).getInt("active_network_state", -1), al.UNSPECIFIED);
                rk rkVarB = tk.B();
                i6 = bundle.getInt("cnt", -2);
                int i7 = bundle.getInt("gnt", 0);
                if (i6 != -1) {
                    ry0Var.f8738z = bn.ENUM_TRUE;
                } else {
                    ry0Var.f8738z = bn.ENUM_FALSE;
                    int i8 = 2;
                    if (i6 == 0) {
                        rkVarB.i();
                        tk.E((tk) rkVarB.f4126t, 2);
                    } else if (i6 != 1) {
                        rkVarB.i();
                        tk.E((tk) rkVarB.f4126t, 1);
                    } else {
                        rkVarB.i();
                        tk.E((tk) rkVarB.f4126t, 3);
                    }
                    switch (i7) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                        case 16:
                            break;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            i8 = 3;
                            break;
                        case 13:
                            i8 = 4;
                            break;
                        default:
                            i8 = 1;
                            break;
                    }
                    rkVarB.i();
                    tk.D((tk) rkVarB.f4126t, i8);
                }
                ((jy0) ry0Var.f6799u).a(new py0(this, this.s, arrayList, rkVarB.g(), alVar));
            }
            listAsList = Arrays.asList((String[]) obj2);
        }
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (Object obj3 : listAsList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        listUnmodifiableList = Collections.unmodifiableList(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        while (r1.hasNext()) {
        }
        al alVar2 = (al) ry0.A.get(lc1.a("network", lc1.a("device", bundle)).getInt("active_network_state", -1), al.UNSPECIFIED);
        rk rkVarB2 = tk.B();
        i6 = bundle.getInt("cnt", -2);
        int i72 = bundle.getInt("gnt", 0);
        if (i6 != -1) {
        }
        ((jy0) ry0Var.f6799u).a(new py0(this, this.s, arrayList3, rkVarB2.g(), alVar2));
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public final void j(Throwable th) {
        zzo.zzg("Failed to get signals bundle");
    }
}
