package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f implements fv {

    /* renamed from: a, reason: collision with root package name */
    public final m70 f4431a;

    public f(m70 m70Var) {
        this.f4431a = m70Var;
    }

    @Override // com.google.android.gms.internal.ads.fv
    public final cw a(Context context, mb2 mb2Var, w80 w80Var, gb gbVar, List list) throws r60 {
        try {
            return ((fv) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(m70.class).newInstance(this.f4431a)).a(context, mb2Var, w80Var, gbVar, list);
        } catch (Exception e6) {
            if (e6 instanceof r60) {
                throw ((r60) e6);
            }
            throw new r60(e6);
        }
    }
}
