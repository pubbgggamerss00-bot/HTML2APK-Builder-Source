package zb;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import zb.p;

/* loaded from: classes2.dex */
public final class o extends p.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f34965c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f34966d;

    public o(ArrayList arrayList, Matrix matrix) {
        this.f34965c = arrayList;
        this.f34966d = matrix;
    }

    @Override // zb.p.f
    public final void a(Matrix matrix, yb.a aVar, int i10, Canvas canvas) {
        ArrayList arrayList = this.f34965c;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((p.f) obj).a(this.f34966d, aVar, i10, canvas);
        }
    }
}
