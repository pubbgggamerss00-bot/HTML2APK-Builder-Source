package com.google.android.gms.internal.ads;

import android.os.AsyncTask;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class qh1 extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public wv0 f8388a;

    /* renamed from: b, reason: collision with root package name */
    public final s70 f8389b;

    public qh1(s70 s70Var) {
        this.f8389b = s70Var;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        wv0 wv0Var = this.f8388a;
        if (wv0Var != null) {
            wv0Var.f10279u = null;
            qh1 qh1Var = (qh1) ((ArrayDeque) wv0Var.f10278t).poll();
            wv0Var.f10279u = qh1Var;
            if (qh1Var != null) {
                qh1Var.executeOnExecutor((ThreadPoolExecutor) wv0Var.s, new Object[0]);
            }
        }
    }
}
