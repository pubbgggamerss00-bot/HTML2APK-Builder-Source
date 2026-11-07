package u4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import u4.n;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m extends n.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f14669c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f14670d;

    public m(ArrayList arrayList, Matrix matrix) {
        this.f14669c = arrayList;
        this.f14670d = matrix;
    }

    @Override // u4.n.f
    public final void a(Matrix matrix, t4.a aVar, int i6, Canvas canvas) {
        ArrayList arrayList = this.f14669c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((n.f) obj).a(this.f14670d, aVar, i6, canvas);
        }
    }
}
