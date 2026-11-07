package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class a6 implements pl1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2588a;

    public /* synthetic */ a6(int i6) {
        this.f2588a = i6;
    }

    @Override // com.google.android.gms.internal.ads.pl1
    public final Object apply(Object obj) {
        switch (this.f2588a) {
            case 0:
                return (f6) obj;
            case 1:
                ArrayList arrayList = new ArrayList();
                for (jr0 jr0Var : (List) obj) {
                    if (jr0Var != null) {
                        arrayList.add(jr0Var);
                    }
                }
                return arrayList;
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                if (true == arrayList2.isEmpty()) {
                    arrayList2 = null;
                }
                return new u51(0, arrayList2);
            case 3:
                return new f51((String) obj, 1);
            case 4:
                return new f51((String) obj, 2);
            case 5:
                return new bd2((el0) obj);
            default:
                e1 e1Var = (e1) obj;
                int i6 = w.K;
                return androidx.activity.m.d(e1Var.f4073a, ": ", e1Var.f4074b);
        }
    }
}
