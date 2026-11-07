package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class or0 implements bi {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ xa0 f7848t;

    public /* synthetic */ or0(xa0 xa0Var, int i6) {
        this.s = i6;
        this.f7848t = xa0Var;
    }

    @Override // com.google.android.gms.internal.ads.bi
    public final void C(ai aiVar) {
        switch (this.s) {
            case 0:
                HashMap map = new HashMap();
                map.put("isVisible", true != aiVar.f2772j ? "0" : "1");
                this.f7848t.G("onAdVisibilityChanged", map);
                break;
            default:
                eb0 eb0VarZzN = this.f7848t.zzN();
                Rect rect = aiVar.f2767d;
                eb0VarZzN.c0(rect.left, rect.top);
                break;
        }
    }
}
