package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class h8 implements Comparator {
    public final /* synthetic */ int s;

    public /* synthetic */ h8(int i6) {
        this.s = i6;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.s) {
            case 0:
                return Integer.compare(((i8) obj).f5596a.f5969b, ((i8) obj2).f5596a.f5969b);
            case 1:
                si siVar = (si) obj;
                si siVar2 = (si) obj2;
                float f6 = siVar.f8941b;
                float f7 = siVar2.f8941b;
                if (f6 < f7) {
                    return -1;
                }
                if (f6 <= f7) {
                    float f8 = siVar.f8940a;
                    float f9 = siVar2.f8940a;
                    if (f8 < f9) {
                        return -1;
                    }
                    if (f8 <= f9) {
                        float f10 = (siVar.f8943d - f6) * (siVar.f8942c - f8);
                        float f11 = (siVar2.f8943d - f7) * (siVar2.f8942c - f9);
                        if (f10 > f11) {
                            return -1;
                        }
                        if (f10 >= f11) {
                            return 0;
                        }
                    }
                }
                return 1;
            case 2:
                return ((w) obj2).f9974i - ((w) obj).f9974i;
            default:
                return ((fj2) Collections.max((List) obj)).compareTo((fj2) Collections.max((List) obj2));
        }
    }
}
