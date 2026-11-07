package b0;

import com.google.android.gms.internal.ads.yw;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class l extends e {

    /* renamed from: r0, reason: collision with root package name */
    public ArrayList<e> f1981r0 = new ArrayList<>();

    @Override // b0.e
    public void C() {
        this.f1981r0.clear();
        super.C();
    }

    @Override // b0.e
    public final void F(yw ywVar) {
        super.F(ywVar);
        int size = this.f1981r0.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f1981r0.get(i6).F(ywVar);
        }
    }

    public void R() {
        ArrayList<e> arrayList = this.f1981r0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            e eVar = this.f1981r0.get(i6);
            if (eVar instanceof l) {
                ((l) eVar).R();
            }
        }
    }
}
