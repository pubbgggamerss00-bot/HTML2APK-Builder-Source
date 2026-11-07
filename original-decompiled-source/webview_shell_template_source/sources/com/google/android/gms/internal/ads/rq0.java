package com.google.android.gms.internal.ads;

import java.util.function.Function;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class rq0 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((JSONObject) obj).optJSONArray("flags");
    }
}
