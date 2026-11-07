package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class oa2 {

    /* renamed from: a, reason: collision with root package name */
    public final em1 f7664a;

    /* renamed from: b, reason: collision with root package name */
    public final ma2 f7665b;

    /* renamed from: c, reason: collision with root package name */
    public na2 f7666c;

    /* renamed from: e, reason: collision with root package name */
    public float f7668e = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public int f7667d = 0;

    public oa2(Context context, Handler handler, na2 na2Var) {
        this.f7664a = sj1.c(new yn(context, 2));
        this.f7666c = na2Var;
        this.f7665b = new ma2(this, handler);
    }

    public final void a() {
        int i6 = this.f7667d;
        if (i6 == 1 || i6 == 0 || j31.f5914a >= 26) {
            return;
        }
        ((AudioManager) this.f7664a.mo7zza()).abandonAudioFocus(this.f7665b);
    }

    public final void b(int i6) {
        na2 na2Var = this.f7666c;
        if (na2Var != null) {
            int i7 = i6 == -1 ? 2 : 1;
            gb2 gb2Var = ((db2) na2Var).s;
            gb2Var.L(i6, i7, gb2Var.x());
        }
    }

    public final void c(int i6) {
        if (this.f7667d == i6) {
            return;
        }
        this.f7667d = i6;
        float f6 = i6 == 4 ? 0.2f : 1.0f;
        if (this.f7668e != f6) {
            this.f7668e = f6;
            na2 na2Var = this.f7666c;
            if (na2Var != null) {
                gb2 gb2Var = ((db2) na2Var).s;
                gb2Var.I(1, 2, Float.valueOf(gb2Var.f4976c0 * gb2Var.O.f7668e));
            }
        }
    }
}
