package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jh extends lh {
    public final View h;

    public jh(dg dgVar, kd kdVar, int i6, View view) {
        super(dgVar, "mEjNDtPMm+doViWgwYfgFasHLoNhAzlke51uTCfqtDoGOxX1zsnuUhlK2oJYi5bg", "XF2ECF8x32hNHbBL1ZweWW5YOt0QuzlbOpXni7lBWlc=", kdVar, i6, 57);
        this.h = view;
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void a() {
        View view = this.h;
        if (view != null) {
            Boolean bool = (Boolean) zzbe.zzc().a(zn.f11512y3);
            Boolean bool2 = (Boolean) zzbe.zzc().a(zn.Pa);
            String str = (String) this.f6728e.invoke(null, view, this.f6724a.f3897a.getResources().getDisplayMetrics(), bool, bool2);
            hg hgVar = new hg(0);
            HashMap mapD = me.d(str);
            if (mapD != null) {
                hgVar.f5378t = (Long) mapD.get(0);
                hgVar.f5379u = (Long) mapD.get(1);
                hgVar.f5380v = (Long) mapD.get(2);
                hgVar.f5381w = (Long) mapD.get(3);
                hgVar.f5382x = (Long) mapD.get(4);
            }
            wd wdVarB = xd.B();
            long jLongValue = hgVar.f5378t.longValue();
            wdVarB.i();
            xd.D((xd) wdVarB.f4126t, jLongValue);
            long jLongValue2 = hgVar.f5379u.longValue();
            wdVarB.i();
            xd.F((xd) wdVarB.f4126t, jLongValue2);
            long jLongValue3 = hgVar.f5380v.longValue();
            wdVarB.i();
            xd.G((xd) wdVarB.f4126t, jLongValue3);
            if (bool2.booleanValue()) {
                long jLongValue4 = hgVar.f5382x.longValue();
                wdVarB.i();
                xd.E((xd) wdVarB.f4126t, jLongValue4);
            }
            if (bool.booleanValue()) {
                long jLongValue5 = hgVar.f5381w.longValue();
                wdVarB.i();
                xd.C((xd) wdVarB.f4126t, jLongValue5);
            }
            xd xdVar = (xd) wdVarB.g();
            kd kdVar = this.f6727d;
            kdVar.i();
            yd.i0((yd) kdVar.f4126t, xdVar);
        }
    }
}
