package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class og extends lh {
    public og(dg dgVar, kd kdVar, int i6) {
        super(dgVar, "IuqhWQe4tlbVfr7yvxlVNsd5e/l7lVHvlqpkvK+6tt5EoeON2tkyyhuv1x7KBAeM", "CXimWsgId9Q4NJ7Th/z0oZbD0fgxUqQs1m5HYkmnDaE=", kdVar, i6, 49);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void a() throws InvocationTargetException {
        kd kdVar = this.f6727d;
        kdVar.i();
        yd.o0((yd) kdVar.f4126t, 3);
        try {
            int i6 = 1;
            if (true == ((Boolean) this.f6728e.invoke(null, this.f6724a.f3897a)).booleanValue()) {
                i6 = 2;
            }
            kdVar.i();
            yd.o0((yd) kdVar.f4126t, i6);
        } catch (InvocationTargetException e6) {
            if (!(e6.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e6;
            }
        }
    }
}
