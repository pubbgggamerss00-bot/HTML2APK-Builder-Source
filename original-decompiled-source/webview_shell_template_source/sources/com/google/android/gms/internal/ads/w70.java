package com.google.android.gms.internal.ads;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class w70 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f10090t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f10091u;

    public /* synthetic */ w70(int i6, int i7, Object obj) {
        this.s = i7;
        this.f10091u = obj;
        this.f10090t = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                f80 f80Var = ((z70) this.f10091u).H;
                if (f80Var != null) {
                    f80Var.onWindowVisibilityChanged(this.f10090t);
                    break;
                }
                break;
            default:
                RecyclerView recyclerView = ((com.google.android.material.datepicker.j) this.f10091u).f12267u0;
                if (!recyclerView.Q) {
                    RecyclerView.m mVar = recyclerView.F;
                    if (mVar != null) {
                        mVar.z0(recyclerView, this.f10090t);
                        break;
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        break;
                    }
                }
                break;
        }
    }
}
