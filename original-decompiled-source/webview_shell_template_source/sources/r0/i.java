package r0;

import java.util.ArrayList;
import r0.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i implements t0.a<j.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f14239a;

    public i(String str) {
        this.f14239a = str;
    }

    @Override // t0.a
    public final void accept(j.a aVar) {
        j.a aVar2 = aVar;
        synchronized (j.f14242c) {
            try {
                w.g<String, ArrayList<t0.a<j.a>>> gVar = j.f14243d;
                ArrayList<t0.a<j.a>> arrayList = gVar.get(this.f14239a);
                if (arrayList == null) {
                    return;
                }
                gVar.remove(this.f14239a);
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    arrayList.get(i6).accept(aVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
