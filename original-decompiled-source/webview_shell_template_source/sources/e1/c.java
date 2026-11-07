package e1;

import android.view.View;
import e5.i;
import java.nio.ByteBuffer;
import java.util.WeakHashMap;
import u0.f0;
import u0.n0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f12775a;

    /* renamed from: b, reason: collision with root package name */
    public int f12776b;

    /* renamed from: c, reason: collision with root package name */
    public int f12777c;

    /* renamed from: d, reason: collision with root package name */
    public Object f12778d;

    public c(int i6) {
        switch (i6) {
            case 1:
                int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
                this.f12777c = iHighestOneBit - 1;
                this.f12778d = new int[iHighestOneBit];
                break;
            default:
                if (j3.b.f13493c == null) {
                    j3.b.f13493c = new j3.b();
                    break;
                }
                break;
        }
    }

    public int a(int i6) {
        if (i6 < this.f12777c) {
            return ((ByteBuffer) this.f12778d).getShort(this.f12776b + i6);
        }
        return 0;
    }

    public void b(int i6) {
        int[] iArr = (int[]) this.f12778d;
        int i7 = this.f12776b;
        iArr[i7] = i6;
        int i8 = this.f12777c & (i7 + 1);
        this.f12776b = i8;
        int i9 = this.f12775a;
        if (i8 == i9) {
            int length = iArr.length;
            int i10 = length - i9;
            int i11 = length << 1;
            if (i11 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i11];
            i.d(0, i9, iArr, iArr2, length);
            i.d(i10, 0, (int[]) this.f12778d, iArr2, this.f12775a);
            this.f12778d = iArr2;
            this.f12775a = 0;
            this.f12776b = length;
            this.f12777c = i11 - 1;
        }
    }

    public void c() {
        View view = (View) this.f12778d;
        int top = this.f12777c - (view.getTop() - this.f12775a);
        WeakHashMap<View, n0> weakHashMap = f0.f14480a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f12776b));
    }
}
