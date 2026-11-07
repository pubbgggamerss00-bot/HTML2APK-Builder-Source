package q7;

import android.content.Context;
import android.content.res.Resources;
import g7.h0;
import g7.i0;
import w7.m;

/* loaded from: classes.dex */
public final class e implements c<Integer, h0> {
    @Override // q7.c
    public final h0 a(Object obj, m mVar) {
        int iIntValue = ((Number) obj).intValue();
        Context context = mVar.f31401a;
        try {
            if (context.getResources().getResourceEntryName(iIntValue) == null) {
                return null;
            }
            return i0.g("android.resource://" + context.getPackageName() + '/' + iIntValue);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
