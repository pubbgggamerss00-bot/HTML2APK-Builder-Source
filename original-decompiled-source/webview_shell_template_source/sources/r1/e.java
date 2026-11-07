package r1;

import android.adservices.topics.GetTopicsRequest;
import android.annotation.SuppressLint;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@SuppressLint({"NewApi", "ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class e extends f {
    @Override // r1.f
    public final GetTopicsRequest i(a aVar) {
        j.e("request", aVar);
        GetTopicsRequest getTopicsRequestBuild = q1.b.a().setAdsSdkName(aVar.f14256a).setShouldRecordObservation(aVar.f14257b).build();
        j.d("Builder()\n            .s…ion)\n            .build()", getTopicsRequestBuild);
        return getTopicsRequestBuild;
    }
}
