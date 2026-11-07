package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f7904t;

    public /* synthetic */ p(int i6, Object obj) {
        this.s = i6;
        this.f7904t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strA;
        switch (this.s) {
            case 0:
                y yVar = (y) this.f7904t;
                yVar.getClass();
                int i6 = j31.f5914a;
                bd2 bd2Var = yVar.f10757b.s.I;
                bd2Var.q(bd2Var.t(), 1016, new sj1(22));
                return;
            case 1:
                ((qw) this.f7904t).zzc();
                return;
            case 2:
                f80 f80Var = ((z70) this.f7904t).H;
                if (f80Var != null) {
                    r80 r80Var = f80Var.f4540w;
                    r80Var.f8582t = false;
                    uj1 uj1Var = zzs.zza;
                    uj1Var.removeCallbacks(r80Var);
                    uj1Var.postDelayed(r80Var, 250L);
                    uj1Var.post(new x(5, f80Var));
                    return;
                }
                return;
            case 3:
                ((f80) this.f7904t).c("firstFrameRendered", new String[0]);
                return;
            case 4:
                zzv.zzz().s.remove((j90) this.f7904t);
                return;
            case 5:
                f80 f80Var2 = ((na0) this.f7904t).f7365w;
                if (f80Var2 != null) {
                    f80Var2.e();
                    return;
                }
                return;
            case 6:
                super/*android.webkit.WebView*/.destroy();
                return;
            case 7:
                fe0 fe0Var = (fe0) this.f7904t;
                wo woVarZzf = zzv.zzf();
                Context context = fe0Var.s;
                cu0 cu0Var = fe0Var.F;
                if (woVarZzf.f10236b.getAndSet(true)) {
                    return;
                }
                woVarZzf.f10237c = context;
                woVarZzf.f10238d = cu0Var;
                if (woVarZzf.f10240f != null || context == null || (strA = p.d.a(context)) == null) {
                    return;
                }
                woVarZzf.f14051a = context.getApplicationContext();
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(strA)) {
                    intent.setPackage(strA);
                }
                context.bindService(intent, woVarZzf, 33);
                return;
            case 8:
                cg0 cg0Var = (cg0) this.f7904t;
                cg0Var.f3563t.execute(new x(6, cg0Var));
                return;
            case 9:
                ((nt0) this.f7904t).a();
                return;
            case 10:
                bu0 bu0Var = (bu0) this.f7904t;
                bu0Var.f3292b.f3661a.b(bu0Var.f3291a, true);
                return;
            case 11:
                String str = zzv.zzp().d().zzg().f10066e;
                boolean zIsEmpty = TextUtils.isEmpty(str);
                o70 o70Var = (o70) this.f7904t;
                if (zIsEmpty) {
                    o70Var.b(new Exception());
                    return;
                } else {
                    o70Var.a(str);
                    return;
                }
            case 12:
                ((cx0) this.f7904t).a();
                return;
            case 13:
                c41 c41Var = (c41) this.f7904t;
                synchronized (c41Var) {
                    c41Var.i1(3, "Signal collection timeout.");
                }
                return;
            case 14:
                fa1 fa1Var = (fa1) this.f7904t;
                fa1Var.s.a().execute(new b(16, fa1Var));
                return;
            case 15:
                ((hb1) this.f7904t).t();
                return;
            case 16:
                hl1 hl1Var = (hl1) this.f7904t;
                if (hl1Var.f5445j != null) {
                    hl1Var.f5439c.c("Unbind from service.", new Object[0]);
                    Context context2 = hl1Var.f5438b;
                    gl1 gl1Var = hl1Var.f5444i;
                    gl1Var.getClass();
                    context2.unbindService(gl1Var);
                    hl1Var.f5442f = false;
                    hl1Var.f5445j = null;
                    hl1Var.f5444i = null;
                    synchronized (hl1Var.f5441e) {
                        hl1Var.f5441e.clear();
                    }
                    return;
                }
                return;
            default:
                ei2 ei2Var = (ei2) this.f7904t;
                if (ei2Var.f4309d0) {
                    return;
                }
                mh2 mh2Var = ei2Var.G;
                mh2Var.getClass();
                mh2Var.d(ei2Var);
                return;
        }
    }

    public /* synthetic */ p(y yVar, String str, long j6, long j7) {
        this.s = 0;
        this.f7904t = yVar;
    }
}
