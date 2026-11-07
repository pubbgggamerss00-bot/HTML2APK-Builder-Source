package r1;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.annotation.SuppressLint;
import androidx.fragment.app.p;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.j;
import q1.g;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public class f extends p {
    public final TopicsManager s;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @i5.e(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", l = {22}, m = "getTopics$suspendImpl")
    public static final class a extends i5.c {

        /* renamed from: v, reason: collision with root package name */
        public f f14262v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f14263w;

        /* renamed from: y, reason: collision with root package name */
        public int f14265y;

        public a(g5.d<? super a> dVar) {
            super(dVar);
        }

        @Override // i5.a
        public final Object d(Object obj) {
            this.f14263w = obj;
            this.f14265y |= Integer.MIN_VALUE;
            return f.k(f.this, null, this);
        }
    }

    public f(TopicsManager topicsManager) {
        j.e("mTopicsManager", topicsManager);
        this.s = topicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object k(f fVar, r1.a aVar, g5.d<? super b> dVar) throws Throwable {
        a aVar2;
        if (dVar instanceof a) {
            aVar2 = (a) dVar;
            int i6 = aVar2.f14265y;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar2.f14265y = i6 - Integer.MIN_VALUE;
            } else {
                aVar2 = fVar.new a(dVar);
            }
        }
        Object objL = aVar2.f14263w;
        int i7 = aVar2.f14265y;
        if (i7 == 0) {
            d5.e.b(objL);
            GetTopicsRequest getTopicsRequestI = fVar.i(aVar);
            aVar2.f14262v = fVar;
            aVar2.f14265y = 1;
            y5.f fVar2 = new y5.f(a1.a.f(aVar2));
            fVar2.m();
            fVar.s.getTopics(getTopicsRequestI, new g(), new q0.d(fVar2));
            objL = fVar2.l();
            h5.a aVar3 = h5.a.s;
            if (objL == aVar3) {
                return aVar3;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = aVar2.f14262v;
            d5.e.b(objL);
        }
        GetTopicsResponse getTopicsResponseA = q1.c.a(objL);
        fVar.getClass();
        j.e("response", getTopicsResponseA);
        ArrayList arrayList = new ArrayList();
        Iterator it = getTopicsResponseA.getTopics().iterator();
        while (it.hasNext()) {
            Topic topicB = androidx.camera.camera2.internal.compat.params.a.b(it.next());
            arrayList.add(new c(topicB.getTopicId(), topicB.getTaxonomyVersion(), topicB.getModelVersion()));
        }
        return new b(arrayList);
    }

    public GetTopicsRequest i(r1.a aVar) {
        j.e("request", aVar);
        GetTopicsRequest getTopicsRequestBuild = q1.b.a().setAdsSdkName(aVar.f14256a).build();
        j.d("Builder()\n            .s…ame)\n            .build()", getTopicsRequestBuild);
        return getTopicsRequestBuild;
    }

    public Object j(r1.a aVar, g5.d<? super b> dVar) {
        return k(this, aVar, dVar);
    }
}
