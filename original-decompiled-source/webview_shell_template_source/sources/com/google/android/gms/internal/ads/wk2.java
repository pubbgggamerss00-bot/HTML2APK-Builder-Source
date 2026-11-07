package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wk2 {

    /* renamed from: g, reason: collision with root package name */
    public static final o8 f10216g = new o8(2);
    public static final uk2 h = new uk2();

    /* renamed from: d, reason: collision with root package name */
    public int f10220d;

    /* renamed from: e, reason: collision with root package name */
    public int f10221e;

    /* renamed from: f, reason: collision with root package name */
    public int f10222f;

    /* renamed from: b, reason: collision with root package name */
    public final vk2[] f10218b = new vk2[5];

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10217a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public int f10219c = -1;

    public final float a() {
        int i6 = this.f10219c;
        ArrayList arrayList = this.f10217a;
        if (i6 != 0) {
            Collections.sort(arrayList, h);
            this.f10219c = 0;
        }
        float f6 = this.f10221e;
        int i7 = 0;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            float f7 = 0.5f * f6;
            vk2 vk2Var = (vk2) arrayList.get(i8);
            i7 += vk2Var.f9894b;
            if (i7 >= f7) {
                return vk2Var.f9895c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((vk2) arrayList.get(arrayList.size() - 1)).f9895c;
    }

    public final void b(float f6, int i6) {
        vk2 vk2Var;
        int i7 = this.f10219c;
        ArrayList arrayList = this.f10217a;
        if (i7 != 1) {
            Collections.sort(arrayList, f10216g);
            this.f10219c = 1;
        }
        int i8 = this.f10222f;
        vk2[] vk2VarArr = this.f10218b;
        if (i8 > 0) {
            int i9 = i8 - 1;
            this.f10222f = i9;
            vk2Var = vk2VarArr[i9];
        } else {
            vk2Var = new vk2();
        }
        int i10 = this.f10220d;
        this.f10220d = i10 + 1;
        vk2Var.f9893a = i10;
        vk2Var.f9894b = i6;
        vk2Var.f9895c = f6;
        arrayList.add(vk2Var);
        this.f10221e += i6;
        while (true) {
            int i11 = this.f10221e;
            if (i11 <= 2000) {
                return;
            }
            int i12 = i11 - 2000;
            vk2 vk2Var2 = (vk2) arrayList.get(0);
            int i13 = vk2Var2.f9894b;
            if (i13 <= i12) {
                this.f10221e -= i13;
                arrayList.remove(0);
                int i14 = this.f10222f;
                if (i14 < 5) {
                    this.f10222f = i14 + 1;
                    vk2VarArr[i14] = vk2Var2;
                }
            } else {
                vk2Var2.f9894b = i13 - i12;
                this.f10221e -= i12;
            }
        }
    }
}
