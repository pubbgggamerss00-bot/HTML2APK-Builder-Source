package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sh1 extends ph1 {
    @Override // com.google.android.gms.internal.ads.qh1
    /* renamed from: a */
    public final void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }

    public final void b(String str) {
        rg1 rg1Var = rg1.f8631c;
        if (rg1Var != null) {
            for (fg1 fg1Var : Collections.unmodifiableCollection(rg1Var.f8632a)) {
                if (this.f8076c.contains(fg1Var.f4657g)) {
                    ch1 ch1Var = fg1Var.f4654d;
                    if (this.f8078e >= ch1Var.f3578c && ch1Var.f3579d != 3) {
                        ch1Var.f3579d = 3;
                        xg1.a(ch1Var.a(), "setNativeViewHierarchy", str, ch1Var.f3576a);
                    }
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f8077d.toString();
    }

    @Override // com.google.android.gms.internal.ads.qh1, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        b(str);
        super.onPostExecute(str);
    }
}
