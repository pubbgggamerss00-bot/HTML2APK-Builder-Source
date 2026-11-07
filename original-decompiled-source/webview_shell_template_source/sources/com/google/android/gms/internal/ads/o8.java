package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class o8 implements Comparator {
    public final /* synthetic */ int s;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.s) {
            case 0:
                return Long.compare(((g8) obj).f4933b, ((g8) obj2).f4933b);
            case 1:
                xi xiVar = (xi) obj;
                xi xiVar2 = (xi) obj2;
                int i6 = xiVar.f10606c - xiVar2.f10606c;
                return i6 != 0 ? i6 : Long.compare(xiVar.f10604a, xiVar2.f10604a);
            default:
                return ((vk2) obj).f9893a - ((vk2) obj2).f9893a;
        }
    }
}
