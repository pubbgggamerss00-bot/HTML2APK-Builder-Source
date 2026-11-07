package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jj2 extends d40 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f6086u = 0;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f6087l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f6088m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f6089n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f6090o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f6091p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f6092q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f6093r;
    public final SparseArray s;

    /* renamed from: t, reason: collision with root package name */
    public final SparseBooleanArray f6094t;

    static {
        new jj2(new ij2());
        Integer.toString(CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    public jj2(ij2 ij2Var) {
        super(ij2Var);
        this.f6087l = ij2Var.f5783l;
        this.f6088m = ij2Var.f5784m;
        this.f6089n = ij2Var.f5785n;
        this.f6090o = ij2Var.f5786o;
        this.f6091p = ij2Var.f5787p;
        this.f6092q = ij2Var.f5788q;
        this.f6093r = ij2Var.f5789r;
        this.s = ij2Var.s;
        this.f6094t = ij2Var.f5790t;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jj2.class == obj.getClass()) {
            jj2 jj2Var = (jj2) obj;
            if (super.equals(jj2Var) && this.f6087l == jj2Var.f6087l && this.f6088m == jj2Var.f6088m && this.f6089n == jj2Var.f6089n && this.f6090o == jj2Var.f6090o && this.f6091p == jj2Var.f6091p && this.f6092q == jj2Var.f6092q && this.f6093r == jj2Var.f6093r) {
                SparseBooleanArray sparseBooleanArray = jj2Var.f6094t;
                SparseBooleanArray sparseBooleanArray2 = this.f6094t;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size) {
                            SparseArray sparseArray = jj2Var.s;
                            SparseArray sparseArray2 = this.s;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i7 = 0; i7 < size2; i7++) {
                                    int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i7));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i7);
                                        Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                ui2 ui2Var = (ui2) entry.getKey();
                                                if (!map2.containsKey(ui2Var) || !Objects.equals(entry.getValue(), map2.get(ui2Var))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i6)) < 0) {
                                break;
                            }
                            i6++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f6087l ? 1 : 0)) * 961) + (this.f6088m ? 1 : 0)) * 961) + (this.f6089n ? 1 : 0)) * 28629151) + (this.f6090o ? 1 : 0)) * 31) + (this.f6091p ? 1 : 0)) * 31) + (this.f6092q ? 1 : 0)) * 961) + (this.f6093r ? 1 : 0)) * 31;
    }
}
