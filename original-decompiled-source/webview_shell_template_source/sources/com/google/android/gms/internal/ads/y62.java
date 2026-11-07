package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y62 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f10874a = new ArrayDeque();

    public final void a(g42 g42Var) {
        if (!g42Var.j()) {
            if (!(g42Var instanceof a72)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(g42Var.getClass())));
            }
            a72 a72Var = (a72) g42Var;
            a(a72Var.f2599v);
            a(a72Var.f2600w);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(a72.f2597z, g42Var.g());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iU = a72.u(iBinarySearch + 1);
        ArrayDeque arrayDeque = this.f10874a;
        if (arrayDeque.isEmpty() || ((g42) arrayDeque.peek()).g() >= iU) {
            arrayDeque.push(g42Var);
            return;
        }
        int iU2 = a72.u(iBinarySearch);
        g42 a72Var2 = (g42) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((g42) arrayDeque.peek()).g() < iU2) {
            a72Var2 = new a72((g42) arrayDeque.pop(), a72Var2);
        }
        a72 a72Var3 = new a72(a72Var2, g42Var);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(a72.f2597z, a72Var3.f2598u);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((g42) arrayDeque.peek()).g() >= a72.u(iBinarySearch2 + 1)) {
                break;
            } else {
                a72Var3 = new a72((g42) arrayDeque.pop(), a72Var3);
            }
        }
        arrayDeque.push(a72Var3);
    }
}
