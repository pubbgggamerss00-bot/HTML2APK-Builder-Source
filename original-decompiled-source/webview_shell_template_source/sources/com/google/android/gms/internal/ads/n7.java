package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n7 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7327a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7328b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7329c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7330d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7331e;

    public n7(int i6, int i7, int i8, int i9, int i10) {
        this.f7327a = i6;
        this.f7328b = i7;
        this.f7329c = i8;
        this.f7330d = i9;
        this.f7331e = i10;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static n7 a(String str) {
        y5.n(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i6 >= length) {
                if (i7 == -1 || i8 == -1 || i10 == -1) {
                    return null;
                }
                return new n7(i7, i8, i9, i10, length);
            }
            String strG = rj1.g(strArrSplit[i6].trim());
            switch (strG.hashCode()) {
                case 100571:
                    if (!strG.equals("end")) {
                        break;
                    } else {
                        i8 = i6;
                        break;
                    }
                case 3556653:
                    if (!strG.equals("text")) {
                        break;
                    } else {
                        i10 = i6;
                        break;
                    }
                case 109757538:
                    if (!strG.equals("start")) {
                        break;
                    } else {
                        i7 = i6;
                        break;
                    }
                case 109780401:
                    if (!strG.equals("style")) {
                        break;
                    } else {
                        i9 = i6;
                        break;
                    }
            }
            i6++;
        }
    }
}
