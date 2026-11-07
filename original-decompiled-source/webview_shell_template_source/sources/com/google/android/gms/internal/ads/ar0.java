package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class ar0 implements pl1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2829a;

    public /* synthetic */ ar0(int i6) {
        this.f2829a = i6;
    }

    @Override // com.google.android.gms.internal.ads.pl1
    public final Object apply(Object obj) {
        switch (this.f2829a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (mq mqVar : (List) obj) {
                    if (mqVar != null) {
                        arrayList.add(mqVar);
                    }
                }
                return arrayList;
            default:
                return Collections.singletonList(bs1.m((fp0) obj));
        }
    }
}
